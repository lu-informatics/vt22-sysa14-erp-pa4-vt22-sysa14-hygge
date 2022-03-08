using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using EmployeeWindowsForms.CronusReference1;

namespace EmployeeWindowsForms
{
    public partial class EmployeeWindow : Form
    {
        private CronusServiceSoapClient proxy;

        public EmployeeWindow()
        {
            InitializeComponent(); 
            proxy = new CronusServiceSoapClient();

            // Add current employees to the data grid
            CRONUS_Sverige_AB_Employee[] employees = proxy.GetEmployees();  //Array containing Cronus employees fetched from database
            foreach (CRONUS_Sverige_AB_Employee employee in employees)      //For each employee in the Array, add employee to the gridView
            {
                dataGridViewEmployee.Rows.Add(employee.No_, employee.First_Name, employee.Last_Name, employee.Job_Title, employee.Address);
            }
        }

        private void btnCreate_Click(object sender, EventArgs e)
        {
            string no = txtBoxNo.Text;                      //Gets the values from the textBoxes
            string firstName = txtBoxFirstName.Text;
            string lastName = txtBoxLastName.Text;
            string jobTitle = txtBoxJobTitle.Text;
            string address = txtBoxAddress.Text; 

            if (no.Equals("") || firstName.Equals("") || lastName.Equals("") || jobTitle.Equals("") || address.Equals("")) //Checks if all the values are empty
            {
                MessageBox.Show("Error Occured. Please make sure that all fields are filled in."); //If they are empty, send this message
                return;
            }

            try
            {
                proxy.AddEmployee(no, firstName, lastName, jobTitle, address);              //Add employee to database
                dataGridViewEmployee.Rows.Add(no, firstName, lastName, jobTitle, address);  //Add row in the gridView
                ClearTxtBoxes();    //Clears all the boxes after pushing a button (click) 
            }
            catch (Exception e1) 
            { 
                if (e1.Message.Contains("PRIMARY KEY"))
                {
                    MessageBox.Show("Error Occured. Please make sure the the Employee No's are unique.");
                }
                else
                {
                    MessageBox.Show("Error Occured. Message: " + e1.Message);
                }
            }
        }

        private void btnUpdate_Click(object sender, EventArgs e)
        {
            string firstName = txtBoxFirstName.Text;    //Gets the values from the textBoxes
            string lastName = txtBoxLastName.Text;
            string jobTitle = txtBoxJobTitle.Text;
            string address = txtBoxAddress.Text;

            if (firstName.Equals("") && lastName.Equals("") && jobTitle.Equals("") && address.Equals(""))       //Checks if all the values are empty
            {
                MessageBox.Show("Error Occured. Please enter at least one value in one of the text fields.");   //If they are empty, send this message
                return; 
            }

            try
            {

                DataGridViewSelectedRowCollection rows = dataGridViewEmployee.SelectedRows;  //Retrieve selected rows
                if (rows.Count != 1)    //If row is not 1 -> send message! Notice: you can only update in one row
                {
                    MessageBox.Show("Error Occured. Please select one and only one row to be updated.");
                    return;
                }

                string no = rows[0].Cells[0].Value.ToString();      //Get No from selected row           
                proxy.UpdateEmployee(no, firstName, lastName, jobTitle, address);   //Update in database
                
                if (!firstName.Equals(""))      //Update gridview cells if text field is nor empty              
                {
                    rows[0].Cells[1].Value = firstName;
                }
                if (!lastName.Equals(""))
                {
                    rows[0].Cells[2].Value = lastName;
                }
                if (!jobTitle.Equals(""))
                {
                    rows[0].Cells[3].Value = jobTitle;
                }
                if (!address.Equals(""))
                {
                    rows[0].Cells[4].Value = address;
                }
                ClearTxtBoxes();
            } 
            catch (Exception e1)
            {
                MessageBox.Show("Error Occured. Error message: " + e1.Message);
            }
        }

        private void btnDelete_Click(object sender, EventArgs e)
        {
            try
            {
                DataGridViewSelectedRowCollection rows = dataGridViewEmployee.SelectedRows;     //Retrieve selected rows

                if (rows.Count == 0)    //Checks if the user has not selected a row 
                {
                    MessageBox.Show("Error Occured. Please select a row to be deleted.");
                    return;
                }

                foreach (DataGridViewRow row in rows)               //iterates through selected rows
                {
                    string no = row.Cells[0].Value.ToString();      //Gets No of the selected row 
                    proxy.DeleteEmployee(no);                       //Delete employee from database
                    dataGridViewEmployee.Rows.RemoveAt(row.Index);  //Delete from gridView (not visible in GUI)                
                }
            }
            catch (Exception)
            {
                MessageBox.Show("Error Occured. Please make sure that at least one row is selected.");
            }     

        }

        private void btnFind_Click(object sender, EventArgs e)
        {
            try
            {
                txtBoxFindEmployee.Clear(); //Clear the field with information about an employee
                string no = txtBoxNo.Text;  //Gets No from textbox
                CRONUS_Sverige_AB_Employee employee = proxy.FindEmployee(no);   //Find employee from database
                txtBoxFindEmployee.AppendText("No: " + employee.No_ + Environment.NewLine);    //Show information about an employee
                txtBoxFindEmployee.AppendText("First name: " + employee.First_Name + Environment.NewLine); 
                txtBoxFindEmployee.AppendText("Last Name: " + employee.Last_Name + Environment.NewLine);
                txtBoxFindEmployee.AppendText("Job Title: " + employee.Job_Title + Environment.NewLine);
                txtBoxFindEmployee.AppendText("Address: " + employee.Address + Environment.NewLine);
                ClearTxtBoxes();
            }
            catch (Exception)
            {
                MessageBox.Show("Error Occured. Make sure the entered No exists.");
            }
        }
    }
}

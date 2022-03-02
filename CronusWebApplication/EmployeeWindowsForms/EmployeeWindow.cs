using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using EmployeeWindowsForms.CronusReference;

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
            string No = txtBoxNo.Text;                      //Gets the values from the textBoxes
            string FirstName = txtBoxFirstName.Text;
            string LastName = txtBoxLastName.Text;
            string JobTitle = txtBoxJobTitle.Text;
            string Address = txtBoxAddress.Text; 

            if (No.Equals("") || FirstName.Equals("") || LastName.Equals("") || JobTitle.Equals("") || Address.Equals("")) //Checks if all the values are empty
            {
                MessageBox.Show("Error Occured. Please make sure that all fields are filled in."); //If they are empty, send this message
                return;
            }

            try
            {
                proxy.AddEmployee(No, FirstName, LastName, JobTitle, Address);              //Add employee to database
                dataGridViewEmployee.Rows.Add(No, FirstName, LastName, JobTitle, Address);  //Add row in the gridView
                ClearTxtBoxes();    //Clears all the boxes after pushing a button (click) 
            }
            catch (Exception e1) 
            { 
                MessageBox.Show("Error Occured. Message: " + e1.Message);
            }
        }

        private void btnUpdate_Click(object sender, EventArgs e)
        {
            string FirstName = txtBoxFirstName.Text;
            string LastName = txtBoxLastName.Text;
            string JobTitle = txtBoxJobTitle.Text;
            string Address = txtBoxAddress.Text;

            if (FirstName.Equals("") && LastName.Equals("") && JobTitle.Equals("") && Address.Equals(""))
            {
                MessageBox.Show("Error Occured. Please enter at least one value in one of the text fields.");
                return; 
            }

            try
            {

                DataGridViewSelectedRowCollection rows = dataGridViewEmployee.SelectedRows;
                if (rows.Count != 1)
                {
                    MessageBox.Show("Error Occured. Please select one and only one row to be updated.");
                    return;
                }

                string No = rows[0].Cells[0].Value.ToString();
                proxy.UpdateEmployee(No, FirstName, LastName, JobTitle, Address);
                
                if (!FirstName.Equals(""))
                {
                    rows[0].Cells[1].Value = FirstName;
                }
                if (!LastName.Equals(""))
                {
                    rows[0].Cells[2].Value = LastName;
                }
                if (!JobTitle.Equals(""))
                {
                    rows[0].Cells[3].Value = JobTitle;
                }
                if (!Address.Equals(""))
                {
                    rows[0].Cells[4].Value = Address;
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
                DataGridViewSelectedRowCollection rows = dataGridViewEmployee.SelectedRows;

                if (rows.Count == 0)
                {
                    MessageBox.Show("Error Occured. Please select a row to be deleted.");
                    return;
                }

                foreach (DataGridViewRow row in rows)
                {
                    string No = row.Cells[0].Value.ToString();
                    proxy.DeleteEmployee(No);
                    dataGridViewEmployee.Rows.RemoveAt(row.Index);                 
                }
            }
            catch (Exception e1)
            {
                MessageBox.Show("Error Occured. Please make sure that at least one row is selected.");
            }     

        }

        private void btnFind_Click(object sender, EventArgs e)
        {
            try
            {
                txtBoxFindEmployee.Clear();
                string No = txtBoxNo.Text;
                CRONUS_Sverige_AB_Employee employee = proxy.FindEmployee(No);
                txtBoxFindEmployee.AppendText("No: " + employee.No_ + Environment.NewLine);
                txtBoxFindEmployee.AppendText("First name: " + employee.First_Name + Environment.NewLine);
                txtBoxFindEmployee.AppendText("Last Name: " + employee.Last_Name + Environment.NewLine);
                txtBoxFindEmployee.AppendText("Job Title: " + employee.Job_Title + Environment.NewLine);
                txtBoxFindEmployee.AppendText("Address: " + employee.Address + Environment.NewLine);
                ClearTxtBoxes();
            }
            catch (Exception e1)
            {
                MessageBox.Show("Error Occured. Make sure the entered No exists.");
            }
        }
    }
}

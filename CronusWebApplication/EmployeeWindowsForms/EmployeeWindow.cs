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
            CRONUS_Sverige_AB_Employee[] employees = proxy.GetEmployees();
            foreach (CRONUS_Sverige_AB_Employee employee in employees)
            {
                dataGridViewEmployee.Rows.Add(employee.No_, employee.First_Name, employee.Last_Name, employee.Job_Title, employee.Address);
            }
        }

        private void btnCreate_Click(object sender, EventArgs e)
        {
            string No = txtBoxNo.Text;
            string FirstName = txtBoxFirstName.Text;
            string LastName = txtBoxLastName.Text;
            string JobTitle = txtBoxJobTitle.Text;
            string Address = txtBoxAddress.Text; 

            if (No.Equals("") || FirstName.Equals("") || LastName.Equals("") || JobTitle.Equals("") || Address.Equals(""))
            {
                MessageBox.Show("Error Occured. Please make sure that all fields are filled in.");
                return;
            }

            try
            {
                proxy.AddEmployee(No, FirstName, LastName, JobTitle, Address);
                dataGridViewEmployee.Rows.Add(No, FirstName, LastName, JobTitle, Address);
            }
            catch (Exception e1)
            { 
                MessageBox.Show("Error Occured. Please make sure that all fields are filled in and that No is unique.");
            }
        }

        private void btnUpdate_Click(object sender, EventArgs e)
        {
        
        }

        private void btnDelete_Click(object sender, EventArgs e)
        {

        }

        private void btnFind_Click(object sender, EventArgs e)
        {

        }
    }
}

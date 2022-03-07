using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Data.Entity.Validation;

namespace CronusWebApplication
{       //THE CONNECTION (DB) WILL BE FOUND IN Web.config, line 27! (sql/querys)
    public class DataAccessLayer
    {
        //FIND EMPLOYEE
        public CRONUS_Sverige_AB_Employee FindEmployee(string no)  //Method to find employee with No
        {
            using (CronusEntities cronusEntities = new CronusEntities())    
            {
                CRONUS_Sverige_AB_Employee tmpEmployee = cronusEntities.CRONUS_Sverige_AB_Employee.Where(e => e.No_ == no).First(); //Retrieves the first employee with matching No_
                return tmpEmployee;

            }

        }
        //GET EMPLOYEE
        public List<CRONUS_Sverige_AB_Employee> GetEmployees()
        {

            using (CronusEntities cronusEntities = new CronusEntities())
            {
                List<CRONUS_Sverige_AB_Employee> employees = cronusEntities.CRONUS_Sverige_AB_Employee.ToList();    //A list of employees
                return employees;

            }
        }
        //ADD EMPLOYEE
        public void AddEmployee(string no, string firstName, string lastName, string jobTitle, string address)
        {
            using (CronusEntities cronusEntities = new CronusEntities())
            {
                CRONUS_Sverige_AB_Employee tmpEmployee = new CRONUS_Sverige_AB_Employee()   //Create a new employee object
                {
                    No_ = no,                              
                    First_Name = firstName,
                    Middle_Name = "",
                    Last_Name = lastName,
                    Job_Title = jobTitle,
                    Address = address,
                    Initials = "",
                    Search_Name = "",
                    Address_2 = "",                             //CRUD functionalities for No, FirstName, LastName, JobTitle, Address
                    City = "",                                  //Rest of the values/columns in Cronus are set to default values. 
                    Post_Code = "",
                    County = "",
                    Phone_No_ = "",
                    Mobile_Phone_No_ = "",
                    E_Mail = "",
                    Alt__Address_Code = "",
                    Alt__Address_Start_Date = DateTime.Now,
                    Alt__Address_End_Date = DateTime.Now,
                    Birth_Date = DateTime.Now,
                    Social_Security_No_ = "",
                    Union_Code = "",
                    Union_Membership_No_ = "",
                    Sex = 0,
                    Country_Region_Code = "",
                    Manager_No_ = "",
                    Emplymt__Contract_Code = "",
                    Statistics_Group_Code = "",
                    Employment_Date = DateTime.Now,
                    Status = 0,
                    Inactive_Date = DateTime.Now,
                    Cause_of_Inactivity_Code = "",
                    Termination_Date = DateTime.Now,
                    Grounds_for_Term__Code = "",
                    Global_Dimension_1_Code = "",
                    Global_Dimension_2_Code = "",
                    Resource_No_ = "",
                    Last_Date_Modified = DateTime.Now,
                    Extension = "",
                    Pager = "",
                    Fax_No_ = "",
                    Company_E_Mail = "",
                    Title = "",
                    Salespers__Purch__Code = "",
                    No__Series = ""
                };

                cronusEntities.CRONUS_Sverige_AB_Employee.Add(tmpEmployee);     //Add employee

                cronusEntities.SaveChanges();   //Important because this is the way we save changes

            }

        }
        //UPDATE EMPLOYEE
        public void UpdateEmployee(string no, string firstName, string lastName, string jobTitle, string address)
        {
            using (CronusEntities cronusEntities = new CronusEntities())

            {
                CRONUS_Sverige_AB_Employee tmpEmployee = cronusEntities.CRONUS_Sverige_AB_Employee.Where(e => e.No_ == no).First();    //Retrieves the first employee with matching No_

                try

                {
                    if (firstName != "")                           //Every column that has been given a value will be updated
                    {
                        tmpEmployee.First_Name = firstName;
                    }
                    if (lastName != "")
                    {
                        tmpEmployee.Last_Name = lastName;
                    }
                    if (jobTitle != "")
                    {
                        tmpEmployee.Job_Title = jobTitle;
                    }
                    if (address != "")
                    {
                        tmpEmployee.Address = address;
                    }
                    cronusEntities.SaveChanges();
                }

                catch (InvalidOperationException ex)
                {
                    throw;
                }

            }
        }
        //DELETE EMPLOYEE
        public void DeleteEmployee(string no)
        {
            using (CronusEntities cronusEntities = new CronusEntities())
            {

                CRONUS_Sverige_AB_Employee tmpEmployee = this.FindEmployee(no);               

                cronusEntities.CRONUS_Sverige_AB_Employee.Attach(tmpEmployee);

                cronusEntities.CRONUS_Sverige_AB_Employee.Remove(tmpEmployee);

                cronusEntities.SaveChanges();
            }   

        }
    }

}

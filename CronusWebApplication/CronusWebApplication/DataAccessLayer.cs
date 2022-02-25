﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Data.Entity.Validation;

namespace CronusWebApplication
{
    public class DataAccessLayer
    {
        public CRONUS_Sverige_AB_Employee FindEmployee(string No_)
        {
            using (CronusEntities cronusEntities = new CronusEntities())
            {
                CRONUS_Sverige_AB_Employee tmpEmployee = cronusEntities.CRONUS_Sverige_AB_Employee.Where(e => e.No_ == No_).First();
                return tmpEmployee;

            }

        }
        public List<CRONUS_Sverige_AB_Employee> GetEmployees()
        {

            using (CronusEntities cronusEntities = new CronusEntities())
            {
                List<CRONUS_Sverige_AB_Employee> employees = cronusEntities.CRONUS_Sverige_AB_Employee.ToList();
                return employees;

            }
        }

        public void AddEmployee(string No_, string First_Name, string Last_Name, string Job_Title, string Address)
        {
            using (CronusEntities cronusEntities = new CronusEntities())
            {
                CRONUS_Sverige_AB_Employee tmpEmployee = new CRONUS_Sverige_AB_Employee() { 
                    No_ = No_,
                    First_Name = First_Name,
                    Middle_Name = "",
                    Last_Name = Last_Name,
                    Job_Title = Job_Title,
                    Address = Address,
                    Initials = "",
                    Search_Name = "",
                    Address_2 = "",
                    City = "",
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

                cronusEntities.CRONUS_Sverige_AB_Employee.Add(tmpEmployee);

                cronusEntities.SaveChanges();

            }

        }

        public void UpdateEmployee(string No_, string First_Name, string Last_Name, string Job_Title, string Address)
        {
            using (CronusEntities cronusEntities = new CronusEntities())
            {

            }
        }
    }
    
}

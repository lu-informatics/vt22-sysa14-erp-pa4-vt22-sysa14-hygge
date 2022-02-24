using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace CronusWebApplication
{
    public class DataAccessLayer
    {

        public List<CRONUS_Sverige_AB_Employee> GetEmployees() 
        {

            using (CronusEntities cronusEntities = new CronusEntities()) 
            { 
                List<CRONUS_Sverige_AB_Employee> employees = cronusEntities.CRONUS_Sverige_AB_Employee.ToList();
                return employees; 
               
            }
        }

        public void AddEmployee(string First_Name, string Last_Name, string Job_Title)
        { 
            using(CronusEntities cronusEntities =new CronusEntities())
            {
                CRONUS_Sverige_AB_Employee tmpEmployee = new CRONUS_Sverige_AB_Employee() { First_Name = First_Name, Last_Name = Last_Name, Job_Title = Job_Title }; 

               cronusEntities.CRONUS_Sverige_AB_Employee.Add(tmpEmployee);

               cronusEntities.SaveChanges();

            }   
                    
               }
    }
}
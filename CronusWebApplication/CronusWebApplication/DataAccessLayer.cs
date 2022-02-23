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
    }
}
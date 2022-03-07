using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Services;

namespace CronusWebApplication
{
    /// <summary>
    /// Summary description for CronusService
    /// </summary>
    [WebService(Namespace = "http://tempuri.org/")]
    [WebServiceBinding(ConformsTo = WsiProfiles.BasicProfile1_1)]
    [System.ComponentModel.ToolboxItem(false)]
    // To allow this Web Service to be called from script, using ASP.NET AJAX, uncomment the following line. 
    // [System.Web.Script.Services.ScriptService]
    public class CronusService : System.Web.Services.WebService
    {

        DataAccessLayer dataAccessLayer;

        public CronusService() 
        { 
            dataAccessLayer = new DataAccessLayer();       
        }

        //The web methods follow crud and by that calling data access layer

        [WebMethod] 
        public List<CRONUS_Sverige_AB_Employee> GetEmployees() 
        {
            return dataAccessLayer.GetEmployees();
        }

        [WebMethod]
        public void AddEmployee(string no, string firstName, string lastName, string jobTitle, string address)
        {
            dataAccessLayer.AddEmployee(no, firstName, lastName, jobTitle, address);
        }

        [WebMethod]
        public CRONUS_Sverige_AB_Employee FindEmployee(string no)
        {
            return dataAccessLayer.FindEmployee(no);
        }

        [WebMethod]
        public void UpdateEmployee(string no, string firstName, string lastName, string jobTitle, string address)
        {
            dataAccessLayer.UpdateEmployee(no, firstName, lastName, jobTitle, address);
        }

        [WebMethod]
        public void DeleteEmployee(string no) 
        { 
            dataAccessLayer.DeleteEmployee(no);
        }

        
    }
}

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

        [WebMethod]
        public List<CRONUS_Sverige_AB_Employee> GetEmployees() 
        {
            return dataAccessLayer.GetEmployees();
        }

        [WebMethod]
        public void AddEmployee(string No_, string First_Name, string Last_Name, string Job_Title, string Address)
        {
            dataAccessLayer.AddEmployee(No_, First_Name, Last_Name, Job_Title, Address);
        }

        [WebMethod]
        public CRONUS_Sverige_AB_Employee FindEmployee(string No_)
        {
            return dataAccessLayer.FindEmployee(No_);
        }
    }
}

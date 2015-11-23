using System;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using System.Net;
using System.IO;
using System.Web.Script.Serialization;

namespace RESTServicesTest
{
    [TestClass]
    public class RemesaTest
    {
        [TestMethod]
        public void ObtenerRemesa()
        {
            HttpWebRequest req = (HttpWebRequest)WebRequest.Create("http://localhost:61010/Remesas.svc/Remesas/1");
            req.Method = "GET";
            HttpWebResponse res = null;
            try
            {
                res = (HttpWebResponse)req.GetResponse();
                StreamReader reader = new StreamReader(res.GetResponseStream());
                String cadenaJson = reader.ReadToEnd();
                JavaScriptSerializer js = new JavaScriptSerializer();
                Remesa remesa = js.Deserialize<Remesa>(cadenaJson);
                Assert.AreEqual(1, remesa.Numero);
                Assert.AreEqual("Pendiente", remesa.Estado);
            }
            catch (WebException e)
            {
                HttpStatusCode code = ((HttpWebResponse)e.Response).StatusCode;
                String description = ((HttpWebResponse)e.Response).StatusDescription;
                StreamReader reader = new StreamReader(e.Response.GetResponseStream());
                String cadenaJson = reader.ReadToEnd();
                JavaScriptSerializer js = new JavaScriptSerializer();
                String mensaje = js.Deserialize<String>(cadenaJson);
                Assert.AreEqual("La información mostrada puede no estar actualizada", mensaje);
            }
        }

        [TestMethod]
        public void RemesaNoExiste()
        {
            HttpWebRequest req = (HttpWebRequest)WebRequest.Create("http://localhost:61010/Remesas.svc/Remesas/4");
            req.Method = "GET";
            HttpWebResponse res = null;
            try
            {
                res = (HttpWebResponse)req.GetResponse();
                StreamReader reader = new StreamReader(res.GetResponseStream());
                String cadenaJson = reader.ReadToEnd();
                JavaScriptSerializer js = new JavaScriptSerializer();
                Remesa remesa = js.Deserialize<Remesa>(cadenaJson);
                Assert.AreEqual(4, remesa.Numero);
                Assert.AreEqual("Pendiente", remesa.Estado);
            }
            catch (WebException e)
            {
                HttpStatusCode code = ((HttpWebResponse)e.Response).StatusCode;
                String description = ((HttpWebResponse)e.Response).StatusDescription;
                StreamReader reader = new StreamReader(e.Response.GetResponseStream());
                String cadenaJson = reader.ReadToEnd();
                JavaScriptSerializer js = new JavaScriptSerializer();
                String mensaje = js.Deserialize<String>(cadenaJson);
                Assert.AreEqual("La remesa buscada no existe", mensaje);
            }
        }
    }
}

using System;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using SOAPServicesTest.RemesasWS;

namespace SOAPServicesTest
{
    [TestClass]
    public class RemesaTest
    {
        [TestMethod]
        public void ConsultarEstadoRemesa()
        {
            RemesasWS.RemesasClient proxy = new RemesasWS.RemesasClient();            
            Remesa remesaObtener = proxy.ObtenerRemesa(1);
            Assert.AreNotEqual(null, remesaObtener); 
        }

        //[TestMethod]
        //public void CrearRemesa()
        //{
        //    RemesaWS.RemesaClient proxy = new RemesaWS.RemesaClient();
        //    Remesa remesa = proxy.CrearRemesa(321, "04-11-2015", 1);
        //    Remesa remesaObtener = proxy.ObtenerRemesa(remesa.numTrans);
        //    Assert.AreEqual(remesaObtener.numTrans, remesa.numTrans);
        //}

        //[TestMethod]
        //public void EliminarRemesa()
        //{
        //    RemesaWS.RemesaClient proxy = new RemesaWS.RemesaClient();
        //    proxy.EliminarRemesa(7);

        //    Remesa remesa = proxy.ObtenerRemesa(7);
        //    Assert.AreEqual(null, remesa);
        //}

        //[TestMethod]
        //public void ListarRemesas()
        //{
        //    RemesaWS.RemesaClient proxy = new RemesaWS.RemesaClient();
        //    Remesa[] remesas = proxy.ListarRemesas();
        //    Assert.AreEqual(1, remesas.Length);
        //}
    }
}

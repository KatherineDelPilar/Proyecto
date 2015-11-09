using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.ServiceModel;
using System.ServiceModel.Web;
using System.Text;

namespace SOAPServices
{
    // NOTA: puede usar el comando "Rename" del menú "Refactorizar" para cambiar el nombre de clase "Service1" en el código, en svc y en el archivo de configuración.
    public class RemesaEjecutarOperacion : IRemesa
    {
        public String consultarEstado(int numRemesa)
        {
            try
            {
                Remesa remesa = RemesaDAO.obtenerRemesa(numRemesa);
                return "Num: " + remesa.numTrans + " \nFecha: " + remesa.fecTrans +" \nEstado: " + remesa.estTrans;
            }
            catch (Exception e)
            {
                return null;
            }
        }
    }
}

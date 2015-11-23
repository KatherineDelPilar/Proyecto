using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.ServiceModel;
using System.ServiceModel.Web;
using System.Text;

namespace RESTServices
{
    // NOTA: puede usar el comando "Rename" del menú "Refactorizar" para cambiar el nombre de clase "Service1" en el código, en svc y en el archivo de configuración.
    // NOTE: para iniciar el Cliente de prueba WCF para probar este servicio, seleccione Service1.svc o Service1.svc.cs en el Explorador de soluciones e inicie la depuración.
    public class Remesas : IRemesas
    {
        private RemesaDAO remesaDAO = null;

        private RemesaDAO DAO
        {
            get
            {
                if (remesaDAO == null)
                    remesaDAO = new RemesaDAO();
                return remesaDAO;
            }
        }

        public Remesa ObtenerRemesa(String numero)
        {
            validarHora();
            Remesa remesa = DAO.Obtener(Int32.Parse(numero));
            validarRemesa(remesa);
            return remesa;
        }

        private void validarHora()
        {
            DateTime fechaActual = DateTime.Now;

            int horaActual = fechaActual.Hour;

            if (horaActual >= 0 && horaActual <= 1)
            {
                throw new WebFaultException<string>("La información mostrada puede no estar actualizada", System.Net.HttpStatusCode.InternalServerError);
            }
        }

        private void validarRemesa(Remesa remesa)
        {
            if (remesa == null)
            {
                throw new WebFaultException<string>("La remesa buscada no existe", System.Net.HttpStatusCode.InternalServerError);
            }
        }
    }
}

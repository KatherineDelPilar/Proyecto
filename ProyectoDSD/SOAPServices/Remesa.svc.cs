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

        public Remesa CrearRemesa(int pin, DateTime fecha, Agencia agencia, Moneda moneda, decimal monto)
        {
            Remesa remesa = new Remesa()
            {
                PIN = pin,
                Fecha = fecha,
                Agencia = agencia,
                Moneda = moneda,
                Monto = monto,
                Estado = "Pendiente"
            };
            return DAO.Crear(remesa);
        }

        public Remesa ObtenerRemesa(int numero)
        {
            return DAO.Obtener(numero);
        }

        public Remesa ModificarRemesa(int numero, int pin, DateTime fecha, Agencia agencia, Moneda moneda, decimal monto, string estado)
        {
            Remesa remesa = new Remesa()
            {
                Numero = numero,
                PIN = pin,
                Fecha = fecha,
                Agencia = agencia,
                Moneda = moneda,
                Monto = monto,
                Estado = estado
            };
            return DAO.Modificar(remesa);
        }

        public void EliminarRemesa(int numero)
        {
            Remesa remesa = DAO.Obtener(numero);
            DAO.Eliminar(remesa);
        }

        public List<Remesa> ListarRemesas()
        {
            return DAO.ListarTodos().ToList();
        }
    }
}

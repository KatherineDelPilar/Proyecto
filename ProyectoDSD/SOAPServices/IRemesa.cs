using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.ServiceModel;
using System.ServiceModel.Web;
using System.Text;

namespace SOAPServices
{
    // NOTA: puede usar el comando "Rename" del menú "Refactorizar" para cambiar el nombre de interfaz "IService1" en el código y en el archivo de configuración a la vez.
    [ServiceContract]
    public interface IRemesa
    {
        [OperationContract]
        Remesa CrearRemesa(int pin, DateTime fecha, Agencia agencia, Moneda moneda, decimal monto);

        [OperationContract]
        Remesa ObtenerRemesa(int numero);

        [OperationContract]
        Remesa ModificarRemesa(int numero, int pin, DateTime fecha, Agencia agencia, Moneda moneda, decimal monto, string estado);

        [OperationContract]
        void EliminarRemesa(int numero);

        [OperationContract]
        List<Remesa> ListarRemesas();
    }
}

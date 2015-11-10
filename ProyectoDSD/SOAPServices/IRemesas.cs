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
    public interface IRemesas
    {
        [OperationContract]
        [FaultContract(typeof(HoraExcedidaException))]
        Remesa CrearRemesa(int pin, DateTime fecha, Agencia agencia, Moneda moneda, decimal monto);

        [OperationContract]
        [FaultContract(typeof(HoraExcedidaException))]
        Remesa ObtenerRemesa(int numero);

        [OperationContract]
        [FaultContract(typeof(HoraExcedidaException))]
        Remesa ModificarRemesa(int numero, int pin, DateTime fecha, Agencia agencia, Moneda moneda, decimal monto, string estado);

        [OperationContract]
        [FaultContract(typeof(HoraExcedidaException))]
        void EliminarRemesa(int numero);

        [OperationContract]
        [FaultContract(typeof(HoraExcedidaException))]
        List<Remesa> ListarRemesas();
    }
}

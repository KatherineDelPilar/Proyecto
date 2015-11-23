using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.ServiceModel;
using System.ServiceModel.Web;
using System.Text;

namespace RESTServices
{
    [ServiceContract]
    public interface IRemesas
    {
        [OperationContract]
        [WebInvoke(Method="GET", UriTemplate="Remesas/{numero}", ResponseFormat=WebMessageFormat.Json)]        
        Remesa ObtenerRemesa(String numero);

    }
}

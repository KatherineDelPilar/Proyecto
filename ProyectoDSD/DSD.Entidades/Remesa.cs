using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Runtime.Serialization;

[DataContract]
public class Remesa
{
    [DataMember]
    public int Numero { get; set; }
    [DataMember]
    public int PIN { get; set; }
    [DataMember]
    public DateTime Fecha { get; set; }
    [DataMember]
    public Agencia Agencia { get; set; }
    [DataMember]
    public Moneda Moneda { get; set; }
    [DataMember]
    public decimal Monto { get; set; }
    [DataMember]
    public String Estado { get; set; }
}

[DataContract]
public class HoraExcedidaException {

    [DataMember]
    public string DetalleError;

    public HoraExcedidaException(string error)
    {
        DetalleError = error;
    }
}

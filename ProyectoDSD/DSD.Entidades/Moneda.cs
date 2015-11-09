using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Runtime.Serialization;

[DataContract]
public class Moneda
{
    [DataMember]
    public int ID { get; set; }
    [DataMember]
    public String Codigo { get; set; }
    [DataMember]
    public String Nombre { get; set; }
    [DataMember]
    public String Simbolo { get; set; }
}


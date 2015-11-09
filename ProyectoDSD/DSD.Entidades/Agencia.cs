using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Runtime.Serialization;

[DataContract]
public class Agencia
{
    [DataMember]
    public int ID { get; set; }
    [DataMember]
    public String Codigo { get; set; }
    [DataMember]
    public String Nombre { get; set; }
    
}


/**
 * Moneda.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07;

public class Moneda  implements java.io.Serializable {
    private java.lang.String codigo;

    private java.lang.Integer ID;

    private java.lang.String nombre;

    private java.lang.String simbolo;

    public Moneda() {
    }

    public Moneda(
           java.lang.String codigo,
           java.lang.Integer ID,
           java.lang.String nombre,
           java.lang.String simbolo) {
           this.codigo = codigo;
           this.ID = ID;
           this.nombre = nombre;
           this.simbolo = simbolo;
    }


    /**
     * Gets the codigo value for this Moneda.
     * 
     * @return codigo
     */
    public java.lang.String getCodigo() {
        return codigo;
    }


    /**
     * Sets the codigo value for this Moneda.
     * 
     * @param codigo
     */
    public void setCodigo(java.lang.String codigo) {
        this.codigo = codigo;
    }


    /**
     * Gets the ID value for this Moneda.
     * 
     * @return ID
     */
    public java.lang.Integer getID() {
        return ID;
    }


    /**
     * Sets the ID value for this Moneda.
     * 
     * @param ID
     */
    public void setID(java.lang.Integer ID) {
        this.ID = ID;
    }


    /**
     * Gets the nombre value for this Moneda.
     * 
     * @return nombre
     */
    public java.lang.String getNombre() {
        return nombre;
    }


    /**
     * Sets the nombre value for this Moneda.
     * 
     * @param nombre
     */
    public void setNombre(java.lang.String nombre) {
        this.nombre = nombre;
    }


    /**
     * Gets the simbolo value for this Moneda.
     * 
     * @return simbolo
     */
    public java.lang.String getSimbolo() {
        return simbolo;
    }


    /**
     * Sets the simbolo value for this Moneda.
     * 
     * @param simbolo
     */
    public void setSimbolo(java.lang.String simbolo) {
        this.simbolo = simbolo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Moneda)) return false;
        Moneda other = (Moneda) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codigo==null && other.getCodigo()==null) || 
             (this.codigo!=null &&
              this.codigo.equals(other.getCodigo()))) &&
            ((this.ID==null && other.getID()==null) || 
             (this.ID!=null &&
              this.ID.equals(other.getID()))) &&
            ((this.nombre==null && other.getNombre()==null) || 
             (this.nombre!=null &&
              this.nombre.equals(other.getNombre()))) &&
            ((this.simbolo==null && other.getSimbolo()==null) || 
             (this.simbolo!=null &&
              this.simbolo.equals(other.getSimbolo())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getCodigo() != null) {
            _hashCode += getCodigo().hashCode();
        }
        if (getID() != null) {
            _hashCode += getID().hashCode();
        }
        if (getNombre() != null) {
            _hashCode += getNombre().hashCode();
        }
        if (getSimbolo() != null) {
            _hashCode += getSimbolo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Moneda.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/", "Moneda"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/", "Codigo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/", "ID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombre");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/", "Nombre"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("simbolo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/", "Simbolo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}

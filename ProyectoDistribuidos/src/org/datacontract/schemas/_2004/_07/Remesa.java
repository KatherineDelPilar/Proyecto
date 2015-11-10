/**
 * Remesa.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07;

public class Remesa  implements java.io.Serializable {
    private org.datacontract.schemas._2004._07.Agencia agencia;

    private java.lang.String estado;

    private java.util.Calendar fecha;

    private org.datacontract.schemas._2004._07.Moneda moneda;

    private java.math.BigDecimal monto;

    private java.lang.Integer numero;

    private java.lang.Integer PIN;

    public Remesa() {
    }

    public Remesa(
           org.datacontract.schemas._2004._07.Agencia agencia,
           java.lang.String estado,
           java.util.Calendar fecha,
           org.datacontract.schemas._2004._07.Moneda moneda,
           java.math.BigDecimal monto,
           java.lang.Integer numero,
           java.lang.Integer PIN) {
           this.agencia = agencia;
           this.estado = estado;
           this.fecha = fecha;
           this.moneda = moneda;
           this.monto = monto;
           this.numero = numero;
           this.PIN = PIN;
    }


    /**
     * Gets the agencia value for this Remesa.
     * 
     * @return agencia
     */
    public org.datacontract.schemas._2004._07.Agencia getAgencia() {
        return agencia;
    }


    /**
     * Sets the agencia value for this Remesa.
     * 
     * @param agencia
     */
    public void setAgencia(org.datacontract.schemas._2004._07.Agencia agencia) {
        this.agencia = agencia;
    }


    /**
     * Gets the estado value for this Remesa.
     * 
     * @return estado
     */
    public java.lang.String getEstado() {
        return estado;
    }


    /**
     * Sets the estado value for this Remesa.
     * 
     * @param estado
     */
    public void setEstado(java.lang.String estado) {
        this.estado = estado;
    }


    /**
     * Gets the fecha value for this Remesa.
     * 
     * @return fecha
     */
    public java.util.Calendar getFecha() {
        return fecha;
    }


    /**
     * Sets the fecha value for this Remesa.
     * 
     * @param fecha
     */
    public void setFecha(java.util.Calendar fecha) {
        this.fecha = fecha;
    }


    /**
     * Gets the moneda value for this Remesa.
     * 
     * @return moneda
     */
    public org.datacontract.schemas._2004._07.Moneda getMoneda() {
        return moneda;
    }


    /**
     * Sets the moneda value for this Remesa.
     * 
     * @param moneda
     */
    public void setMoneda(org.datacontract.schemas._2004._07.Moneda moneda) {
        this.moneda = moneda;
    }


    /**
     * Gets the monto value for this Remesa.
     * 
     * @return monto
     */
    public java.math.BigDecimal getMonto() {
        return monto;
    }


    /**
     * Sets the monto value for this Remesa.
     * 
     * @param monto
     */
    public void setMonto(java.math.BigDecimal monto) {
        this.monto = monto;
    }


    /**
     * Gets the numero value for this Remesa.
     * 
     * @return numero
     */
    public java.lang.Integer getNumero() {
        return numero;
    }


    /**
     * Sets the numero value for this Remesa.
     * 
     * @param numero
     */
    public void setNumero(java.lang.Integer numero) {
        this.numero = numero;
    }


    /**
     * Gets the PIN value for this Remesa.
     * 
     * @return PIN
     */
    public java.lang.Integer getPIN() {
        return PIN;
    }


    /**
     * Sets the PIN value for this Remesa.
     * 
     * @param PIN
     */
    public void setPIN(java.lang.Integer PIN) {
        this.PIN = PIN;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Remesa)) return false;
        Remesa other = (Remesa) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.agencia==null && other.getAgencia()==null) || 
             (this.agencia!=null &&
              this.agencia.equals(other.getAgencia()))) &&
            ((this.estado==null && other.getEstado()==null) || 
             (this.estado!=null &&
              this.estado.equals(other.getEstado()))) &&
            ((this.fecha==null && other.getFecha()==null) || 
             (this.fecha!=null &&
              this.fecha.equals(other.getFecha()))) &&
            ((this.moneda==null && other.getMoneda()==null) || 
             (this.moneda!=null &&
              this.moneda.equals(other.getMoneda()))) &&
            ((this.monto==null && other.getMonto()==null) || 
             (this.monto!=null &&
              this.monto.equals(other.getMonto()))) &&
            ((this.numero==null && other.getNumero()==null) || 
             (this.numero!=null &&
              this.numero.equals(other.getNumero()))) &&
            ((this.PIN==null && other.getPIN()==null) || 
             (this.PIN!=null &&
              this.PIN.equals(other.getPIN())));
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
        if (getAgencia() != null) {
            _hashCode += getAgencia().hashCode();
        }
        if (getEstado() != null) {
            _hashCode += getEstado().hashCode();
        }
        if (getFecha() != null) {
            _hashCode += getFecha().hashCode();
        }
        if (getMoneda() != null) {
            _hashCode += getMoneda().hashCode();
        }
        if (getMonto() != null) {
            _hashCode += getMonto().hashCode();
        }
        if (getNumero() != null) {
            _hashCode += getNumero().hashCode();
        }
        if (getPIN() != null) {
            _hashCode += getPIN().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Remesa.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/", "Remesa"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agencia");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/", "Agencia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/", "Agencia"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estado");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/", "Estado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fecha");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/", "Fecha"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("moneda");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/", "Moneda"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/", "Moneda"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("monto");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/", "Monto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numero");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/", "Numero"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PIN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/", "PIN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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

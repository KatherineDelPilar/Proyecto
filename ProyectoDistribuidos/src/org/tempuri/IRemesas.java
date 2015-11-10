/**
 * IRemesas.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public interface IRemesas extends java.rmi.Remote {
    public org.datacontract.schemas._2004._07.Remesa crearRemesa(java.lang.Integer pin, java.util.Calendar fecha, org.datacontract.schemas._2004._07.Agencia agencia, org.datacontract.schemas._2004._07.Moneda moneda, java.math.BigDecimal monto) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.HoraExcedidaException;
    public org.datacontract.schemas._2004._07.Remesa obtenerRemesa(java.lang.Integer numero) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.HoraExcedidaException;
    public org.datacontract.schemas._2004._07.Remesa modificarRemesa(java.lang.Integer numero, java.lang.Integer pin, java.util.Calendar fecha, org.datacontract.schemas._2004._07.Agencia agencia, org.datacontract.schemas._2004._07.Moneda moneda, java.math.BigDecimal monto, java.lang.String estado) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.HoraExcedidaException;
    public void eliminarRemesa(java.lang.Integer numero) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.HoraExcedidaException;
    public org.datacontract.schemas._2004._07.Remesa[] listarRemesas() throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.HoraExcedidaException;
}

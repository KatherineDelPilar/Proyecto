package org.tempuri;

public class IRemesaProxy implements org.tempuri.IRemesa {
  private String _endpoint = null;
  private org.tempuri.IRemesa iRemesa = null;
  
  public IRemesaProxy() {
    _initIRemesaProxy();
  }
  
  public IRemesaProxy(String endpoint) {
    _endpoint = endpoint;
    _initIRemesaProxy();
  }
  
  private void _initIRemesaProxy() {
    try {
      iRemesa = (new org.tempuri.RemesaEjecutarOperacionLocator()).getBasicHttpBinding_IRemesa();
      if (iRemesa != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)iRemesa)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)iRemesa)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (iRemesa != null)
      ((javax.xml.rpc.Stub)iRemesa)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.tempuri.IRemesa getIRemesa() {
    if (iRemesa == null)
      _initIRemesaProxy();
    return iRemesa;
  }
  
  public org.datacontract.schemas._2004._07.Remesa crearRemesa(java.lang.Integer pin, java.util.Calendar fecha, org.datacontract.schemas._2004._07.Agencia agencia, org.datacontract.schemas._2004._07.Moneda moneda, java.math.BigDecimal monto) throws java.rmi.RemoteException{
    if (iRemesa == null)
      _initIRemesaProxy();
    return iRemesa.crearRemesa(pin, fecha, agencia, moneda, monto);
  }
  
  public org.datacontract.schemas._2004._07.Remesa obtenerRemesa(java.lang.Integer numero) throws java.rmi.RemoteException{
    if (iRemesa == null)
      _initIRemesaProxy();
    return iRemesa.obtenerRemesa(numero);
  }
  
  public org.datacontract.schemas._2004._07.Remesa modificarRemesa(java.lang.Integer numero, java.lang.Integer pin, java.util.Calendar fecha, org.datacontract.schemas._2004._07.Agencia agencia, org.datacontract.schemas._2004._07.Moneda moneda, java.math.BigDecimal monto, java.lang.String estado) throws java.rmi.RemoteException{
    if (iRemesa == null)
      _initIRemesaProxy();
    return iRemesa.modificarRemesa(numero, pin, fecha, agencia, moneda, monto, estado);
  }
  
  public void eliminarRemesa(java.lang.Integer numero) throws java.rmi.RemoteException{
    if (iRemesa == null)
      _initIRemesaProxy();
    iRemesa.eliminarRemesa(numero);
  }
  
  public org.datacontract.schemas._2004._07.Remesa[] listarRemesas() throws java.rmi.RemoteException{
    if (iRemesa == null)
      _initIRemesaProxy();
    return iRemesa.listarRemesas();
  }
  
  
}
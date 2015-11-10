package org.tempuri;

public class IRemesasProxy implements org.tempuri.IRemesas {
  private String _endpoint = null;
  private org.tempuri.IRemesas iRemesas = null;
  
  public IRemesasProxy() {
    _initIRemesasProxy();
  }
  
  public IRemesasProxy(String endpoint) {
    _endpoint = endpoint;
    _initIRemesasProxy();
  }
  
  private void _initIRemesasProxy() {
    try {
      iRemesas = (new org.tempuri.RemesasLocator()).getBasicHttpBinding_IRemesas();
      if (iRemesas != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)iRemesas)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)iRemesas)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (iRemesas != null)
      ((javax.xml.rpc.Stub)iRemesas)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.tempuri.IRemesas getIRemesas() {
    if (iRemesas == null)
      _initIRemesasProxy();
    return iRemesas;
  }
  
  public org.datacontract.schemas._2004._07.Remesa crearRemesa(java.lang.Integer pin, java.util.Calendar fecha, org.datacontract.schemas._2004._07.Agencia agencia, org.datacontract.schemas._2004._07.Moneda moneda, java.math.BigDecimal monto) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.HoraExcedidaException{
    if (iRemesas == null)
      _initIRemesasProxy();
    return iRemesas.crearRemesa(pin, fecha, agencia, moneda, monto);
  }
  
  public org.datacontract.schemas._2004._07.Remesa obtenerRemesa(java.lang.Integer numero) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.HoraExcedidaException{
    if (iRemesas == null)
      _initIRemesasProxy();
    return iRemesas.obtenerRemesa(numero);
  }
  
  public org.datacontract.schemas._2004._07.Remesa modificarRemesa(java.lang.Integer numero, java.lang.Integer pin, java.util.Calendar fecha, org.datacontract.schemas._2004._07.Agencia agencia, org.datacontract.schemas._2004._07.Moneda moneda, java.math.BigDecimal monto, java.lang.String estado) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.HoraExcedidaException{
    if (iRemesas == null)
      _initIRemesasProxy();
    return iRemesas.modificarRemesa(numero, pin, fecha, agencia, moneda, monto, estado);
  }
  
  public void eliminarRemesa(java.lang.Integer numero) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.HoraExcedidaException{
    if (iRemesas == null)
      _initIRemesasProxy();
    iRemesas.eliminarRemesa(numero);
  }
  
  public org.datacontract.schemas._2004._07.Remesa[] listarRemesas() throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.HoraExcedidaException{
    if (iRemesas == null)
      _initIRemesasProxy();
    return iRemesas.listarRemesas();
  }
  
  
}
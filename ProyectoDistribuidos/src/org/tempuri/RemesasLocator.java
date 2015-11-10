/**
 * RemesasLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class RemesasLocator extends org.apache.axis.client.Service implements org.tempuri.Remesas {

    public RemesasLocator() {
    }


    public RemesasLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public RemesasLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for BasicHttpBinding_IRemesas
    private java.lang.String BasicHttpBinding_IRemesas_address = "http://localhost:2835/Remesas.svc";

    public java.lang.String getBasicHttpBinding_IRemesasAddress() {
        return BasicHttpBinding_IRemesas_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String BasicHttpBinding_IRemesasWSDDServiceName = "BasicHttpBinding_IRemesas";

    public java.lang.String getBasicHttpBinding_IRemesasWSDDServiceName() {
        return BasicHttpBinding_IRemesasWSDDServiceName;
    }

    public void setBasicHttpBinding_IRemesasWSDDServiceName(java.lang.String name) {
        BasicHttpBinding_IRemesasWSDDServiceName = name;
    }

    public org.tempuri.IRemesas getBasicHttpBinding_IRemesas() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(BasicHttpBinding_IRemesas_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getBasicHttpBinding_IRemesas(endpoint);
    }

    public org.tempuri.IRemesas getBasicHttpBinding_IRemesas(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            org.tempuri.BasicHttpBinding_IRemesasStub _stub = new org.tempuri.BasicHttpBinding_IRemesasStub(portAddress, this);
            _stub.setPortName(getBasicHttpBinding_IRemesasWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setBasicHttpBinding_IRemesasEndpointAddress(java.lang.String address) {
        BasicHttpBinding_IRemesas_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (org.tempuri.IRemesas.class.isAssignableFrom(serviceEndpointInterface)) {
                org.tempuri.BasicHttpBinding_IRemesasStub _stub = new org.tempuri.BasicHttpBinding_IRemesasStub(new java.net.URL(BasicHttpBinding_IRemesas_address), this);
                _stub.setPortName(getBasicHttpBinding_IRemesasWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("BasicHttpBinding_IRemesas".equals(inputPortName)) {
            return getBasicHttpBinding_IRemesas();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://tempuri.org/", "Remesas");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://tempuri.org/", "BasicHttpBinding_IRemesas"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("BasicHttpBinding_IRemesas".equals(portName)) {
            setBasicHttpBinding_IRemesasEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}

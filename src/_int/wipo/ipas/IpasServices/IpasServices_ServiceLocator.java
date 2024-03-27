/**
 * IpasServices_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _int.wipo.ipas.IpasServices;

public class IpasServices_ServiceLocator extends org.apache.axis.client.Service implements _int.wipo.ipas.IpasServices.IpasServices_Service {

    public IpasServices_ServiceLocator() {
    }


    public IpasServices_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public IpasServices_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for IpasServicesPort
    private java.lang.String IpasServicesPort_address = "http://10.10.0.35:8082/IpasServices/IpasServices";
    //private java.lang.String IpasServicesPort_address = "http://localhost:8082/IpasServices/IpasServices";

    public java.lang.String getIpasServicesPortAddress() {
        return IpasServicesPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String IpasServicesPortWSDDServiceName = "IpasServicesPort";

    public java.lang.String getIpasServicesPortWSDDServiceName() {
        return IpasServicesPortWSDDServiceName;
    }

    public void setIpasServicesPortWSDDServiceName(java.lang.String name) {
        IpasServicesPortWSDDServiceName = name;
    }

    public _int.wipo.ipas.IpasServices.IpasServices_PortType getIpasServicesPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(IpasServicesPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getIpasServicesPort(endpoint);
    }

    public _int.wipo.ipas.IpasServices.IpasServices_PortType getIpasServicesPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            _int.wipo.ipas.IpasServices.IpasServicesPortBindingStub _stub = new _int.wipo.ipas.IpasServices.IpasServicesPortBindingStub(portAddress, this);
            _stub.setPortName(getIpasServicesPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setIpasServicesPortEndpointAddress(java.lang.String address) {
        IpasServicesPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (_int.wipo.ipas.IpasServices.IpasServices_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                _int.wipo.ipas.IpasServices.IpasServicesPortBindingStub _stub = new _int.wipo.ipas.IpasServices.IpasServicesPortBindingStub(new java.net.URL(IpasServicesPort_address), this);
                _stub.setPortName(getIpasServicesPortWSDDServiceName());
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
        if ("IpasServicesPort".equals(inputPortName)) {
            return getIpasServicesPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasServices");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasServicesPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("IpasServicesPort".equals(portName)) {
            setIpasServicesPortEndpointAddress(address);
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

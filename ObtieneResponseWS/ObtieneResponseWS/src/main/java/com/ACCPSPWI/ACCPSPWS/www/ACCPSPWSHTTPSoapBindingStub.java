/**
 * ACCPSPWSHTTPSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ACCPSPWI.ACCPSPWS.www;

public class ACCPSPWSHTTPSoapBindingStub extends org.apache.axis.client.Stub implements com.ACCPSPWI.ACCPSPWS.www.ACCPSPWSPort {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[1];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ACCPSPWSOperation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.ACCPSPWS.ACCPSPWI.Request.com", "accpspwi_entrada"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.ACCPSPWS.ACCPSPWI.Request.com", ">ProgramInterface>accpspwi_entrada"), com.Request.ACCPSPWI.ACCPSPWS.www.ProgramInterfaceAccpspwi_entradaAccpspwi_i_lineas[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("http://www.ACCPSPWS.ACCPSPWI.Request.com", "accpspwi_i_lineas"));
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.ACCPSPWS.ACCPSPWI.Response.com", ">ProgramInterface>accpspwo_salida"));
        oper.setReturnClass(com.Response.ACCPSPWI.ACCPSPWS.www.ProgramInterfaceAccpspwo_salida.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.ACCPSPWS.ACCPSPWI.Response.com", "accpspwo_salida"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

    }

    public ACCPSPWSHTTPSoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public ACCPSPWSHTTPSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public ACCPSPWSHTTPSoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://www.ACCPSPWS.ACCPSPWI.Request.com", ">>>ProgramInterface>accpspwi_entrada>accpspwi_i_lineas>accpspwi_i_area");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.ACCPSPWS.ACCPSPWI.Request.com", ">>>ProgramInterface>accpspwi_entrada>accpspwi_i_lineas>accpspwi_i_ini_vi");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.ACCPSPWS.ACCPSPWI.Request.com", ">>>ProgramInterface>accpspwi_entrada>accpspwi_i_lineas>accpspwi_i_num_com");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.ACCPSPWS.ACCPSPWI.Request.com", ">>ProgramInterface>accpspwi_entrada>accpspwi_i_lineas");
            cachedSerQNames.add(qName);
            cls = com.Request.ACCPSPWI.ACCPSPWS.www.ProgramInterfaceAccpspwi_entradaAccpspwi_i_lineas.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.ACCPSPWS.ACCPSPWI.Request.com", ">ProgramInterface>accpspwi_entrada");
            cachedSerQNames.add(qName);
            cls = com.Request.ACCPSPWI.ACCPSPWS.www.ProgramInterfaceAccpspwi_entradaAccpspwi_i_lineas[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.ACCPSPWS.ACCPSPWI.Request.com", ">>ProgramInterface>accpspwi_entrada>accpspwi_i_lineas");
            qName2 = new javax.xml.namespace.QName("http://www.ACCPSPWS.ACCPSPWI.Request.com", "accpspwi_i_lineas");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.ACCPSPWS.ACCPSPWI.Response.com", ">>>>ProgramInterface>accpspwo_salida>accpspwo_o_lineas>accpspwo_ps_lineas>accpspwo_o_cod_fam");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.ACCPSPWS.ACCPSPWI.Response.com", ">>>>ProgramInterface>accpspwo_salida>accpspwo_o_lineas>accpspwo_ps_lineas>accpspwo_o_desc");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.ACCPSPWS.ACCPSPWI.Response.com", ">>>>ProgramInterface>accpspwo_salida>accpspwo_o_lineas>accpspwo_ps_lineas>accpspwo_o_ps");
            cachedSerQNames.add(qName);
            cls = org.apache.axis.types.UnsignedInt.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.ACCPSPWS.ACCPSPWI.Response.com", ">>>>ProgramInterface>accpspwo_salida>accpspwo_o_lineas>accpspwo_ps_lineas>accpspwo_o_subgr2");
            cachedSerQNames.add(qName);
            cls = org.apache.axis.types.UnsignedInt.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.ACCPSPWS.ACCPSPWI.Response.com", ">>>ProgramInterface>accpspwo_salida>accpspwo_o_lineas>accpspwo_o_area");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.ACCPSPWS.ACCPSPWI.Response.com", ">>>ProgramInterface>accpspwo_salida>accpspwo_o_lineas>accpspwo_o_fono");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.ACCPSPWS.ACCPSPWI.Response.com", ">>>ProgramInterface>accpspwo_salida>accpspwo_o_lineas>accpspwo_ps_lineas");
            cachedSerQNames.add(qName);
            cls = com.Response.ACCPSPWI.ACCPSPWS.www.ProgramInterfaceAccpspwo_salidaAccpspwo_o_lineasAccpspwo_ps_lineas.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.ACCPSPWS.ACCPSPWI.Response.com", ">>ProgramInterface>accpspwo_salida>accpspwo_o_cod_db");
            cachedSerQNames.add(qName);
            cls = org.apache.axis.types.UnsignedInt.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.ACCPSPWS.ACCPSPWI.Response.com", ">>ProgramInterface>accpspwo_salida>accpspwo_o_cod_error");
            cachedSerQNames.add(qName);
            cls = org.apache.axis.types.UnsignedInt.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.ACCPSPWS.ACCPSPWI.Response.com", ">>ProgramInterface>accpspwo_salida>accpspwo_o_desc_error");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.ACCPSPWS.ACCPSPWI.Response.com", ">>ProgramInterface>accpspwo_salida>accpspwo_o_lineas");
            cachedSerQNames.add(qName);
            cls = com.Response.ACCPSPWI.ACCPSPWS.www.ProgramInterfaceAccpspwo_salidaAccpspwo_o_lineas.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.ACCPSPWS.ACCPSPWI.Response.com", ">>ProgramInterface>accpspwo_salida>accpspwo_o_programa");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.ACCPSPWS.ACCPSPWI.Response.com", ">ProgramInterface>accpspwo_salida");
            cachedSerQNames.add(qName);
            cls = com.Response.ACCPSPWI.ACCPSPWS.www.ProgramInterfaceAccpspwo_salida.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public com.Response.ACCPSPWI.ACCPSPWS.www.ProgramInterfaceAccpspwo_salida ACCPSPWSOperation(com.Request.ACCPSPWI.ACCPSPWS.www.ProgramInterfaceAccpspwi_entradaAccpspwi_i_lineas[] accpspwi_entrada) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.ACCPSPWS.ACCPSPWI.Request.com", "ACCPSPWSOperation"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {accpspwi_entrada});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.Response.ACCPSPWI.ACCPSPWS.www.ProgramInterfaceAccpspwo_salida) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.Response.ACCPSPWI.ACCPSPWS.www.ProgramInterfaceAccpspwo_salida) org.apache.axis.utils.JavaUtils.convert(_resp, com.Response.ACCPSPWI.ACCPSPWS.www.ProgramInterfaceAccpspwo_salida.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}

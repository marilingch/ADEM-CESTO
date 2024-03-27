/**
 * IpasServicesPortBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _int.wipo.ipas.IpasServices;

public class IpasServicesPortBindingStub extends org.apache.axis.client.Stub implements _int.wipo.ipas.IpasServices.IpasServices_PortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[169];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
        _initOperationDesc4();
        _initOperationDesc5();
        _initOperationDesc6();
        _initOperationDesc7();
        _initOperationDesc8();
        _initOperationDesc9();
        _initOperationDesc10();
        _initOperationDesc11();
        _initOperationDesc12();
        _initOperationDesc13();
        _initOperationDesc14();
        _initOperationDesc15();
        _initOperationDesc16();
        _initOperationDesc17();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ProcessGroupImportFromExternalPhysicalTracking");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cProcessGroupId"), _int.wipo.ipas.IpasServices.CProcessGroupId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasInteger"));
        oper.setReturnClass(_int.wipo.ipas.IpasServices.IpasInteger.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CommonServicesConfigParamRead");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CommonServicesConfigParamUpdate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CommonServicesEnvironmentGetList");
        oper.setReturnType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cEnvironment"));
        oper.setReturnClass(_int.wipo.ipas.IpasServices.CEnvironment[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CommonServicesEnvironmentTestConnection");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CommonServicesGetRoleAuthorisationList");
        oper.setReturnType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cRoleAuthorization"));
        oper.setReturnClass(_int.wipo.ipas.IpasServices.CRoleAuthorization[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ProcessGetUserStatusStatisticsList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cUserId"), _int.wipo.ipas.IpasServices.CUserId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cStatusId"), _int.wipo.ipas.IpasServices.CStatusId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg3"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg4"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg5"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cUserStatusStatistics"));
        oper.setReturnClass(_int.wipo.ipas.IpasServices.CUserStatusStatistics[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("OutputFieldGetTemplateOutputFieldCodeList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cOutputFieldCode"));
        oper.setReturnClass(_int.wipo.ipas.IpasServices.COutputFieldCode[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("OfficedocGetMailmergeFieldList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cOfficedocId"), _int.wipo.ipas.IpasServices.COfficedocId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cOutputFieldCode"), _int.wipo.ipas.IpasServices.COutputFieldCode[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cOutputFieldCode"), _int.wipo.ipas.IpasServices.COutputFieldCode[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cOutputField"));
        oper.setReturnClass(_int.wipo.ipas.IpasServices.COutputField[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ProcessGetPossibleSpecialActionTypeList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cStatusId"), _int.wipo.ipas.IpasServices.CStatusId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg3"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasInteger"), _int.wipo.ipas.IpasServices.IpasInteger.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg4"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg5"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cActionType"));
        oper.setReturnClass(_int.wipo.ipas.IpasServices.CActionType[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("FileCheckIntegrityForNewFileId");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cFileId"), _int.wipo.ipas.IpasServices.CFileId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UserdocCheckIntegrityForNewDocId");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cDocumentId"), _int.wipo.ipas.IpasServices.CDocumentId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UserdocCheckIntegrityForNewDocSeqId");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cDocumentSeqId"), _int.wipo.ipas.IpasServices.CDocumentSeqId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("MadridProcessPendingInputTransactions");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasInteger"), _int.wipo.ipas.IpasServices.IpasInteger.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cMadridProcessingResult"));
        oper.setReturnClass(_int.wipo.ipas.IpasServices.CMadridProcessingResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("OutputFieldGetUserdocOutputFieldCodeList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cOutputField"));
        oper.setReturnClass(_int.wipo.ipas.IpasServices.COutputField[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("OutputFieldGetOfficedocOutputFieldCodeList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cOutputField"));
        oper.setReturnClass(_int.wipo.ipas.IpasServices.COutputField[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DailyLogIntercalateInFileFolder");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasDateTime"), _int.wipo.ipas.IpasServices.IpasDateTime.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg3"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cFileId"), _int.wipo.ipas.IpasServices.CFileId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("OutputFieldGetPriorityOutputFieldList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cFileId"), _int.wipo.ipas.IpasServices.CFileId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg3"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg4"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cOutputFieldCode"), _int.wipo.ipas.IpasServices.COutputFieldCode[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cOutputField"));
        oper.setReturnClass(_int.wipo.ipas.IpasServices.COutputField[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DailyLogSetDigitalizationReady");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cDailyLogId"), _int.wipo.ipas.IpasServices.CDailyLogId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasDateTime"), _int.wipo.ipas.IpasServices.IpasDateTime.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("OutputFieldGetFileOutputFieldList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cFileId"), _int.wipo.ipas.IpasServices.CFileId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cOutputFieldCode"), _int.wipo.ipas.IpasServices.COutputFieldCode[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cOutputField"));
        oper.setReturnClass(_int.wipo.ipas.IpasServices.COutputField[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[19] = oper;

    }

    private static void _initOperationDesc3(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ProcessAutoassignResponsibleUser");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cUserId"), _int.wipo.ipas.IpasServices.CUserId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasInteger"), _int.wipo.ipas.IpasServices.IpasInteger.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cStatusId"), _int.wipo.ipas.IpasServices.CStatusId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg3"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg4"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg5"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg6"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg7"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cProcessId"));
        oper.setReturnClass(_int.wipo.ipas.IpasServices.CProcessId[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[20] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ProcessActivateRequiredOptions");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cOption"), _int.wipo.ipas.IpasServices.COption[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cOption"));
        oper.setReturnClass(_int.wipo.ipas.IpasServices.COption[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[21] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("OutputFieldGetOfficedocOutputFieldList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cOfficedocId"), _int.wipo.ipas.IpasServices.COfficedocId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cOutputFieldCode"), _int.wipo.ipas.IpasServices.COutputFieldCode[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cOutputField"));
        oper.setReturnClass(_int.wipo.ipas.IpasServices.COutputField[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[22] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ProcessGroupExportToExternalPhysicalTracking");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cProcessGroupId"), _int.wipo.ipas.IpasServices.CProcessGroupId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasInteger"));
        oper.setReturnClass(_int.wipo.ipas.IpasServices.IpasInteger.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[23] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("PhoneticSearchPhonetizePending");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasInteger"), _int.wipo.ipas.IpasServices.IpasInteger.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasInteger"));
        oper.setReturnClass(_int.wipo.ipas.IpasServices.IpasInteger.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[24] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeliveryBreakByCapturedSection");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cDeliveryId"), _int.wipo.ipas.IpasServices.CDeliveryId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cDocumentId"));
        oper.setReturnClass(_int.wipo.ipas.IpasServices.CDocumentId[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[25] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("OutputFieldGetActionOutputFieldCodeList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cOutputField"));
        oper.setReturnClass(_int.wipo.ipas.IpasServices.COutputField[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[26] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CommonServicesMadridTransactionLogRead");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasInteger"), _int.wipo.ipas.IpasServices.IpasInteger.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cMadridTransactionLog"));
        oper.setReturnClass(_int.wipo.ipas.IpasServices.CMadridTransactionLog.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[27] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CommonServicesMadridTransactionLogUpdate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cMadridTransactionLog"), _int.wipo.ipas.IpasServices.CMadridTransactionLog.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[28] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("OutputFieldGetUserdocOutputFieldList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cDocumentId"), _int.wipo.ipas.IpasServices.CDocumentId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cOutputFieldCode"), _int.wipo.ipas.IpasServices.COutputFieldCode[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cOutputField"));
        oper.setReturnClass(_int.wipo.ipas.IpasServices.COutputField[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[29] = oper;

    }

    private static void _initOperationDesc4(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("OutputFieldGetFileOutputFieldCodeList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cOutputField"));
        oper.setReturnClass(_int.wipo.ipas.IpasServices.COutputField[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[30] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DailyLogIntercalateInUserdocFolder");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasDateTime"), _int.wipo.ipas.IpasServices.IpasDateTime.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg3"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cDocumentId"), _int.wipo.ipas.IpasServices.CDocumentId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[31] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeliveryBreakByConfiguredResponsibleUser");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cDeliveryId"), _int.wipo.ipas.IpasServices.CDeliveryId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cDocumentId"));
        oper.setReturnClass(_int.wipo.ipas.IpasServices.CDocumentId[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[32] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("OutputFieldGetPriorityOutputFieldCodeList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cOutputField"));
        oper.setReturnClass(_int.wipo.ipas.IpasServices.COutputField[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[33] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DailyLogSetUserdocCaptureReady");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cDailyLogId"), _int.wipo.ipas.IpasServices.CDailyLogId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasDateTime"), _int.wipo.ipas.IpasServices.IpasDateTime.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[34] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("OutputFieldDocumentAppendServer");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cStringValue"), _int.wipo.ipas.IpasServices.CStringValue[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[35] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DailyLogSetAffectedFilesReady");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cDailyLogId"), _int.wipo.ipas.IpasServices.CDailyLogId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasDateTime"), _int.wipo.ipas.IpasServices.IpasDateTime.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[36] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("OutputFieldGetActionOutputFieldList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cActionId"), _int.wipo.ipas.IpasServices.CActionId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cOutputFieldCode"), _int.wipo.ipas.IpasServices.COutputFieldCode[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cOutputField"));
        oper.setReturnClass(_int.wipo.ipas.IpasServices.COutputField[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[37] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ProcessGetPossibleResponsibleUserList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cStatusId"), _int.wipo.ipas.IpasServices.CStatusId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cUser"));
        oper.setReturnClass(_int.wipo.ipas.IpasServices.CUser[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[38] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ProcessGetPossibleNoteActionTypeList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasInteger"), _int.wipo.ipas.IpasServices.IpasInteger.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg3"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cActionType"));
        oper.setReturnClass(_int.wipo.ipas.IpasServices.CActionType[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[39] = oper;

    }

    private static void _initOperationDesc5(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AgentAddPerson");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cAgentId"), _int.wipo.ipas.IpasServices.CAgentId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cPerson"), _int.wipo.ipas.IpasServices.CPerson.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[40] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DailyLogCount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cCriteriaDailyLog"), _int.wipo.ipas.IpasServices.CCriteriaDailyLog.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasInteger"));
        oper.setReturnClass(_int.wipo.ipas.IpasServices.IpasInteger.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[41] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DailyLogDelete");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cDailyLogId"), _int.wipo.ipas.IpasServices.CDailyLogId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[42] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AgentRemovePerson");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cAgentId"), _int.wipo.ipas.IpasServices.CAgentId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cPerson"), _int.wipo.ipas.IpasServices.CPerson.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[43] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DailyLogClose");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cDailyLogId"), _int.wipo.ipas.IpasServices.CDailyLogId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[44] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DailyLogInsert");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cDailyLog"), _int.wipo.ipas.IpasServices.CDailyLog.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[45] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DailyLogGetList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cCriteriaDailyLog"), _int.wipo.ipas.IpasServices.CCriteriaDailyLog.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cDailyLog"));
        oper.setReturnClass(_int.wipo.ipas.IpasServices.CDailyLog[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[46] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DailyLogSetFileCaptureReady");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cDailyLogId"), _int.wipo.ipas.IpasServices.CDailyLogId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasDateTime"), _int.wipo.ipas.IpasServices.IpasDateTime.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[47] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DailyLogSetLogoCaptureReady");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cDailyLogId"), _int.wipo.ipas.IpasServices.CDailyLogId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasDateTime"), _int.wipo.ipas.IpasServices.IpasDateTime.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[48] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("JournalInsert");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cJournal"), _int.wipo.ipas.IpasServices.CJournal.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[49] = oper;

    }

    private static void _initOperationDesc6(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("MadridProcessPendingImages");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasInteger"), _int.wipo.ipas.IpasServices.IpasInteger.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cMadridProcessingResult"));
        oper.setReturnClass(_int.wipo.ipas.IpasServices.CMadridProcessingResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[50] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("MarkSimilarityUpdate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cFileId"), _int.wipo.ipas.IpasServices.CFileId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cFileId"), _int.wipo.ipas.IpasServices.CFileId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasInteger"), _int.wipo.ipas.IpasServices.IpasInteger.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg3"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasInteger"), _int.wipo.ipas.IpasServices.IpasInteger.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg4"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg5"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[51] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeliveryFlagAsReceived");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cDeliveryId"), _int.wipo.ipas.IpasServices.CDeliveryId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[52] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("OfficedocUpdateAsPrinted");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cOfficedocId"), _int.wipo.ipas.IpasServices.COfficedocId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[53] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("OutputFieldDocumentAppend");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cDocumentImage"), _int.wipo.ipas.IpasServices.CDocumentImage[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cDocumentImage"));
        oper.setReturnClass(_int.wipo.ipas.IpasServices.CDocumentImage.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[54] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DailyLogSetSearchCodesReady");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cDailyLogId"), _int.wipo.ipas.IpasServices.CDailyLogId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasDateTime"), _int.wipo.ipas.IpasServices.IpasDateTime.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[55] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeliveryRemoveOfficedoc");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cDeliveryId"), _int.wipo.ipas.IpasServices.CDeliveryId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cOfficedocId"), _int.wipo.ipas.IpasServices.COfficedocId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[56] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("MarkReadSimilarityList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cFileId"), _int.wipo.ipas.IpasServices.CFileId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), java.lang.Boolean.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), java.lang.Boolean.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg3"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), java.lang.Boolean.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cMarkSimilarity"));
        oper.setReturnClass(_int.wipo.ipas.IpasServices.CMarkSimilarity[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[57] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeliveryInsert");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cDelivery"), _int.wipo.ipas.IpasServices.CDelivery.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cDeliveryId"));
        oper.setReturnClass(_int.wipo.ipas.IpasServices.CDeliveryId.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[58] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("OutputFieldMergeDocument");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cMergeData"), _int.wipo.ipas.IpasServices.COutputField[][].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cOutputField"), _int.wipo.ipas.IpasServices.COutputField[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg3"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg4"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg5"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cDocumentImage"));
        oper.setReturnClass(_int.wipo.ipas.IpasServices.CDocumentImage.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[59] = oper;

    }

    private static void _initOperationDesc7(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("JournalPublish");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cJournalId"), _int.wipo.ipas.IpasServices.CJournalId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasDateTime"), _int.wipo.ipas.IpasServices.IpasDateTime.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasDateTime"), _int.wipo.ipas.IpasServices.IpasDateTime.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[60] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("OfficedocNotify");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cOfficedocId"), _int.wipo.ipas.IpasServices.COfficedocId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasDateTime"), _int.wipo.ipas.IpasServices.IpasDateTime.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg3"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg4"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg5"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg6"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg7"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cDocumentId"));
        oper.setReturnClass(_int.wipo.ipas.IpasServices.CDocumentId.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[61] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeliveryFlagAsPrinted");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cDeliveryId"), _int.wipo.ipas.IpasServices.CDeliveryId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[62] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("JournalUpdate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cJournal"), _int.wipo.ipas.IpasServices.CJournal.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[63] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("MarkSimilarityDelete");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cFileId"), _int.wipo.ipas.IpasServices.CFileId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cFileId"), _int.wipo.ipas.IpasServices.CFileId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasInteger"), _int.wipo.ipas.IpasServices.IpasInteger.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[64] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("OutputFieldGetPrinterList");
        oper.setReturnType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cStringValue"));
        oper.setReturnClass(_int.wipo.ipas.IpasServices.CStringValue[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[65] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeliveryUpdate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cDelivery"), _int.wipo.ipas.IpasServices.CDelivery.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[66] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("FileGetMissingList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasInteger"), _int.wipo.ipas.IpasServices.IpasInteger.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg3"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasInteger"), _int.wipo.ipas.IpasServices.IpasInteger.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg4"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasInteger"), _int.wipo.ipas.IpasServices.IpasInteger.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cFileId"));
        oper.setReturnClass(_int.wipo.ipas.IpasServices.CFileId[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[67] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeliveryRemoveUserdoc");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cDeliveryId"), _int.wipo.ipas.IpasServices.CDeliveryId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cDocumentId"), _int.wipo.ipas.IpasServices.CDocumentId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[68] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("JournalRemoveAllActions");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cJournalId"), _int.wipo.ipas.IpasServices.CJournalId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[69] = oper;

    }

    private static void _initOperationDesc8(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("JournalUndoPublish");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cJournalId"), _int.wipo.ipas.IpasServices.CJournalId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[70] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("MarkReadSound");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cFileId"), _int.wipo.ipas.IpasServices.CFileId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cSound"));
        oper.setReturnClass(_int.wipo.ipas.IpasServices.CSound.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[71] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("MarkCountByViennaClass");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cCriteriaMark"), _int.wipo.ipas.IpasServices.CCriteriaMark.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cCountViennaClass"));
        oper.setReturnClass(_int.wipo.ipas.IpasServices.CCountViennaClass[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[72] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeliveryCount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cCriteriaDelivery"), _int.wipo.ipas.IpasServices.CCriteriaDelivery.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasInteger"));
        oper.setReturnClass(_int.wipo.ipas.IpasServices.IpasInteger.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[73] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("OfficedocRead");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cOfficedocId"), _int.wipo.ipas.IpasServices.COfficedocId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cOfficedoc"));
        oper.setReturnClass(_int.wipo.ipas.IpasServices.COfficedoc.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[74] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeliveryAddOfficedoc");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cDeliveryId"), _int.wipo.ipas.IpasServices.CDeliveryId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cOfficedocId"), _int.wipo.ipas.IpasServices.COfficedocId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[75] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeliveryGetList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cCriteriaDelivery"), _int.wipo.ipas.IpasServices.CCriteriaDelivery.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cDeliverySummary"));
        oper.setReturnClass(_int.wipo.ipas.IpasServices.CDeliverySummary[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[76] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeliveryAddUserdoc");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cDeliveryId"), _int.wipo.ipas.IpasServices.CDeliveryId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cDocumentId"), _int.wipo.ipas.IpasServices.CDocumentId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[77] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeliveryDelete");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cDeliveryId"), _int.wipo.ipas.IpasServices.CDeliveryId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[78] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("JournalAddActions");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cJournalId"), _int.wipo.ipas.IpasServices.CJournalId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasDateTime"), _int.wipo.ipas.IpasServices.IpasDateTime.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cActionTypeId"), _int.wipo.ipas.IpasServices.CActionTypeId[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[79] = oper;

    }

    private static void _initOperationDesc9(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("JournalGenerateDocuments");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cJournalId"), _int.wipo.ipas.IpasServices.CJournalId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[80] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("JournalGetList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cCriteriaJournal"), _int.wipo.ipas.IpasServices.CCriteriaJournal.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cJournal"));
        oper.setReturnClass(_int.wipo.ipas.IpasServices.CJournal[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[81] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeliveryRemoveFileSection");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cDeliveryId"), _int.wipo.ipas.IpasServices.CDeliveryId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cFileSectionId"), _int.wipo.ipas.IpasServices.CFileSectionId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[82] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DailyLogUpdate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cDailyLog"), _int.wipo.ipas.IpasServices.CDailyLog.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[83] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeliveryFlagAsSent");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cDeliveryId"), _int.wipo.ipas.IpasServices.CDeliveryId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[84] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("JournalDelete");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cJournalId"), _int.wipo.ipas.IpasServices.CJournalId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[85] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DailyLogUndoClose");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cDailyLogId"), _int.wipo.ipas.IpasServices.CDailyLogId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[86] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("MarkSimilarityInsert");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cFileId"), _int.wipo.ipas.IpasServices.CFileId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cFileId"), _int.wipo.ipas.IpasServices.CFileId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasInteger"), _int.wipo.ipas.IpasServices.IpasInteger.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg3"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasInteger"), _int.wipo.ipas.IpasServices.IpasInteger.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg4"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg5"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[87] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("JournalUndoClose");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cJournalId"), _int.wipo.ipas.IpasServices.CJournalId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[88] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("OfficedocGetToBePrintedList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cFileId"), _int.wipo.ipas.IpasServices.CFileId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasDateTime"), _int.wipo.ipas.IpasServices.IpasDateTime.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg3"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasDateTime"), _int.wipo.ipas.IpasServices.IpasDateTime.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg4"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg5"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg6"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cUserId"), _int.wipo.ipas.IpasServices.CUserId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cOfficedoc"));
        oper.setReturnClass(_int.wipo.ipas.IpasServices.COfficedoc[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[89] = oper;

    }

    private static void _initOperationDesc10(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("JournalGetActionList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cJournalId"), _int.wipo.ipas.IpasServices.CJournalId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cAction"));
        oper.setReturnClass(_int.wipo.ipas.IpasServices.CAction[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[90] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeliveryAddFileSection");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cDeliveryId"), _int.wipo.ipas.IpasServices.CDeliveryId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cFileSectionId"), _int.wipo.ipas.IpasServices.CFileSectionId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[91] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("OutputFieldWriteDocument");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cDocumentImage"), _int.wipo.ipas.IpasServices.CDocumentImage.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[92] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ProcessUpdateAction");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cActionId"), _int.wipo.ipas.IpasServices.CActionId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg3"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg4"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg5"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg6"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg7"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg8"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cJournalId"), _int.wipo.ipas.IpasServices.CJournalId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg9"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), java.lang.Boolean.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg10"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), java.lang.Boolean.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg11"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), java.lang.Boolean.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg12"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), java.lang.Boolean.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg13"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), java.lang.Boolean.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[93] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ProcessGroupAddProcess");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cProcessGroupId"), _int.wipo.ipas.IpasServices.CProcessGroupId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cProcessId"), _int.wipo.ipas.IpasServices.CProcessId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[94] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ProcessGetList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cCriteriaProcess"), _int.wipo.ipas.IpasServices.CCriteriaProcess.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasInteger"), _int.wipo.ipas.IpasServices.IpasInteger.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cProcessSummary"));
        oper.setReturnClass(_int.wipo.ipas.IpasServices.CProcessSummary[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[95] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("PatentGetList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cCriteriaPatent"), _int.wipo.ipas.IpasServices.CCriteriaPatent.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cFileSummary"));
        oper.setReturnClass(_int.wipo.ipas.IpasServices.CFileSummary[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[96] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ProcessReplaceOptionFields");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cOption"), _int.wipo.ipas.IpasServices.COption.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[97] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ProcessReadAction");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cActionId"), _int.wipo.ipas.IpasServices.CActionId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cAction"));
        oper.setReturnClass(_int.wipo.ipas.IpasServices.CAction.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[98] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ProcessInsertFreeze");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cProcessId"), _int.wipo.ipas.IpasServices.CProcessId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cProcessId"), _int.wipo.ipas.IpasServices.CProcessId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg3"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[99] = oper;

    }

    private static void _initOperationDesc11(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UserdocAddAffectedFile");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cDocumentId"), _int.wipo.ipas.IpasServices.CDocumentId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cFileId"), _int.wipo.ipas.IpasServices.CFileId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[100] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ProcessGroupRemoveProcess");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cProcessGroupId"), _int.wipo.ipas.IpasServices.CProcessGroupId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cProcessId"), _int.wipo.ipas.IpasServices.CProcessId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[101] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ProcessGetPossibleOptionList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cActionTypeId"), _int.wipo.ipas.IpasServices.CActionTypeId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg3"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasInteger"), _int.wipo.ipas.IpasServices.IpasInteger.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg4"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cOption"));
        oper.setReturnClass(_int.wipo.ipas.IpasServices.COption[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[102] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ProcessGroupDeleteLastAction");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cProcessGroupId"), _int.wipo.ipas.IpasServices.CProcessGroupId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[103] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UserdocUpdate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cUserdoc"), _int.wipo.ipas.IpasServices.CUserdoc.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[104] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ProcessDeleteFreeze");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cProcessId"), _int.wipo.ipas.IpasServices.CProcessId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cProcessId"), _int.wipo.ipas.IpasServices.CProcessId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[105] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ProcessGroupReadProcessList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cProcessGroupId"), _int.wipo.ipas.IpasServices.CProcessGroupId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasInteger"), _int.wipo.ipas.IpasServices.IpasInteger.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cProcessSummary"));
        oper.setReturnClass(_int.wipo.ipas.IpasServices.CProcessSummary[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[106] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ProcessInsertManual");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cProcessId"), _int.wipo.ipas.IpasServices.CProcessId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg3"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg4"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg5"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasDateTime"), _int.wipo.ipas.IpasServices.IpasDateTime.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[107] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ProcessReadFrozenList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cProcessId"), _int.wipo.ipas.IpasServices.CProcessId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cProcessFrozen"));
        oper.setReturnClass(_int.wipo.ipas.IpasServices.CProcessFrozen[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[108] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ProcessInsertAction");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cProcessId"), _int.wipo.ipas.IpasServices.CProcessId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cActionTypeId"), _int.wipo.ipas.IpasServices.CActionTypeId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasDateTime"), _int.wipo.ipas.IpasServices.IpasDateTime.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg3"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasDateTime"), _int.wipo.ipas.IpasServices.IpasDateTime.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg4"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cUserId"), _int.wipo.ipas.IpasServices.CUserId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg5"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cOption"), _int.wipo.ipas.IpasServices.COption[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg6"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg7"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg8"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg9"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg10"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg11"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg12"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cAckMessageNbr"), _int.wipo.ipas.IpasServices.CAckMessageNbr[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg13"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cAckMessageText"), _int.wipo.ipas.IpasServices.CAckMessageText[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg14"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cUserId"), _int.wipo.ipas.IpasServices.CUserId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg15"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasInteger"), _int.wipo.ipas.IpasServices.IpasInteger.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cStatusId"));
        oper.setReturnClass(_int.wipo.ipas.IpasServices.CStatusId.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[109] = oper;

    }

    private static void _initOperationDesc12(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ProcessReadFreezingList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cProcessId"), _int.wipo.ipas.IpasServices.CProcessId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cProcessFreezing"));
        oper.setReturnClass(_int.wipo.ipas.IpasServices.CProcessFreezing[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[110] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UserdocAddUserdocType");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cDocumentId"), _int.wipo.ipas.IpasServices.CDocumentId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[111] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ProcessDeleteAction");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cActionId"), _int.wipo.ipas.IpasServices.CActionId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[112] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ProcessInsertSpecialAction");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cProcessId"), _int.wipo.ipas.IpasServices.CProcessId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cActionTypeId"), _int.wipo.ipas.IpasServices.CActionTypeId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg3"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasDateTime"), _int.wipo.ipas.IpasServices.IpasDateTime.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg4"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasDateTime"), _int.wipo.ipas.IpasServices.IpasDateTime.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg5"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cUserId"), _int.wipo.ipas.IpasServices.CUserId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg6"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cOption"), _int.wipo.ipas.IpasServices.COption[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg7"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cOption"), _int.wipo.ipas.IpasServices.COption[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg8"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg9"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg10"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg11"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg12"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg13"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg14"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cAckMessageNbr"), _int.wipo.ipas.IpasServices.CAckMessageNbr[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg15"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cAckMessageText"), _int.wipo.ipas.IpasServices.CAckMessageText[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg16"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cUserId"), _int.wipo.ipas.IpasServices.CUserId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[113] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("PatentReadDrawingList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cFileId"), _int.wipo.ipas.IpasServices.CFileId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cDrawing"));
        oper.setReturnClass(_int.wipo.ipas.IpasServices.CDrawing[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[114] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UserdocGetList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cCriteriaUserdoc"), _int.wipo.ipas.IpasServices.CCriteriaUserdoc.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cUserdocSummary"));
        oper.setReturnClass(_int.wipo.ipas.IpasServices.CUserdocSummary[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[115] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UserdocRemoveUserdocType");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cDocumentId"), _int.wipo.ipas.IpasServices.CDocumentId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[116] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ProcessReadEventList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cProcessId"), _int.wipo.ipas.IpasServices.CProcessId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cProcessEvent"));
        oper.setReturnClass(_int.wipo.ipas.IpasServices.CProcessEvent[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[117] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ProcessGroupGetList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cUserId"), _int.wipo.ipas.IpasServices.CUserId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cProcessGroup"));
        oper.setReturnClass(_int.wipo.ipas.IpasServices.CProcessGroup[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[118] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("OutputFieldReadDocument");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cDocumentImage"));
        oper.setReturnClass(_int.wipo.ipas.IpasServices.CDocumentImage.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[119] = oper;

    }

    private static void _initOperationDesc13(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SqlCheckSyntax");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[120] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("PersonGetList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cCriteriaPerson"), _int.wipo.ipas.IpasServices.CCriteriaPerson.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cPerson"));
        oper.setReturnClass(_int.wipo.ipas.IpasServices.CPerson[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[121] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ProcessReadFinalStatus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cActionTypeId"), _int.wipo.ipas.IpasServices.CActionTypeId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cStatusId"), _int.wipo.ipas.IpasServices.CStatusId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cStatus"));
        oper.setReturnClass(_int.wipo.ipas.IpasServices.CStatus.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[122] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ProcessGroupDelete");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cProcessGroupId"), _int.wipo.ipas.IpasServices.CProcessGroupId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[123] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ProcessUpdateFreeze");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cProcessId"), _int.wipo.ipas.IpasServices.CProcessId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cProcessId"), _int.wipo.ipas.IpasServices.CProcessId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg3"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[124] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UserdocReceive");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cFileId"), _int.wipo.ipas.IpasServices.CFileId[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg3"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg4"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cOfficedocId"), _int.wipo.ipas.IpasServices.COfficedocId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg5"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cOfficeSectionId"), _int.wipo.ipas.IpasServices.COfficeSectionId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg6"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasDateTime"), _int.wipo.ipas.IpasServices.IpasDateTime.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg7"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cReceipt"), _int.wipo.ipas.IpasServices.CReceipt.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg8"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasInteger"), _int.wipo.ipas.IpasServices.IpasInteger.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg9"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg10"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cDocumentId"), _int.wipo.ipas.IpasServices.CDocumentId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg11"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cDocumentSeqId"), _int.wipo.ipas.IpasServices.CDocumentSeqId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg12"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cDocumentId"), _int.wipo.ipas.IpasServices.CDocumentId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cUserdoc"));
        oper.setReturnClass(_int.wipo.ipas.IpasServices.CUserdoc.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[125] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ProcessInsertNoteAction");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cProcessId"), _int.wipo.ipas.IpasServices.CProcessId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cActionTypeId"), _int.wipo.ipas.IpasServices.CActionTypeId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasDateTime"), _int.wipo.ipas.IpasServices.IpasDateTime.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg3"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cUserId"), _int.wipo.ipas.IpasServices.CUserId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg4"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cOption"), _int.wipo.ipas.IpasServices.COption[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg5"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg6"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg7"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg8"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg9"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg10"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg11"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cAckMessageNbr"), _int.wipo.ipas.IpasServices.CAckMessageNbr[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg12"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cAckMessageText"), _int.wipo.ipas.IpasServices.CAckMessageText[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg13"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cUserId"), _int.wipo.ipas.IpasServices.CUserId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[126] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("OutputFieldGetFolderContent");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cStringValue"));
        oper.setReturnClass(_int.wipo.ipas.IpasServices.CStringValue[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[127] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ProcessGroupRead");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cProcessGroupId"), _int.wipo.ipas.IpasServices.CProcessGroupId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasInteger"), _int.wipo.ipas.IpasServices.IpasInteger.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cProcessGroup"));
        oper.setReturnClass(_int.wipo.ipas.IpasServices.CProcessGroup.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[128] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UserdocDelete");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cDocumentId"), _int.wipo.ipas.IpasServices.CDocumentId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[129] = oper;

    }

    private static void _initOperationDesc14(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UserdocInsert");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cUserdoc"), _int.wipo.ipas.IpasServices.CUserdoc.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[130] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("PatentReadWordfileTitle");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cFileId"), _int.wipo.ipas.IpasServices.CFileId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        oper.setReturnClass(byte[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[131] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UserdocRemoveAffectedFile");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cDocumentId"), _int.wipo.ipas.IpasServices.CDocumentId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cFileId"), _int.wipo.ipas.IpasServices.CFileId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[132] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ProcessGroupInsert");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cProcessGroup"), _int.wipo.ipas.IpasServices.CProcessGroup.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[133] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("MarkInsert");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cMark"), _int.wipo.ipas.IpasServices.CMark.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cProcessId"));
        oper.setReturnClass(_int.wipo.ipas.IpasServices.CProcessId.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[134] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DailyLogOpen");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cDailyLogId"), _int.wipo.ipas.IpasServices.CDailyLogId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[135] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DailyLogRead");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cDailyLogId"), _int.wipo.ipas.IpasServices.CDailyLogId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cDailyLog"));
        oper.setReturnClass(_int.wipo.ipas.IpasServices.CDailyLog.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[136] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AgentCount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cCriteriaAgent"), _int.wipo.ipas.IpasServices.CCriteriaAgent.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasInteger"));
        oper.setReturnClass(_int.wipo.ipas.IpasServices.IpasInteger.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[137] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeliveryRead");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cDeliveryId"), _int.wipo.ipas.IpasServices.CDeliveryId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cDelivery"));
        oper.setReturnClass(_int.wipo.ipas.IpasServices.CDelivery.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[138] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("FileCount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cCriteriaFile"), _int.wipo.ipas.IpasServices.CCriteriaFile.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasInteger"));
        oper.setReturnClass(_int.wipo.ipas.IpasServices.IpasInteger.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[139] = oper;

    }

    private static void _initOperationDesc15(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AgentRead");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cAgentId"), _int.wipo.ipas.IpasServices.CAgentId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cAgent"));
        oper.setReturnClass(_int.wipo.ipas.IpasServices.CAgent.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[140] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("JournalRead");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cJournalId"), _int.wipo.ipas.IpasServices.CJournalId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cJournal"));
        oper.setReturnClass(_int.wipo.ipas.IpasServices.CJournal.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[141] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("JournalClose");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cJournalId"), _int.wipo.ipas.IpasServices.CJournalId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[142] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("FileReceive");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg3"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cRelationship"), _int.wipo.ipas.IpasServices.CRelationship[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg4"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasDateTime"), _int.wipo.ipas.IpasServices.IpasDateTime.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg5"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cReceipt"), _int.wipo.ipas.IpasServices.CReceipt.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg6"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cFileId"), _int.wipo.ipas.IpasServices.CFileId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg7"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cDocumentId"), _int.wipo.ipas.IpasServices.CDocumentId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg8"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cFile"));
        oper.setReturnClass(_int.wipo.ipas.IpasServices.CFile.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[143] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("JournalCount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cCriteriaJournal"), _int.wipo.ipas.IpasServices.CCriteriaJournal.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasInteger"));
        oper.setReturnClass(_int.wipo.ipas.IpasServices.IpasInteger.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[144] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AgentInsert");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cAgent"), _int.wipo.ipas.IpasServices.CAgent.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[145] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("MarkCount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cCriteriaMark"), _int.wipo.ipas.IpasServices.CCriteriaMark.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasInteger"));
        oper.setReturnClass(_int.wipo.ipas.IpasServices.IpasInteger.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[146] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AgentGetList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cCriteriaAgent"), _int.wipo.ipas.IpasServices.CCriteriaAgent.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cAgent"));
        oper.setReturnClass(_int.wipo.ipas.IpasServices.CAgent[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[147] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AgentUpdate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cAgent"), _int.wipo.ipas.IpasServices.CAgent.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[148] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AgentDelete");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cAgentId"), _int.wipo.ipas.IpasServices.CAgentId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[149] = oper;

    }

    private static void _initOperationDesc16(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("FileGetList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cCriteriaFile"), _int.wipo.ipas.IpasServices.CCriteriaFile.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cFileSummary"));
        oper.setReturnClass(_int.wipo.ipas.IpasServices.CFileSummary[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[150] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("FileRead");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cFileId"), _int.wipo.ipas.IpasServices.CFileId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cFile"));
        oper.setReturnClass(_int.wipo.ipas.IpasServices.CFile.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[151] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("MarkDelete");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cFileId"), _int.wipo.ipas.IpasServices.CFileId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[152] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("MarkGetList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cCriteriaMark"), _int.wipo.ipas.IpasServices.CCriteriaMark.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cFileSummary"));
        oper.setReturnClass(_int.wipo.ipas.IpasServices.CFileSummary[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[153] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("MarkGetList2");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cCriteriaMark"), _int.wipo.ipas.IpasServices.CCriteriaMark.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cFileId"), _int.wipo.ipas.IpasServices.CFileId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cFileSummary"));
        oper.setReturnClass(_int.wipo.ipas.IpasServices.CFileSummary[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[154] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("PatentRead");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cFileId"), _int.wipo.ipas.IpasServices.CFileId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cPatent"));
        oper.setReturnClass(_int.wipo.ipas.IpasServices.CPatent.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[155] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("MarkRead");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cFileId"), _int.wipo.ipas.IpasServices.CFileId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cMark"));
        oper.setReturnClass(_int.wipo.ipas.IpasServices.CMark.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[156] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("PatentCount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cCriteriaPatent"), _int.wipo.ipas.IpasServices.CCriteriaPatent.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasInteger"));
        oper.setReturnClass(_int.wipo.ipas.IpasServices.IpasInteger.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[157] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("MarkUpdate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cMark"), _int.wipo.ipas.IpasServices.CMark.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[158] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("PatentDelete");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cFileId"), _int.wipo.ipas.IpasServices.CFileId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[159] = oper;

    }

    private static void _initOperationDesc17(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SqlFetchAll");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cSqlRow"), _int.wipo.ipas.IpasServices.CSqlRow.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cSqlRow"));
        oper.setReturnClass(_int.wipo.ipas.IpasServices.CSqlRow[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[160] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("PersonCount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cCriteriaPerson"), _int.wipo.ipas.IpasServices.CCriteriaPerson.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasInteger"));
        oper.setReturnClass(_int.wipo.ipas.IpasServices.IpasInteger.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[161] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ProcessRead");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cProcessId"), _int.wipo.ipas.IpasServices.CProcessId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cProcess"));
        oper.setReturnClass(_int.wipo.ipas.IpasServices.CProcess.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[162] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("MarkReadLogo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cFileId"), _int.wipo.ipas.IpasServices.CFileId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cLogo"));
        oper.setReturnClass(_int.wipo.ipas.IpasServices.CLogo.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[163] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("PatentInsert");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cPatent"), _int.wipo.ipas.IpasServices.CPatent.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[164] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SqlExecute");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[165] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UserdocCount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cCriteriaUserdoc"), _int.wipo.ipas.IpasServices.CCriteriaUserdoc.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasInteger"));
        oper.setReturnClass(_int.wipo.ipas.IpasServices.IpasInteger.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[166] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UserdocRead");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cDocumentId"), _int.wipo.ipas.IpasServices.CDocumentId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cUserdoc"));
        oper.setReturnClass(_int.wipo.ipas.IpasServices.CUserdoc.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[167] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("PatentUpdate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cPatent"), _int.wipo.ipas.IpasServices.CPatent.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"),
                      "_int.wipo.ipas.IpasServices.IpasException",
                      new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException"), 
                      true
                     ));
        _operations[168] = oper;

    }

    public IpasServicesPortBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public IpasServicesPortBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public IpasServicesPortBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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
        addBindings0();
        addBindings1();
    }

    private void addBindings0() {
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
            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "abstractCollection");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.AbstractCollection.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "abstractList");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.AbstractList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "arrayList");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.ArrayList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cAckMessageNbr");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.CAckMessageNbr.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cAckMessageText");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.CAckMessageText.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cAction");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.CAction.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cActionId");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.CActionId.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cActionSequenceEntry");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.CActionSequenceEntry.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cActionType");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.CActionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cActionTypeId");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.CActionTypeId.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cAgent");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.CAgent.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cAgentId");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.CAgentId.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cAnnuity");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.CAnnuity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cAnnuityPayment");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.CAnnuityPayment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cApplicant");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.CApplicant.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cAuthor");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.CAuthor.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cAuthorshipData");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.CAuthorshipData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cAuxiliaryRegisterData");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.CAuxiliaryRegisterData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cClaim");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.CClaim.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cCountViennaClass");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.CCountViennaClass.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cCourt");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.CCourt.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cCourtDoc");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.CCourtDoc.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cCourtFile");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.CCourtFile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cCriteriaAgent");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.CCriteriaAgent.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cCriteriaAnnuityData");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.CCriteriaAnnuityData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cCriteriaApplicantData");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.CCriteriaApplicantData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cCriteriaCourtData");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.CCriteriaCourtData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cCriteriaDailyLog");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.CCriteriaDailyLog.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cCriteriaDelivery");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.CCriteriaDelivery.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cCriteriaDocumentId");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.CCriteriaDocumentId.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cCriteriaDocumentSeqId");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.CCriteriaDocumentSeqId.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cCriteriaExtraData");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.CCriteriaExtraData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cCriteriaFile");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.CCriteriaFile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cCriteriaFileId");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.CCriteriaFileId.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cCriteriaFilingData");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.CCriteriaFilingData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cCriteriaJournal");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.CCriteriaJournal.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cCriteriaMadridData");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.CCriteriaMadridData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cCriteriaMark");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.CCriteriaMark.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cCriteriaNiceClass");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.CCriteriaNiceClass.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cCriteriaOwnershipData");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.CCriteriaOwnershipData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cCriteriaPatent");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.CCriteriaPatent.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cCriteriaPerson");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.CCriteriaPerson.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cCriteriaPriority");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.CCriteriaPriority.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cCriteriaProcess");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.CCriteriaProcess.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cCriteriaProcessByAction");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.CCriteriaProcessByAction.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cCriteriaProcessByFile");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.CCriteriaProcessByFile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cCriteriaProcessByOfficedoc");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.CCriteriaProcessByOfficedoc.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cCriteriaProcessByStatus");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.CCriteriaProcessByStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cCriteriaProcessByUserdoc");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.CCriteriaProcessByUserdoc.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cCriteriaProtectionData");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.CCriteriaProtectionData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cCriteriaReceipt");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.CCriteriaReceipt.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cCriteriaRegistrationData");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.CCriteriaRegistrationData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cCriteriaRepresentationData");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.CCriteriaRepresentationData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cCriteriaSearchClass");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.CCriteriaSearchClass.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cCriteriaSignData");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.CCriteriaSignData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cCriteriaStatus");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.CCriteriaStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cCriteriaTechnicalData");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.CCriteriaTechnicalData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cCriteriaUserdoc");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.CCriteriaUserdoc.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cCriteriaUserdocFilingData");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.CCriteriaUserdocFilingData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cCriteriaViennaClass");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.CCriteriaViennaClass.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cDailyLog");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.CDailyLog.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cDailyLogId");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.CDailyLogId.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cDelivery");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.CDelivery.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cDeliveryId");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.CDeliveryId.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cDeliverySummary");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.CDeliverySummary.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cDocument");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.CDocument.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cDocumentEdmsData");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.CDocumentEdmsData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cDocumentId");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.CDocumentId.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cDocumentImage");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.CDocumentImage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cDocumentSeqId");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.CDocumentSeqId.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cDrawing");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.CDrawing.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cEnvironment");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.CEnvironment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cExamDocRef");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.CExamDocRef.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cExtraData");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.CExtraData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cFile");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.CFile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cFileId");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.CFileId.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cFileSectionId");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.CFileSectionId.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cFileSummary");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.CFileSummary.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cFilingData");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.CFilingData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cGuaranteeData");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.CGuaranteeData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cInputDocumentData");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.CReceipt[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cReceipt");
            qName2 = new javax.xml.namespace.QName("", "receiptList");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cInternalDocumentData");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.CInternalDocumentData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cIpcClass");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.CIpcClass.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cJournal");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.CJournal.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cJournalId");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.CJournalId.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cLicenseData");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.CLicenseData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cLimitationData");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.CLimitationData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cLocarnoClass");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.CLocarnoClass.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cLogo");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.CLogo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cMadridApplicationData");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.CMadridApplicationData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cMadridProcessingResult");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.CMadridProcessingResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cMadridTransaction");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.CMadridTransaction.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cMadridTransactionLog");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.CMadridTransactionLog.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cMark");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.CMark.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cMarkSimilarity");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.CMarkSimilarity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cMergeData");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.COutputField[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cOutputField");
            qName2 = new javax.xml.namespace.QName("", "outputFieldList");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cNationalGoodsClass");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.CNationalGoodsClass.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cNiceClass");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.CNiceClass.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cOfficedoc");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.COfficedoc.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cOfficedocId");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.COfficedocId.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings1() {
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
            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cOfficeSectionId");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.COfficeSectionId.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cOption");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.COption.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cOptionField");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.COptionField.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cOptionList");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.COptionList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cOptionListSet");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.COptionListSet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cOutputDocumentData");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.COutputDocumentData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cOutputField");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.COutputField.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cOutputFieldCode");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.COutputFieldCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cOwner");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.COwner.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cOwnershipData");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.COwnershipData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cParisPriority");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.CParisPriority.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cPatent");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.CPatent.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cPatentExaminationData");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.CPatentExaminationData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cPayment");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.CPayment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cPctApplicationData");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.CPctApplicationData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cPerson");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.CPerson.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cpoaData");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.CpoaData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cpoaGrantee");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.CpoaGrantee.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cpoaGrantor");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.CpoaGrantor.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cPriorityData");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.CPriorityData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cProcess");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.CProcess.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cProcessCodes");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.CProcessCodes.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cProcessEvent");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.CProcessEvent.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cProcessFreezing");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.CProcessFreezing.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cProcessFrozen");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.CProcessFrozen.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cProcessGroup");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.CProcessGroup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cProcessGroupId");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.CProcessGroupId.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cProcessId");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.CProcessId.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cProcessOriginData");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.CProcessOriginData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cProcessSummary");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.CProcessSummary.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cProtectionData");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.CProtectionData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cPublicationData");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.CPublicationData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cReceipt");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.CReceipt.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cRegionalApplData");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.CRegionalApplData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cRegistrationData");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.CRegistrationData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cRegistrationId");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.CRegistrationId.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cRelationship");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.CRelationship.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cRepresentationData");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.CRepresentationData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cRepresentative");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.CRepresentative.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cRoleAuthorization");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.CRoleAuthorization.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cSearchClass");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.CSearchClass.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cSignData");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.CSignData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cSound");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.CSound.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cSqlColumn");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.CSqlColumn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cSqlRow");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.CSqlRow.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cStateValidityData");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.CStateValidityData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cStatus");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.CStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cStatusId");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.CStatusId.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cStringValue");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.CStringValue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cSubstatus");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.CSubstatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cSubStatusId");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.CSubStatusId.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cTechnicalData");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.CTechnicalData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cUser");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.CUser.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cUserdoc");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.CUserdoc.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cUserdocSummary");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.CUserdocSummary.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cUserdocType");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.CUserdocType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cUserId");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.CUserId.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cUserStatusStatistics");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.CUserStatusStatistics.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cValidState");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.CValidState.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cViennaClass");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.CViennaClass.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasDateTime");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.IpasDateTime.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "IpasException");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.IpasException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasInteger");
            cachedSerQNames.add(qName);
            cls = _int.wipo.ipas.IpasServices.IpasInteger.class;
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

    public _int.wipo.ipas.IpasServices.IpasInteger processGroupImportFromExternalPhysicalTracking(_int.wipo.ipas.IpasServices.CProcessGroupId arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ProcessGroupImportFromExternalPhysicalTracking"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (_int.wipo.ipas.IpasServices.IpasInteger) _resp;
            } catch (java.lang.Exception _exception) {
                return (_int.wipo.ipas.IpasServices.IpasInteger) org.apache.axis.utils.JavaUtils.convert(_resp, _int.wipo.ipas.IpasServices.IpasInteger.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String commonServicesConfigParamRead(java.lang.String arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "CommonServicesConfigParamRead"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean commonServicesConfigParamUpdate(java.lang.String arg0, java.lang.String arg1) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "CommonServicesConfigParamUpdate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0, arg1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public _int.wipo.ipas.IpasServices.CEnvironment[] commonServicesEnvironmentGetList() throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "CommonServicesEnvironmentGetList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (_int.wipo.ipas.IpasServices.CEnvironment[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (_int.wipo.ipas.IpasServices.CEnvironment[]) org.apache.axis.utils.JavaUtils.convert(_resp, _int.wipo.ipas.IpasServices.CEnvironment[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean commonServicesEnvironmentTestConnection(java.lang.String arg0, java.lang.String arg1) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "CommonServicesEnvironmentTestConnection"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0, arg1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public _int.wipo.ipas.IpasServices.CRoleAuthorization[] commonServicesGetRoleAuthorisationList() throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "CommonServicesGetRoleAuthorisationList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (_int.wipo.ipas.IpasServices.CRoleAuthorization[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (_int.wipo.ipas.IpasServices.CRoleAuthorization[]) org.apache.axis.utils.JavaUtils.convert(_resp, _int.wipo.ipas.IpasServices.CRoleAuthorization[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public _int.wipo.ipas.IpasServices.CUserStatusStatistics[] processGetUserStatusStatisticsList(_int.wipo.ipas.IpasServices.CUserId arg0, _int.wipo.ipas.IpasServices.CStatusId arg1, boolean arg2, boolean arg3, java.lang.String arg4, java.lang.String arg5) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ProcessGetUserStatusStatisticsList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0, arg1, new java.lang.Boolean(arg2), new java.lang.Boolean(arg3), arg4, arg5});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (_int.wipo.ipas.IpasServices.CUserStatusStatistics[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (_int.wipo.ipas.IpasServices.CUserStatusStatistics[]) org.apache.axis.utils.JavaUtils.convert(_resp, _int.wipo.ipas.IpasServices.CUserStatusStatistics[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public _int.wipo.ipas.IpasServices.COutputFieldCode[] outputFieldGetTemplateOutputFieldCodeList(java.lang.String arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "OutputFieldGetTemplateOutputFieldCodeList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (_int.wipo.ipas.IpasServices.COutputFieldCode[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (_int.wipo.ipas.IpasServices.COutputFieldCode[]) org.apache.axis.utils.JavaUtils.convert(_resp, _int.wipo.ipas.IpasServices.COutputFieldCode[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public _int.wipo.ipas.IpasServices.COutputField[] officedocGetMailmergeFieldList(_int.wipo.ipas.IpasServices.COfficedocId arg0, _int.wipo.ipas.IpasServices.COutputFieldCode[] arg1, _int.wipo.ipas.IpasServices.COutputFieldCode[] arg2) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "OfficedocGetMailmergeFieldList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0, arg1, arg2});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (_int.wipo.ipas.IpasServices.COutputField[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (_int.wipo.ipas.IpasServices.COutputField[]) org.apache.axis.utils.JavaUtils.convert(_resp, _int.wipo.ipas.IpasServices.COutputField[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public _int.wipo.ipas.IpasServices.CActionType[] processGetPossibleSpecialActionTypeList(_int.wipo.ipas.IpasServices.CStatusId arg0, java.lang.String arg1, java.lang.String arg2, _int.wipo.ipas.IpasServices.IpasInteger arg3, java.lang.String arg4, java.lang.String arg5) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ProcessGetPossibleSpecialActionTypeList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0, arg1, arg2, arg3, arg4, arg5});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (_int.wipo.ipas.IpasServices.CActionType[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (_int.wipo.ipas.IpasServices.CActionType[]) org.apache.axis.utils.JavaUtils.convert(_resp, _int.wipo.ipas.IpasServices.CActionType[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean fileCheckIntegrityForNewFileId(_int.wipo.ipas.IpasServices.CFileId arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "FileCheckIntegrityForNewFileId"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean userdocCheckIntegrityForNewDocId(_int.wipo.ipas.IpasServices.CDocumentId arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "UserdocCheckIntegrityForNewDocId"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean userdocCheckIntegrityForNewDocSeqId(_int.wipo.ipas.IpasServices.CDocumentSeqId arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "UserdocCheckIntegrityForNewDocSeqId"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public _int.wipo.ipas.IpasServices.CMadridProcessingResult madridProcessPendingInputTransactions(_int.wipo.ipas.IpasServices.IpasInteger arg0, java.lang.String arg1, long arg2) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "MadridProcessPendingInputTransactions"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0, arg1, new java.lang.Long(arg2)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (_int.wipo.ipas.IpasServices.CMadridProcessingResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (_int.wipo.ipas.IpasServices.CMadridProcessingResult) org.apache.axis.utils.JavaUtils.convert(_resp, _int.wipo.ipas.IpasServices.CMadridProcessingResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public _int.wipo.ipas.IpasServices.COutputField[] outputFieldGetUserdocOutputFieldCodeList(java.lang.String arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "OutputFieldGetUserdocOutputFieldCodeList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (_int.wipo.ipas.IpasServices.COutputField[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (_int.wipo.ipas.IpasServices.COutputField[]) org.apache.axis.utils.JavaUtils.convert(_resp, _int.wipo.ipas.IpasServices.COutputField[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public _int.wipo.ipas.IpasServices.COutputField[] outputFieldGetOfficedocOutputFieldCodeList(java.lang.String arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "OutputFieldGetOfficedocOutputFieldCodeList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (_int.wipo.ipas.IpasServices.COutputField[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (_int.wipo.ipas.IpasServices.COutputField[]) org.apache.axis.utils.JavaUtils.convert(_resp, _int.wipo.ipas.IpasServices.COutputField[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean dailyLogIntercalateInFileFolder(java.lang.String arg0, _int.wipo.ipas.IpasServices.IpasDateTime arg1, java.lang.String arg2, _int.wipo.ipas.IpasServices.CFileId arg3) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "DailyLogIntercalateInFileFolder"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0, arg1, arg2, arg3});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public _int.wipo.ipas.IpasServices.COutputField[] outputFieldGetPriorityOutputFieldList(java.lang.String arg0, _int.wipo.ipas.IpasServices.CFileId arg1, java.lang.String arg2, java.lang.String arg3, _int.wipo.ipas.IpasServices.COutputFieldCode[] arg4) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "OutputFieldGetPriorityOutputFieldList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0, arg1, arg2, arg3, arg4});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (_int.wipo.ipas.IpasServices.COutputField[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (_int.wipo.ipas.IpasServices.COutputField[]) org.apache.axis.utils.JavaUtils.convert(_resp, _int.wipo.ipas.IpasServices.COutputField[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean dailyLogSetDigitalizationReady(_int.wipo.ipas.IpasServices.CDailyLogId arg0, _int.wipo.ipas.IpasServices.IpasDateTime arg1) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "DailyLogSetDigitalizationReady"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0, arg1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public _int.wipo.ipas.IpasServices.COutputField[] outputFieldGetFileOutputFieldList(java.lang.String arg0, _int.wipo.ipas.IpasServices.CFileId arg1, _int.wipo.ipas.IpasServices.COutputFieldCode[] arg2) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "OutputFieldGetFileOutputFieldList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0, arg1, arg2});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (_int.wipo.ipas.IpasServices.COutputField[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (_int.wipo.ipas.IpasServices.COutputField[]) org.apache.axis.utils.JavaUtils.convert(_resp, _int.wipo.ipas.IpasServices.COutputField[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public _int.wipo.ipas.IpasServices.CProcessId[] processAutoassignResponsibleUser(_int.wipo.ipas.IpasServices.CUserId arg0, _int.wipo.ipas.IpasServices.IpasInteger arg1, _int.wipo.ipas.IpasServices.CStatusId arg2, java.lang.String arg3, java.lang.String arg4, java.lang.String arg5, boolean arg6, java.lang.String arg7) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[20]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ProcessAutoassignResponsibleUser"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0, arg1, arg2, arg3, arg4, arg5, new java.lang.Boolean(arg6), arg7});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (_int.wipo.ipas.IpasServices.CProcessId[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (_int.wipo.ipas.IpasServices.CProcessId[]) org.apache.axis.utils.JavaUtils.convert(_resp, _int.wipo.ipas.IpasServices.CProcessId[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public _int.wipo.ipas.IpasServices.COption[] processActivateRequiredOptions(_int.wipo.ipas.IpasServices.COption[] arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[21]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ProcessActivateRequiredOptions"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (_int.wipo.ipas.IpasServices.COption[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (_int.wipo.ipas.IpasServices.COption[]) org.apache.axis.utils.JavaUtils.convert(_resp, _int.wipo.ipas.IpasServices.COption[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public _int.wipo.ipas.IpasServices.COutputField[] outputFieldGetOfficedocOutputFieldList(java.lang.String arg0, _int.wipo.ipas.IpasServices.COfficedocId arg1, _int.wipo.ipas.IpasServices.COutputFieldCode[] arg2) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[22]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "OutputFieldGetOfficedocOutputFieldList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0, arg1, arg2});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (_int.wipo.ipas.IpasServices.COutputField[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (_int.wipo.ipas.IpasServices.COutputField[]) org.apache.axis.utils.JavaUtils.convert(_resp, _int.wipo.ipas.IpasServices.COutputField[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public _int.wipo.ipas.IpasServices.IpasInteger processGroupExportToExternalPhysicalTracking(_int.wipo.ipas.IpasServices.CProcessGroupId arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[23]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ProcessGroupExportToExternalPhysicalTracking"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (_int.wipo.ipas.IpasServices.IpasInteger) _resp;
            } catch (java.lang.Exception _exception) {
                return (_int.wipo.ipas.IpasServices.IpasInteger) org.apache.axis.utils.JavaUtils.convert(_resp, _int.wipo.ipas.IpasServices.IpasInteger.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public _int.wipo.ipas.IpasServices.IpasInteger phoneticSearchPhonetizePending(_int.wipo.ipas.IpasServices.IpasInteger arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[24]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "PhoneticSearchPhonetizePending"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (_int.wipo.ipas.IpasServices.IpasInteger) _resp;
            } catch (java.lang.Exception _exception) {
                return (_int.wipo.ipas.IpasServices.IpasInteger) org.apache.axis.utils.JavaUtils.convert(_resp, _int.wipo.ipas.IpasServices.IpasInteger.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public _int.wipo.ipas.IpasServices.CDocumentId[] deliveryBreakByCapturedSection(_int.wipo.ipas.IpasServices.CDeliveryId arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[25]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "DeliveryBreakByCapturedSection"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (_int.wipo.ipas.IpasServices.CDocumentId[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (_int.wipo.ipas.IpasServices.CDocumentId[]) org.apache.axis.utils.JavaUtils.convert(_resp, _int.wipo.ipas.IpasServices.CDocumentId[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public _int.wipo.ipas.IpasServices.COutputField[] outputFieldGetActionOutputFieldCodeList(java.lang.String arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[26]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "OutputFieldGetActionOutputFieldCodeList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (_int.wipo.ipas.IpasServices.COutputField[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (_int.wipo.ipas.IpasServices.COutputField[]) org.apache.axis.utils.JavaUtils.convert(_resp, _int.wipo.ipas.IpasServices.COutputField[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public _int.wipo.ipas.IpasServices.CMadridTransactionLog commonServicesMadridTransactionLogRead(_int.wipo.ipas.IpasServices.IpasInteger arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[27]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "CommonServicesMadridTransactionLogRead"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (_int.wipo.ipas.IpasServices.CMadridTransactionLog) _resp;
            } catch (java.lang.Exception _exception) {
                return (_int.wipo.ipas.IpasServices.CMadridTransactionLog) org.apache.axis.utils.JavaUtils.convert(_resp, _int.wipo.ipas.IpasServices.CMadridTransactionLog.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean commonServicesMadridTransactionLogUpdate(_int.wipo.ipas.IpasServices.CMadridTransactionLog arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[28]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "CommonServicesMadridTransactionLogUpdate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public _int.wipo.ipas.IpasServices.COutputField[] outputFieldGetUserdocOutputFieldList(java.lang.String arg0, _int.wipo.ipas.IpasServices.CDocumentId arg1, _int.wipo.ipas.IpasServices.COutputFieldCode[] arg2) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[29]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "OutputFieldGetUserdocOutputFieldList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0, arg1, arg2});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (_int.wipo.ipas.IpasServices.COutputField[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (_int.wipo.ipas.IpasServices.COutputField[]) org.apache.axis.utils.JavaUtils.convert(_resp, _int.wipo.ipas.IpasServices.COutputField[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public _int.wipo.ipas.IpasServices.COutputField[] outputFieldGetFileOutputFieldCodeList(java.lang.String arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[30]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "OutputFieldGetFileOutputFieldCodeList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (_int.wipo.ipas.IpasServices.COutputField[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (_int.wipo.ipas.IpasServices.COutputField[]) org.apache.axis.utils.JavaUtils.convert(_resp, _int.wipo.ipas.IpasServices.COutputField[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean dailyLogIntercalateInUserdocFolder(java.lang.String arg0, _int.wipo.ipas.IpasServices.IpasDateTime arg1, java.lang.String arg2, _int.wipo.ipas.IpasServices.CDocumentId arg3) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[31]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "DailyLogIntercalateInUserdocFolder"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0, arg1, arg2, arg3});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public _int.wipo.ipas.IpasServices.CDocumentId[] deliveryBreakByConfiguredResponsibleUser(_int.wipo.ipas.IpasServices.CDeliveryId arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[32]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "DeliveryBreakByConfiguredResponsibleUser"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (_int.wipo.ipas.IpasServices.CDocumentId[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (_int.wipo.ipas.IpasServices.CDocumentId[]) org.apache.axis.utils.JavaUtils.convert(_resp, _int.wipo.ipas.IpasServices.CDocumentId[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public _int.wipo.ipas.IpasServices.COutputField[] outputFieldGetPriorityOutputFieldCodeList(java.lang.String arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[33]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "OutputFieldGetPriorityOutputFieldCodeList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (_int.wipo.ipas.IpasServices.COutputField[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (_int.wipo.ipas.IpasServices.COutputField[]) org.apache.axis.utils.JavaUtils.convert(_resp, _int.wipo.ipas.IpasServices.COutputField[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean dailyLogSetUserdocCaptureReady(_int.wipo.ipas.IpasServices.CDailyLogId arg0, _int.wipo.ipas.IpasServices.IpasDateTime arg1) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[34]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "DailyLogSetUserdocCaptureReady"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0, arg1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean outputFieldDocumentAppendServer(_int.wipo.ipas.IpasServices.CStringValue[] arg0, java.lang.String arg1) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[35]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "OutputFieldDocumentAppendServer"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0, arg1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean dailyLogSetAffectedFilesReady(_int.wipo.ipas.IpasServices.CDailyLogId arg0, _int.wipo.ipas.IpasServices.IpasDateTime arg1) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[36]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "DailyLogSetAffectedFilesReady"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0, arg1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public _int.wipo.ipas.IpasServices.COutputField[] outputFieldGetActionOutputFieldList(java.lang.String arg0, _int.wipo.ipas.IpasServices.CActionId arg1, _int.wipo.ipas.IpasServices.COutputFieldCode[] arg2) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[37]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "OutputFieldGetActionOutputFieldList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0, arg1, arg2});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (_int.wipo.ipas.IpasServices.COutputField[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (_int.wipo.ipas.IpasServices.COutputField[]) org.apache.axis.utils.JavaUtils.convert(_resp, _int.wipo.ipas.IpasServices.COutputField[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public _int.wipo.ipas.IpasServices.CUser[] processGetPossibleResponsibleUserList(_int.wipo.ipas.IpasServices.CStatusId arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[38]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ProcessGetPossibleResponsibleUserList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (_int.wipo.ipas.IpasServices.CUser[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (_int.wipo.ipas.IpasServices.CUser[]) org.apache.axis.utils.JavaUtils.convert(_resp, _int.wipo.ipas.IpasServices.CUser[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public _int.wipo.ipas.IpasServices.CActionType[] processGetPossibleNoteActionTypeList(java.lang.String arg0, java.lang.String arg1, _int.wipo.ipas.IpasServices.IpasInteger arg2, java.lang.String arg3) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[39]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ProcessGetPossibleNoteActionTypeList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0, arg1, arg2, arg3});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (_int.wipo.ipas.IpasServices.CActionType[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (_int.wipo.ipas.IpasServices.CActionType[]) org.apache.axis.utils.JavaUtils.convert(_resp, _int.wipo.ipas.IpasServices.CActionType[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean agentAddPerson(_int.wipo.ipas.IpasServices.CAgentId arg0, _int.wipo.ipas.IpasServices.CPerson arg1) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[40]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "AgentAddPerson"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0, arg1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public _int.wipo.ipas.IpasServices.IpasInteger dailyLogCount(_int.wipo.ipas.IpasServices.CCriteriaDailyLog arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[41]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "DailyLogCount"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (_int.wipo.ipas.IpasServices.IpasInteger) _resp;
            } catch (java.lang.Exception _exception) {
                return (_int.wipo.ipas.IpasServices.IpasInteger) org.apache.axis.utils.JavaUtils.convert(_resp, _int.wipo.ipas.IpasServices.IpasInteger.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean dailyLogDelete(_int.wipo.ipas.IpasServices.CDailyLogId arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[42]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "DailyLogDelete"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean agentRemovePerson(_int.wipo.ipas.IpasServices.CAgentId arg0, _int.wipo.ipas.IpasServices.CPerson arg1) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[43]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "AgentRemovePerson"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0, arg1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean dailyLogClose(_int.wipo.ipas.IpasServices.CDailyLogId arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[44]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "DailyLogClose"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean dailyLogInsert(_int.wipo.ipas.IpasServices.CDailyLog arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[45]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "DailyLogInsert"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public _int.wipo.ipas.IpasServices.CDailyLog[] dailyLogGetList(_int.wipo.ipas.IpasServices.CCriteriaDailyLog arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[46]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "DailyLogGetList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (_int.wipo.ipas.IpasServices.CDailyLog[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (_int.wipo.ipas.IpasServices.CDailyLog[]) org.apache.axis.utils.JavaUtils.convert(_resp, _int.wipo.ipas.IpasServices.CDailyLog[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean dailyLogSetFileCaptureReady(_int.wipo.ipas.IpasServices.CDailyLogId arg0, _int.wipo.ipas.IpasServices.IpasDateTime arg1) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[47]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "DailyLogSetFileCaptureReady"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0, arg1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean dailyLogSetLogoCaptureReady(_int.wipo.ipas.IpasServices.CDailyLogId arg0, _int.wipo.ipas.IpasServices.IpasDateTime arg1) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[48]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "DailyLogSetLogoCaptureReady"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0, arg1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean journalInsert(_int.wipo.ipas.IpasServices.CJournal arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[49]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "JournalInsert"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public _int.wipo.ipas.IpasServices.CMadridProcessingResult madridProcessPendingImages(_int.wipo.ipas.IpasServices.IpasInteger arg0, java.lang.String arg1) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[50]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "MadridProcessPendingImages"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0, arg1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (_int.wipo.ipas.IpasServices.CMadridProcessingResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (_int.wipo.ipas.IpasServices.CMadridProcessingResult) org.apache.axis.utils.JavaUtils.convert(_resp, _int.wipo.ipas.IpasServices.CMadridProcessingResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean markSimilarityUpdate(_int.wipo.ipas.IpasServices.CFileId arg0, _int.wipo.ipas.IpasServices.CFileId arg1, _int.wipo.ipas.IpasServices.IpasInteger arg2, _int.wipo.ipas.IpasServices.IpasInteger arg3, boolean arg4, boolean arg5) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[51]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "MarkSimilarityUpdate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0, arg1, arg2, arg3, new java.lang.Boolean(arg4), new java.lang.Boolean(arg5)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean deliveryFlagAsReceived(_int.wipo.ipas.IpasServices.CDeliveryId arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[52]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "DeliveryFlagAsReceived"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean officedocUpdateAsPrinted(_int.wipo.ipas.IpasServices.COfficedocId arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[53]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "OfficedocUpdateAsPrinted"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public _int.wipo.ipas.IpasServices.CDocumentImage outputFieldDocumentAppend(_int.wipo.ipas.IpasServices.CDocumentImage[] arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[54]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "OutputFieldDocumentAppend"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (_int.wipo.ipas.IpasServices.CDocumentImage) _resp;
            } catch (java.lang.Exception _exception) {
                return (_int.wipo.ipas.IpasServices.CDocumentImage) org.apache.axis.utils.JavaUtils.convert(_resp, _int.wipo.ipas.IpasServices.CDocumentImage.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean dailyLogSetSearchCodesReady(_int.wipo.ipas.IpasServices.CDailyLogId arg0, _int.wipo.ipas.IpasServices.IpasDateTime arg1) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[55]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "DailyLogSetSearchCodesReady"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0, arg1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean deliveryRemoveOfficedoc(_int.wipo.ipas.IpasServices.CDeliveryId arg0, _int.wipo.ipas.IpasServices.COfficedocId arg1) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[56]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "DeliveryRemoveOfficedoc"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0, arg1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public _int.wipo.ipas.IpasServices.CMarkSimilarity[] markReadSimilarityList(_int.wipo.ipas.IpasServices.CFileId arg0, java.lang.Boolean arg1, java.lang.Boolean arg2, java.lang.Boolean arg3) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[57]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "MarkReadSimilarityList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0, arg1, arg2, arg3});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (_int.wipo.ipas.IpasServices.CMarkSimilarity[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (_int.wipo.ipas.IpasServices.CMarkSimilarity[]) org.apache.axis.utils.JavaUtils.convert(_resp, _int.wipo.ipas.IpasServices.CMarkSimilarity[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public _int.wipo.ipas.IpasServices.CDeliveryId deliveryInsert(_int.wipo.ipas.IpasServices.CDelivery arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[58]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "DeliveryInsert"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (_int.wipo.ipas.IpasServices.CDeliveryId) _resp;
            } catch (java.lang.Exception _exception) {
                return (_int.wipo.ipas.IpasServices.CDeliveryId) org.apache.axis.utils.JavaUtils.convert(_resp, _int.wipo.ipas.IpasServices.CDeliveryId.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public _int.wipo.ipas.IpasServices.CDocumentImage outputFieldMergeDocument(java.lang.String arg0, _int.wipo.ipas.IpasServices.COutputField[][] arg1, _int.wipo.ipas.IpasServices.COutputField[] arg2, java.lang.String arg3, java.lang.String arg4, java.lang.String arg5) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[59]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "OutputFieldMergeDocument"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0, arg1, arg2, arg3, arg4, arg5});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (_int.wipo.ipas.IpasServices.CDocumentImage) _resp;
            } catch (java.lang.Exception _exception) {
                return (_int.wipo.ipas.IpasServices.CDocumentImage) org.apache.axis.utils.JavaUtils.convert(_resp, _int.wipo.ipas.IpasServices.CDocumentImage.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean journalPublish(_int.wipo.ipas.IpasServices.CJournalId arg0, _int.wipo.ipas.IpasServices.IpasDateTime arg1, _int.wipo.ipas.IpasServices.IpasDateTime arg2) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[60]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "JournalPublish"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0, arg1, arg2});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public _int.wipo.ipas.IpasServices.CDocumentId officedocNotify(java.lang.String arg0, _int.wipo.ipas.IpasServices.COfficedocId arg1, _int.wipo.ipas.IpasServices.IpasDateTime arg2, java.lang.String arg3, java.lang.String arg4, java.lang.String arg5, java.lang.String arg6, java.lang.String arg7) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[61]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "OfficedocNotify"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (_int.wipo.ipas.IpasServices.CDocumentId) _resp;
            } catch (java.lang.Exception _exception) {
                return (_int.wipo.ipas.IpasServices.CDocumentId) org.apache.axis.utils.JavaUtils.convert(_resp, _int.wipo.ipas.IpasServices.CDocumentId.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean deliveryFlagAsPrinted(_int.wipo.ipas.IpasServices.CDeliveryId arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[62]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "DeliveryFlagAsPrinted"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean journalUpdate(_int.wipo.ipas.IpasServices.CJournal arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[63]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "JournalUpdate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean markSimilarityDelete(_int.wipo.ipas.IpasServices.CFileId arg0, _int.wipo.ipas.IpasServices.CFileId arg1, _int.wipo.ipas.IpasServices.IpasInteger arg2) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[64]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "MarkSimilarityDelete"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0, arg1, arg2});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public _int.wipo.ipas.IpasServices.CStringValue[] outputFieldGetPrinterList() throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[65]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "OutputFieldGetPrinterList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (_int.wipo.ipas.IpasServices.CStringValue[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (_int.wipo.ipas.IpasServices.CStringValue[]) org.apache.axis.utils.JavaUtils.convert(_resp, _int.wipo.ipas.IpasServices.CStringValue[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean deliveryUpdate(_int.wipo.ipas.IpasServices.CDelivery arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[66]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "DeliveryUpdate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public _int.wipo.ipas.IpasServices.CFileId[] fileGetMissingList(java.lang.String arg0, java.lang.String arg1, _int.wipo.ipas.IpasServices.IpasInteger arg2, _int.wipo.ipas.IpasServices.IpasInteger arg3, _int.wipo.ipas.IpasServices.IpasInteger arg4) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[67]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "FileGetMissingList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0, arg1, arg2, arg3, arg4});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (_int.wipo.ipas.IpasServices.CFileId[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (_int.wipo.ipas.IpasServices.CFileId[]) org.apache.axis.utils.JavaUtils.convert(_resp, _int.wipo.ipas.IpasServices.CFileId[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean deliveryRemoveUserdoc(_int.wipo.ipas.IpasServices.CDeliveryId arg0, _int.wipo.ipas.IpasServices.CDocumentId arg1) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[68]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "DeliveryRemoveUserdoc"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0, arg1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean journalRemoveAllActions(_int.wipo.ipas.IpasServices.CJournalId arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[69]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "JournalRemoveAllActions"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean journalUndoPublish(_int.wipo.ipas.IpasServices.CJournalId arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[70]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "JournalUndoPublish"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public _int.wipo.ipas.IpasServices.CSound markReadSound(_int.wipo.ipas.IpasServices.CFileId arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[71]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "MarkReadSound"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (_int.wipo.ipas.IpasServices.CSound) _resp;
            } catch (java.lang.Exception _exception) {
                return (_int.wipo.ipas.IpasServices.CSound) org.apache.axis.utils.JavaUtils.convert(_resp, _int.wipo.ipas.IpasServices.CSound.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public _int.wipo.ipas.IpasServices.CCountViennaClass[] markCountByViennaClass(_int.wipo.ipas.IpasServices.CCriteriaMark arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[72]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "MarkCountByViennaClass"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (_int.wipo.ipas.IpasServices.CCountViennaClass[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (_int.wipo.ipas.IpasServices.CCountViennaClass[]) org.apache.axis.utils.JavaUtils.convert(_resp, _int.wipo.ipas.IpasServices.CCountViennaClass[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public _int.wipo.ipas.IpasServices.IpasInteger deliveryCount(_int.wipo.ipas.IpasServices.CCriteriaDelivery arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[73]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "DeliveryCount"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (_int.wipo.ipas.IpasServices.IpasInteger) _resp;
            } catch (java.lang.Exception _exception) {
                return (_int.wipo.ipas.IpasServices.IpasInteger) org.apache.axis.utils.JavaUtils.convert(_resp, _int.wipo.ipas.IpasServices.IpasInteger.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public _int.wipo.ipas.IpasServices.COfficedoc officedocRead(_int.wipo.ipas.IpasServices.COfficedocId arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[74]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "OfficedocRead"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (_int.wipo.ipas.IpasServices.COfficedoc) _resp;
            } catch (java.lang.Exception _exception) {
                return (_int.wipo.ipas.IpasServices.COfficedoc) org.apache.axis.utils.JavaUtils.convert(_resp, _int.wipo.ipas.IpasServices.COfficedoc.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean deliveryAddOfficedoc(_int.wipo.ipas.IpasServices.CDeliveryId arg0, _int.wipo.ipas.IpasServices.COfficedocId arg1) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[75]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "DeliveryAddOfficedoc"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0, arg1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public _int.wipo.ipas.IpasServices.CDeliverySummary[] deliveryGetList(_int.wipo.ipas.IpasServices.CCriteriaDelivery arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[76]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "DeliveryGetList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (_int.wipo.ipas.IpasServices.CDeliverySummary[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (_int.wipo.ipas.IpasServices.CDeliverySummary[]) org.apache.axis.utils.JavaUtils.convert(_resp, _int.wipo.ipas.IpasServices.CDeliverySummary[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean deliveryAddUserdoc(_int.wipo.ipas.IpasServices.CDeliveryId arg0, _int.wipo.ipas.IpasServices.CDocumentId arg1) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[77]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "DeliveryAddUserdoc"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0, arg1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean deliveryDelete(_int.wipo.ipas.IpasServices.CDeliveryId arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[78]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "DeliveryDelete"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean journalAddActions(_int.wipo.ipas.IpasServices.CJournalId arg0, _int.wipo.ipas.IpasServices.IpasDateTime arg1, _int.wipo.ipas.IpasServices.CActionTypeId[] arg2) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[79]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "JournalAddActions"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0, arg1, arg2});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean journalGenerateDocuments(_int.wipo.ipas.IpasServices.CJournalId arg0, java.lang.String arg1) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[80]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "JournalGenerateDocuments"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0, arg1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public _int.wipo.ipas.IpasServices.CJournal[] journalGetList(_int.wipo.ipas.IpasServices.CCriteriaJournal arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[81]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "JournalGetList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (_int.wipo.ipas.IpasServices.CJournal[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (_int.wipo.ipas.IpasServices.CJournal[]) org.apache.axis.utils.JavaUtils.convert(_resp, _int.wipo.ipas.IpasServices.CJournal[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean deliveryRemoveFileSection(_int.wipo.ipas.IpasServices.CDeliveryId arg0, _int.wipo.ipas.IpasServices.CFileSectionId arg1) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[82]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "DeliveryRemoveFileSection"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0, arg1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean dailyLogUpdate(_int.wipo.ipas.IpasServices.CDailyLog arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[83]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "DailyLogUpdate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean deliveryFlagAsSent(_int.wipo.ipas.IpasServices.CDeliveryId arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[84]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "DeliveryFlagAsSent"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean journalDelete(_int.wipo.ipas.IpasServices.CJournalId arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[85]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "JournalDelete"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean dailyLogUndoClose(_int.wipo.ipas.IpasServices.CDailyLogId arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[86]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "DailyLogUndoClose"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean markSimilarityInsert(_int.wipo.ipas.IpasServices.CFileId arg0, _int.wipo.ipas.IpasServices.CFileId arg1, _int.wipo.ipas.IpasServices.IpasInteger arg2, _int.wipo.ipas.IpasServices.IpasInteger arg3, boolean arg4, boolean arg5) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[87]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "MarkSimilarityInsert"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0, arg1, arg2, arg3, new java.lang.Boolean(arg4), new java.lang.Boolean(arg5)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean journalUndoClose(_int.wipo.ipas.IpasServices.CJournalId arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[88]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "JournalUndoClose"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public _int.wipo.ipas.IpasServices.COfficedoc[] officedocGetToBePrintedList(java.lang.String arg0, _int.wipo.ipas.IpasServices.CFileId arg1, _int.wipo.ipas.IpasServices.IpasDateTime arg2, _int.wipo.ipas.IpasServices.IpasDateTime arg3, boolean arg4, boolean arg5, _int.wipo.ipas.IpasServices.CUserId arg6) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[89]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "OfficedocGetToBePrintedList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0, arg1, arg2, arg3, new java.lang.Boolean(arg4), new java.lang.Boolean(arg5), arg6});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (_int.wipo.ipas.IpasServices.COfficedoc[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (_int.wipo.ipas.IpasServices.COfficedoc[]) org.apache.axis.utils.JavaUtils.convert(_resp, _int.wipo.ipas.IpasServices.COfficedoc[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public _int.wipo.ipas.IpasServices.CAction[] journalGetActionList(_int.wipo.ipas.IpasServices.CJournalId arg0, boolean arg1) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[90]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "JournalGetActionList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0, new java.lang.Boolean(arg1)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (_int.wipo.ipas.IpasServices.CAction[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (_int.wipo.ipas.IpasServices.CAction[]) org.apache.axis.utils.JavaUtils.convert(_resp, _int.wipo.ipas.IpasServices.CAction[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean deliveryAddFileSection(_int.wipo.ipas.IpasServices.CDeliveryId arg0, _int.wipo.ipas.IpasServices.CFileSectionId arg1) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[91]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "DeliveryAddFileSection"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0, arg1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean outputFieldWriteDocument(_int.wipo.ipas.IpasServices.CDocumentImage arg0, java.lang.String arg1) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[92]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "OutputFieldWriteDocument"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0, arg1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean processUpdateAction(_int.wipo.ipas.IpasServices.CActionId arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4, java.lang.String arg5, java.lang.String arg6, boolean arg7, _int.wipo.ipas.IpasServices.CJournalId arg8, java.lang.Boolean arg9, java.lang.Boolean arg10, java.lang.Boolean arg11, java.lang.Boolean arg12, java.lang.Boolean arg13) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[93]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ProcessUpdateAction"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0, arg1, arg2, arg3, arg4, arg5, arg6, new java.lang.Boolean(arg7), arg8, arg9, arg10, arg11, arg12, arg13});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean processGroupAddProcess(_int.wipo.ipas.IpasServices.CProcessGroupId arg0, _int.wipo.ipas.IpasServices.CProcessId arg1) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[94]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ProcessGroupAddProcess"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0, arg1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public _int.wipo.ipas.IpasServices.CProcessSummary[] processGetList(_int.wipo.ipas.IpasServices.CCriteriaProcess arg0, _int.wipo.ipas.IpasServices.IpasInteger arg1) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[95]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ProcessGetList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0, arg1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (_int.wipo.ipas.IpasServices.CProcessSummary[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (_int.wipo.ipas.IpasServices.CProcessSummary[]) org.apache.axis.utils.JavaUtils.convert(_resp, _int.wipo.ipas.IpasServices.CProcessSummary[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public _int.wipo.ipas.IpasServices.CFileSummary[] patentGetList(_int.wipo.ipas.IpasServices.CCriteriaPatent arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[96]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "PatentGetList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (_int.wipo.ipas.IpasServices.CFileSummary[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (_int.wipo.ipas.IpasServices.CFileSummary[]) org.apache.axis.utils.JavaUtils.convert(_resp, _int.wipo.ipas.IpasServices.CFileSummary[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String processReplaceOptionFields(_int.wipo.ipas.IpasServices.COption arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[97]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ProcessReplaceOptionFields"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public _int.wipo.ipas.IpasServices.CAction processReadAction(_int.wipo.ipas.IpasServices.CActionId arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[98]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ProcessReadAction"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (_int.wipo.ipas.IpasServices.CAction) _resp;
            } catch (java.lang.Exception _exception) {
                return (_int.wipo.ipas.IpasServices.CAction) org.apache.axis.utils.JavaUtils.convert(_resp, _int.wipo.ipas.IpasServices.CAction.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean processInsertFreeze(_int.wipo.ipas.IpasServices.CProcessId arg0, _int.wipo.ipas.IpasServices.CProcessId arg1, boolean arg2, boolean arg3) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[99]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ProcessInsertFreeze"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0, arg1, new java.lang.Boolean(arg2), new java.lang.Boolean(arg3)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean userdocAddAffectedFile(_int.wipo.ipas.IpasServices.CDocumentId arg0, _int.wipo.ipas.IpasServices.CFileId arg1) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[100]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "UserdocAddAffectedFile"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0, arg1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean processGroupRemoveProcess(_int.wipo.ipas.IpasServices.CProcessGroupId arg0, _int.wipo.ipas.IpasServices.CProcessId arg1) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[101]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ProcessGroupRemoveProcess"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0, arg1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public _int.wipo.ipas.IpasServices.COption[] processGetPossibleOptionList(_int.wipo.ipas.IpasServices.CActionTypeId arg0, java.lang.String arg1, java.lang.String arg2, _int.wipo.ipas.IpasServices.IpasInteger arg3, java.lang.String arg4) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[102]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ProcessGetPossibleOptionList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0, arg1, arg2, arg3, arg4});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (_int.wipo.ipas.IpasServices.COption[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (_int.wipo.ipas.IpasServices.COption[]) org.apache.axis.utils.JavaUtils.convert(_resp, _int.wipo.ipas.IpasServices.COption[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean processGroupDeleteLastAction(_int.wipo.ipas.IpasServices.CProcessGroupId arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[103]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ProcessGroupDeleteLastAction"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean userdocUpdate(_int.wipo.ipas.IpasServices.CUserdoc arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[104]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "UserdocUpdate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean processDeleteFreeze(_int.wipo.ipas.IpasServices.CProcessId arg0, _int.wipo.ipas.IpasServices.CProcessId arg1) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[105]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ProcessDeleteFreeze"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0, arg1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public _int.wipo.ipas.IpasServices.CProcessSummary[] processGroupReadProcessList(_int.wipo.ipas.IpasServices.CProcessGroupId arg0, _int.wipo.ipas.IpasServices.IpasInteger arg1) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[106]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ProcessGroupReadProcessList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0, arg1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (_int.wipo.ipas.IpasServices.CProcessSummary[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (_int.wipo.ipas.IpasServices.CProcessSummary[]) org.apache.axis.utils.JavaUtils.convert(_resp, _int.wipo.ipas.IpasServices.CProcessSummary[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean processInsertManual(_int.wipo.ipas.IpasServices.CProcessId arg0, java.lang.String arg1, boolean arg2, boolean arg3, boolean arg4, _int.wipo.ipas.IpasServices.IpasDateTime arg5) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[107]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ProcessInsertManual"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0, arg1, new java.lang.Boolean(arg2), new java.lang.Boolean(arg3), new java.lang.Boolean(arg4), arg5});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public _int.wipo.ipas.IpasServices.CProcessFrozen[] processReadFrozenList(_int.wipo.ipas.IpasServices.CProcessId arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[108]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ProcessReadFrozenList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (_int.wipo.ipas.IpasServices.CProcessFrozen[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (_int.wipo.ipas.IpasServices.CProcessFrozen[]) org.apache.axis.utils.JavaUtils.convert(_resp, _int.wipo.ipas.IpasServices.CProcessFrozen[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public _int.wipo.ipas.IpasServices.CStatusId processInsertAction(_int.wipo.ipas.IpasServices.CProcessId arg0, _int.wipo.ipas.IpasServices.CActionTypeId arg1, _int.wipo.ipas.IpasServices.IpasDateTime arg2, _int.wipo.ipas.IpasServices.IpasDateTime arg3, _int.wipo.ipas.IpasServices.CUserId arg4, _int.wipo.ipas.IpasServices.COption[] arg5, java.lang.String arg6, java.lang.String arg7, java.lang.String arg8, java.lang.String arg9, java.lang.String arg10, java.lang.String arg11, _int.wipo.ipas.IpasServices.CAckMessageNbr[] arg12, _int.wipo.ipas.IpasServices.CAckMessageText[] arg13, _int.wipo.ipas.IpasServices.CUserId arg14, _int.wipo.ipas.IpasServices.IpasInteger arg15) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[109]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ProcessInsertAction"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (_int.wipo.ipas.IpasServices.CStatusId) _resp;
            } catch (java.lang.Exception _exception) {
                return (_int.wipo.ipas.IpasServices.CStatusId) org.apache.axis.utils.JavaUtils.convert(_resp, _int.wipo.ipas.IpasServices.CStatusId.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public _int.wipo.ipas.IpasServices.CProcessFreezing[] processReadFreezingList(_int.wipo.ipas.IpasServices.CProcessId arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[110]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ProcessReadFreezingList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (_int.wipo.ipas.IpasServices.CProcessFreezing[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (_int.wipo.ipas.IpasServices.CProcessFreezing[]) org.apache.axis.utils.JavaUtils.convert(_resp, _int.wipo.ipas.IpasServices.CProcessFreezing[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean userdocAddUserdocType(_int.wipo.ipas.IpasServices.CDocumentId arg0, java.lang.String arg1) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[111]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "UserdocAddUserdocType"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0, arg1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean processDeleteAction(_int.wipo.ipas.IpasServices.CActionId arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[112]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ProcessDeleteAction"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean processInsertSpecialAction(_int.wipo.ipas.IpasServices.CProcessId arg0, _int.wipo.ipas.IpasServices.CActionTypeId arg1, java.lang.String arg2, _int.wipo.ipas.IpasServices.IpasDateTime arg3, _int.wipo.ipas.IpasServices.IpasDateTime arg4, _int.wipo.ipas.IpasServices.CUserId arg5, _int.wipo.ipas.IpasServices.COption[] arg6, _int.wipo.ipas.IpasServices.COption[] arg7, java.lang.String arg8, java.lang.String arg9, java.lang.String arg10, java.lang.String arg11, java.lang.String arg12, java.lang.String arg13, _int.wipo.ipas.IpasServices.CAckMessageNbr[] arg14, _int.wipo.ipas.IpasServices.CAckMessageText[] arg15, _int.wipo.ipas.IpasServices.CUserId arg16) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[113]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ProcessInsertSpecialAction"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public _int.wipo.ipas.IpasServices.CDrawing[] patentReadDrawingList(_int.wipo.ipas.IpasServices.CFileId arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[114]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "PatentReadDrawingList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (_int.wipo.ipas.IpasServices.CDrawing[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (_int.wipo.ipas.IpasServices.CDrawing[]) org.apache.axis.utils.JavaUtils.convert(_resp, _int.wipo.ipas.IpasServices.CDrawing[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public _int.wipo.ipas.IpasServices.CUserdocSummary[] userdocGetList(_int.wipo.ipas.IpasServices.CCriteriaUserdoc arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[115]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "UserdocGetList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (_int.wipo.ipas.IpasServices.CUserdocSummary[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (_int.wipo.ipas.IpasServices.CUserdocSummary[]) org.apache.axis.utils.JavaUtils.convert(_resp, _int.wipo.ipas.IpasServices.CUserdocSummary[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean userdocRemoveUserdocType(_int.wipo.ipas.IpasServices.CDocumentId arg0, java.lang.String arg1) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[116]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "UserdocRemoveUserdocType"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0, arg1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public _int.wipo.ipas.IpasServices.CProcessEvent[] processReadEventList(_int.wipo.ipas.IpasServices.CProcessId arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[117]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ProcessReadEventList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (_int.wipo.ipas.IpasServices.CProcessEvent[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (_int.wipo.ipas.IpasServices.CProcessEvent[]) org.apache.axis.utils.JavaUtils.convert(_resp, _int.wipo.ipas.IpasServices.CProcessEvent[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public _int.wipo.ipas.IpasServices.CProcessGroup[] processGroupGetList(_int.wipo.ipas.IpasServices.CUserId arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[118]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ProcessGroupGetList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (_int.wipo.ipas.IpasServices.CProcessGroup[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (_int.wipo.ipas.IpasServices.CProcessGroup[]) org.apache.axis.utils.JavaUtils.convert(_resp, _int.wipo.ipas.IpasServices.CProcessGroup[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public _int.wipo.ipas.IpasServices.CDocumentImage outputFieldReadDocument(java.lang.String arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[119]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "OutputFieldReadDocument"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (_int.wipo.ipas.IpasServices.CDocumentImage) _resp;
            } catch (java.lang.Exception _exception) {
                return (_int.wipo.ipas.IpasServices.CDocumentImage) org.apache.axis.utils.JavaUtils.convert(_resp, _int.wipo.ipas.IpasServices.CDocumentImage.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean sqlCheckSyntax(java.lang.String arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[120]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "SqlCheckSyntax"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public _int.wipo.ipas.IpasServices.CPerson[] personGetList(_int.wipo.ipas.IpasServices.CCriteriaPerson arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[121]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "PersonGetList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (_int.wipo.ipas.IpasServices.CPerson[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (_int.wipo.ipas.IpasServices.CPerson[]) org.apache.axis.utils.JavaUtils.convert(_resp, _int.wipo.ipas.IpasServices.CPerson[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public _int.wipo.ipas.IpasServices.CStatus processReadFinalStatus(_int.wipo.ipas.IpasServices.CActionTypeId arg0, _int.wipo.ipas.IpasServices.CStatusId arg1) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[122]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ProcessReadFinalStatus"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0, arg1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (_int.wipo.ipas.IpasServices.CStatus) _resp;
            } catch (java.lang.Exception _exception) {
                return (_int.wipo.ipas.IpasServices.CStatus) org.apache.axis.utils.JavaUtils.convert(_resp, _int.wipo.ipas.IpasServices.CStatus.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean processGroupDelete(_int.wipo.ipas.IpasServices.CProcessGroupId arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[123]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ProcessGroupDelete"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean processUpdateFreeze(_int.wipo.ipas.IpasServices.CProcessId arg0, _int.wipo.ipas.IpasServices.CProcessId arg1, boolean arg2, boolean arg3) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[124]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ProcessUpdateFreeze"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0, arg1, new java.lang.Boolean(arg2), new java.lang.Boolean(arg3)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public _int.wipo.ipas.IpasServices.CUserdoc userdocReceive(java.lang.String arg0, java.lang.String arg1, _int.wipo.ipas.IpasServices.CFileId[] arg2, boolean arg3, _int.wipo.ipas.IpasServices.COfficedocId arg4, _int.wipo.ipas.IpasServices.COfficeSectionId arg5, _int.wipo.ipas.IpasServices.IpasDateTime arg6, _int.wipo.ipas.IpasServices.CReceipt arg7, _int.wipo.ipas.IpasServices.IpasInteger arg8, java.lang.String arg9, _int.wipo.ipas.IpasServices.CDocumentId arg10, _int.wipo.ipas.IpasServices.CDocumentSeqId arg11, _int.wipo.ipas.IpasServices.CDocumentId arg12) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[125]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "UserdocReceive"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0, arg1, arg2, new java.lang.Boolean(arg3), arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (_int.wipo.ipas.IpasServices.CUserdoc) _resp;
            } catch (java.lang.Exception _exception) {
                return (_int.wipo.ipas.IpasServices.CUserdoc) org.apache.axis.utils.JavaUtils.convert(_resp, _int.wipo.ipas.IpasServices.CUserdoc.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean processInsertNoteAction(_int.wipo.ipas.IpasServices.CProcessId arg0, _int.wipo.ipas.IpasServices.CActionTypeId arg1, _int.wipo.ipas.IpasServices.IpasDateTime arg2, _int.wipo.ipas.IpasServices.CUserId arg3, _int.wipo.ipas.IpasServices.COption[] arg4, java.lang.String arg5, java.lang.String arg6, java.lang.String arg7, java.lang.String arg8, java.lang.String arg9, java.lang.String arg10, _int.wipo.ipas.IpasServices.CAckMessageNbr[] arg11, _int.wipo.ipas.IpasServices.CAckMessageText[] arg12, _int.wipo.ipas.IpasServices.CUserId arg13) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[126]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ProcessInsertNoteAction"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public _int.wipo.ipas.IpasServices.CStringValue[] outputFieldGetFolderContent(java.lang.String arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[127]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "OutputFieldGetFolderContent"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (_int.wipo.ipas.IpasServices.CStringValue[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (_int.wipo.ipas.IpasServices.CStringValue[]) org.apache.axis.utils.JavaUtils.convert(_resp, _int.wipo.ipas.IpasServices.CStringValue[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public _int.wipo.ipas.IpasServices.CProcessGroup processGroupRead(_int.wipo.ipas.IpasServices.CProcessGroupId arg0, boolean arg1, _int.wipo.ipas.IpasServices.IpasInteger arg2) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[128]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ProcessGroupRead"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0, new java.lang.Boolean(arg1), arg2});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (_int.wipo.ipas.IpasServices.CProcessGroup) _resp;
            } catch (java.lang.Exception _exception) {
                return (_int.wipo.ipas.IpasServices.CProcessGroup) org.apache.axis.utils.JavaUtils.convert(_resp, _int.wipo.ipas.IpasServices.CProcessGroup.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean userdocDelete(_int.wipo.ipas.IpasServices.CDocumentId arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[129]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "UserdocDelete"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean userdocInsert(_int.wipo.ipas.IpasServices.CUserdoc arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[130]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "UserdocInsert"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public byte[] patentReadWordfileTitle(_int.wipo.ipas.IpasServices.CFileId arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[131]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "PatentReadWordfileTitle"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (byte[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (byte[]) org.apache.axis.utils.JavaUtils.convert(_resp, byte[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean userdocRemoveAffectedFile(_int.wipo.ipas.IpasServices.CDocumentId arg0, _int.wipo.ipas.IpasServices.CFileId arg1) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[132]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "UserdocRemoveAffectedFile"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0, arg1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean processGroupInsert(_int.wipo.ipas.IpasServices.CProcessGroup arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[133]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ProcessGroupInsert"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public _int.wipo.ipas.IpasServices.CProcessId markInsert(_int.wipo.ipas.IpasServices.CMark arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[134]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "MarkInsert"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (_int.wipo.ipas.IpasServices.CProcessId) _resp;
            } catch (java.lang.Exception _exception) {
                return (_int.wipo.ipas.IpasServices.CProcessId) org.apache.axis.utils.JavaUtils.convert(_resp, _int.wipo.ipas.IpasServices.CProcessId.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean dailyLogOpen(_int.wipo.ipas.IpasServices.CDailyLogId arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[135]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "DailyLogOpen"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public _int.wipo.ipas.IpasServices.CDailyLog dailyLogRead(_int.wipo.ipas.IpasServices.CDailyLogId arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[136]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "DailyLogRead"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (_int.wipo.ipas.IpasServices.CDailyLog) _resp;
            } catch (java.lang.Exception _exception) {
                return (_int.wipo.ipas.IpasServices.CDailyLog) org.apache.axis.utils.JavaUtils.convert(_resp, _int.wipo.ipas.IpasServices.CDailyLog.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public _int.wipo.ipas.IpasServices.IpasInteger agentCount(_int.wipo.ipas.IpasServices.CCriteriaAgent arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[137]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "AgentCount"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (_int.wipo.ipas.IpasServices.IpasInteger) _resp;
            } catch (java.lang.Exception _exception) {
                return (_int.wipo.ipas.IpasServices.IpasInteger) org.apache.axis.utils.JavaUtils.convert(_resp, _int.wipo.ipas.IpasServices.IpasInteger.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public _int.wipo.ipas.IpasServices.CDelivery deliveryRead(_int.wipo.ipas.IpasServices.CDeliveryId arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[138]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "DeliveryRead"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (_int.wipo.ipas.IpasServices.CDelivery) _resp;
            } catch (java.lang.Exception _exception) {
                return (_int.wipo.ipas.IpasServices.CDelivery) org.apache.axis.utils.JavaUtils.convert(_resp, _int.wipo.ipas.IpasServices.CDelivery.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public _int.wipo.ipas.IpasServices.IpasInteger fileCount(_int.wipo.ipas.IpasServices.CCriteriaFile arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[139]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "FileCount"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (_int.wipo.ipas.IpasServices.IpasInteger) _resp;
            } catch (java.lang.Exception _exception) {
                return (_int.wipo.ipas.IpasServices.IpasInteger) org.apache.axis.utils.JavaUtils.convert(_resp, _int.wipo.ipas.IpasServices.IpasInteger.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public _int.wipo.ipas.IpasServices.CAgent agentRead(_int.wipo.ipas.IpasServices.CAgentId arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[140]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "AgentRead"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (_int.wipo.ipas.IpasServices.CAgent) _resp;
            } catch (java.lang.Exception _exception) {
                return (_int.wipo.ipas.IpasServices.CAgent) org.apache.axis.utils.JavaUtils.convert(_resp, _int.wipo.ipas.IpasServices.CAgent.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public _int.wipo.ipas.IpasServices.CJournal journalRead(_int.wipo.ipas.IpasServices.CJournalId arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[141]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "JournalRead"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (_int.wipo.ipas.IpasServices.CJournal) _resp;
            } catch (java.lang.Exception _exception) {
                return (_int.wipo.ipas.IpasServices.CJournal) org.apache.axis.utils.JavaUtils.convert(_resp, _int.wipo.ipas.IpasServices.CJournal.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean journalClose(_int.wipo.ipas.IpasServices.CJournalId arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[142]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "JournalClose"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public _int.wipo.ipas.IpasServices.CFile fileReceive(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, _int.wipo.ipas.IpasServices.CRelationship[] arg3, _int.wipo.ipas.IpasServices.IpasDateTime arg4, _int.wipo.ipas.IpasServices.CReceipt arg5, _int.wipo.ipas.IpasServices.CFileId arg6, _int.wipo.ipas.IpasServices.CDocumentId arg7, java.lang.String arg8) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[143]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "FileReceive"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (_int.wipo.ipas.IpasServices.CFile) _resp;
            } catch (java.lang.Exception _exception) {
                return (_int.wipo.ipas.IpasServices.CFile) org.apache.axis.utils.JavaUtils.convert(_resp, _int.wipo.ipas.IpasServices.CFile.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public _int.wipo.ipas.IpasServices.IpasInteger journalCount(_int.wipo.ipas.IpasServices.CCriteriaJournal arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[144]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "JournalCount"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (_int.wipo.ipas.IpasServices.IpasInteger) _resp;
            } catch (java.lang.Exception _exception) {
                return (_int.wipo.ipas.IpasServices.IpasInteger) org.apache.axis.utils.JavaUtils.convert(_resp, _int.wipo.ipas.IpasServices.IpasInteger.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean agentInsert(_int.wipo.ipas.IpasServices.CAgent arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[145]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "AgentInsert"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public _int.wipo.ipas.IpasServices.IpasInteger markCount(_int.wipo.ipas.IpasServices.CCriteriaMark arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[146]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "MarkCount"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (_int.wipo.ipas.IpasServices.IpasInteger) _resp;
            } catch (java.lang.Exception _exception) {
                return (_int.wipo.ipas.IpasServices.IpasInteger) org.apache.axis.utils.JavaUtils.convert(_resp, _int.wipo.ipas.IpasServices.IpasInteger.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public _int.wipo.ipas.IpasServices.CAgent[] agentGetList(_int.wipo.ipas.IpasServices.CCriteriaAgent arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[147]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "AgentGetList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (_int.wipo.ipas.IpasServices.CAgent[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (_int.wipo.ipas.IpasServices.CAgent[]) org.apache.axis.utils.JavaUtils.convert(_resp, _int.wipo.ipas.IpasServices.CAgent[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean agentUpdate(_int.wipo.ipas.IpasServices.CAgent arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[148]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "AgentUpdate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean agentDelete(_int.wipo.ipas.IpasServices.CAgentId arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[149]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "AgentDelete"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public _int.wipo.ipas.IpasServices.CFileSummary[] fileGetList(_int.wipo.ipas.IpasServices.CCriteriaFile arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[150]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "FileGetList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (_int.wipo.ipas.IpasServices.CFileSummary[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (_int.wipo.ipas.IpasServices.CFileSummary[]) org.apache.axis.utils.JavaUtils.convert(_resp, _int.wipo.ipas.IpasServices.CFileSummary[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public _int.wipo.ipas.IpasServices.CFile fileRead(_int.wipo.ipas.IpasServices.CFileId arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[151]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "FileRead"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (_int.wipo.ipas.IpasServices.CFile) _resp;
            } catch (java.lang.Exception _exception) {
                return (_int.wipo.ipas.IpasServices.CFile) org.apache.axis.utils.JavaUtils.convert(_resp, _int.wipo.ipas.IpasServices.CFile.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean markDelete(_int.wipo.ipas.IpasServices.CFileId arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[152]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "MarkDelete"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public _int.wipo.ipas.IpasServices.CFileSummary[] markGetList(_int.wipo.ipas.IpasServices.CCriteriaMark arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[153]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "MarkGetList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (_int.wipo.ipas.IpasServices.CFileSummary[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (_int.wipo.ipas.IpasServices.CFileSummary[]) org.apache.axis.utils.JavaUtils.convert(_resp, _int.wipo.ipas.IpasServices.CFileSummary[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public _int.wipo.ipas.IpasServices.CFileSummary[] markGetList2(_int.wipo.ipas.IpasServices.CCriteriaMark arg0, _int.wipo.ipas.IpasServices.CFileId arg1) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[154]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "MarkGetList2"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0, arg1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (_int.wipo.ipas.IpasServices.CFileSummary[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (_int.wipo.ipas.IpasServices.CFileSummary[]) org.apache.axis.utils.JavaUtils.convert(_resp, _int.wipo.ipas.IpasServices.CFileSummary[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public _int.wipo.ipas.IpasServices.CPatent patentRead(_int.wipo.ipas.IpasServices.CFileId arg0, boolean arg1, boolean arg2) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[155]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "PatentRead"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0, new java.lang.Boolean(arg1), new java.lang.Boolean(arg2)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (_int.wipo.ipas.IpasServices.CPatent) _resp;
            } catch (java.lang.Exception _exception) {
                return (_int.wipo.ipas.IpasServices.CPatent) org.apache.axis.utils.JavaUtils.convert(_resp, _int.wipo.ipas.IpasServices.CPatent.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public _int.wipo.ipas.IpasServices.CMark markRead(_int.wipo.ipas.IpasServices.CFileId arg0, boolean arg1, boolean arg2) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[156]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "MarkRead"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0, new java.lang.Boolean(arg1), new java.lang.Boolean(arg2)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (_int.wipo.ipas.IpasServices.CMark) _resp;
            } catch (java.lang.Exception _exception) {
                return (_int.wipo.ipas.IpasServices.CMark) org.apache.axis.utils.JavaUtils.convert(_resp, _int.wipo.ipas.IpasServices.CMark.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public _int.wipo.ipas.IpasServices.IpasInteger patentCount(_int.wipo.ipas.IpasServices.CCriteriaPatent arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[157]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "PatentCount"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (_int.wipo.ipas.IpasServices.IpasInteger) _resp;
            } catch (java.lang.Exception _exception) {
                return (_int.wipo.ipas.IpasServices.IpasInteger) org.apache.axis.utils.JavaUtils.convert(_resp, _int.wipo.ipas.IpasServices.IpasInteger.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean markUpdate(_int.wipo.ipas.IpasServices.CMark arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[158]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "MarkUpdate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean patentDelete(_int.wipo.ipas.IpasServices.CFileId arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[159]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "PatentDelete"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public _int.wipo.ipas.IpasServices.CSqlRow[] sqlFetchAll(java.lang.String arg0, _int.wipo.ipas.IpasServices.CSqlRow arg1) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[160]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "SqlFetchAll"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0, arg1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (_int.wipo.ipas.IpasServices.CSqlRow[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (_int.wipo.ipas.IpasServices.CSqlRow[]) org.apache.axis.utils.JavaUtils.convert(_resp, _int.wipo.ipas.IpasServices.CSqlRow[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public _int.wipo.ipas.IpasServices.IpasInteger personCount(_int.wipo.ipas.IpasServices.CCriteriaPerson arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[161]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "PersonCount"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (_int.wipo.ipas.IpasServices.IpasInteger) _resp;
            } catch (java.lang.Exception _exception) {
                return (_int.wipo.ipas.IpasServices.IpasInteger) org.apache.axis.utils.JavaUtils.convert(_resp, _int.wipo.ipas.IpasServices.IpasInteger.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public _int.wipo.ipas.IpasServices.CProcess processRead(_int.wipo.ipas.IpasServices.CProcessId arg0, boolean arg1, boolean arg2) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[162]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ProcessRead"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0, new java.lang.Boolean(arg1), new java.lang.Boolean(arg2)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (_int.wipo.ipas.IpasServices.CProcess) _resp;
            } catch (java.lang.Exception _exception) {
                return (_int.wipo.ipas.IpasServices.CProcess) org.apache.axis.utils.JavaUtils.convert(_resp, _int.wipo.ipas.IpasServices.CProcess.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public _int.wipo.ipas.IpasServices.CLogo markReadLogo(_int.wipo.ipas.IpasServices.CFileId arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[163]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "MarkReadLogo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (_int.wipo.ipas.IpasServices.CLogo) _resp;
            } catch (java.lang.Exception _exception) {
                return (_int.wipo.ipas.IpasServices.CLogo) org.apache.axis.utils.JavaUtils.convert(_resp, _int.wipo.ipas.IpasServices.CLogo.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean patentInsert(_int.wipo.ipas.IpasServices.CPatent arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[164]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "PatentInsert"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean sqlExecute(java.lang.String arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[165]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "SqlExecute"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public _int.wipo.ipas.IpasServices.IpasInteger userdocCount(_int.wipo.ipas.IpasServices.CCriteriaUserdoc arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[166]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "UserdocCount"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (_int.wipo.ipas.IpasServices.IpasInteger) _resp;
            } catch (java.lang.Exception _exception) {
                return (_int.wipo.ipas.IpasServices.IpasInteger) org.apache.axis.utils.JavaUtils.convert(_resp, _int.wipo.ipas.IpasServices.IpasInteger.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public _int.wipo.ipas.IpasServices.CUserdoc userdocRead(_int.wipo.ipas.IpasServices.CDocumentId arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[167]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "UserdocRead"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (_int.wipo.ipas.IpasServices.CUserdoc) _resp;
            } catch (java.lang.Exception _exception) {
                return (_int.wipo.ipas.IpasServices.CUserdoc) org.apache.axis.utils.JavaUtils.convert(_resp, _int.wipo.ipas.IpasServices.CUserdoc.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean patentUpdate(_int.wipo.ipas.IpasServices.CPatent arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[168]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "PatentUpdate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.wipo.ipas.IpasServices.IpasException) {
              throw (_int.wipo.ipas.IpasServices.IpasException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

}

package _int.wipo.ipas.IpasServices;

public class IpasServicesProxy implements _int.wipo.ipas.IpasServices.IpasServices_PortType {
  private String _endpoint = null;
  private _int.wipo.ipas.IpasServices.IpasServices_PortType ipasServices_PortType = null;
  
  public IpasServicesProxy() {
    _initIpasServicesProxy();
  }
  
  public IpasServicesProxy(String endpoint) {
    _endpoint = endpoint;
    _initIpasServicesProxy();
  }
  
  private void _initIpasServicesProxy() {
    try {
      ipasServices_PortType = (new _int.wipo.ipas.IpasServices.IpasServices_ServiceLocator()).getIpasServicesPort();
      if (ipasServices_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)ipasServices_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)ipasServices_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (ipasServices_PortType != null)
      ((javax.xml.rpc.Stub)ipasServices_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public _int.wipo.ipas.IpasServices.IpasServices_PortType getIpasServices_PortType() {
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType;
  }
  
  public _int.wipo.ipas.IpasServices.IpasInteger processGroupImportFromExternalPhysicalTracking(_int.wipo.ipas.IpasServices.CProcessGroupId arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.processGroupImportFromExternalPhysicalTracking(arg0);
  }
  
  public java.lang.String commonServicesConfigParamRead(java.lang.String arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.commonServicesConfigParamRead(arg0);
  }
  
  public boolean commonServicesConfigParamUpdate(java.lang.String arg0, java.lang.String arg1) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.commonServicesConfigParamUpdate(arg0, arg1);
  }
  
  public _int.wipo.ipas.IpasServices.CEnvironment[] commonServicesEnvironmentGetList() throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.commonServicesEnvironmentGetList();
  }
  
  public boolean commonServicesEnvironmentTestConnection(java.lang.String arg0, java.lang.String arg1) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.commonServicesEnvironmentTestConnection(arg0, arg1);
  }
  
  public _int.wipo.ipas.IpasServices.CRoleAuthorization[] commonServicesGetRoleAuthorisationList() throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.commonServicesGetRoleAuthorisationList();
  }
  
  public _int.wipo.ipas.IpasServices.CUserStatusStatistics[] processGetUserStatusStatisticsList(_int.wipo.ipas.IpasServices.CUserId arg0, _int.wipo.ipas.IpasServices.CStatusId arg1, boolean arg2, boolean arg3, java.lang.String arg4, java.lang.String arg5) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.processGetUserStatusStatisticsList(arg0, arg1, arg2, arg3, arg4, arg5);
  }
  
  public _int.wipo.ipas.IpasServices.COutputFieldCode[] outputFieldGetTemplateOutputFieldCodeList(java.lang.String arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.outputFieldGetTemplateOutputFieldCodeList(arg0);
  }
  
  public _int.wipo.ipas.IpasServices.COutputField[] officedocGetMailmergeFieldList(_int.wipo.ipas.IpasServices.COfficedocId arg0, _int.wipo.ipas.IpasServices.COutputFieldCode[] arg1, _int.wipo.ipas.IpasServices.COutputFieldCode[] arg2) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.officedocGetMailmergeFieldList(arg0, arg1, arg2);
  }
  
  public _int.wipo.ipas.IpasServices.CActionType[] processGetPossibleSpecialActionTypeList(_int.wipo.ipas.IpasServices.CStatusId arg0, java.lang.String arg1, java.lang.String arg2, _int.wipo.ipas.IpasServices.IpasInteger arg3, java.lang.String arg4, java.lang.String arg5) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.processGetPossibleSpecialActionTypeList(arg0, arg1, arg2, arg3, arg4, arg5);
  }
  
  public boolean fileCheckIntegrityForNewFileId(_int.wipo.ipas.IpasServices.CFileId arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.fileCheckIntegrityForNewFileId(arg0);
  }
  
  public boolean userdocCheckIntegrityForNewDocId(_int.wipo.ipas.IpasServices.CDocumentId arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.userdocCheckIntegrityForNewDocId(arg0);
  }
  
  public boolean userdocCheckIntegrityForNewDocSeqId(_int.wipo.ipas.IpasServices.CDocumentSeqId arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.userdocCheckIntegrityForNewDocSeqId(arg0);
  }
  
  public _int.wipo.ipas.IpasServices.CMadridProcessingResult madridProcessPendingInputTransactions(_int.wipo.ipas.IpasServices.IpasInteger arg0, java.lang.String arg1, long arg2) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.madridProcessPendingInputTransactions(arg0, arg1, arg2);
  }
  
  public _int.wipo.ipas.IpasServices.COutputField[] outputFieldGetUserdocOutputFieldCodeList(java.lang.String arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.outputFieldGetUserdocOutputFieldCodeList(arg0);
  }
  
  public _int.wipo.ipas.IpasServices.COutputField[] outputFieldGetOfficedocOutputFieldCodeList(java.lang.String arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.outputFieldGetOfficedocOutputFieldCodeList(arg0);
  }
  
  public boolean dailyLogIntercalateInFileFolder(java.lang.String arg0, _int.wipo.ipas.IpasServices.IpasDateTime arg1, java.lang.String arg2, _int.wipo.ipas.IpasServices.CFileId arg3) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.dailyLogIntercalateInFileFolder(arg0, arg1, arg2, arg3);
  }
  
  public _int.wipo.ipas.IpasServices.COutputField[] outputFieldGetPriorityOutputFieldList(java.lang.String arg0, _int.wipo.ipas.IpasServices.CFileId arg1, java.lang.String arg2, java.lang.String arg3, _int.wipo.ipas.IpasServices.COutputFieldCode[] arg4) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.outputFieldGetPriorityOutputFieldList(arg0, arg1, arg2, arg3, arg4);
  }
  
  public boolean dailyLogSetDigitalizationReady(_int.wipo.ipas.IpasServices.CDailyLogId arg0, _int.wipo.ipas.IpasServices.IpasDateTime arg1) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.dailyLogSetDigitalizationReady(arg0, arg1);
  }
  
  public _int.wipo.ipas.IpasServices.COutputField[] outputFieldGetFileOutputFieldList(java.lang.String arg0, _int.wipo.ipas.IpasServices.CFileId arg1, _int.wipo.ipas.IpasServices.COutputFieldCode[] arg2) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.outputFieldGetFileOutputFieldList(arg0, arg1, arg2);
  }
  
  public _int.wipo.ipas.IpasServices.CProcessId[] processAutoassignResponsibleUser(_int.wipo.ipas.IpasServices.CUserId arg0, _int.wipo.ipas.IpasServices.IpasInteger arg1, _int.wipo.ipas.IpasServices.CStatusId arg2, java.lang.String arg3, java.lang.String arg4, java.lang.String arg5, boolean arg6, java.lang.String arg7) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.processAutoassignResponsibleUser(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
  }
  
  public _int.wipo.ipas.IpasServices.COption[] processActivateRequiredOptions(_int.wipo.ipas.IpasServices.COption[] arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.processActivateRequiredOptions(arg0);
  }
  
  public _int.wipo.ipas.IpasServices.COutputField[] outputFieldGetOfficedocOutputFieldList(java.lang.String arg0, _int.wipo.ipas.IpasServices.COfficedocId arg1, _int.wipo.ipas.IpasServices.COutputFieldCode[] arg2) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.outputFieldGetOfficedocOutputFieldList(arg0, arg1, arg2);
  }
  
  public _int.wipo.ipas.IpasServices.IpasInteger processGroupExportToExternalPhysicalTracking(_int.wipo.ipas.IpasServices.CProcessGroupId arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.processGroupExportToExternalPhysicalTracking(arg0);
  }
  
  public _int.wipo.ipas.IpasServices.IpasInteger phoneticSearchPhonetizePending(_int.wipo.ipas.IpasServices.IpasInteger arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.phoneticSearchPhonetizePending(arg0);
  }
  
  public _int.wipo.ipas.IpasServices.CDocumentId[] deliveryBreakByCapturedSection(_int.wipo.ipas.IpasServices.CDeliveryId arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.deliveryBreakByCapturedSection(arg0);
  }
  
  public _int.wipo.ipas.IpasServices.COutputField[] outputFieldGetActionOutputFieldCodeList(java.lang.String arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.outputFieldGetActionOutputFieldCodeList(arg0);
  }
  
  public _int.wipo.ipas.IpasServices.CMadridTransactionLog commonServicesMadridTransactionLogRead(_int.wipo.ipas.IpasServices.IpasInteger arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.commonServicesMadridTransactionLogRead(arg0);
  }
  
  public boolean commonServicesMadridTransactionLogUpdate(_int.wipo.ipas.IpasServices.CMadridTransactionLog arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.commonServicesMadridTransactionLogUpdate(arg0);
  }
  
  public _int.wipo.ipas.IpasServices.COutputField[] outputFieldGetUserdocOutputFieldList(java.lang.String arg0, _int.wipo.ipas.IpasServices.CDocumentId arg1, _int.wipo.ipas.IpasServices.COutputFieldCode[] arg2) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.outputFieldGetUserdocOutputFieldList(arg0, arg1, arg2);
  }
  
  public _int.wipo.ipas.IpasServices.COutputField[] outputFieldGetFileOutputFieldCodeList(java.lang.String arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.outputFieldGetFileOutputFieldCodeList(arg0);
  }
  
  public boolean dailyLogIntercalateInUserdocFolder(java.lang.String arg0, _int.wipo.ipas.IpasServices.IpasDateTime arg1, java.lang.String arg2, _int.wipo.ipas.IpasServices.CDocumentId arg3) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.dailyLogIntercalateInUserdocFolder(arg0, arg1, arg2, arg3);
  }
  
  public _int.wipo.ipas.IpasServices.CDocumentId[] deliveryBreakByConfiguredResponsibleUser(_int.wipo.ipas.IpasServices.CDeliveryId arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.deliveryBreakByConfiguredResponsibleUser(arg0);
  }
  
  public _int.wipo.ipas.IpasServices.COutputField[] outputFieldGetPriorityOutputFieldCodeList(java.lang.String arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.outputFieldGetPriorityOutputFieldCodeList(arg0);
  }
  
  public boolean dailyLogSetUserdocCaptureReady(_int.wipo.ipas.IpasServices.CDailyLogId arg0, _int.wipo.ipas.IpasServices.IpasDateTime arg1) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.dailyLogSetUserdocCaptureReady(arg0, arg1);
  }
  
  public boolean outputFieldDocumentAppendServer(_int.wipo.ipas.IpasServices.CStringValue[] arg0, java.lang.String arg1) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.outputFieldDocumentAppendServer(arg0, arg1);
  }
  
  public boolean dailyLogSetAffectedFilesReady(_int.wipo.ipas.IpasServices.CDailyLogId arg0, _int.wipo.ipas.IpasServices.IpasDateTime arg1) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.dailyLogSetAffectedFilesReady(arg0, arg1);
  }
  
  public _int.wipo.ipas.IpasServices.COutputField[] outputFieldGetActionOutputFieldList(java.lang.String arg0, _int.wipo.ipas.IpasServices.CActionId arg1, _int.wipo.ipas.IpasServices.COutputFieldCode[] arg2) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.outputFieldGetActionOutputFieldList(arg0, arg1, arg2);
  }
  
  public _int.wipo.ipas.IpasServices.CUser[] processGetPossibleResponsibleUserList(_int.wipo.ipas.IpasServices.CStatusId arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.processGetPossibleResponsibleUserList(arg0);
  }
  
  public _int.wipo.ipas.IpasServices.CActionType[] processGetPossibleNoteActionTypeList(java.lang.String arg0, java.lang.String arg1, _int.wipo.ipas.IpasServices.IpasInteger arg2, java.lang.String arg3) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.processGetPossibleNoteActionTypeList(arg0, arg1, arg2, arg3);
  }
  
  public boolean agentAddPerson(_int.wipo.ipas.IpasServices.CAgentId arg0, _int.wipo.ipas.IpasServices.CPerson arg1) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.agentAddPerson(arg0, arg1);
  }
  
  public _int.wipo.ipas.IpasServices.IpasInteger dailyLogCount(_int.wipo.ipas.IpasServices.CCriteriaDailyLog arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.dailyLogCount(arg0);
  }
  
  public boolean dailyLogDelete(_int.wipo.ipas.IpasServices.CDailyLogId arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.dailyLogDelete(arg0);
  }
  
  public boolean agentRemovePerson(_int.wipo.ipas.IpasServices.CAgentId arg0, _int.wipo.ipas.IpasServices.CPerson arg1) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.agentRemovePerson(arg0, arg1);
  }
  
  public boolean dailyLogClose(_int.wipo.ipas.IpasServices.CDailyLogId arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.dailyLogClose(arg0);
  }
  
  public boolean dailyLogInsert(_int.wipo.ipas.IpasServices.CDailyLog arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.dailyLogInsert(arg0);
  }
  
  public _int.wipo.ipas.IpasServices.CDailyLog[] dailyLogGetList(_int.wipo.ipas.IpasServices.CCriteriaDailyLog arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.dailyLogGetList(arg0);
  }
  
  public boolean dailyLogSetFileCaptureReady(_int.wipo.ipas.IpasServices.CDailyLogId arg0, _int.wipo.ipas.IpasServices.IpasDateTime arg1) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.dailyLogSetFileCaptureReady(arg0, arg1);
  }
  
  public boolean dailyLogSetLogoCaptureReady(_int.wipo.ipas.IpasServices.CDailyLogId arg0, _int.wipo.ipas.IpasServices.IpasDateTime arg1) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.dailyLogSetLogoCaptureReady(arg0, arg1);
  }
  
  public boolean journalInsert(_int.wipo.ipas.IpasServices.CJournal arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.journalInsert(arg0);
  }
  
  public _int.wipo.ipas.IpasServices.CMadridProcessingResult madridProcessPendingImages(_int.wipo.ipas.IpasServices.IpasInteger arg0, java.lang.String arg1) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.madridProcessPendingImages(arg0, arg1);
  }
  
  public boolean markSimilarityUpdate(_int.wipo.ipas.IpasServices.CFileId arg0, _int.wipo.ipas.IpasServices.CFileId arg1, _int.wipo.ipas.IpasServices.IpasInteger arg2, _int.wipo.ipas.IpasServices.IpasInteger arg3, boolean arg4, boolean arg5) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.markSimilarityUpdate(arg0, arg1, arg2, arg3, arg4, arg5);
  }
  
  public boolean deliveryFlagAsReceived(_int.wipo.ipas.IpasServices.CDeliveryId arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.deliveryFlagAsReceived(arg0);
  }
  
  public boolean officedocUpdateAsPrinted(_int.wipo.ipas.IpasServices.COfficedocId arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.officedocUpdateAsPrinted(arg0);
  }
  
  public _int.wipo.ipas.IpasServices.CDocumentImage outputFieldDocumentAppend(_int.wipo.ipas.IpasServices.CDocumentImage[] arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.outputFieldDocumentAppend(arg0);
  }
  
  public boolean dailyLogSetSearchCodesReady(_int.wipo.ipas.IpasServices.CDailyLogId arg0, _int.wipo.ipas.IpasServices.IpasDateTime arg1) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.dailyLogSetSearchCodesReady(arg0, arg1);
  }
  
  public boolean deliveryRemoveOfficedoc(_int.wipo.ipas.IpasServices.CDeliveryId arg0, _int.wipo.ipas.IpasServices.COfficedocId arg1) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.deliveryRemoveOfficedoc(arg0, arg1);
  }
  
  public _int.wipo.ipas.IpasServices.CMarkSimilarity[] markReadSimilarityList(_int.wipo.ipas.IpasServices.CFileId arg0, java.lang.Boolean arg1, java.lang.Boolean arg2, java.lang.Boolean arg3) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.markReadSimilarityList(arg0, arg1, arg2, arg3);
  }
  
  public _int.wipo.ipas.IpasServices.CDeliveryId deliveryInsert(_int.wipo.ipas.IpasServices.CDelivery arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.deliveryInsert(arg0);
  }
  
  public _int.wipo.ipas.IpasServices.CDocumentImage outputFieldMergeDocument(java.lang.String arg0, _int.wipo.ipas.IpasServices.COutputField[][] arg1, _int.wipo.ipas.IpasServices.COutputField[] arg2, java.lang.String arg3, java.lang.String arg4, java.lang.String arg5) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.outputFieldMergeDocument(arg0, arg1, arg2, arg3, arg4, arg5);
  }
  
  public boolean journalPublish(_int.wipo.ipas.IpasServices.CJournalId arg0, _int.wipo.ipas.IpasServices.IpasDateTime arg1, _int.wipo.ipas.IpasServices.IpasDateTime arg2) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.journalPublish(arg0, arg1, arg2);
  }
  
  public _int.wipo.ipas.IpasServices.CDocumentId officedocNotify(java.lang.String arg0, _int.wipo.ipas.IpasServices.COfficedocId arg1, _int.wipo.ipas.IpasServices.IpasDateTime arg2, java.lang.String arg3, java.lang.String arg4, java.lang.String arg5, java.lang.String arg6, java.lang.String arg7) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.officedocNotify(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
  }
  
  public boolean deliveryFlagAsPrinted(_int.wipo.ipas.IpasServices.CDeliveryId arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.deliveryFlagAsPrinted(arg0);
  }
  
  public boolean journalUpdate(_int.wipo.ipas.IpasServices.CJournal arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.journalUpdate(arg0);
  }
  
  public boolean markSimilarityDelete(_int.wipo.ipas.IpasServices.CFileId arg0, _int.wipo.ipas.IpasServices.CFileId arg1, _int.wipo.ipas.IpasServices.IpasInteger arg2) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.markSimilarityDelete(arg0, arg1, arg2);
  }
  
  public _int.wipo.ipas.IpasServices.CStringValue[] outputFieldGetPrinterList() throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.outputFieldGetPrinterList();
  }
  
  public boolean deliveryUpdate(_int.wipo.ipas.IpasServices.CDelivery arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.deliveryUpdate(arg0);
  }
  
  public _int.wipo.ipas.IpasServices.CFileId[] fileGetMissingList(java.lang.String arg0, java.lang.String arg1, _int.wipo.ipas.IpasServices.IpasInteger arg2, _int.wipo.ipas.IpasServices.IpasInteger arg3, _int.wipo.ipas.IpasServices.IpasInteger arg4) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.fileGetMissingList(arg0, arg1, arg2, arg3, arg4);
  }
  
  public boolean deliveryRemoveUserdoc(_int.wipo.ipas.IpasServices.CDeliveryId arg0, _int.wipo.ipas.IpasServices.CDocumentId arg1) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.deliveryRemoveUserdoc(arg0, arg1);
  }
  
  public boolean journalRemoveAllActions(_int.wipo.ipas.IpasServices.CJournalId arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.journalRemoveAllActions(arg0);
  }
  
  public boolean journalUndoPublish(_int.wipo.ipas.IpasServices.CJournalId arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.journalUndoPublish(arg0);
  }
  
  public _int.wipo.ipas.IpasServices.CSound markReadSound(_int.wipo.ipas.IpasServices.CFileId arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.markReadSound(arg0);
  }
  
  public _int.wipo.ipas.IpasServices.CCountViennaClass[] markCountByViennaClass(_int.wipo.ipas.IpasServices.CCriteriaMark arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.markCountByViennaClass(arg0);
  }
  
  public _int.wipo.ipas.IpasServices.IpasInteger deliveryCount(_int.wipo.ipas.IpasServices.CCriteriaDelivery arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.deliveryCount(arg0);
  }
  
  public _int.wipo.ipas.IpasServices.COfficedoc officedocRead(_int.wipo.ipas.IpasServices.COfficedocId arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.officedocRead(arg0);
  }
  
  public boolean deliveryAddOfficedoc(_int.wipo.ipas.IpasServices.CDeliveryId arg0, _int.wipo.ipas.IpasServices.COfficedocId arg1) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.deliveryAddOfficedoc(arg0, arg1);
  }
  
  public _int.wipo.ipas.IpasServices.CDeliverySummary[] deliveryGetList(_int.wipo.ipas.IpasServices.CCriteriaDelivery arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.deliveryGetList(arg0);
  }
  
  public boolean deliveryAddUserdoc(_int.wipo.ipas.IpasServices.CDeliveryId arg0, _int.wipo.ipas.IpasServices.CDocumentId arg1) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.deliveryAddUserdoc(arg0, arg1);
  }
  
  public boolean deliveryDelete(_int.wipo.ipas.IpasServices.CDeliveryId arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.deliveryDelete(arg0);
  }
  
  public boolean journalAddActions(_int.wipo.ipas.IpasServices.CJournalId arg0, _int.wipo.ipas.IpasServices.IpasDateTime arg1, _int.wipo.ipas.IpasServices.CActionTypeId[] arg2) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.journalAddActions(arg0, arg1, arg2);
  }
  
  public boolean journalGenerateDocuments(_int.wipo.ipas.IpasServices.CJournalId arg0, java.lang.String arg1) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.journalGenerateDocuments(arg0, arg1);
  }
  
  public _int.wipo.ipas.IpasServices.CJournal[] journalGetList(_int.wipo.ipas.IpasServices.CCriteriaJournal arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.journalGetList(arg0);
  }
  
  public boolean deliveryRemoveFileSection(_int.wipo.ipas.IpasServices.CDeliveryId arg0, _int.wipo.ipas.IpasServices.CFileSectionId arg1) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.deliveryRemoveFileSection(arg0, arg1);
  }
  
  public boolean dailyLogUpdate(_int.wipo.ipas.IpasServices.CDailyLog arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.dailyLogUpdate(arg0);
  }
  
  public boolean deliveryFlagAsSent(_int.wipo.ipas.IpasServices.CDeliveryId arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.deliveryFlagAsSent(arg0);
  }
  
  public boolean journalDelete(_int.wipo.ipas.IpasServices.CJournalId arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.journalDelete(arg0);
  }
  
  public boolean dailyLogUndoClose(_int.wipo.ipas.IpasServices.CDailyLogId arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.dailyLogUndoClose(arg0);
  }
  
  public boolean markSimilarityInsert(_int.wipo.ipas.IpasServices.CFileId arg0, _int.wipo.ipas.IpasServices.CFileId arg1, _int.wipo.ipas.IpasServices.IpasInteger arg2, _int.wipo.ipas.IpasServices.IpasInteger arg3, boolean arg4, boolean arg5) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.markSimilarityInsert(arg0, arg1, arg2, arg3, arg4, arg5);
  }
  
  public boolean journalUndoClose(_int.wipo.ipas.IpasServices.CJournalId arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.journalUndoClose(arg0);
  }
  
  public _int.wipo.ipas.IpasServices.COfficedoc[] officedocGetToBePrintedList(java.lang.String arg0, _int.wipo.ipas.IpasServices.CFileId arg1, _int.wipo.ipas.IpasServices.IpasDateTime arg2, _int.wipo.ipas.IpasServices.IpasDateTime arg3, boolean arg4, boolean arg5, _int.wipo.ipas.IpasServices.CUserId arg6) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.officedocGetToBePrintedList(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
  }
  
  public _int.wipo.ipas.IpasServices.CAction[] journalGetActionList(_int.wipo.ipas.IpasServices.CJournalId arg0, boolean arg1) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.journalGetActionList(arg0, arg1);
  }
  
  public boolean deliveryAddFileSection(_int.wipo.ipas.IpasServices.CDeliveryId arg0, _int.wipo.ipas.IpasServices.CFileSectionId arg1) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.deliveryAddFileSection(arg0, arg1);
  }
  
  public boolean outputFieldWriteDocument(_int.wipo.ipas.IpasServices.CDocumentImage arg0, java.lang.String arg1) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.outputFieldWriteDocument(arg0, arg1);
  }
  
  public boolean processUpdateAction(_int.wipo.ipas.IpasServices.CActionId arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4, java.lang.String arg5, java.lang.String arg6, boolean arg7, _int.wipo.ipas.IpasServices.CJournalId arg8, java.lang.Boolean arg9, java.lang.Boolean arg10, java.lang.Boolean arg11, java.lang.Boolean arg12, java.lang.Boolean arg13) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.processUpdateAction(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13);
  }
  
  public boolean processGroupAddProcess(_int.wipo.ipas.IpasServices.CProcessGroupId arg0, _int.wipo.ipas.IpasServices.CProcessId arg1) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.processGroupAddProcess(arg0, arg1);
  }
  
  public _int.wipo.ipas.IpasServices.CProcessSummary[] processGetList(_int.wipo.ipas.IpasServices.CCriteriaProcess arg0, _int.wipo.ipas.IpasServices.IpasInteger arg1) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.processGetList(arg0, arg1);
  }
  
  public _int.wipo.ipas.IpasServices.CFileSummary[] patentGetList(_int.wipo.ipas.IpasServices.CCriteriaPatent arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.patentGetList(arg0);
  }
  
  public java.lang.String processReplaceOptionFields(_int.wipo.ipas.IpasServices.COption arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.processReplaceOptionFields(arg0);
  }
  
  public _int.wipo.ipas.IpasServices.CAction processReadAction(_int.wipo.ipas.IpasServices.CActionId arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.processReadAction(arg0);
  }
  
  public boolean processInsertFreeze(_int.wipo.ipas.IpasServices.CProcessId arg0, _int.wipo.ipas.IpasServices.CProcessId arg1, boolean arg2, boolean arg3) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.processInsertFreeze(arg0, arg1, arg2, arg3);
  }
  
  public boolean userdocAddAffectedFile(_int.wipo.ipas.IpasServices.CDocumentId arg0, _int.wipo.ipas.IpasServices.CFileId arg1) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.userdocAddAffectedFile(arg0, arg1);
  }
  
  public boolean processGroupRemoveProcess(_int.wipo.ipas.IpasServices.CProcessGroupId arg0, _int.wipo.ipas.IpasServices.CProcessId arg1) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.processGroupRemoveProcess(arg0, arg1);
  }
  
  public _int.wipo.ipas.IpasServices.COption[] processGetPossibleOptionList(_int.wipo.ipas.IpasServices.CActionTypeId arg0, java.lang.String arg1, java.lang.String arg2, _int.wipo.ipas.IpasServices.IpasInteger arg3, java.lang.String arg4) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.processGetPossibleOptionList(arg0, arg1, arg2, arg3, arg4);
  }
  
  public boolean processGroupDeleteLastAction(_int.wipo.ipas.IpasServices.CProcessGroupId arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.processGroupDeleteLastAction(arg0);
  }
  
  public boolean userdocUpdate(_int.wipo.ipas.IpasServices.CUserdoc arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.userdocUpdate(arg0);
  }
  
  public boolean processDeleteFreeze(_int.wipo.ipas.IpasServices.CProcessId arg0, _int.wipo.ipas.IpasServices.CProcessId arg1) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.processDeleteFreeze(arg0, arg1);
  }
  
  public _int.wipo.ipas.IpasServices.CProcessSummary[] processGroupReadProcessList(_int.wipo.ipas.IpasServices.CProcessGroupId arg0, _int.wipo.ipas.IpasServices.IpasInteger arg1) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.processGroupReadProcessList(arg0, arg1);
  }
  
  public boolean processInsertManual(_int.wipo.ipas.IpasServices.CProcessId arg0, java.lang.String arg1, boolean arg2, boolean arg3, boolean arg4, _int.wipo.ipas.IpasServices.IpasDateTime arg5) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.processInsertManual(arg0, arg1, arg2, arg3, arg4, arg5);
  }
  
  public _int.wipo.ipas.IpasServices.CProcessFrozen[] processReadFrozenList(_int.wipo.ipas.IpasServices.CProcessId arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.processReadFrozenList(arg0);
  }
  
  public _int.wipo.ipas.IpasServices.CStatusId processInsertAction(_int.wipo.ipas.IpasServices.CProcessId arg0, _int.wipo.ipas.IpasServices.CActionTypeId arg1, _int.wipo.ipas.IpasServices.IpasDateTime arg2, _int.wipo.ipas.IpasServices.IpasDateTime arg3, _int.wipo.ipas.IpasServices.CUserId arg4, _int.wipo.ipas.IpasServices.COption[] arg5, java.lang.String arg6, java.lang.String arg7, java.lang.String arg8, java.lang.String arg9, java.lang.String arg10, java.lang.String arg11, _int.wipo.ipas.IpasServices.CAckMessageNbr[] arg12, _int.wipo.ipas.IpasServices.CAckMessageText[] arg13, _int.wipo.ipas.IpasServices.CUserId arg14, _int.wipo.ipas.IpasServices.IpasInteger arg15) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.processInsertAction(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15);
  }
  
  public _int.wipo.ipas.IpasServices.CProcessFreezing[] processReadFreezingList(_int.wipo.ipas.IpasServices.CProcessId arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.processReadFreezingList(arg0);
  }
  
  public boolean userdocAddUserdocType(_int.wipo.ipas.IpasServices.CDocumentId arg0, java.lang.String arg1) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.userdocAddUserdocType(arg0, arg1);
  }
  
  public boolean processDeleteAction(_int.wipo.ipas.IpasServices.CActionId arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.processDeleteAction(arg0);
  }
  
  public boolean processInsertSpecialAction(_int.wipo.ipas.IpasServices.CProcessId arg0, _int.wipo.ipas.IpasServices.CActionTypeId arg1, java.lang.String arg2, _int.wipo.ipas.IpasServices.IpasDateTime arg3, _int.wipo.ipas.IpasServices.IpasDateTime arg4, _int.wipo.ipas.IpasServices.CUserId arg5, _int.wipo.ipas.IpasServices.COption[] arg6, _int.wipo.ipas.IpasServices.COption[] arg7, java.lang.String arg8, java.lang.String arg9, java.lang.String arg10, java.lang.String arg11, java.lang.String arg12, java.lang.String arg13, _int.wipo.ipas.IpasServices.CAckMessageNbr[] arg14, _int.wipo.ipas.IpasServices.CAckMessageText[] arg15, _int.wipo.ipas.IpasServices.CUserId arg16) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.processInsertSpecialAction(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16);
  }
  
  public _int.wipo.ipas.IpasServices.CDrawing[] patentReadDrawingList(_int.wipo.ipas.IpasServices.CFileId arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.patentReadDrawingList(arg0);
  }
  
  public _int.wipo.ipas.IpasServices.CUserdocSummary[] userdocGetList(_int.wipo.ipas.IpasServices.CCriteriaUserdoc arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.userdocGetList(arg0);
  }
  
  public boolean userdocRemoveUserdocType(_int.wipo.ipas.IpasServices.CDocumentId arg0, java.lang.String arg1) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.userdocRemoveUserdocType(arg0, arg1);
  }
  
  public _int.wipo.ipas.IpasServices.CProcessEvent[] processReadEventList(_int.wipo.ipas.IpasServices.CProcessId arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.processReadEventList(arg0);
  }
  
  public _int.wipo.ipas.IpasServices.CProcessGroup[] processGroupGetList(_int.wipo.ipas.IpasServices.CUserId arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.processGroupGetList(arg0);
  }
  
  public _int.wipo.ipas.IpasServices.CDocumentImage outputFieldReadDocument(java.lang.String arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.outputFieldReadDocument(arg0);
  }
  
  public boolean sqlCheckSyntax(java.lang.String arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.sqlCheckSyntax(arg0);
  }
  
  public _int.wipo.ipas.IpasServices.CPerson[] personGetList(_int.wipo.ipas.IpasServices.CCriteriaPerson arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.personGetList(arg0);
  }
  
  public _int.wipo.ipas.IpasServices.CStatus processReadFinalStatus(_int.wipo.ipas.IpasServices.CActionTypeId arg0, _int.wipo.ipas.IpasServices.CStatusId arg1) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.processReadFinalStatus(arg0, arg1);
  }
  
  public boolean processGroupDelete(_int.wipo.ipas.IpasServices.CProcessGroupId arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.processGroupDelete(arg0);
  }
  
  public boolean processUpdateFreeze(_int.wipo.ipas.IpasServices.CProcessId arg0, _int.wipo.ipas.IpasServices.CProcessId arg1, boolean arg2, boolean arg3) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.processUpdateFreeze(arg0, arg1, arg2, arg3);
  }
  
  public _int.wipo.ipas.IpasServices.CUserdoc userdocReceive(java.lang.String arg0, java.lang.String arg1, _int.wipo.ipas.IpasServices.CFileId[] arg2, boolean arg3, _int.wipo.ipas.IpasServices.COfficedocId arg4, _int.wipo.ipas.IpasServices.COfficeSectionId arg5, _int.wipo.ipas.IpasServices.IpasDateTime arg6, _int.wipo.ipas.IpasServices.CReceipt arg7, _int.wipo.ipas.IpasServices.IpasInteger arg8, java.lang.String arg9, _int.wipo.ipas.IpasServices.CDocumentId arg10, _int.wipo.ipas.IpasServices.CDocumentSeqId arg11, _int.wipo.ipas.IpasServices.CDocumentId arg12) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.userdocReceive(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12);
  }
  
  public boolean processInsertNoteAction(_int.wipo.ipas.IpasServices.CProcessId arg0, _int.wipo.ipas.IpasServices.CActionTypeId arg1, _int.wipo.ipas.IpasServices.IpasDateTime arg2, _int.wipo.ipas.IpasServices.CUserId arg3, _int.wipo.ipas.IpasServices.COption[] arg4, java.lang.String arg5, java.lang.String arg6, java.lang.String arg7, java.lang.String arg8, java.lang.String arg9, java.lang.String arg10, _int.wipo.ipas.IpasServices.CAckMessageNbr[] arg11, _int.wipo.ipas.IpasServices.CAckMessageText[] arg12, _int.wipo.ipas.IpasServices.CUserId arg13) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.processInsertNoteAction(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13);
  }
  
  public _int.wipo.ipas.IpasServices.CStringValue[] outputFieldGetFolderContent(java.lang.String arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.outputFieldGetFolderContent(arg0);
  }
  
  public _int.wipo.ipas.IpasServices.CProcessGroup processGroupRead(_int.wipo.ipas.IpasServices.CProcessGroupId arg0, boolean arg1, _int.wipo.ipas.IpasServices.IpasInteger arg2) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.processGroupRead(arg0, arg1, arg2);
  }
  
  public boolean userdocDelete(_int.wipo.ipas.IpasServices.CDocumentId arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.userdocDelete(arg0);
  }
  
  public boolean userdocInsert(_int.wipo.ipas.IpasServices.CUserdoc arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.userdocInsert(arg0);
  }
  
  public byte[] patentReadWordfileTitle(_int.wipo.ipas.IpasServices.CFileId arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.patentReadWordfileTitle(arg0);
  }
  
  public boolean userdocRemoveAffectedFile(_int.wipo.ipas.IpasServices.CDocumentId arg0, _int.wipo.ipas.IpasServices.CFileId arg1) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.userdocRemoveAffectedFile(arg0, arg1);
  }
  
  public boolean processGroupInsert(_int.wipo.ipas.IpasServices.CProcessGroup arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.processGroupInsert(arg0);
  }
  
  public _int.wipo.ipas.IpasServices.CProcessId markInsert(_int.wipo.ipas.IpasServices.CMark arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.markInsert(arg0);
  }
  
  public boolean dailyLogOpen(_int.wipo.ipas.IpasServices.CDailyLogId arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.dailyLogOpen(arg0);
  }
  
  public _int.wipo.ipas.IpasServices.CDailyLog dailyLogRead(_int.wipo.ipas.IpasServices.CDailyLogId arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.dailyLogRead(arg0);
  }
  
  public _int.wipo.ipas.IpasServices.IpasInteger agentCount(_int.wipo.ipas.IpasServices.CCriteriaAgent arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.agentCount(arg0);
  }
  
  public _int.wipo.ipas.IpasServices.CDelivery deliveryRead(_int.wipo.ipas.IpasServices.CDeliveryId arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.deliveryRead(arg0);
  }
  
  public _int.wipo.ipas.IpasServices.IpasInteger fileCount(_int.wipo.ipas.IpasServices.CCriteriaFile arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.fileCount(arg0);
  }
  
  public _int.wipo.ipas.IpasServices.CAgent agentRead(_int.wipo.ipas.IpasServices.CAgentId arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.agentRead(arg0);
  }
  
  public _int.wipo.ipas.IpasServices.CJournal journalRead(_int.wipo.ipas.IpasServices.CJournalId arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.journalRead(arg0);
  }
  
  public boolean journalClose(_int.wipo.ipas.IpasServices.CJournalId arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.journalClose(arg0);
  }
  
  public _int.wipo.ipas.IpasServices.CFile fileReceive(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, _int.wipo.ipas.IpasServices.CRelationship[] arg3, _int.wipo.ipas.IpasServices.IpasDateTime arg4, _int.wipo.ipas.IpasServices.CReceipt arg5, _int.wipo.ipas.IpasServices.CFileId arg6, _int.wipo.ipas.IpasServices.CDocumentId arg7, java.lang.String arg8) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.fileReceive(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
  }
  
  public _int.wipo.ipas.IpasServices.IpasInteger journalCount(_int.wipo.ipas.IpasServices.CCriteriaJournal arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.journalCount(arg0);
  }
  
  public boolean agentInsert(_int.wipo.ipas.IpasServices.CAgent arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.agentInsert(arg0);
  }
  
  public _int.wipo.ipas.IpasServices.IpasInteger markCount(_int.wipo.ipas.IpasServices.CCriteriaMark arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.markCount(arg0);
  }
  
  public _int.wipo.ipas.IpasServices.CAgent[] agentGetList(_int.wipo.ipas.IpasServices.CCriteriaAgent arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.agentGetList(arg0);
  }
  
  public boolean agentUpdate(_int.wipo.ipas.IpasServices.CAgent arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.agentUpdate(arg0);
  }
  
  public boolean agentDelete(_int.wipo.ipas.IpasServices.CAgentId arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.agentDelete(arg0);
  }
  
  public _int.wipo.ipas.IpasServices.CFileSummary[] fileGetList(_int.wipo.ipas.IpasServices.CCriteriaFile arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.fileGetList(arg0);
  }
  
  public _int.wipo.ipas.IpasServices.CFile fileRead(_int.wipo.ipas.IpasServices.CFileId arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.fileRead(arg0);
  }
  
  public boolean markDelete(_int.wipo.ipas.IpasServices.CFileId arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.markDelete(arg0);
  }
  
  public _int.wipo.ipas.IpasServices.CFileSummary[] markGetList(_int.wipo.ipas.IpasServices.CCriteriaMark arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.markGetList(arg0);
  }
  
  public _int.wipo.ipas.IpasServices.CFileSummary[] markGetList2(_int.wipo.ipas.IpasServices.CCriteriaMark arg0, _int.wipo.ipas.IpasServices.CFileId arg1) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.markGetList2(arg0, arg1);
  }
  
  public _int.wipo.ipas.IpasServices.CPatent patentRead(_int.wipo.ipas.IpasServices.CFileId arg0, boolean arg1, boolean arg2) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.patentRead(arg0, arg1, arg2);
  }
  
  public _int.wipo.ipas.IpasServices.CMark markRead(_int.wipo.ipas.IpasServices.CFileId arg0, boolean arg1, boolean arg2) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.markRead(arg0, arg1, arg2);
  }
  
  public _int.wipo.ipas.IpasServices.IpasInteger patentCount(_int.wipo.ipas.IpasServices.CCriteriaPatent arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.patentCount(arg0);
  }
  
  public boolean markUpdate(_int.wipo.ipas.IpasServices.CMark arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.markUpdate(arg0);
  }
  
  public boolean patentDelete(_int.wipo.ipas.IpasServices.CFileId arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.patentDelete(arg0);
  }
  
  public _int.wipo.ipas.IpasServices.CSqlRow[] sqlFetchAll(java.lang.String arg0, _int.wipo.ipas.IpasServices.CSqlRow arg1) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.sqlFetchAll(arg0, arg1);
  }
  
  public _int.wipo.ipas.IpasServices.IpasInteger personCount(_int.wipo.ipas.IpasServices.CCriteriaPerson arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.personCount(arg0);
  }
  
  public _int.wipo.ipas.IpasServices.CProcess processRead(_int.wipo.ipas.IpasServices.CProcessId arg0, boolean arg1, boolean arg2) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.processRead(arg0, arg1, arg2);
  }
  
  public _int.wipo.ipas.IpasServices.CLogo markReadLogo(_int.wipo.ipas.IpasServices.CFileId arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.markReadLogo(arg0);
  }
  
  public boolean patentInsert(_int.wipo.ipas.IpasServices.CPatent arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.patentInsert(arg0);
  }
  
  public boolean sqlExecute(java.lang.String arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.sqlExecute(arg0);
  }
  
  public _int.wipo.ipas.IpasServices.IpasInteger userdocCount(_int.wipo.ipas.IpasServices.CCriteriaUserdoc arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.userdocCount(arg0);
  }
  
  public _int.wipo.ipas.IpasServices.CUserdoc userdocRead(_int.wipo.ipas.IpasServices.CDocumentId arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.userdocRead(arg0);
  }
  
  public boolean patentUpdate(_int.wipo.ipas.IpasServices.CPatent arg0) throws java.rmi.RemoteException, _int.wipo.ipas.IpasServices.IpasException{
    if (ipasServices_PortType == null)
      _initIpasServicesProxy();
    return ipasServices_PortType.patentUpdate(arg0);
  }
  
  
}
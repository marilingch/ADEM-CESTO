package org.tmview.interfaces;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.rmi.RemoteException;
import java.text.DecimalFormat;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Formatter;
import java.util.logging.Logger;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.rpc.ServiceException;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.time.DateUtils;
import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPHTTPClient;
import org.tmview.soip.Applicant;
import org.tmview.soip.Claimant;
import org.tmview.interfaces.Messages;
import org.tmview.soip.*;
import org.tmview.utilities.*;
import org.tmview.xml.TransactionXML;
import org.xml.sax.SAXException;

import jxml.TransactionType;
import _int.wipo.ipas.IpasServices.*;

import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.Session;
import com.jcraft.jsch.SftpException;

//import xml.TransactionXML;
//************************************************************************************************************************
//************************************************************* VERSION 14-Jun-2019 11:30AM
//************************************************************************************************************************
//************************************************************************************************************************
//************************************************************************************************************************


public class TmViewXmlGenerate {

	
	//private static IpasServices_ServiceLocator sloc =  new IpasServices_ServiceLocator();
	
	private static IpasServices_Service service = new IpasServices_ServiceLocator();
 
	private static IpasServices_PortType port1;
	
	public static int directoryCounter = 0;
	public static int numberOfGeneretedFiles = 1;

	public static String sqlQryGetFullDbBacklog;
	public static String sqlQryDiffGetDailyNewFiling;
	public static String sqlQryDiffGetDailyLogChanges;
	public static String sqlQryDiffGetDailyStatusChanges;
	public static String sqlQryDiffGetTMsPublishedInLastJournal;
	public static String sqlQryDiffGetUserDocsPublishedInLastJournal;
	
//	public static String paramExtractDiffFromDate;
//	public static String paramExtractDiffDateFormat;
	public static String paramInvalidCountryCodes;
	public static String paramSqlFull;
	public static String paramSqlDiffNewFilings;
	public static String paramSqlDiffLogChanges;
	public static String paramSqlDiffStatusChanges; 
	public static String paramSqlDiffGetTrademarksPublishedInLastJournal;
	public static String paramSqlDiffGetUserdocsPublishedInLastJournal;
	
	// declare parameters as global
	public static String paramCloseOnEnd;
	public static String paramInterfaceLanguage;
	public static String paramTransactionIdentifier;
	public static String paramDebug;
	public static String paramPreferredImageSize;
	public static String paramInvalidPriorityCountryCodes;
	public static String paramGetPublicationsAndRecords;
	
	public static String paramLocalFolderImagesCTI;
	public static String paramExecutionContext;
	public static String paramInternationalApplicationCode;
	public static String paramIPO;
	public static String paramExportDetailsIgnore;
	public static String paramSaveImagesToDisc;
	public static String paramDeleteGeneratedImages;
	public static String paramDeleteGeneratedXml;
	public static String paramLocalFolderLogging;

	public static String paramFtpIgnore;
	public static String paramLocalFolderFtp;
	public static String paramLocalPrepare_TM_CESTO;
	public static String paramLocalPrepare_IMG_CESTO;
	public static String paramFtpServer1;
	public static String paramFtpUser1;
	public static String paramFtpPassword1;
	public static String paramFtpFolder1;
	public static String paramFtpFolderImages1;
	
	public static String paramFtpServer2;
	public static String paramFtpUser2;
	public static String paramFtpPassword2;
	public static String paramFtpFolder2;
	public static String paramFtpFolderImages2;
	
	public static String paramFTPRetryCount;
	public static String paramFtpSecure;
	
	public static String paramProxyHost;
	public static String paramProxyPort;
	public static String paramProxyUsername;
	public static String paramProxyPassword;
	
	
	public static Marshaller jxmlJaxbMarshallerTmview;
	public static Unmarshaller jxmlJaxbUnmarshallerTmview;

	// declare reference to Swing worker task which called the interfaces
	public static BackgroundTask backgroundTask;

	// declare loggers as global
	public static Logger messagesLogger;
	public static Logger errorsLogger;

	// declare resource bundle as global
	public static ResourceBundle messages;

	// **************

	//public static String paramExtractUnpublishedTrademarks;
	public static String paramExtractIpasActionTypes;
	public static String paramExtractIpasUserdocTypes;
	public static String paramExtractIpasUserdocTypesSubActionTypes;
	public static String paramIgnoreIpasApplTypes;
	public static String paramMapIpasRecordsAndPublications;

	// declare KindMark
	public static String paramMapIpasApplToKindMark1;
	public static String paramMapIpasApplToKindMark2;
	public static String paramMapIpasApplToKindMark3;
	public static String paramMapIpasApplToKindMark4;

	// declare IPRKind
	public static String paramMapIpasApplToIPRKind1;
	public static String paramMapIpasApplToIPRKind2;
	public static String paramMapIpasApplToIPRKind3;
	public static String paramMapIpasApplToIPRKind4;
	public static String paramMapIpasApplToIPRKind5;
	public static String paramMapIpasApplToIPRKind6;
	public static String paramMapIpasApplToIPRKind7;
	public static String paramMapIpasApplToIPRKind8;
	public static String paramMapIpasApplToIPRKind9;
	public static String paramMapIpasApplToIPRKind10;
	public static String paramMapIpasApplToIPRKind11;
	public static String paramMapIpasApplToIPRKind12;

	// declare Status list
	public static String paramMapIpasStatusToTMviewStatus1;
	public static String paramMapIpasStatusToTMviewStatus2;
	public static String paramMapIpasStatusToTMviewStatus3;
	public static String paramMapIpasStatusToTMviewStatus4;
	public static String paramMapIpasStatusToTMviewStatus5;
	public static String paramMapIpasStatusToTMviewStatus6;
	public static String paramMapIpasStatusToTMviewStatus7;
	public static String paramMapIpasStatusToTMviewStatus8;
	public static String paramMapIpasStatusToTMviewStatus9;
	public static String paramMapIpasStatusToTMviewStatus10;
	public static String paramMapIpasStatusToTMviewStatus11;
	public static String paramMapIpasStatusToTMviewStatus12;
//	public static String paramMapIpasStatusToTMviewStatus13;
//	public static String paramMapIpasStatusToTMviewStatus14;
//	public static String paramMapIpasStatusToTMviewStatus15;

	// map ipr kind
	public static HashMap<String, Integer> mapIpasApplToIPRKind;

	// map KindMark
	public static HashMap<String, Integer> mapIpasApplToKindMark;

	// maps from IPAS status code and IPAS process result type, to TMview status
	public static HashMap<String, Integer> mapIpasStatusCode2TmViewStatus;
	public static HashMap<String, Integer> mapIpasProcessResultType2TmViewStatus;

	// maps from IPAS status to IPAS process result type
	// kjo nuk duhet
	public static HashMap<String, String> mapIpasStatus2IpasProcessResultType;

	// sets with IPAS action types and user doc types to be extracted
	public static HashMap<String, String> mapIpasActionTypeForExtraction;
	public static HashMap<String, String> mapIpasUserdocTypeForExtraction;
	public static HashMap<String, String> mapIpasUserdocTypeSubActionsForExtraction;
	
	// set invalid country codes to be replaced by 'XX' in order to pass the validation
	public static HashMap<String, String> mapIpasInvalidCountryCodes;
	// set invalid priority country codes to be replaced by 'XX' in order to pass the validation
	public static HashMap<String, String> mapIpasInvalidPriorityCountryCodes;
	
	// set record or publication mapping
	public static HashMap<String, String> mapIpasRecordsAndPublicationCodes;
	

	/*
	 * ************************************** ******************** 
	 * initializeJAXB ------- jxml 
	 * **************************************
	 */
	public static void initializeJAXB() throws JAXBException, SAXException {
		
		logMessage(Messages.getString("TmViewXmlGenerate.Status.InitializingXML")); 

		// create JAXB schema factory
		SchemaFactory sf = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);

		// initialize JAXB for jxml AU
		JAXBContext jxmlJaxbContextTMview = JAXBContext.newInstance("jxml");
		jxmlJaxbUnmarshallerTmview = jxmlJaxbContextTMview.createUnmarshaller();
		jxmlJaxbMarshallerTmview = jxmlJaxbContextTMview.createMarshaller();
		jxmlJaxbMarshallerTmview.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

		// validation using schema
		Schema schemaJxmlTmview = sf.newSchema(new File("resources/XSD/TM-XML-ST66-V0-6.xsd")); 
		jxmlJaxbUnmarshallerTmview.setSchema(schemaJxmlTmview);
		jxmlJaxbMarshallerTmview.setSchema(schemaJxmlTmview);
	}

	/*
	 * ************************************** 
	 * ******************** readParameters
	 * **************************************
	 */
	public static void readParameters() throws MalformedURLException {
		
		// set IPAS service port
		try {
			port1 = service.getIpasServicesPort();
		} catch (ServiceException e1) {
			e1.printStackTrace();
		}
		
		// declare resource bundle for config.properties using a class loader
		// referring
		// to the "resources" sub-folder
		File file = new File("resources"); 
		URL[] urls = { file.toURI().toURL() };
		ClassLoader configClassLoader = new URLClassLoader(urls);
		ResourceBundle config;
		config = ResourceBundle.getBundle("configuration", Locale.getDefault(), configClassLoader); 

		
		paramSqlFull = config.getString("paramSqlFull");
		paramSqlDiffNewFilings = config.getString("paramSqlDiffNewFilings");
		paramSqlDiffLogChanges = config.getString("paramSqlDiffLogChanges");
		paramSqlDiffStatusChanges = config.getString("paramSqlDiffStatusChanges");
		paramSqlDiffGetTrademarksPublishedInLastJournal = config.getString("paramSqlDiffGetTrademarksPublishedInLastJournal");
		paramSqlDiffGetUserdocsPublishedInLastJournal = config.getString("paramSqlDiffGetUserdocsPublishedInLastJournal");

		
		
		// get configuration parameters
		paramCloseOnEnd = config.getString("paramCloseOnEnd"); 
		paramInterfaceLanguage = config.getString("paramInterfaceLanguage"); 
		paramIPO = config.getString("paramIPO"); 
		paramInternationalApplicationCode = config.getString("paramInternationalApplicationCode");
		paramTransactionIdentifier = config.getString("paramTransactionIdentifier");
		paramDebug = config.getString("paramDebug");
		paramPreferredImageSize = config.getString("paramPreferredImageSize"); 
		paramInvalidCountryCodes = config.getString("paramInvalidCountryCodes");
		paramInvalidPriorityCountryCodes = config.getString("paramInvalidPriorityCountryCodes");
		paramGetPublicationsAndRecords = config.getString("paramGetPublicationsAndRecords");
		paramSaveImagesToDisc = config.getString("paramSaveImagesToDisc");
		paramDeleteGeneratedImages = config.getString("paramDeleteGeneratedImages");
		paramDeleteGeneratedXml = config.getString("paramDeleteGeneratedXml");
		paramLocalFolderLogging = config.getString("paramLocalFolderLogging"); 
		paramExtractIpasActionTypes = config.getString("paramExtractIpasActionTypes"); 
		paramExtractIpasUserdocTypes = config.getString("paramExtractIpasUserdocTypes"); 
		paramExtractIpasUserdocTypesSubActionTypes = config.getString("paramExtractIpasUserdocTypesSubActionTypes");
		paramIgnoreIpasApplTypes = config.getString("paramIgnoreIpasApplTypes"); 
		paramMapIpasRecordsAndPublications = config.getString("paramMapIpasRecordsAndPublications");
		
		paramMapIpasApplToKindMark1 = config.getString("paramMapIpasApplToKindMark1"); 
		paramMapIpasApplToKindMark2 = config.getString("paramMapIpasApplToKindMark2"); 
		paramMapIpasApplToKindMark3 = config.getString("paramMapIpasApplToKindMark3"); 
		paramMapIpasApplToKindMark4 = config.getString("paramMapIpasApplToKindMark4"); 

		paramMapIpasApplToIPRKind1 = config.getString("paramMapIpasApplToIPRKind1"); 
		paramMapIpasApplToIPRKind2 = config.getString("paramMapIpasApplToIPRKind2"); 
		paramMapIpasApplToIPRKind3 = config.getString("paramMapIpasApplToIPRKind3"); 
		paramMapIpasApplToIPRKind4 = config.getString("paramMapIpasApplToIPRKind4"); 
		paramMapIpasApplToIPRKind5 = config.getString("paramMapIpasApplToIPRKind5"); 
		paramMapIpasApplToIPRKind6 = config.getString("paramMapIpasApplToIPRKind6"); 
		paramMapIpasApplToIPRKind7 = config.getString("paramMapIpasApplToIPRKind7"); 
		paramMapIpasApplToIPRKind8 = config.getString("paramMapIpasApplToIPRKind8"); 
		paramMapIpasApplToIPRKind9 = config.getString("paramMapIpasApplToIPRKind9"); 
		paramMapIpasApplToIPRKind10 = config.getString("paramMapIpasApplToIPRKind10"); 
		paramMapIpasApplToIPRKind11 = config.getString("paramMapIpasApplToIPRKind11"); 
		paramMapIpasApplToIPRKind12 = config.getString("paramMapIpasApplToIPRKind12"); 

		paramMapIpasStatusToTMviewStatus1 = config.getString("paramMapIpasStatusToTMviewStatus1"); 
		paramMapIpasStatusToTMviewStatus2 = config.getString("paramMapIpasStatusToTMviewStatus2"); 
		paramMapIpasStatusToTMviewStatus3 = config.getString("paramMapIpasStatusToTMviewStatus3"); 
		paramMapIpasStatusToTMviewStatus4 = config.getString("paramMapIpasStatusToTMviewStatus4"); 
		paramMapIpasStatusToTMviewStatus5 = config.getString("paramMapIpasStatusToTMviewStatus5"); 
		paramMapIpasStatusToTMviewStatus6 = config.getString("paramMapIpasStatusToTMviewStatus6"); 
		paramMapIpasStatusToTMviewStatus7 = config.getString("paramMapIpasStatusToTMviewStatus7"); 
		paramMapIpasStatusToTMviewStatus8 = config.getString("paramMapIpasStatusToTMviewStatus8"); 
		paramMapIpasStatusToTMviewStatus9 = config.getString("paramMapIpasStatusToTMviewStatus9"); 
		paramMapIpasStatusToTMviewStatus10 = config.getString("paramMapIpasStatusToTMviewStatus10"); 
		paramMapIpasStatusToTMviewStatus11 = config.getString("paramMapIpasStatusToTMviewStatus11"); 
		paramMapIpasStatusToTMviewStatus12 = config.getString("paramMapIpasStatusToTMviewStatus12"); 
//		paramMapIpasStatusToTMviewStatus13 = config.getString("paramMapIpasStatusToTMviewStatus13"); 
//		paramMapIpasStatusToTMviewStatus14 = config.getString("paramMapIpasStatusToTMviewStatus14"); 
//		paramMapIpasStatusToTMviewStatus15 = config.getString("paramMapIpasStatusToTMviewStatus15"); 

		paramLocalFolderFtp = config.getString("paramLocalFolderFtp"); 
		paramLocalFolderImagesCTI = config.getString("paramLocalFolderImagesCTI"); 
		paramLocalPrepare_TM_CESTO = config.getString("paramLocalPrepare_TM_CESTO");
		paramLocalPrepare_IMG_CESTO = config.getString("paramLocalPrepare_IMG_CESTO");		
		
		paramExecutionContext = config.getString("paramExecutionContext");
		paramFtpIgnore = config.getString("paramFtpIgnore"); 

		paramFtpServer1 = config.getString("paramFtpServer1"); 
		paramFtpUser1 = config.getString("paramFtpUser1"); 
		paramFtpPassword1 = config.getString("paramFtpPassword1"); 
		paramFtpFolder1 = config.getString("paramFtpFolder1"); 
		paramFtpFolderImages1 = config.getString("paramFtpFolderImages1");
		
		paramFtpServer2 = config.getString("paramFtpServer2"); 
		paramFtpUser2 = config.getString("paramFtpUser2"); 
		paramFtpPassword2 = config.getString("paramFtpPassword2"); 
		paramFtpFolder2 = config.getString("paramFtpFolder2"); 
		paramFtpFolderImages2 = config.getString("paramFtpFolderImages2");
		
		paramFTPRetryCount = config.getString("paramFTPRetryCount");
		paramFtpSecure = config.getString("paramFtpSecure");

		paramProxyHost = config.getString("paramProxyHost");
		paramProxyPort  = config.getString("paramProxyPort");
		paramProxyUsername  = config.getString("paramProxyUsername");
		paramProxyPassword  = config.getString("paramProxyPassword");
		

		// optional parameter to ignore details XML generation
		paramExportDetailsIgnore = "0";
		try {
			paramExportDetailsIgnore = config.getString("paramExportDetailsIgnore"); 
		} catch (Exception e) {
			// config param does not exist, just ignore it
		}

		// build map from IPAS from appl_typ or appl_subtyp (kind mark)
		mapIpasApplToKindMark = new HashMap<String, Integer>();
		String[] kindmark_codes;

		// kindmark1
		kindmark_codes = paramMapIpasApplToKindMark1.split(",");
		for (int i = 0; i < kindmark_codes.length; i++) {
			mapIpasApplToKindMark.put(kindmark_codes[i].trim(), 1);
		}

		// kindmark2
		kindmark_codes = paramMapIpasApplToKindMark2.split(",");
		for (int i = 0; i < kindmark_codes.length; i++) {
			mapIpasApplToKindMark.put(kindmark_codes[i].trim(), 2);
		}

		// kindmark3
		kindmark_codes = paramMapIpasApplToKindMark3.split(",");
		for (int i = 0; i < kindmark_codes.length; i++) {
			mapIpasApplToKindMark.put(kindmark_codes[i].trim(), 3);
		}

		// kindmark4
		kindmark_codes = paramMapIpasApplToKindMark4.split(",");
		for (int i = 0; i < kindmark_codes.length; i++) {
			mapIpasApplToKindMark.put(kindmark_codes[i].trim(), 4);
		}

		// build map from IPAS from appl_typ or appl_subtyp (kind mark)
		mapIpasApplToIPRKind = new HashMap<String, Integer>();
		String[] iprkind_codes;

		// iprkind1
		iprkind_codes = paramMapIpasApplToIPRKind1.split(",");
		for (int i = 0; i < iprkind_codes.length; i++) {
			mapIpasApplToIPRKind.put(iprkind_codes[i].trim(), 1);
		}

		// iprkind2
		iprkind_codes = paramMapIpasApplToIPRKind2.split(",");
		for (int i = 0; i < iprkind_codes.length; i++) {
			mapIpasApplToIPRKind.put(iprkind_codes[i].trim(), 2);
		}

		// iprkind3
		iprkind_codes = paramMapIpasApplToIPRKind3.split(",");
		for (int i = 0; i < iprkind_codes.length; i++) {
			mapIpasApplToIPRKind.put(iprkind_codes[i].trim(), 3);
		}

		// iprkind4
		iprkind_codes = paramMapIpasApplToIPRKind4.split(",");
		for (int i = 0; i < iprkind_codes.length; i++) {
			mapIpasApplToIPRKind.put(iprkind_codes[i].trim(), 4);
		}

		// iprkind5
		iprkind_codes = paramMapIpasApplToIPRKind5.split(",");
		for (int i = 0; i < iprkind_codes.length; i++) {
			mapIpasApplToIPRKind.put(iprkind_codes[i].trim(), 5);
		}

		// iprkind6
		iprkind_codes = paramMapIpasApplToIPRKind6.split(",");
		for (int i = 0; i < iprkind_codes.length; i++) {
			mapIpasApplToIPRKind.put(iprkind_codes[i].trim(), 6);
		}

		// iprkind7
		iprkind_codes = paramMapIpasApplToIPRKind7.split(",");
		for (int i = 0; i < iprkind_codes.length; i++) {
			mapIpasApplToIPRKind.put(iprkind_codes[i].trim(), 7);
		}

		// iprkind8
		iprkind_codes = paramMapIpasApplToIPRKind8.split(",");
		for (int i = 0; i < iprkind_codes.length; i++) {
			mapIpasApplToIPRKind.put(iprkind_codes[i].trim(), 8);
		}

		// iprkind9
		iprkind_codes = paramMapIpasApplToIPRKind9.split(",");
		for (int i = 0; i < iprkind_codes.length; i++) {
			mapIpasApplToIPRKind.put(iprkind_codes[i].trim(), 9);
		}
		// iprkind10
		iprkind_codes = paramMapIpasApplToIPRKind10.split(",");
		for (int i = 0; i < iprkind_codes.length; i++) {
			mapIpasApplToIPRKind.put(iprkind_codes[i].trim(), 10);
		}
		// iprkind11
		iprkind_codes = paramMapIpasApplToIPRKind11.split(",");
		for (int i = 0; i < iprkind_codes.length; i++) {
			mapIpasApplToIPRKind.put(iprkind_codes[i].trim(), 11);
		}
		// iprkind12
		iprkind_codes = paramMapIpasApplToIPRKind12.split(",");
		for (int i = 0; i < iprkind_codes.length; i++) {
			mapIpasApplToIPRKind.put(iprkind_codes[i].trim(), 12);
		}
		

		// build map from IPAS status to TMview status
		mapIpasStatusCode2TmViewStatus = new HashMap<String, Integer>();
		String[] codes;

		codes = paramMapIpasStatusToTMviewStatus1.split(","); 
		for (int i = 0; i < codes.length; i++) {
			mapIpasStatusCode2TmViewStatus.put(codes[i].trim(), 1); // $NON-NLS-1$
		}
		codes = paramMapIpasStatusToTMviewStatus2.split(","); 
		for (int i = 0; i < codes.length; i++) {
			mapIpasStatusCode2TmViewStatus.put(codes[i].trim(), 2); // $NON-NLS-1$
		}
		codes = paramMapIpasStatusToTMviewStatus3.split(","); 
		for (int i = 0; i < codes.length; i++) {
			mapIpasStatusCode2TmViewStatus.put(codes[i].trim(), 3); // $NON-NLS-1$
		}
		codes = paramMapIpasStatusToTMviewStatus4.split(","); 
		for (int i = 0; i < codes.length; i++) {
			mapIpasStatusCode2TmViewStatus.put(codes[i].trim(), 4); // $NON-NLS-1$
		}
		codes = paramMapIpasStatusToTMviewStatus5.split(","); 
		for (int i = 0; i < codes.length; i++) {
			mapIpasStatusCode2TmViewStatus.put(codes[i].trim(), 5); // $NON-NLS-1$
		}
		codes = paramMapIpasStatusToTMviewStatus6.split(","); 
		for (int i = 0; i < codes.length; i++) {
			mapIpasStatusCode2TmViewStatus.put(codes[i].trim(), 6); // $NON-NLS-1$
		}
		codes = paramMapIpasStatusToTMviewStatus7.split(","); 
		for (int i = 0; i < codes.length; i++) {
			mapIpasStatusCode2TmViewStatus.put(codes[i].trim(), 7); // $NON-NLS-1$
		}
		codes = paramMapIpasStatusToTMviewStatus8.split(","); 
		for (int i = 0; i < codes.length; i++) {
			mapIpasStatusCode2TmViewStatus.put(codes[i].trim(), 8); // $NON-NLS-1$
		}
		codes = paramMapIpasStatusToTMviewStatus9.split(","); 
		for (int i = 0; i < codes.length; i++) {
			mapIpasStatusCode2TmViewStatus.put(codes[i].trim(), 9); // $NON-NLS-1$
		}
		codes = paramMapIpasStatusToTMviewStatus10.split(","); 
		for (int i = 0; i < codes.length; i++) {
			mapIpasStatusCode2TmViewStatus.put(codes[i].trim(), 10); // $NON-NLS-1$
		}
		codes = paramMapIpasStatusToTMviewStatus11.split(","); 
		for (int i = 0; i < codes.length; i++) {
			mapIpasStatusCode2TmViewStatus.put(codes[i].trim(), 11); // $NON-NLS-1$
		}
		codes = paramMapIpasStatusToTMviewStatus12.split(","); 
		for (int i = 0; i < codes.length; i++) {
			mapIpasStatusCode2TmViewStatus.put(codes[i].trim(), 12); // $NON-NLS-1$
		}
		
		/*
		codes = paramMapIpasStatusToTMviewStatus13.split(","); 
		for (int i = 0; i < codes.length; i++) {
			mapIpasStatusCode2TmViewStatus.put(codes[i].trim(), 13); // $NON-NLS-1$
		}
		codes = paramMapIpasStatusToTMviewStatus14.split(","); 
		for (int i = 0; i < codes.length; i++) {
			mapIpasStatusCode2TmViewStatus.put(codes[i].trim(), 14); // $NON-NLS-1$
		}
		codes = paramMapIpasStatusToTMviewStatus15.split(","); 
		for (int i = 0; i < codes.length; i++) {
			mapIpasStatusCode2TmViewStatus.put(codes[i].trim(), 15); // $NON-NLS-1$
		}
		*/
		// build map of IPAS action types to be extracted
		mapIpasActionTypeForExtraction = new HashMap<String, String>();
		codes = paramExtractIpasActionTypes.split(","); 
		for (int i = 0; i < codes.length; i++) {
			if (!codes[i].trim().equals("")) {
				mapIpasActionTypeForExtraction.put(codes[i].trim(), "1"); 
			}
		}

		// build map of IPAS user doc types to be extracted
		mapIpasUserdocTypeForExtraction = new HashMap<String, String>();
		codes = paramExtractIpasUserdocTypes.split(","); 
		for (int i = 0; i < codes.length; i++) {
			if (!codes[i].trim().equals("")) {
				mapIpasUserdocTypeForExtraction.put(codes[i].trim(), "1"); 
			}
		}

		// build map of IPAS user doc types sub actions to be extracted
		mapIpasUserdocTypeSubActionsForExtraction = new HashMap<String, String>();
		codes = paramExtractIpasUserdocTypesSubActionTypes.split(",");
		for (int i = 0; i < codes.length; i++) {
			if (!codes[i].trim().equals("")) {
				mapIpasUserdocTypeSubActionsForExtraction.put(codes[i].trim(), "1");
			}
		}
		
		// build map of IPAS invalid country codes for applicant and priority
		String[] invalidCodes = paramInvalidCountryCodes.split(",");
		mapIpasInvalidCountryCodes = new HashMap<String, String>();
		for(int i=0;i < invalidCodes.length;i++) {
			if(!invalidCodes[i].trim().equals("")) {
				mapIpasInvalidCountryCodes.put(invalidCodes[i], ""+i);
			}
		}
		
		// build map of IPAS invalid country codes for applicant and priority
		String[] invalidPriorityCountryCodes = paramInvalidPriorityCountryCodes.split(",");
		mapIpasInvalidPriorityCountryCodes = new HashMap<String, String>();
		for(int i=0;i < invalidPriorityCountryCodes.length;i++) {
			if(!invalidPriorityCountryCodes[i].trim().equals("")) {
				mapIpasInvalidPriorityCountryCodes.put(invalidPriorityCountryCodes[i], ""+i);
			}
		}
		
		// map records and publications
		String[] ipasRecordsAndPublications = paramMapIpasRecordsAndPublications.split(",");
		mapIpasRecordsAndPublicationCodes = new HashMap<String, String>();
		for(int i=0; i<ipasRecordsAndPublications.length; i++) {
			if(!ipasRecordsAndPublications[i].trim().equals("")) {
				mapIpasRecordsAndPublicationCodes.put(ipasRecordsAndPublications[i].split(":")[0], ipasRecordsAndPublications[i].split(":")[1]);
				
				if(paramDebug.equals("0"))System.out.println("code: "+ ipasRecordsAndPublications[i].split(":")[0] + ":" + ipasRecordsAndPublications[i].split(":")[1]);
			}
		}
		
		
		/**
		 * Read SQL queries from SQL files
		 * 	1. Get full database backlog
		 * 	2. Get Daily New Filings
		 * 	3. Get Daily Log Changes (bibliographic data changes)
		 * 	4. Get Daily Status Changes
		 */
		if(paramSqlFull != null && paramSqlFull.length()>0) {
			sqlQryGetFullDbBacklog = readQueries(paramSqlFull);
		}
		
		if(paramSqlDiffNewFilings != null && paramSqlDiffNewFilings.length()>0) {
			sqlQryDiffGetDailyNewFiling = readQueries(paramSqlDiffNewFilings);
		}
		
		if(paramSqlDiffLogChanges!= null && paramSqlDiffLogChanges.length()>0) {
			sqlQryDiffGetDailyLogChanges = readQueries(paramSqlDiffLogChanges);
		}
		
		if(paramSqlDiffStatusChanges != null && paramSqlDiffStatusChanges.length()>0) {
			sqlQryDiffGetDailyStatusChanges = readQueries(paramSqlDiffStatusChanges);
		}
		if(paramSqlDiffGetTrademarksPublishedInLastJournal != null && paramSqlDiffGetTrademarksPublishedInLastJournal.length() > 0) {
			sqlQryDiffGetTMsPublishedInLastJournal = readQueries(paramSqlDiffGetTrademarksPublishedInLastJournal);
		}
		
		if(paramSqlDiffGetUserdocsPublishedInLastJournal != null && paramSqlDiffGetUserdocsPublishedInLastJournal.length() > 0) {
			sqlQryDiffGetUserDocsPublishedInLastJournal = readQueries(paramSqlDiffGetUserdocsPublishedInLastJournal);
		}
	}

	
	public static String readQueries(String sqlFileName) {
		String qry = "";
		File query1 = new File("resources/" + sqlFileName);
		if (query1 != null) {
			try (FileReader reader = new FileReader(query1);
		            BufferedReader br = new BufferedReader(reader)) {

		            String line;
		            while ((line = br.readLine()) != null) {
		               if(paramDebug.equals("0")) System.out.println(line);
		                qry += line + " ";
		            }
		        } catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		}
		System.out.println("Sql file name: " + sqlFileName);
		System.out.println(qry);
		return qry;
	}
	
	public static void createFolders() throws Exception {
		// create folders
			File processed = new File(paramLocalFolderFtp + "/processed/sample.txt");
			new File(processed.getParent()).mkdirs();
	
			processed = new File(paramLocalFolderImagesCTI + "/sample.txt");
			new File(processed.getParent()).mkdirs();
	
			processed = new File(paramLocalFolderLogging + "/sample.txt");
			new File(processed.getParent()).mkdirs();
	
			processed = new File(paramLocalFolderLogging + "/logs/sample.txt");
			new File(processed.getParent()).mkdirs();
	
			processed = new File(paramLocalFolderLogging + "/errors/sample.txt");
			new File(processed.getParent()).mkdirs();
	
	}
	public static void validateParameters() throws Exception {
		// validates the parameters

		// test if logging folder exists
		try {
			File testFile = new File(paramLocalFolderLogging + "/test"); 
			testFile.createNewFile();
			testFile.delete();
		} catch (IOException e) {
			throw new Exception(MessageFormat.format(
					Messages.getString("TmViewXmlGenerate.Error.OutputFolderForLoggingDoesNotExist{0}"), 
					paramLocalFolderLogging));
		}


		return;
	}

	public static void logError(String msg) {
		// logs an error

		// a StatusBackgroundTask is created in the background task and
		// a StatusBackgroundTask is created in the background task and
		// the "publish" method is called to update the status
		// (method "publish2" is actually called since the standard "publish" is
		// protected)
		BackgroundTask.StatusBackgroundTask statusBackgroundTask = backgroundTask.new StatusBackgroundTask();
		statusBackgroundTask.setTextFrame(Messages.getString("TmViewXmlGenerate.WindowTitle")); 
		statusBackgroundTask.setTextError(msg);
		backgroundTask.publish2(statusBackgroundTask);

		// log the error
		errorsLogger.info(msg);
	}

	public static void logMessage(String msg) {
		// logs a message

		// a StatusBackgroundTask is created in the background task and
		// the "publish" method is called to update the status
		// (method "publish2" is actually called since the standard "publish" is
		// protected)
		BackgroundTask.StatusBackgroundTask statusBackgroundTask = backgroundTask.new StatusBackgroundTask();
		statusBackgroundTask.setTextFrame(Messages.getString("TmViewXmlGenerate.WindowTitle")); 
		statusBackgroundTask.setTextMessage(msg);
		backgroundTask.publish2(statusBackgroundTask);

		// log the message
		messagesLogger.info(msg);
	}

	public static void logStatus(String msg) {
		// logs the status

		// a StatusBackgroundTask is created in the background task and
		// the "publish" method is called to update the status
		// (method "publish2" is actually called since the standard "publish" is
		// protected)
		BackgroundTask.StatusBackgroundTask statusBackgroundTask = backgroundTask.new StatusBackgroundTask();
		statusBackgroundTask.setTextFrame(Messages.getString("TmViewXmlGenerate.WindowTitle")); 
		statusBackgroundTask.setTextStatus(msg);
		backgroundTask.publish2(statusBackgroundTask);
	}

	public static void initLoggers() throws IOException {
		FileHandler messagesLoggerFileHandler;
		FileHandler errorsLoggerFileHandler;
		Formatter messagesFormatter;

		// create "logs" and "errors" sub-folders if not exist
		File logsFolderFile = new File(paramLocalFolderLogging + "/logs"); 
		File errorsFolderFile = new File(paramLocalFolderLogging + "/errors"); 
		if (!logsFolderFile.exists()) {
			logsFolderFile.mkdir();
		}
		if (!errorsFolderFile.exists()) {
			errorsFolderFile.mkdir();
		}

		// create file names for log files
		SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd_HHmmss"); 
		String timestamp = format.format(new java.util.Date());
		String messagesLogFileName = paramLocalFolderLogging + "/logs/GenerationStatusMessages_" + timestamp + ".log";  //$NON-NLS-2$
		String errorsLogFileName = paramLocalFolderLogging + "/errors/GenerationErrorMessages_" + timestamp + ".log";  //$NON-NLS-2$

		// create log formatter using class TmClassLogFormatter which overrides
		// the format() method in SimpleFormatter
		messagesFormatter = new LogFormatter();

		// configure the loggers with handler and formatter
		messagesLoggerFileHandler = new FileHandler(messagesLogFileName);
		messagesLoggerFileHandler.setFormatter(messagesFormatter);
		errorsLoggerFileHandler = new FileHandler(errorsLogFileName);
		errorsLoggerFileHandler.setFormatter(messagesFormatter);

		// create loggers and add logger handlers to write the logs to disk
		messagesLogger = Logger.getLogger("messages"); 
		messagesLogger.addHandler(messagesLoggerFileHandler);

		errorsLogger = Logger.getLogger("errors"); 
		errorsLogger.addHandler(errorsLoggerFileHandler);
	}

	/**
	 * **************************************** 
	 * runInterface
	 *  
	 * ****************************************
	 */
	public static void runInterface(BackgroundTask paramBackgroundTask) {
		// save parameter indicating the background task which called the
		// interface, so as
		// to make call-backs to its "publish" method
		backgroundTask = paramBackgroundTask;

		try {
			logStatus(Messages.getString("TmViewXmlGenerate.Status.StartingUp")); 

			// read parameters (with no logging yet)
			readParameters();

			// create folders 
			createFolders();
			
			// initialize the loggers
			initLoggers();

			// validate parameters
			logMessage(Messages.getString("TmViewXmlGenerate.Status.ValidatingConfigurationParameters")); 
			validateParameters();

			// initialize JAXB
			initializeJAXB();

			// initialize the JPA entity manager
			// to delete
			logMessage(Messages.getString("TmViewXmlGenerate.Status.Initializing")); 

			// all initialization are finished, the actual processing starts here
			logStatus(Messages.getString("TmViewXmlGenerate.Status.Running")); 

			//
			ArrayList<Trademark> lista = null;
			if (paramExecutionContext.equals("FULL")) {
				logMessage(Messages.getString("TMViewXmlGenerate.Status.ContextFull"));
				lista = Get_Trademark_ID();
			} else {
				logMessage(Messages.getString("TMViewXmlGenerate.Status.ContextDiff"));
				lista = Get_Trademark_ID_Daily_Changes();
			}

			int listSize = 0;
			if (lista != null)
				listSize = lista.size(); // $NON-NLS-1$

			// log message
			logMessage(Messages.getString("TmViewXmlGenerate.Status.ReadingMarksToBeExtracted") + ": " + listSize); 

			// initializations to compute performance
			Integer counter1 = 0;
			Integer counter2 = 0;
			Date dateStart = new Date();

			if (listSize == 0) {
				// send empty XML/ZIP
				logMessage("The list is empty.");
				logMessage("Creating empty XML file");
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
				String today = sdf.format(new Date());
				CommonUtil.createEmptyXml("Empty xml file from " + paramIPO + ": " + today,
						paramLocalFolderFtp + "/" + today + "-" + paramIPO + "500000000000000.xml");
				logMessage("Generating zip file and uploading it to the ftp...");
				generateTrademarkZipForEmptyXml();

			} else {

				for (Trademark tm : lista) {
					try {
						
						Trademark trademark = buildTrademark(tm);
						logMessage(MessageFormat.format(Messages.getString("TmViewXmlGenerate.Status.ExportingMark{0}"), tm.toString()));
						
						if (validateMark(trademark)) {

							/*
							 * Generate XML file
							 * Increase OK counter
							 * 
							 */
							
							exportTrademarkToFtp(trademark);
							counter1 += 1;

						} else {
							// increase errors counter
							counter2 += 1;
						}
					} catch (Exception e) {
						// any exception is added as a validation error
						// the root cause is determined
						Throwable rootException = e;
						while (rootException.getCause() != null) {
							rootException = rootException.getCause();
						}
						String rootMessage = rootException.getMessage();
						String validationMsg = "";
						if (e instanceof RuntimeException) {
							validationMsg = MessageFormat.format("Runtime exception: {0}. Caused by: {1}", e.getClass().getName(), rootMessage);
						} else {
							validationMsg = MessageFormat.format("Validation error: {0}", rootMessage); 
						}

						// for runtime exception, the stack trace is printed
						if (e instanceof RuntimeException) {
							logError(MessageFormat.format(
									Messages.getString("TmViewXmlGenerate.Status.ExportingMark{0}"), 
									tm.getApplicationNumber()));
							logError("   " + validationMsg);
							logError("The Java stack trace follows"); 
							StackTraceElement[] stackTraceElementArray = e.getStackTrace();
							for (int j = 0; j < stackTraceElementArray.length; j++) {
								logError("   " + stackTraceElementArray[j].toString()); 
							}
						}
						
						// message error
						logMessage("   " + validationMsg);

						// increase errors counter
						counter2 += 1;
					}

					// display count and performance
					long seconds = (new Date().getTime() - dateStart.getTime()) / 1000;
					if (seconds == 0) {
						seconds = 1;
					}
					logStatus(MessageFormat.format("Marks exported OK:{0}/("+listSize+") Errors:{1} Rate:{2}/min", counter1, counter2,
							(counter1 + counter2) * 60 / seconds));
				}

				// generate the last ZIP file with the existing index XML files
				// generateMarkIndexZip();
				generateTrademarkZip();
				generateTrademarkZipForImages();
				
				// start uploading generated files to FTP
				uploadZipFilestoFtp();

			} // end if

			logMessage(Messages.getString("TmViewXmlGenerate.Status.Ended")); 

			// end of process
			logStatus(Messages.getString("TmViewXmlGenerate.Status.Ended")); 

			// close the program if configured
			if (paramCloseOnEnd.equals("1")) { System.exit(0); }

		} catch (Exception e) {
			// the exception stack trace is returned as an error and processing ends

			// get root cause and print it
			Throwable rootException = e;
			while (rootException.getCause() != null) {
				rootException = rootException.getCause();
			}
			String rootMessage = rootException.getMessage();
			logError(MessageFormat.format("Unexpected exception occurred. Class: {0}. Message: {1}. Root cause: {2}",
					e.getClass().getName(), e.getMessage(), rootMessage));

			logError(Messages.getString("TmViewXmlGenerate.Error.TheJavaStackTraceFollows")); 
			StackTraceElement[] stackTraceElementArray = e.getStackTrace();
			for (int i = 0; i < stackTraceElementArray.length; i++) {
				logError("   " + stackTraceElementArray[i].toString()); 
			}

			// log final message
			logStatus(Messages.getString("TmViewXmlGenerate.Status.StoppedPleaseCopyErrorsAndContactAdministrator")); 

			// close the program if configured
			if (paramCloseOnEnd.equals("1")) { System.exit(1); }

		}
	}


	/**
	 * ********************************************************************************** 
	 *   get File ID from IPAS
	 * ********************************************************************************** 
	 */

	static int folder_id = 0;
	public static ArrayList<Trademark> Get_Trademark_ID() {
		
		
		CSqlRow[] sqlRows = null;
		ArrayList<Trademark> listaFileId = null;
		
		Scanner sc=new Scanner(System.in);  
		//System.out.println("Enter Trademarks f.file_nbr to start=");  
		//int fnr=sc.nextInt();  
		
		System.out.println("Enter folder id where to save the xml files=");  
		folder_id=sc.nextInt(); 
		sc.close();
		
		try {
			if(!paramSqlFull.isEmpty()) {
				//if(paramDebug.equals("0")) System.out.println("File name: " + paramSqlFull);
				listaFileId = runSqlQueryAndPopulateList(listaFileId, sqlRows, sqlQryGetFullDbBacklog, "Qry Extract full db");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return listaFileId;
	}

	public static ArrayList<Trademark> Get_Trademark_ID_Daily_Changes() {
		
		CSqlRow[] sqlRows = null;
		ArrayList<Trademark> listaFileId = null;
		try {
			
			/// RUN QUERY & POPULATE LIST
			if(!paramSqlDiffNewFilings.isEmpty()) {
				listaFileId = runSqlQueryAndPopulateList(listaFileId, sqlRows, sqlQryDiffGetDailyNewFiling, "Qry. 1-Get new TM filings");
			}
			
			///	SET UP QUERY 2 FOR THE DAILY LOG CHANGES /////////////////////////////////////////////
			if(!paramSqlDiffLogChanges.isEmpty()) {
				listaFileId = runSqlQueryAndPopulateList(listaFileId, sqlRows, sqlQryDiffGetDailyLogChanges, "Qry. 2-Get TM log changes");
			}
			
			///	SET UP QUERY 3 FOR THE DAILY STATUS CHANGES /////////////////////////////////////////////
			if(!paramSqlDiffStatusChanges.isEmpty()) {
				listaFileId = runSqlQueryAndPopulateList(listaFileId, sqlRows, sqlQryDiffGetDailyStatusChanges, "Qry. 3-Get TM status changes");
			}
			
			/// SET UP QUERY 4 FOR THE TRADEMARKS PUBLISHED IN THE LAST JOURNAL /////////////////////////////////////////////
			if(!paramSqlDiffGetTrademarksPublishedInLastJournal.isEmpty()) {
				listaFileId = runSqlQueryAndPopulateList(listaFileId, sqlRows, sqlQryDiffGetTMsPublishedInLastJournal, "Qry. 4-Get TMs published in last journal");
			}
			
			/// SET UP QUERY 5 FOR THE USER DOCUMENTS PUBLISHED IN THE LAST JOURNAL /////////////////////////////////////////////
			if(!paramSqlDiffGetUserdocsPublishedInLastJournal.isEmpty()) {
				listaFileId = runSqlQueryAndPopulateList(listaFileId, sqlRows, sqlQryDiffGetUserDocsPublishedInLastJournal, "Qry. 5-Get UserDocs published in last journal");
			}
			
			
			if(listaFileId != null && listaFileId.size()>0) {
				if(paramDebug.equals("0")) System.out.println("The sum (total) of TMs to be extracted: " + listaFileId.size());
				logMessage("The sum (total) of TMs to be extracted: " + listaFileId.size());
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return listaFileId;
	}

	public static String getPreviuousStatusCode(int proc_nbr) {
		CSqlRow[] sqlRows = null;
		String data = "";
		try {
			CSqlColumn col1 = new CSqlColumn(new IpasInteger(1.0), "String", "FILE_SEQ");
			CSqlColumn[] columnList = new CSqlColumn[1];
			columnList[0] = col1;

			CSqlRow row = new CSqlRow();
			row.setSqlColumnList(columnList);

			// build and execute SQL statement
			String qry = "select * from (select prior_status_code, ROW_NUMBER() OVER (ORDER BY action_nbr DESC) AS RowNum from ip_action where proc_nbr=" + proc_nbr
					+ ") as mytable where mytable.RowNum = 1 ";

			sqlRows = new IpasServicesProxy().sqlFetchAll(qry, row);

			if (sqlRows != null) {
				for (int i = 0; i < sqlRows.length; i++) {
					data = sqlRows[i].getSqlColumnList()[0].getSqlColumnValue();
				}
			}
		} catch (Exception ee) {
			System.out.println(ee.getMessage());
			ee.printStackTrace();
		}
		return data;
     }
	
	public static ArrayList<Trademark> runSqlQueryAndPopulateList(ArrayList<Trademark> listaFileId, CSqlRow[] sqlRows, String sqlQry, String qryDescription) {
		
		try 
		{
			CSqlColumn col1 = new CSqlColumn(new IpasInteger(1.0), "String", "FILE_SEQ");
			CSqlColumn col2 = new CSqlColumn(new IpasInteger(1.0), "String", "FILE_TYP");
			CSqlColumn col3 = new CSqlColumn(new IpasInteger(1.0), "String", "FILE_SER");
			CSqlColumn col4 = new CSqlColumn(new IpasInteger(1.0), "String", "FILE_NBR");
			CSqlColumn col5 = new CSqlColumn(new IpasInteger(1.0), "String", "STATUS_NAME");
			CSqlColumn col6 = new CSqlColumn(new IpasInteger(1.0), "String", "STATUS_CODE");
			CSqlColumn col7 = new CSqlColumn(new IpasInteger(1.0), "String", "STATUS_DATE");
			CSqlColumn col8 = new CSqlColumn(new IpasInteger(1.0), "String", "PROC_NBR");

			CSqlColumn[] columnList = new CSqlColumn[8];
			columnList[0] = col1;
			columnList[1] = col2;
			columnList[2] = col3;
			columnList[3] = col4;
			columnList[4] = col5;
			columnList[5] = col6;
			columnList[6] = col7;
			columnList[7] = col8;
			
			CSqlRow row = new CSqlRow();
			row.setSqlColumnList(columnList);
			
			/*
			 * Fetch IPAS data run the query
			 */
			sqlRows = new IpasServicesProxy().sqlFetchAll(sqlQry, row);
		} catch (RemoteException e) {
			logError(e.getMessage());
			e.printStackTrace();
		}

		if (sqlRows != null) 
		{
			logMessage("Query " + qryDescription + " found in total TMs to process: " + sqlRows.length);
			// populate list
			if(listaFileId == null)	listaFileId = new ArrayList<Trademark>();
			
			for (int i = 0; i < sqlRows.length; i++) {
				Trademark t = new Trademark();
				t.setFileSeq(sqlRows[i].getSqlColumnList()[0].getSqlColumnValue());
				t.setFileType(sqlRows[i].getSqlColumnList()[1].getSqlColumnValue());
				t.setFileSeries(Integer.parseInt(sqlRows[i].getSqlColumnList()[2].getSqlColumnValue()));
				t.setFileNumber(Integer.parseInt(sqlRows[i].getSqlColumnList()[3].getSqlColumnValue()));
				t.setStatusName(sqlRows[i].getSqlColumnList()[4].getSqlColumnValue());
				t.setStatusCode(sqlRows[i].getSqlColumnList()[5].getSqlColumnValue());
				t.setStatusDate(ClassHelper.ConvertStringToDate1(sqlRows[i].getSqlColumnList()[6].getSqlColumnValue()));
				t.setProcessNumber(Integer.parseInt(sqlRows[i].getSqlColumnList()[7].getSqlColumnValue()));
				
				Trademark found = listaFileId.stream().filter(x -> x.getFileSeries()== t.getFileSeries() && x.getFileNumber()== t.getFileNumber() && x.getFileSeq().equals(t.getFileSeq()) 
						&& x.getFileType().equals(t.getFileType()) )
							.findAny()
							.orElse(null);
				
				if(found == null) { listaFileId.add(t); }
			}
			
		}
		else { logMessage("Query " + qryDescription + " is null or empty!"); }
		
		return listaFileId;
	}
	
	
	
	
	private static String mapRecordsToTmviewValues(String val, String val2) {
		
		String result = "";
		if(mapIpasRecordsAndPublicationCodes.containsKey(val))
			result = mapIpasRecordsAndPublicationCodes.get(val);
		else 
			result = val;
		
		return result;
	}
	
	
	public static void setUserDocDetails(CUserdoc userdoc, TrademarkRecord tmrec, Appeal appeal, Opposition opposition) {
		
		Claimant claimant = null;
		Applicant newApplicant = null;
		
		// NEW OWNER  or beneficary //////////////////////
		if (userdoc.getNewOwnershipData().getOwnerList() != null) {
			System.out.println("userdoc applicant list size: " + userdoc.getNewOwnershipData().getOwnerList().length);

			for (COwner owner : userdoc.getNewOwnershipData().getOwnerList()) {

				if (paramDebug.equals("0")) {
					System.out.println("\tUserdoc New Owner details:");
					System.out.println("\t--------------------------------");
					System.out.println("\tName: " + owner.getPerson().getPersonName());
					System.out.println("\tAddress: " + owner.getPerson().getAddressStreet());
					System.out.println("\tCountry: " + owner.getPerson().getResidenceCountryCode());
					System.out.println("\t--------------------------------");
				}

				// Applicant newApplicant = new Applicant();
				newApplicant = new Applicant();
				newApplicant.setApplicantIdentifier(1);
				newApplicant.setRole("Applicant");
				newApplicant.setPersonName(owner.getPerson().getPersonName());
				if (owner.getPerson().getAddressStreet() != null && owner.getPerson().getAddressStreet().length() > 0) {
					newApplicant.setAddress(owner.getPerson().getAddressStreet().trim());
				}

				newApplicant.setResidenceCountryCode(owner.getPerson().getResidenceCountryCode());
				tmrec.getRecordApplicantList().add(newApplicant);
			}
		}
		
		
		
		// APPLICANT (CLAIMANT)   //////////////////////
		if(userdoc.getApplicant().getPerson().getPersonName().length() > 1) {
			
			if(paramDebug.equals("0")) {
				System.out.println("\tUserdoc Applicant details:");
				System.out.println("\t--------------------------------");
				System.out.println("\tName: " + userdoc.getApplicant().getPerson().getPersonName());
				System.out.println("\tAddress: " + userdoc.getApplicant().getPerson().getAddressStreet() + ", " + userdoc.getApplicant().getPerson().getResidenceCountryCode());
				System.out.println("\t--------------------------------");
			}
			//Applicant ap = new Applicant();
			claimant = new Claimant();
			claimant.setClaimantIdentifier(1);
			claimant.setRole("Claimant");
			claimant.setPersonName(userdoc.getApplicant().getPerson().getPersonName());
			claimant.setAddress(userdoc.getApplicant().getPerson().getAddressStreet() + ", " );
			claimant.setResidenceCountryCode(userdoc.getApplicant().getPerson().getResidenceCountryCode());
			
			tmrec.getRecordClaimentList().add(claimant);
			
			if(appeal!=null) {
				Appellant appellant = new Appellant();
				appellant.setPersonName(claimant.getPersonName());
				appellant.setAddress(claimant.getAddress());
				appellant.setResidenceCountryCode(claimant.getResidenceCountryCode());
				appellant.setRole("Äppellant");
				appeal.getAppellantList().add(appellant);
			}
			
			if(opposition!=null) {
				Opponent opponent = new Opponent();
				opponent.setPersonName(claimant.getPersonName());
				opponent.setAddress(claimant.getAddress());
				opponent.setResidenceCountryCode(claimant.getResidenceCountryCode());
				opponent.setRole("Opponent");
				opposition.getOpponentList().add(opponent);
			}
			
		}
		else {
			if(paramDebug.equals("0")) System.out.println("\t[No applicants]");
		}
		
		// REPRESENTATIVE   //////////////////////
		if(userdoc.getRepresentationData().getRepresentativeList() != null) {
			if(paramDebug.equals("0")) {
				System.out.println("\tUserDoc representative details:");
				System.out.println("\t--------------------------------");
				System.out.println("\tName: " + userdoc.getRepresentationData().getRepresentativeList()[0].getPerson().getPersonName());
				System.out.println("\tAddress: " + userdoc.getRepresentationData().getRepresentativeList()[0].getPerson().getAddressStreet() + ", " +userdoc.getRepresentationData().getRepresentativeList()[0].getPerson().getCityCode() + ", "+ userdoc.getRepresentationData().getRepresentativeList()[0].getPerson().getResidenceCountryCode() );
				System.out.println("\t--------------------------------");
			}
			Representative rep = new Representative();
			rep.setRepresentativeCodeIdentifier(1);
			rep.setRole("Agent");
			rep.setPersonName(userdoc.getRepresentationData().getRepresentativeList()[0].getPerson().getPersonName());
			rep.setAddress( userdoc.getRepresentationData().getRepresentativeList()[0].getPerson().getAddressStreet() + ", " +userdoc.getRepresentationData().getRepresentativeList()[0].getPerson().getCityCode() + ", ");
			rep.setResidenceCountryCode(userdoc.getRepresentationData().getRepresentativeList()[0].getPerson().getResidenceCountryCode());
			rep.setRepresentativeType(userdoc.getRepresentationData().getRepresentativeList()[0].getRepresentativeType());
			tmrec.getRecordRepresentativeList().add(rep);
			
			//set claimant representative
			if(claimant != null) {
				claimant.getRepresentativeList().add(rep);
			}
			
			//set appeal representative
			if(appeal != null) {
				appeal.getRepresentativeList().add(rep);
			}
			
			//set opposition representative
			if(opposition!= null) {
				opposition.getRepresentativeList().add(rep);
			}
		}
		else {
			if(paramDebug.equals("0")) System.out.println("\t[No representatives]");
		}
	}
	
	
	public static void setWorkflowDetails(Trademark tm, CProcessId pid, IpasServices_PortType port) throws IpasException, RemoteException {
		Appeal appeal = null;
		Opposition opposition = null;
		CProcessEvent[] prMainWorkflowEventList = port.processReadEventList(pid);
		
		if (prMainWorkflowEventList != null) {
			
			if(paramDebug.equals("0")) System.out.println("Event list: " + prMainWorkflowEventList.length + ", pid:" + pid.getProcessNbr().getDoubleValue().toString());

			for (CProcessEvent event : prMainWorkflowEventList) {
				// get events (actions) of the main process
				/*
				 * 
				 * LEVEL 1 : MAIN WORKFLOW
				 * 
				 * A - eventTypeCode: publications
				 * 
				 */
				if (event.getEventTypeCode().equals("A")) {
					if (!mapIpasActionTypeForExtraction.isEmpty() && mapIpasActionTypeForExtraction.containsKey(event.getEventActionTypeCode())) {

						// set as publications (publications)
						TrademarkPublication tmpub = new TrademarkPublication();

						if(paramDebug.equals("0")) {
							System.out.println("  #*--------------------- A [rec or pub] ----------------------------*#");
							System.out.println("\tActionType: [" + event.getEventActionTypeCode() + "]["+ event.getEventDescription() + "], Date: " + ClassHelper.ConvertStringToDate(event.getEventDate().getDateValue().getTime().toString()));
							if (event.getActionJournalDate().getDateValue() != null) { System.out.print("\tActionType published: Yes!  ");}
						}
						

						// SET RECORD PUBLICATION DETAILS - JOURNAL DETAILS ///////////////////

						CActionId actionid = event.getEventActionId();
						CAction action = port.processReadAction(actionid);

						if (!action.getIsDeleted() && action.getJournal() != null && action.getJournal().getJournalName().toString().length() > 2) {

							CJournal journal = null;
							try {
								journal = port.journalRead(action.getJournal().getJournalId());
							} catch (IpasException e) {
								logError("Journal was not found from IPAS services"+ action.getJournal().getJournalId());
							}

							if (journal != null && journal.getPublicationDate().getDateValue() != null) {

								/*
								 *  set start of the opposition date
								 *  set the opposition start date TMViewXMLgenerate.java
								 */
								if (event.getEventActionTypeCode().trim().equals("213")) {
									tm.setStartDateOfOppoisition(ClassHelper.ConvertStringToDate(journal.getPublicationDate().getDateValue().getTime().toString()));
								}

								/*
								 * Set publication: 
								 * 	- identifier (journal name)
								 * 	- publication section (map via configuration file based on action code type)
								 *  - publication date 
								 */
								tmpub.setPublicationIdentifier(journal.getJournalName());
								tmpub.setPublicationSection(mapRecordsToTmviewValues(event.getEventActionTypeCode(), "")); 
								tmpub.setPublicationDate(ClassHelper.ConvertStringToDate(journal.getPublicationDate().getDateValue().getTime().toString()));

								// add publication to list
								tm.getTrademarkPublicationList().add(tmpub);
								if(paramDebug.equals("0")) System.out.println("-> JournalCode: " + action.getJournal().getJournalName().toString() + ", PubDate: " + journal.getPublicationDate().getDateValue().getTime().toString());
							}
						}
						if(paramDebug.equals("0"))  System.out.println("\t-----------------------------------------------------------");
					}
				}
				
				
				/*
				 * 
				 * LEVEL 2: USERDOC WORKFLOW
				 * 
				 */
				//System.out.println("\tUserdoc typ: [" + event.getEventUserdocTypeCode() + "]\n\t[" + event.getEventDescription().trim() + "]");
				//System.out.println("\teventTypeCode: [" + event.getEventTypeCode() + "]\teventSubTypeCode:[" + event.getEventSubtypeCode() + "]");
				

				if (event.getEventTypeCode().equals("P") && event.getEventSubtypeCode().equals("U")) {

		
					if (!mapIpasUserdocTypeForExtraction.isEmpty() && mapIpasUserdocTypeForExtraction.containsKey(event.getEventUserdocTypeCode())) {

						if(paramDebug.equals("0")) {
						System.out.println("  #*-------------------------- P & U [user doc] ------------------------------*#");
						System.out.println("\tUserdoc typ: [" + event.getEventUserdocTypeCode() + "]\n\t[" + event.getEventDescription().trim() + "]");
						System.out.println("\tFiling date: [" + ClassHelper.ConvertStringToDate(event.getEventDate().getDateValue().getTime().toString()+"]")
								+ ", ProcessId: [" + event.getEventProcessId().getProcessNbr().getDoubleValue().toString() + "]");
						}

						// set Appeals if user document type is appeal_userdoc
						String appeal_code = event.getEventUserdocTypeCode().trim();
						if (appeal_code.equals("REC")) {
							if (appeal == null) {
								appeal = new Appeal();
							}
							appeal.setAppealDate(ClassHelper.ConvertStringToDate(event.getEventDate().getDateValue().getTime().toString()));
						}
						

						// set Opposition if user document type is opposition_userdoc
						if (event.getEventUserdocTypeCode().trim().equals("opposition_userdoc")) 
						{
							if (opposition == null) 
							{ 
								opposition = new Opposition(); 
							}
							opposition.setOppositionDate(ClassHelper.ConvertStringToDate(event.getEventDate().getDateValue().getTime().toString()));
						}

						// create TrademarkRecord object
						TrademarkRecord tmrec = new TrademarkRecord();
						
						/*
						 * Set record: 
						 * 	- filing date
						 *  - user document name (original as in IPAS)
						 *  - user document type
						 *  - user document effective date
						 */
						tmrec.setRecordFilingDate(ClassHelper.ConvertStringToDate(event.getEventDate().getDateValue().getTime().toString()));
						tmrec.setUserDocTypeName(event.getEventDescription());
						tmrec.setUserDocTypeCode(event.getEventUserdocTypeCode());
						tmrec.setRecordEffectiveDate(ClassHelper.ConvertStringToDate(event.getEventDate().getDateValue().getTime().toString()));

						/*
						 *  Read user doc sub actions (user document work flow) 
						 */
						CProcessId userdocProcessIdMainWorkflow = event.getEventProcessId();
						CProcess userdocprocessMainWorkFlow = port.processRead(userdocProcessIdMainWorkflow, false, false);
						CDocumentId userdocIdMainWorkflow = userdocprocessMainWorkFlow.getProcessOriginData().getDocumentId();

						// Get user document events in a list
						CProcessEvent[] prMainWorkflowUserdocEventList = port.processReadEventList(userdocProcessIdMainWorkflow);

						// get the user document details
						if (prMainWorkflowUserdocEventList != null && prMainWorkflowUserdocEventList.length > 0) {
							CUserdoc userdoc = port.userdocRead(userdocIdMainWorkflow);

							if (userdoc != null) { setUserDocDetails(userdoc, tmrec, appeal, opposition); }
						}
						// end of if setting up user document details

						boolean eventactionTypeCodeIsFound = false;
						// user doc in the main workflow
						if (prMainWorkflowUserdocEventList != null) {

							// for (int u = 0; u < prMainWorkflowUserdocEventList.length; u++) {
							for (CProcessEvent subEvent : prMainWorkflowUserdocEventList) {

								if(paramDebug.equals("0")) {
									System.out.print("\t- subaction acceptance code: [" + subEvent.getEventActionTypeCode()+"]");
									System.out.println(", action name: [" + subEvent.getEventDescription() + "] ");
									//System.out.println("], getEventUserdocTypeCode (userdocCode): " + subEvent.getEventUserdocTypeCode());
								}
								
								/*
								 * Reading user document acceptance actions (codes)
								 */
								//if (mapIpasUserdocTypeSubActionsForExtraction.isEmpty() || mapIpasUserdocTypeSubActionsForExtraction.containsKey(subEvent.getEventActionTypeCode())) {
								if (!mapIpasUserdocTypeSubActionsForExtraction.isEmpty() && mapIpasUserdocTypeSubActionsForExtraction.containsKey(subEvent.getEventActionTypeCode())) {

									eventactionTypeCodeIsFound = true;

									if(paramDebug.equals("0")) System.out.println("\t --> Reading user doc sub actions [accepted action] (userdoc workflow) <--");

									String docidentifier = userdocIdMainWorkflow.getDocOrigin().toString();
									docidentifier += "/" + new DecimalFormat("#").format(Double.parseDouble(userdocIdMainWorkflow.getDocSeries().getDoubleValue().toString()));
									docidentifier += "/" + new DecimalFormat("#").format(Double.parseDouble(userdocIdMainWorkflow.getDocNbr().getDoubleValue().toString()));
									
									if(paramDebug.equals("0")) System.out.println("\t -->  Userdocid: " + docidentifier);

									// Appeal details
									if (appeal != null) {
										appeal.setAppealIdentifier(docidentifier);
										appeal.setAppealDecisionDate(ClassHelper.ConvertStringToDate(subEvent.getEventDate().getDateValue().getTime().toString()));

										if (subEvent.getEventActionTypeCode().trim().equals("LUP_APEL") || subEvent.getEventActionTypeCode().trim().equals("2526"))
											appeal.setAppealDecisionStatusCode("Accepted partially");
										else
											appeal.setAppealDecisionStatusCode("Accepted");

										tm.getAppealList().add(appeal);
									}

									// Opposition details
									if (opposition != null && subEvent.getEventActionTypeCode().trim().equals("ADMITIDA")) 
									{
										opposition.setOppositionIdentifier(docidentifier);
										opposition.setOppositionDate(ClassHelper.ConvertStringToDate(subEvent.getEventDate().getDateValue().getTime().toString()));
										tm.getOppositionList().add(opposition); // add opposition to TM list
									}

									/*
									 * Set record:
									 * 	- identifier
									 * 	- effective date (event/action date)
									 *  - current status date (event/action date)
									 * 	- record kind
									 */
									tmrec.setRecordIdentifier(docidentifier);
									tmrec.setRecordEffectiveDate(ClassHelper.ConvertStringToDate(subEvent.getEventDate().getDateValue().getTime().toString()));
									tmrec.setRecordCurrentStatusDate(ClassHelper.ConvertStringToDate(subEvent.getEventDate().getDateValue().getTime().toString()));
									tmrec.setRecordKind(mapRecordsToTmviewValues(subEvent.getEventActionTypeCode(),""));
									//tmrec.setRecordKind(MapRecordsToTmviewValues(event.getEventUserdocTypeCode(),subEvent.getEventActionTypeCode()));
									

									if(paramDebug.equals("0")) {
										System.out.println("\t\t Record kind: " + tmrec.getRecordKind() + " - Mapping -> userdoc type code [" + event.getEventUserdocTypeCode() + "] - action type code: [" + subEvent.getEventActionTypeCode() +"]");
										System.out.println("\t\t -> getUserDocEventDescription: \t" + subEvent.getEventDescription());
										System.out.println("\t\t -> getUserDocEventActionTypeCode: \t" + subEvent.getEventActionTypeCode());
										System.out.println("\t\t -> getUserDocEventDate: \t\t" + ClassHelper.ConvertStringToDate(subEvent.getEventDate().getDateValue().getTime().toString()));
									}
								}

								if (eventactionTypeCodeIsFound) {
									tm.getTrademarkRecordList().add(tmrec);
									if(paramDebug.equals("0")) {
										System.out.println("\t[RECORD VALID SUB ACTIONS FOUND: Added root record to list - LEVEL 2] ");
										System.out.println("\t--------- ------------------------------------------------- ---------");
									}
									eventactionTypeCodeIsFound = false;
								} else {
									if(paramDebug.equals("0")) {
										//System.out.println("\t--------- -------------------------------------------------");
										System.out.println("\t[RECORD VALID SUB ACTIONS NOT FOUND - LEVEL 2]");
										System.out.println("\t--------- -------------------------------------------------");
									}
								}
								eventactionTypeCodeIsFound = false;
								
								
								/*
								 * 
								 * Level 2.1 - reading certain user documents work flow and create records
								 */
								
								// test
								if (subEvent.getEventUserdocTypeCode().equals("userdocument_type") || subEvent.getEventUserdocTypeCode().equals("userdocument_type2")) 
								{

									if(paramDebug.equals("0")) System.out.println("User document (workflow): " + subEvent.getEventUserdocTypeCode());

									// set trademark record details

									// create TrademarkRecord object
									TrademarkRecord tmrec2 = new TrademarkRecord();
									
									/*
									 * Set record: 
									 * 	- filing date
									 *  - user document name (original as in IPAS)
									 *  - user document type
									 *  - user document effective date
									 */
									tmrec2.setRecordFilingDate(ClassHelper.ConvertStringToDate(subEvent.getEventDate().getDateValue().getTime().toString()));
									tmrec2.setUserDocTypeName(subEvent.getEventDescription());
									tmrec2.setUserDocTypeCode(subEvent.getEventUserdocTypeCode());
									tmrec2.setRecordEffectiveDate(ClassHelper.ConvertStringToDate(subEvent.getEventDate().getDateValue().getTime().toString()));

									/*
									 *  Read user doc sub actions //////////////////////
									 */
									CProcessId userdocProcessId2 = subEvent.getEventProcessId();

									if(paramDebug.equals("0")) System.out.println("proc id userdocument_type:"+ subEvent.getEventProcessId().getProcessNbr().getDoubleValue());

									CProcess userdocprocess2 = port.processRead(userdocProcessId2, false, false);
									CDocumentId userdocId2 = userdocprocess2.getProcessOriginData().getDocumentId();
									CProcessEvent[] prUserdocEvent2 = null;
									
									if (userdocId2 != null) {
										// Loop through userdoc events in the userdoc workflow
										prUserdocEvent2 = port.processReadEventList(userdocProcessId2);
									}

									if (prUserdocEvent2 != null) {

										for (int w = 0; w < prUserdocEvent2.length; w++) {

											if(paramDebug.equals("0")) {
												System.out.print("\t w:subaction_acceptance code: " + prUserdocEvent2[w].getEventActionTypeCode());
												System.out.print("\t; w:getEventDescription (userdoc name): " + prUserdocEvent2[w].getEventDescription());
												System.out.println("\t; w:getEventUserdocTypeCode (userdocCode): " + prUserdocEvent2[w].getEventUserdocTypeCode());
											}
											//if (mapIpasUserdocTypeSubActionsForExtraction.isEmpty() || mapIpasUserdocTypeSubActionsForExtraction.containsKey(prUserdocEvent2[w].getEventActionTypeCode())) {
											if (!mapIpasUserdocTypeSubActionsForExtraction.isEmpty() && mapIpasUserdocTypeSubActionsForExtraction.containsKey(prUserdocEvent2[w].getEventActionTypeCode())) {

												eventactionTypeCodeIsFound = true;

												if(paramDebug.equals("0")) System.out.println("\t\t --> Reading user doc sub actions level 2  <--");

												String docidentifier = userdocId2.getDocOrigin().toString();
												docidentifier += "/" + new DecimalFormat("#").format(Double.parseDouble(userdocId2.getDocSeries().getDoubleValue().toString()));
												docidentifier += "/" + new DecimalFormat("#").format(Double.parseDouble(userdocId2.getDocNbr().getDoubleValue().toString()));
												
												if(paramDebug.equals("0")) System.out.println("\t\t -->   Userdocid: " + docidentifier);

												// set appeals if userdoc type is userdoc_type
												appeal_code = prUserdocEvent2[w].getEventUserdocTypeCode().trim();
												if (appeal_code.equals("userdoc_type") || appeal_code.equals("userdoc_type")) {

													if (appeal == null) {
														appeal = new Appeal();
													}
													appeal.setAppealDate(ClassHelper.ConvertStringToDate(event.getEventDate().getDateValue().getTime().toString()));
												}

												// Appeal details
												if (appeal != null) {
													appeal.setAppealIdentifier(docidentifier);
													appeal.setAppealDecisionDate(ClassHelper.ConvertStringToDate(prUserdocEvent2[2].getEventDate().getDateValue().getTime().toString()));
													if (prUserdocEvent2[w].getEventActionTypeCode().trim().equals("LUP_APEL")
															|| prUserdocEvent2[w].getEventActionTypeCode().trim().equals("2526"))
														appeal.setAppealDecisionStatusCode("Accepted partially");
													else
														appeal.setAppealDecisionStatusCode("Accepted");

													tm.getAppealList().add(appeal);
												}

												/*
												 *  Set record: 
												 *   - identifier
												 *   - effective date (event/action date)
												 *   - current status date (event/action date)
												 *   - kind (mapping)
												 */
												tmrec2.setRecordIdentifier(docidentifier);
												tmrec2.setRecordEffectiveDate(ClassHelper.ConvertStringToDate(prUserdocEvent2[w].getEventDate().getDateValue().getTime().toString()));
												tmrec2.setRecordCurrentStatusDate(ClassHelper.ConvertStringToDate(prUserdocEvent2[w].getEventDate().getDateValue().getTime().toString()));
												tmrec2.setRecordKind(mapRecordsToTmviewValues(subEvent.getEventUserdocTypeCode(),prUserdocEvent2[w].getEventActionTypeCode()));

												if(paramDebug.equals("0")) {
													System.out.println("Recordkind: " + tmrec2.getRecordKind() + " - w: map: " + subEvent.getEventUserdocTypeCode() + " - " + prUserdocEvent2[w].getEventActionTypeCode());
													System.out.println("\t\t\t -> w: getUserDocEventDescription: \t" + prUserdocEvent2[w].getEventDescription());
													System.out.println("\t\t\t -> w: getUserDocEventActionTypeCode: \t" + prUserdocEvent2[w].getEventActionTypeCode());
													System.out.println("\t\t\t -> w: getUserDocEventDate: \t\t" + ClassHelper.ConvertStringToDate(prUserdocEvent2[w].getEventDate().getDateValue().getTime().toString()));
													System.out.println("\t\t--------- -------------------------------------------------");
												}
											}
										}

									}

									/*
									 * Set user document details (applicant,representative etc.)
									 */
									if (prUserdocEvent2 != null && prUserdocEvent2.length > 0) {

										CUserdoc userdoc = port.userdocRead(userdocId2);
										if (userdoc != null) {
											setUserDocDetails(userdoc, tmrec2, appeal, opposition);
										}
									}

									/*
									 * Add record to list
									 */
									if (eventactionTypeCodeIsFound) {
										tm.getTrademarkRecordList().add(tmrec2);
										
										if(paramDebug.equals("0")) {
											
											System.out.println("\t\t\t\tAdded sub recod to list. ");
											System.out.println("\t[RECORD VALID SUB ACTIONS FOUND: Added sub record to list - LEVEL 2.1] ");
											System.out.println("\t--------- ------------------------------------------------- ---------");
										}
										
										eventactionTypeCodeIsFound = false;
									} else {
										if(paramDebug.equals("0")) {
											System.out.println("\t--------- -------------------------------------------------");
											System.out.println("\t[RECORD VALID SUB ACTIONS NOT FOUND - LEVEL 2.1]");
											System.out.println("\t--------- -------------------------------------------------");
										}
									}

								}
							}
						}
					}
				}
			}
		}
	}
	
	
	
	/**
	 * This method is used to search for a trademark in IPAS and to 
	 * build the Trademark object
	 * 
	 * @throws Exception
	 */
	public static Trademark buildTrademark(Trademark inputTM) throws Exception, RemoteException, IpasException, ServiceException {

		System.out.print("Reading from IPAS WS: " + inputTM.toString());

		Trademark tm = null;
		CMark cmark = null;
		// build file id key
		CFileId fileId = new CFileId();

		fileId.setFileSeq(inputTM.getFileSeq());
		fileId.setFileType(inputTM.getFileType());
		fileId.setFileSeries(new IpasInteger((double) inputTM.getFileSeries()));
		fileId.setFileNbr(new IpasInteger((double) inputTM.getFileNumber()));

		//_int.wipo.ipas.IpasServices.IpasServices_PortType port = service.getIpasServicesPort();
		
		try {
			cmark = port1.markRead(fileId, true, false);
			System.out.println("  reading ... OK");
			
			//test
			//PrintAgentList();
			
		}
		catch(IpasException e) {
			tm = inputTM;
			//throw new Exception();
		}
		catch(RemoteException e) {
			tm = inputTM;
			//throw new Exception();
		}
		catch(Throwable e) {
			tm = inputTM;
		}
		
		//tm = inputTM;

		
		if(cmark != null) {
			
			tm = new Trademark();
		
			// pid used for looping through events
			_int.wipo.ipas.IpasServices.CProcessId pid = cmark.getFile().getProcessId();
			//System.out.println("Process ID: " + pid.getProcessNbr().getDoubleValue().toString());
	
			// 0 = true, 1 = false (or ignore)
			if(paramGetPublicationsAndRecords.equals("0")) { 
				// if an office has publications and records 
				setWorkflowDetails(tm, pid, port1);
			}
	
			// set language code /////////////////////////
			tm.setLanguageCode(paramInterfaceLanguage);
			
			// set Office Code (not null)/////////////////////////
			tm.setOfficeCode(paramIPO);
			
			// set Transaction identifier (not null)/////////////////////////
			tm.setTransactionIdentifier(paramTransactionIdentifier);
			
			/*
			 *  set application number, for example: 201812345
			 *  the format should be configured by the preferences of NO
			 */
			
			tm.setApplicationNumber(inputTM.getFileSeq() + "" + inputTM.getFileType() + "" + inputTM.getFileSeries() + ""
					+  new DecimalFormat("000000").format(inputTM.getFileNumber()));
	
			
			if(inputTM.getFileSeq().equals("A") 
					|| inputTM.getFileSeq().equals("B") 
					|| inputTM.getFileSeq().equals("C")
					|| inputTM.getFileSeq().equals("D")
					|| inputTM.getFileSeq().equals("E")
					|| inputTM.getFileSeq().equals("F")
					|| inputTM.getFileSeq().equals("G")
					|| inputTM.getFileSeq().equals("M")
					|| inputTM.getFileSeq().equals("R")
					|| inputTM.getFileSeq().equals("X")) 
			{
				// set st13 code /////////////////////////
				tm.setST13Code(paramIPO + "50" + new DecimalFormat("0000").format(inputTM.getFileSeries())
						 + inputTM.getFileSeq() + "" + inputTM.getFileType() + "" 
						+ new DecimalFormat("0000000").format(inputTM.getFileNumber()));
			}
			else {
				// set st13 code /////////////////////////
				tm.setST13Code(paramIPO + "50" + new DecimalFormat("0000").format(inputTM.getFileSeries())
						 + "" + inputTM.getFileType() + "" 
						+ new DecimalFormat("00000000").format(inputTM.getFileNumber()));
			}
			
	
			// set filing date /////////////////////////
			if (cmark.getFile().getFilingData().getFilingDate().getDateValue() != null) 
			{
				Date filingDate = ClassHelper.ConvertStringToDate(cmark.getFile().getFilingData().getFilingDate().getDateValue().getTime().toString());
				tm.setFilingDate(filingDate);
				
			}
	
			// set trademark name /////////////////////////
			if (cmark.getSignData().getMarkName() != null) {
				tm.setTitle(cmark.getSignData().getMarkName());
			}
	
			// set LOGO colors /////////////////////////
			if (cmark.getSignData().getLogo().getColourDescription() != null) {
				tm.setLogoColours(cmark.getSignData().getLogo().getColourDescription());
			}
	
			// set trademark type type /////////////////////////
			tm.setType(cmark.getSignData().getSignType());
			
			if(paramDebug.equals("0")) System.out.println("TM Type: " + tm.getType());
			
			//System.out.println("app_sub_type: " +cmark.getFile().getFilingData().getApplicationSubtype().trim());
					
					
			// SET IPRKIND: TRADEMARK, COMMERCIALNAME, APPELLATIONOFORIGIN, SLOGAN, GEOGRAPHICALINDICIATION /////////////////////////
			tm.setIPRKind(cmark.getFile().getFilingData().getApplicationSubtype().trim());
			Integer tmIPRKindID = mapIpasApplToIPRKind.get(cmark.getFile().getFilingData().getApplicationSubtype().trim());
			if(tmIPRKindID== null)
				logError("IPRKind null or not mapped: " + cmark.getFile().getFilingData().getApplicationSubtype().trim());
			
			tm.setIPRKindID(tmIPRKindID);
			
			if(paramDebug.equals("0")) System.out.println("tm.getIPRKind(): " + tm.getIPRKind() + ", tmIPRKindID: " + tmIPRKindID);
			
			// SET KIND MARK: INDIVIDUAL, COLLECTIVE, CERTIFICATE, GUARANTEE /////////////////////////
			// CHECK IF THE VALUES CAN BE TAKEN FROM cf_application_subtype.APPL.TYP OR cf_application_subtype.APPL.SUBTYP
	
			
			if(paramDebug.equals("0"))
				System.out.println("apptype:" + cmark.getFile().getFilingData().getApplicationType() + ", appsubtype:" + cmark.getFile().getFilingData().getApplicationSubtype());
			
			if (cmark.getFile().getFilingData().getApplicationType() != null) {
				if(cmark.getFile().getFilingData().getApplicationType().equals("T") || cmark.getFile().getFilingData().getApplicationType().equals("M")  
						&& (cmark.getFile().getFilingData().getApplicationSubtype().equals("M") 
						|| cmark.getFile().getFilingData().getApplicationSubtype().equals("C")
						|| cmark.getFile().getFilingData().getApplicationSubtype().equals("1")
						|| cmark.getFile().getFilingData().getApplicationSubtype().equals("2")
						|| cmark.getFile().getFilingData().getApplicationSubtype().equals("3")
						|| cmark.getFile().getFilingData().getApplicationSubtype().equals("4")
						|| cmark.getFile().getFilingData().getApplicationSubtype().equals("5")
						|| cmark.getFile().getFilingData().getApplicationSubtype().equals("6"))) 
				
				{
					// set M or C
					tm.setApplicationKindMark(cmark.getFile().getFilingData().getApplicationSubtype());
				}
				//tm.setApplicationKindMark(cmark.getFile().getFilingData().getApplicationType());
				
				if(paramDebug.equals("0")) System.out.println("tm.getApplicatoinKindMark(): " + tm.getApplicationKindMark() + ", from (appl_typ)");
			}
	
			
			// tm.setApplicationKindMark(cmark.getFile().getFilingData().getApplicationSubtype());
			if(tm.getApplicationKindMark()!=null && tm.getApplicationKindMark().length()>0) {
				Integer tmApplicationKindMarkID = mapIpasApplToKindMark.get(cmark.getFile().getFilingData().getApplicationSubtype().trim());
				
				if(tmApplicationKindMarkID == null)
					logError("KindMark null or not mapped: " + cmark.getFile().getFilingData().getApplicationSubtype().trim());
				
				
				tm.setApplicationKindMarkID(tmApplicationKindMarkID);
			}
			
			// tm.setApplicationKindMark(cmark.getFile().getFilingData().getApplicationSubtype());
			//Integer tmApplicationKindMarkID = mapIpasApplToKindMark.get(cmark.getFile().getFilingData().getApplicationSubtype().trim());
			//tm.setApplicationKindMarkID(tmApplicationKindMarkID);
	
			//System.out.println("APPL_TYP (KINDMARK): " + cmark.getFile().getFilingData().getApplicationType() + "\tApplicationKindMarkID: " + tmApplicationKindMarkID);
	
			// SET TRADEMARK FEATURE /////////////////////////
			if (cmark.getSignData().getSignType().equals("N")) { tm.setMarkFeature("Word"); } 
			else if (cmark.getSignData().getSignType().equals("L")) { tm.setMarkFeature("Figurative"); } 
			else if (cmark.getSignData().getSignType().equals("B")) { tm.setMarkFeature("Combined"); } 
			else if (cmark.getSignData().getSignType().equals("T")) { tm.setMarkFeature("3-D"); } 
			else if (cmark.getSignData().getSignType().equals("S")) { tm.setMarkFeature("Sound"); } 
			else if (cmark.getSignData().getSignType().equals("O")) { tm.setMarkFeature("Olfactory");} 
			else { throw new Exception("The trademark feature could not be assigned"); }
	
			// set journal code /////////////////////////
			if (cmark.getFile().getPublicationData().getJournalCode() != null) {
				tm.setJournalCodeName(cmark.getFile().getPublicationData().getJournalCode());
			}
	
			// set publication date /////////////////////////
			if (cmark.getFile().getPublicationData().getPublicationDate().getDateValue() != null) {
				Date date = ClassHelper.ConvertStringToDate(cmark.getFile().getPublicationData().getPublicationDate().getDateValue().getTime().toString());
				tm.setPublicationDate(date);
				
				
			}
	
			// set registration date /////////////////////////
			if (cmark.getFile().getRegistrationData().getRegistrationDate().getDateValue() != null) {
				Date date = ClassHelper.ConvertStringToDate(cmark.getFile().getRegistrationData().getRegistrationDate().getDateValue().getTime().toString());
				tm.setRegistrationDate(date);
				
			}
	
			// set expiration date /////////////////////////
			if (cmark.getFile().getRegistrationData().getExpirationDate().getDateValue() != null) {
				Date date = ClassHelper.ConvertStringToDate(cmark.getFile().getRegistrationData().getExpirationDate().getDateValue().getTime().toString());
				tm.setExpirationDate(date);
				
			}
	
			// set registration number /////////////////////////
			if (cmark.getFile().getRegistrationData().getRegistrationId().getRegistrationNbr().getDoubleValue() != null
					&& cmark.getFile().getRegistrationData().getRegistrationId().getRegistrationNbr().getDoubleValue() > 0) {
				tm.setRegistrationNumber(new DecimalFormat("#").format(
						cmark.getFile().getRegistrationData().getRegistrationId().getRegistrationNbr().getDoubleValue()));
			}
	
			// check the owner list /////////////////////////
			COwner[] ownerList = cmark.getFile().getOwnershipData().getOwnerList();
			if (ownerList != null && ownerList.length > 0) {
	
				for (COwner ow : ownerList) 
				{
					Applicant owner = new Applicant();
					owner.setPersonName(ow.getPerson().getPersonName());
					owner.setAddress(ow.getPerson().getAddressStreet());
					owner.setCity(ow.getPerson().getCityName());
					owner.setZip(ow.getPerson().getZipCode());
					owner.setStateName(ow.getPerson().getStateName());
					owner.setRole("Applicant");
					//owner.setEmail(ow.getPerson().getEmail());
					//owner.setPhone(ow.getPerson().getTelephone());
					
					if(!mapIpasInvalidCountryCodes.isEmpty() && mapIpasInvalidCountryCodes.containsKey(ow.getPerson().getResidenceCountryCode().trim())) {
						owner.setResidenceCountryCode("XX");
					}
					else {
						owner.setResidenceCountryCode(ow.getPerson().getResidenceCountryCode());
					}
					//owner.setApplicantIsCompany(ow.getPerson().getIndCompany());
					tm.getApplicantList().add(owner); // add owner to list
					
					//System.out.println(owner.getPersonName() + "-" + owner.getAddress());
				}
			}
	
			// check the representative list /////////////////////////
			CRepresentative[] representativeList = cmark.getFile().getRepresentationData().getRepresentativeList();
			if (representativeList != null && representativeList.length > 0) {
	
				for (CRepresentative r : representativeList) 
				{
					Representative rep = new Representative();
					rep.setPersonName(r.getPerson().getPersonName());
					rep.setAddress(r.getPerson().getAddressStreet());
					rep.setCity(r.getPerson().getCityName());
					rep.setStateName(r.getPerson().getStateName());
					rep.setZip(r.getPerson().getZipCode());
					rep.setRole("Agent");
					//rep.setEmail(r.getPerson().getEmail());
					//rep.setPhone(r.getPerson().getTelephone());
					rep.setResidenceCountryCode(r.getPerson().getResidenceCountryCode());
					
					rep.setRepresentativeType(r.getRepresentativeType());
					
					if(r.getPerson().getAgentCode().getDoubleValue() != null)
						rep.setRepresentativeCodeIdentifier(r.getPerson().getAgentCode().getDoubleValue().intValue());
					
					tm.getRepresentaiveList().add(rep);// add representative to list
					
					//System.out.println(rep.getPersonName() + "-" + rep.getAddress());
				}
			}
	
			// set priority /////////////////////////
			CParisPriority[] priorityList = cmark.getFile().getPriorityData().getParisPriorityList();
	
			if (priorityList != null) {
				for (CParisPriority pp : priorityList) 
				{
					org.tmview.soip.Priority py = new org.tmview.soip.Priority();
					py.setApplicationId(pp.getApplicationId());
					
					if(!mapIpasInvalidPriorityCountryCodes.isEmpty()&& mapIpasInvalidPriorityCountryCodes.containsKey(pp.getCountryCode().trim())) 
					{
						py.setCountryCode("XX");
					}
					else {
						py.setCountryCode(pp.getCountryCode().trim());
					}
					
					Date priorityDate = ClassHelper.ConvertStringToDate(pp.getPriorityDate().getDateValue().getTime().toString());
					py.setPriorityDate(priorityDate);
					py.setNotes(pp.getNotes());
					tm.getPriorityList().add(py); // add priority to list
				}
			}
	
			// check the Nice classification /////////////////////////
			CNiceClass[] niceList = cmark.getProtectionData().getNiceClassList();
			
			if (niceList != null && niceList.length > 0) {
	
				for (CNiceClass n : niceList) 
				{
					Nice nd = new Nice();
					nd.setNiceClassNumber((int) n.getNiceClassNbr().getDoubleValue().doubleValue());
					nd.setNiceClassDesc(n.getNiceClassDescription());
					nd.setNiceClassStatus(n.getNiceClassDetailedStatus());
	
					if (n.getNiceClassEdition().getDoubleValue() != null && (int) n.getNiceClassEdition().getDoubleValue().doubleValue() > 0)
						nd.setNiceClassificationEdition((int)n.getNiceClassEdition().getDoubleValue().doubleValue());
	
				// if(nd.getNiceClassStatus() == "R")
					tm.getNiceList().add(nd);
				}
			}
	
			// check Vienna classification /////////////////////////
			CViennaClass[] viennaList = cmark.getSignData().getLogo().getViennaClassList();
			if (viennaList != null && viennaList.length > 0) 
			{
				for (CViennaClass vc : viennaList) {
					
					Vienna vn = new Vienna();
					vn.setViennaCategory(vc.getViennaCategory().getDoubleValue().toString());
					vn.setViennaDivision(vc.getViennaDivision().getDoubleValue().toString());
					vn.setViennaSection(vc.getViennaSection().getDoubleValue().toString());
					vn.setViennaDescriptionText(vc.getViennaDescription());
					tm.getViennaList().add(vn); //add Vienna code to list
				}
			}
	
			// set trademark image /////////////////////////
			if (cmark.getSignData().getLogo().getLogoData().length > 1) {
				// get the content in bytes
				byte[] imageBytes = cmark.getSignData().getLogo().getLogoData();
				if (imageBytes.length > 1) {
					tm.setImageBytes(imageBytes);
					tm.setMarkImageFileName(tm.getST13Code());
					tm.setLogoImageFileFormat(cmark.getSignData().getLogo().getLogoType());
				}
	
			}
	
			// set trademark status details /////////////////////////
			tm.setStatusName(inputTM.getStatusName()); // set status name
			tm.setStatusCode(inputTM.getStatusCode()); // set status code
			tm.setStatusDate(inputTM.getStatusDate()); // set status date
			tm.setProcessNumber(inputTM.getProcessNumber()); // set process number
	
			// System.out.println("Input status code: " + tm.getStatusCode());
			//Integer tmViewStatus = mapIpasStatusCode2TmViewStatus.get(inputTM.getStatusCode());
			//tm.setStatusID(tmViewStatus);
			
			Integer tmViewStatus = mapIpasStatusCode2TmViewStatus.get(inputTM.getStatusCode());
			
			try {
				tm.setStatusID(tmViewStatus);
			}
			catch(Exception e) {
				logError("Status code: " + inputTM.getStatusCode().trim() + " for TM:" + inputTM.toString() + " is not mapped in configuraiton.properties");
				tm = inputTM;
			}
			
			/*
			 * Any status mapping logic should be implemented here
			 * for example: in case we need the previous status code 
			 */
			
			if(inputTM.getStatusCode().equals("MADN") && tm.getRegistrationNumber() != null) {
				tm.setStatusID(11);
			}else if(inputTM.getStatusCode().equals("179") && tm.getRegistrationNumber() != null) {
				tm.setStatusID(10);
			}else if(inputTM.getStatusCode().equals("179") && tm.getRegistrationNumber() == null) {
				tm.setStatusID(5);
			}else if(inputTM.getStatusCode().equals("036") 
					|| inputTM.getStatusCode().equals("037")
					|| inputTM.getStatusCode().equals("045") 
					|| inputTM.getStatusCode().equals("016") 
					|| inputTM.getStatusCode().equals("204") 
					|| inputTM.getStatusCode().equals("024") 
					|| inputTM.getStatusCode().equals("028") 
					|| inputTM.getStatusCode().equals("029") 
					|| inputTM.getStatusCode().equals("030") 
					|| inputTM.getStatusCode().equals("032") 
					|| inputTM.getStatusCode().equals("033") 
					|| inputTM.getStatusCode().equals("075") 
					|| inputTM.getStatusCode().equals("077") 
					|| inputTM.getStatusCode().equals("084") 
					|| inputTM.getStatusCode().equals("085") 
					|| inputTM.getStatusCode().equals("094") 
					|| inputTM.getStatusCode().equals("096") 
					|| inputTM.getStatusCode().equals("128") 
					|| inputTM.getStatusCode().equals("129") 
					|| inputTM.getStatusCode().equals("149") 
					|| inputTM.getStatusCode().equals("155")
					|| inputTM.getStatusCode().equals("158")
					|| inputTM.getStatusCode().equals("159")
					|| inputTM.getStatusCode().equals("161")
					|| inputTM.getStatusCode().equals("181")
					|| inputTM.getStatusCode().equals("182")
					|| inputTM.getStatusCode().equals("185")
					|| inputTM.getStatusCode().equals("162")
					|| inputTM.getStatusCode().equals("163")
					|| inputTM.getStatusCode().equals("183")
					|| inputTM.getStatusCode().equals("186")
					|| inputTM.getStatusCode().equals("180")
					|| inputTM.getStatusCode().equals("197")
					|| inputTM.getStatusCode().equals("198")
					|| inputTM.getStatusCode().equals("199")
					|| inputTM.getStatusCode().equals("184")
					|| inputTM.getStatusCode().equals("035")
					|| inputTM.getStatusCode().equals("098")
					|| inputTM.getStatusCode().equals("034")
					|| inputTM.getStatusCode().equals("100")) {
				
				String prevstatus = getPreviuousStatusCode(inputTM.getProcessNumber());
				//System.out.println("Current status code: " + inputTM.getStatusCode() + "\t >> Previous status code:" + prevstatus);
				if(prevstatus.equals("083"))
					tm.setStatusID(2);
				else if(prevstatus.equals("215")) 
					tm.setStatusID(3);
			}
			
					
	
			if(paramDebug.equals("0")) System.out.println("tm.getStatusCode():" + tm.getStatusCode() + ", Mapped to --> TMview Status : " + tmViewStatus);
			//System.out.println("Prior status code: " + getPreviuousStatusCode(tm.getProcessNumber()) + ", Process number: " + tm.getProcessNumber());
			
		}
		return tm;
	} // end of build trademark

	/*
	 * ********************************************************************
	 * ******************** exportMarkDetailsToFtp
	 * ********************************************************************
	 */

	static public void exportTrademarkToFtp(Trademark mark) throws Exception {

		if(folder_id != 0)
			directoryCounter = folder_id;
		// generate the 1000 XML per folder
		if (numberOfGeneretedFiles % 1000 == 0) {
			directoryCounter++;
			folder_id=0;
		}

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); 
		String today = sdf.format(new Date());

		if (mark.getImageBytes() != null && mark.getImageBytes().length > 1) {

			mark.setMarkImageFileName(today + "-" + mark.getST13Code() + ".jpg");
			// read image bytes and type
			byte[] imageBytes;
			String imageType = "";
			
			imageBytes = mark.getImageBytes();
			imageType = mark.getLogoImageFileFormat();
			
			// check image size configuration (default size 300px height, or 300px witdh)
			int preferredImageSize = 300;
			if(!paramPreferredImageSize.equals("")) {
				preferredImageSize = Integer.parseInt(paramPreferredImageSize);
				if(preferredImageSize<300)
					preferredImageSize = 300;
			}
				
			
			// convert image bytes to JPG if necessary
			byte[] jpgImageBytes = null;
			try {
				if (imageType.equals("JPG") || imageType.equals("JPEG")) {
					// do nothing
					jpgImageBytes = CommonUtil.image2jpg_r(imageBytes, preferredImageSize);
				} else if (imageType.equals("PNG") || imageType.equals("GIF") || imageType.equals("BMP")) {
					// the image is converted to JPG
					jpgImageBytes = CommonUtil.image2jpg_r(imageBytes, preferredImageSize);

				} else if (imageType.equals("TIF")) {
					// TIF images have a special conversion
					jpgImageBytes = CommonUtil.tif2jpg(imageBytes);
				} else {
					// unsupported image
					throw new Exception("Unsupported image type: " + imageType);
				}
			} catch (Exception e) {
				// the image is corrupted
				Throwable rootException = e;
				while (rootException.getCause() != null) {
					rootException = rootException.getCause();
				}
				String rootMessage = rootException.getMessage();
				throw new Exception("The " + imageType + " image is corrupted: " + rootMessage);
			}
			//  end converting image to jpg
						

			if (mark.getMarkImageFileName() != null && !mark.getMarkImageFileName().equals("")) {
				
				// the image is contained in a database as blob
				if(jpgImageBytes != null)
					imageBytes = jpgImageBytes;
				else
					imageBytes = mark.getImageBytes();
				
				// save image to path
				if (!paramSaveImagesToDisc.equals("1")) {

					String fileName = paramLocalFolderImagesCTI 
							+ "/" + today + "/"
							+ new DecimalFormat("0000").format(directoryCounter) 
							+ "/" + today + "-"
							+ mark.getST13Code() + ".jpg";

					// assure all paths exist
					String allPaths = new File(fileName).getParent();
					new File(allPaths).mkdirs();

					// save image to disc location
					CommonUtil.saveImageToLocalDisc(imageBytes, fileName);
				}

				// the image type is the extension
				imageType = mark.getMarkImageFileName().substring(mark.getMarkImageFileName().length() - 3).toUpperCase();
				// System.out.println("imageType: " + imageType);
			
			} 
			else 
			{
				System.out.println("# save image...empty code block - nothing happens here");
			}
		}

		// build trademark transaction

		TransactionType t = new TransactionXML().buildXmlStepByStep(mark);

		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd"); 
		String today1 = sdf1.format(new Date());
		String fileName = paramLocalFolderFtp 
				+ "/" + today1 + "/" 
				+ new DecimalFormat("0000").format(directoryCounter)
				+ "/" + today1 + "-" 
				+ mark.getST13Code() 
				+ ".xml";

		// assure all paths exist
		String allPaths = new File(fileName).getParent();
		new File(allPaths).mkdirs();

		// generate output XML file
		// Use TransactionType as root node (the JAXB compiler does not generate
		// the @XmlRootElement annotation when several complex types exist)
		JAXBElement<jxml.TransactionType> element = (new jxml.ObjectFactory()).createTransaction(t);

		//jxmlJaxbMarshallerTmview.marshal(element, new File(fileName));
		//numberOfGeneretedFiles++;
		
		// generate output XML file, delete the output XML file in case of validation issues
		try {
			jxmlJaxbMarshallerTmview.marshal(element, new File(fileName));
			numberOfGeneretedFiles++;
		} catch (Exception e) {
		    new File(fileName).delete();
		    logError("XML generation failed for: " + mark.getApplicationNumber() + ", XML deleted from files system.");
		    throw e;
		}
	}

	

	/*
	 * ********************************************************************
	 * ********** validateMark
	 * ********************************************************************
	 */

	static public Boolean validateMark(Trademark mark) {
		// several validations are performed to detect possible errors and
		// generate a better message than the XSD validation

		String validationMsg = "";

		// validate ST13 code, which should be: 2 characters for the ST3 IP Office code (this is not part of the standard ST13).
		// -15 digits for the ST13 itself:
		// - 2 digits for the type of IP right, using 50 = trademarkType.
		// - 4 digits for the year
		// - 9 digits for the serial number
		
		if (mark.getST13Code() == null || mark.getST13Code().length() < 17) {
			validationMsg = "ST03/ST13 code must have at least 17 digits";

		} else if (!mark.getST13Code().substring(0, 2).equals(paramIPO)) {
			validationMsg = "ST03/ST13 code must start with the IP Office code";

		} else if (!mark.getST13Code().substring(2, 4).equals("50")) {
			validationMsg = "ST03/ST13 code must indicate 50 as the IP right code for trademarks";
		}

		// test validation result
		if (validationMsg.equals("")) {
			// validation was OK, return true
			return true;

		} else {
			// validation failed, save descriptive error message
			// log message error
			logMessage("   " + validationMsg);

			// return false
			return false;
		}
	}

	/*
	 * *******************************************************************
	 * generateTrademarkZip
	 * ********************************************************************
	 */

	static public void generateTrademarkZip()
			throws FileNotFoundException, IOException, InterruptedException, Exception {

		logStatus("Zipping generated files");
		// create prefix as today
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); 
		String today = sdf.format(new Date());

		// generates a ZIP file with the existing mark index XML files, stores
		// it in the FTP server
		// and deletes the XML files
		File localFolderFtp = new File(paramLocalFolderFtp);
		// delete any ZIP files in the FTP folder
		for (File file : localFolderFtp.listFiles()) {
			int len = file.getAbsolutePath().length();
			if (file.getAbsolutePath().substring(len - 3).toUpperCase().equals("ZIP") && len > 8) {
				file.delete();
			}
		}

		// create the "processed" folder if needed
		File processed = new File(paramLocalFolderFtp + "/processed/sample.txt");
		new File(processed.getParent()).mkdirs();

		FileOutputStream fos1 = null;
		ZipOutputStream zos1 = null;
		File zipFile1 = null;
		String xmlZipFileName1 = "";

		String dir = paramLocalFolderFtp + "/" + today + "/";
		File directory = new File(dir);
		// get all the files from a directory
		File[] fList = directory.listFiles();

		if (fList != null) {
			for (File folder : fList) {
				if (folder.isFile()) {
					// System.out.println(folder.getName());
				} else if (folder.isDirectory()) {
					// System.out.println(folder.getName());

					File subDir = new File(dir + "/" + folder.getName());
					File[] subDirList = subDir.listFiles();

					if (subDirList != null) {
						if (subDirList.length > 0) {
							if (paramExecutionContext.equals("FULL")) {
								xmlZipFileName1 = today + "-" + paramIPO + "-FULL-INDX-" + folder.getName() + ".zip";
								
							} else {
								xmlZipFileName1 = today + "-" + paramIPO + "-DIFF-INDX-" + folder.getName() + ".zip";
							}
							zipFile1 = new File(paramLocalFolderFtp + "/" + xmlZipFileName1);

							fos1 = new FileOutputStream(zipFile1);
							zos1 = new ZipOutputStream(fos1);

							for (File xmlFile : subDirList) {
								System.out.println("Zipping: " + xmlFile.getName());
								logMessage("  Zipping: " + xmlFile.getName());
								String path = xmlFile.getAbsolutePath();
								if (path.substring(path.length() - 3).toUpperCase().equals("XML")) {
									ZipEntry ze = new ZipEntry(xmlFile.getName());
									zos1.putNextEntry(ze);
									// read XML data from file
									DataInputStream dataIs = new DataInputStream(new FileInputStream(xmlFile));
									byte[] data = new byte[(int) xmlFile.length()];
									dataIs.readFully(data);
									dataIs.close();
									// write XML data to ZIP output stream
									zos1.write(data, 0, data.length);
									// close ZIP entry
									zos1.closeEntry();
								} // end if

							} // end inner for
							if (zos1 != null) {
								// close the ZIP file
								zos1.close();
								logMessage("INFO: Zipping XML files finished.");
							}
						} // end if
					} // end if
				} // end els if
			} // end for (outer)


		} else {
			logMessage("INFO: " + directory.getName() + " folder empty, nothing to process. ");
		}

		return;
	}

	/*
	 * ********************************************************************
	 * generateTrademarkZipForImages
	 * ********************************************************************
	 */

	static public void generateTrademarkZipForImages()
			throws FileNotFoundException, IOException, InterruptedException, Exception {

		logStatus("Zipping generated files");
		// create prefix as today
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); 
		String today = sdf.format(new Date());
		// generates a ZIP file with the existing mark index XML files, stores
		// it in the FTP server
		// and deletes the XML files
		File localFolderFtp = new File(paramLocalFolderFtp);
		// delete any ZIP files in the FTP folder
		for (File file : localFolderFtp.listFiles()) {
			int len = file.getAbsolutePath().length();
			if (file.getAbsolutePath().substring(len - 3).toUpperCase().equals("ZIP") && len > 8) {
				// file.delete();
			}
		}

		// create the "processed" folder if needed
		File processed = new File(paramLocalFolderFtp + "/processed/sample.txt");
		new File(processed.getParent()).mkdirs();

		FileOutputStream fos1 = null;
		ZipOutputStream zos1 = null;
		File zipFile1 = null;
		String xmlZipFileName1 = "";

		String dir = paramLocalFolderImagesCTI + "/" + today + "/";
		File directory = new File(dir);
		// get all the files from a directory
		File[] fList = directory.listFiles();

		if (fList != null) {
			for (File folder : fList) {
				if (folder.isFile()) {
					// System.out.println(folder.getName());
				} else if (folder.isDirectory()) {
					// System.out.println(folder.getName());

					File subDir = new File(dir + "/" + folder.getName());
					File[] subDirList = subDir.listFiles();

					if (subDirList != null) {
						if (subDirList.length > 0) {
							if (paramExecutionContext.equals("FULL")) {
								xmlZipFileName1 = today + "-" + paramIPO + "-FULL(IMGA)-INDX-" + folder.getName()
										+ ".zip";
							} else {
								xmlZipFileName1 = today + "-" + paramIPO + "-DIFF(IMGA)-INDX-" + folder.getName()
										+ ".zip";
							}
							zipFile1 = new File(paramLocalFolderFtp + "/" + xmlZipFileName1);

							fos1 = new FileOutputStream(zipFile1);
							zos1 = new ZipOutputStream(fos1);

							for (File xmlFile : subDirList) {
								System.out.println("Zipping: " + xmlFile.getName());
								logMessage("  Zipping: " + xmlFile.getName());
								String path = xmlFile.getAbsolutePath();
								if (path.substring(path.length() - 3).toUpperCase().equals("JPG")) {
									ZipEntry ze = new ZipEntry(xmlFile.getName());
									zos1.putNextEntry(ze);
									// read XML data from file
									DataInputStream dataIs = new DataInputStream(new FileInputStream(xmlFile));
									byte[] data = new byte[(int) xmlFile.length()];
									dataIs.readFully(data);
									dataIs.close();
									// write XML data to ZIP output stream
									zos1.write(data, 0, data.length);
									// close ZIP entry
									zos1.closeEntry();
								} // end if

							} // end inner for
							if (zos1 != null) {
								// close the ZIP file
								zos1.close();
								logMessage("INFO: Zipping images finished.");
							}
						} // end if
					} // end if
				} // end els if
			} // end for (outer)

		} else {
			logMessage(" INFO: images folder is empty, nothing to process. ");
		}

		return;
	}
	
	
	public static void uploadZipFilestoFtp() throws Exception {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); 
		String today = sdf.format(new Date());
		
		File localFolderFtp = new File(paramLocalFolderFtp);
		File localFolderImages = new File(paramLocalFolderImagesCTI);
		
		File localFolderFtp_ZIP = new File(paramLocalFolderFtp);
		if (localFolderFtp_ZIP != null) {
			if (localFolderFtp_ZIP.listFiles().length > 0) {

				for (File zip : localFolderFtp_ZIP.listFiles()) {

					String path = zip.getAbsolutePath();

					if (path.substring(path.length() - 3).toUpperCase().equals("ZIP")) {
						if (path.contains("IMG")) 
						{
							// upload IMG's to FTP server 1
							if (!paramFtpIgnore.equals("1") && !paramFtpServer1.equals("")) {
								
								if(paramFtpSecure.equals("0")) 
								{					
									//secure FTP
									saveToSFtp(paramFtpServer1, paramFtpUser1, paramFtpPassword1, paramFtpFolderImages1,zip.getName(), zip);
								}
								else if(paramFtpSecure.equals("1")) 
								{					
									//plain FTP
									saveToFtp(paramFtpServer1, paramFtpUser1, paramFtpPassword1, paramFtpFolderImages1,zip.getName(), zip);
								}
								else
								{
									// Proxy FTP
									saveToFtpProxy(paramFtpServer1, paramFtpUser1, paramFtpPassword1, paramFtpFolderImages1, zip.getName(), zip);
								}
							}
							
							// upload IMG's to FTP server 2
							if (!paramFtpIgnore.equals("1") && !paramFtpServer2.equals("")) {
								
								if(paramFtpSecure.equals("0")) 
								{					
									//secure FTP
									saveToSFtp(paramFtpServer2, paramFtpUser2, paramFtpPassword2, paramFtpFolderImages2,zip.getName(), zip);
								}
								else if(paramFtpSecure.equals("1")) 
								{					
									//plain FTP
									saveToFtp(paramFtpServer2, paramFtpUser2, paramFtpPassword2, paramFtpFolderImages2,zip.getName(), zip);
								}
								else
								{
									// Proxy FTP
									saveToFtpProxy(paramFtpServer2, paramFtpUser2, paramFtpPassword2, paramFtpFolderImages2, zip.getName(), zip);
								}
							}
							
						} 
						else 
						{
							// upload XML's to FTP server 1
							if (!paramFtpIgnore.equals("1") && !paramFtpServer1.equals("")) {
								
								if(paramFtpSecure.equals("0")) 
								{	
									//secure FTP
									saveToSFtp(paramFtpServer1, paramFtpUser1, paramFtpPassword1, paramFtpFolder1,zip.getName(), zip);
								}
								if(paramFtpSecure.equals("1")) 
								{	
									//Plain FTP
									saveToFtp(paramFtpServer1, paramFtpUser1, paramFtpPassword1, paramFtpFolder1,zip.getName(), zip);
								}
								else {
									// Proxy FTP
									saveToFtpProxy(paramFtpServer1, paramFtpUser1, paramFtpPassword1, paramFtpFolder1, zip.getName(), zip);
								}
							}
							
							// upload XML's to FTP server 2
							if (!paramFtpIgnore.equals("1") && !paramFtpServer2.equals("")) {
								
								if(paramFtpSecure.equals("0")) 
								{	
									//secure FTP
									saveToSFtp(paramFtpServer2, paramFtpUser2, paramFtpPassword2, paramFtpFolder2,zip.getName(), zip);
								}
								if(paramFtpSecure.equals("1")) 
								{	
									//Plain FTP
									saveToFtp(paramFtpServer2, paramFtpUser2, paramFtpPassword2, paramFtpFolder2,zip.getName(), zip);
								}
								else {
									// Proxy FTP
									saveToFtpProxy(paramFtpServer2, paramFtpUser2, paramFtpPassword2, paramFtpFolder2, zip.getName(), zip);
								}
							}
						}

						if(zip.getName().contains("IMG")) {
							File fileTo = new File(paramLocalPrepare_IMG_CESTO + "/" + zip.getName()); 
							new File(fileTo.getParent()).mkdirs();
							CommonUtil.moveFiles(zip, fileTo, true);
							logMessage("Zip files moved to: " + paramLocalPrepare_IMG_CESTO);
						}
						else {
							File fileTo = new File(paramLocalPrepare_TM_CESTO + "/" + zip.getName()); 
							new File(fileTo.getParent()).mkdirs();
							CommonUtil.moveFiles(zip, fileTo, true);
							logMessage("Zip files moved to: " + paramLocalPrepare_TM_CESTO);
						}
						
						// move the ZIP files to the "processed" sub-folder
						/*
						File fileTo = new File(paramLocalFolderFtp + "/processed/" + today + "/" + zip.getName()); 
						new File(fileTo.getParent()).mkdirs();
						CommonUtil.moveFiles(zip, fileTo, true);
						logMessage("Zip files moved to: " + paramLocalFolderFtp + "/processed/" + today);
						*/
					}
				} // end for

				for (File file : localFolderFtp.listFiles()) {
					String path = file.getAbsolutePath();

					// delete generated xml files dir if == 0
					if (!paramDeleteGeneratedXml.equals("1")) {
						if (file.isDirectory()) {
							if (file.getName().equals(today.toString())) {
								// file.delete();
								FileUtils.deleteDirectory(file);
							}
						}
					}

					if (path.substring(path.length() - 3).toUpperCase().equals("XML")) {
						file.delete();
					}
				}

				// delete the JPG files which were already added to the ZIP file
				for (File file : localFolderImages.listFiles()) {
					String path = file.getAbsolutePath();

					// delete generated images dir if == 0
					if (!paramDeleteGeneratedImages.equals("1")) {
						if (file.isDirectory()) {
							if (file.getName().equals(today.toString()))
								// file.delete();
								FileUtils.deleteDirectory(file);
						}
					}

					if (path.substring(path.length() - 3).toUpperCase().equals("JPG")) {
						file.delete();
					}
				} // end for

			} // end inner if

			logMessage("ZIP files have been uploaded to the FTP. ");
		} // end if
	}

	/*
	 * ********************************************************************
	 * generateTrademarkZipForEmptyXml
	 * ********************************************************************
	 */

	static public void generateTrademarkZipForEmptyXml()
			throws FileNotFoundException, IOException, InterruptedException, Exception {

		// create prefix as today
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); 
		String today = sdf.format(new Date());

		// generates a ZIP file with the existing mark index XML files,
		// stores the files in the FTP server
		// and deletes the XML files
		File localFolderFtp = new File(paramLocalFolderFtp);
		// delete any ZIP files in the FTP folder
		for (File file : localFolderFtp.listFiles()) {
			int len = file.getAbsolutePath().length();
			if (file.getAbsolutePath().substring(len - 3).toUpperCase().equals("ZIP") && len > 8) {
				// file.delete();
			}
		}

		// create the "processed" folder if needed
		File processed = new File(paramLocalFolderFtp + "/processed/sample.txt");
		new File(processed.getParent()).mkdirs();

		FileOutputStream fos = null;
		ZipOutputStream zos = null;

		File zipFile = null;

		String xmlZipFileName = "";

		int x1 = 0;
		int i = 0;
		for (File file : localFolderFtp.listFiles()) {

			if (i % 1000 == 0) {
				xmlZipFileName = today + "-" + paramIPO + "-DIFF-INDX-" + new DecimalFormat("0000").format(x1) + ".zip";
				zipFile = new File(paramLocalFolderFtp + "/" + xmlZipFileName);

				fos = new FileOutputStream(zipFile);
				zos = new ZipOutputStream(fos);
				x1++;
			}

			String path = file.getAbsolutePath();
			System.out.println(file.getName());
			if (path.substring(path.length() - 3).toUpperCase().equals("XML")) {
				ZipEntry ze = new ZipEntry(file.getName());
				zos.putNextEntry(ze);
				// read XML data from file
				DataInputStream dataIs = new DataInputStream(new FileInputStream(file));
				byte[] data = new byte[(int) file.length()];
				dataIs.readFully(data);
				dataIs.close();
				// write XML data to ZIP output stream
				zos.write(data, 0, data.length);
				// close ZIP entry
				zos.closeEntry();
			}

			i++;
		} // end for

		// ignore empty ZIP file
		if (x1 > 0) {
			// close the ZIP file and save it in the FTP server
			zos.close();

			// the ZIP file is saved in up to 5 FTP servers
			if (!paramFtpIgnore.equals("1") && !paramFtpServer1.equals("")) {
				if(paramFtpSecure.equals("0")) 
				{
					// secure ftp
					saveToSFtp(paramFtpServer1, paramFtpUser1, paramFtpPassword1, paramFtpFolder1, xmlZipFileName, zipFile);
				}
				else if(paramFtpSecure.equals("1")) {
					// plain ftp
					saveToFtp(paramFtpServer1, paramFtpUser1, paramFtpPassword1, paramFtpFolder1, xmlZipFileName, zipFile);
				}
				else {
					// Proxy ftp
					saveToFtpProxy(paramFtpServer1, paramFtpUser1, paramFtpPassword1, paramFtpFolder1, xmlZipFileName, zipFile);
				}
			}
			// delete the XML files which were already added to the ZIP file
			for (File file : localFolderFtp.listFiles()) {
				String path = file.getAbsolutePath();
				if (path.substring(path.length() - 3).toUpperCase().equals("XML")) {
					file.delete();
				}
			}

			// move the ZIP files to the "processed" sub-folder
			File fileTo = new File(paramLocalFolderFtp + "/processed/" + today + "/" + zipFile.getName()); 
			new File(fileTo.getParent()).mkdirs();
			// FileUtils.moveFile(zip, fileTo);
			CommonUtil.moveFiles(zipFile, fileTo, true);
			logMessage("Zip files moved to: " + paramLocalFolderFtp + "/processed/" + today);
			// all marks pending to be included in the FTP are updated as
			// processed
			// jpa.getTransaction().begin();
			// jpa.createNativeQuery("update mark set exportresult = 'OK' where exportresult
			// = 'FTP' ").executeUpdate();
			// jpa.getTransaction().commit();

			logMessage("FTP file sent and all marks flagged as exported");
		}

		return;
	}

	
	/*
	 * ********************************************************************
	 * ********** saveToFtp
	 * *******************************************************************
	 */

	public static void saveToFtp(String paramFtpServer, String paramFtpUser, String paramFtpPassword,
			String paramFtpFolder, String zipFileName, File zipFile) throws Exception {

		logStatus("Saving ZIP file to FTP server: " + paramFtpServer);
		logMessage("INFO: Started uploading files to the ftp server: " + paramFtpServer + "/" + paramFtpFolder);
		// If an Internet error occurs, 10000 retries after 5 seconds are done
		int retryCount = 0;
		while (retryCount < Integer.parseInt(paramFTPRetryCount)) {
			FTPClient ftpClient = null;
			FileInputStream fis = null;
			try {
				ftpClient = new FTPClient();
				ftpClient.setConnectTimeout(5000);
				// connect to the FTP server
				logMessage("... connecting to the FTP server " + paramFtpServer);
				// logMessage("... username " + paramFtpUser + ", password:"+ paramFtpPassword);

				ftpClient.connect(paramFtpServer, 21);
				logMessage("... connected");
				ftpClient.login(paramFtpUser, paramFtpPassword);

				ftpClient.setDataTimeout(5000);

				// set FTP mode
				ftpClient.setFileType(FTP.BINARY_FILE_TYPE);
				ftpClient.enterLocalPassiveMode();

				// write the ZIP file to the FTP server
				logMessage("... sending file to the FTP");
				logMessage("... uploading: " + zipFileName);
				fis = new FileInputStream(zipFile);
				String remoteName = paramFtpFolder + "/" + zipFileName;
				if (!ftpClient.storeFile(remoteName, fis)) {
					throw new Exception(MessageFormat.format(
							"FTP error during storage of file. Server: {0}. User: {1}. Password: {2}. Error code: {3}",
							paramFtpServer, paramFtpUser, paramFtpPassword, ftpClient.getReplyCode()));
				}

				// exit the loop
				break;

			} catch (IOException e) {
				logStatus("Waiting to retry after Internet error");
				logError("Waiting for 5 seconds before retrying after Internet error");
				logMessage("... waiting for 5 seconds before retrying after Internet error");
				retryCount++;
				Thread.sleep(5000);
				logStatus("Running"); 
				if (retryCount == Integer.parseInt(paramFTPRetryCount)) {
					logMessage(
							"Files where not uploaded to the FTP, please upload the files manully and they can be found under FTP folder.");
					logError("FTP server has not responded after many retries.");

					// throw new Exception("FTP server has not responded after many retries");
				}

			} finally {
				// close the file input stream
				if (fis != null) {
					fis.close();
				}
				// disconnect from the FTP
				if (ftpClient != null) {
					ftpClient.disconnect();
				}
			}
		}

	}


	/*
	 * ********************************************************************
	 * ********** saveToFtpProxy
	 * *******************************************************************
	 */

	
	
	
	/*
	 * ********************************************************************
	 * ********** saveTosFtp
	 * *******************************************************************
	 */

	 
	public static void saveToSFtp(String paramFtpServer, String paramFtpUser, String paramFtpPassword,
			String paramFtpFolder, String zipFileName, File zipFile) throws Exception {

		logStatus("Saving ZIP file to Secure FTP server: " + paramFtpServer);
		logMessage("INFO: Started uploading files to the sftp server: " + paramFtpServer + "/" + paramFtpFolder);
		
		
		ChannelSftp channelSftp = null;
	    Session session = null;
	    Channel channel = null;
	    
	    boolean CD = false;
	    
		// If an Internet error occurs, 10000 retries after 5 seconds are done
		int retryCount = 0;
		
		while (retryCount < Integer.parseInt(paramFTPRetryCount)) {
			
			FileInputStream fis = null;
			JSch jsch = null;
			try 
			{
				jsch = new JSch();
	            session = jsch.getSession(paramFtpUser, paramFtpServer, 22);
	            session.setPassword(paramFtpPassword);
	            java.util.Properties config = new java.util.Properties();
	            config.put("StrictHostKeyChecking", "no");
	            session.setConfig(config);
	            
	            // connect to the FTP server
	            logMessage("... connecting to the FTP server " + paramFtpServer);
	            session.connect(); // Create SFTP Session
	            channel = session.openChannel("sftp"); // Open SFTP Channel
	            channel.connect();
	            channelSftp = (ChannelSftp) channel;
	            
				logMessage("... connected");

				// write the ZIP file to the FTP server
				logMessage("... sending file to the FTP");
				logMessage("... uploading: " + zipFileName);
				
				fis = new FileInputStream(zipFile);
				File sourceFile = new File(paramLocalFolderFtp+"/"+zipFileName);
		        
		        if (sourceFile.isFile()) {
		            // copy if it is a file
		            if(!CD)
		            	channelSftp.cd(paramFtpFolder);
		            
		            CD=true;
		            
		            if (!sourceFile.getName().startsWith(".")) {
		            	System.out.print("...Uploading: " + sourceFile.getName());
		                channelSftp.put(fis, sourceFile.getName(), ChannelSftp.OVERWRITE);
		                System.out.println(" ... Done!");
		            }
		            	
		            
		        } 
		        else 
		        { 
		        	System.out.println(" ... invalid source file, the files not uploaded! "); 
		        	logMessage("... invalid source file, the files not uploaded! ");
		        }

				// exit the loop
				break;

			} catch (IOException e) {
				logStatus("Waiting to retry after Internet error");
				logError("Waiting for 5 seconds before retrying after Internet error");
				logMessage("... waiting for 5 seconds before retrying after Internet error");
				retryCount++;
				Thread.sleep(5000);
				logStatus("Running"); 
				
				
				if (retryCount == Integer.parseInt(paramFTPRetryCount)) {
					logMessage(
							"Files where not uploaded to the FTP, please upload the files manully and they can be found under FTP folder.");
					logError("FTP server has not responded after many retries.");

					// throw new Exception("FTP server has not responded after many retries");
				}

			} 
			finally 
			{
				// close the file input stream
				if (fis != null) {
					fis.close();
				}
				// disconnect from the FTP
				if (channelSftp != null)
	                channelSftp.disconnect();
	            if (channel != null)
	                channel.disconnect();
	            if (session != null)
	                session.disconnect();
	            
	            // set to null
	            if(channelSftp.isClosed())
	            	channelSftp = null;
	            if(channel.isClosed())
	            	channel = null;
	            if(!session.isConnected())
	            	session = null;
			}
		}

	} // end saveSecureFtp



	public static void saveToFtpProxy(String paramFtpServer, String paramFtpUser, String paramFtpPassword,
			String paramFtpFolder, String zipFileName, File zipFile) throws Exception {

		logStatus("Saving ZIP file to FTP server: " + paramFtpServer);
		logMessage("INFO: Started uploading files to the ftp server: " + paramFtpServer + "/" + paramFtpFolder);
		// If an Internet error occurs, 10000 retries after 5 seconds are done
		int retryCount = 0;
		while (retryCount < Integer.parseInt(paramFTPRetryCount)) {
			FTPHTTPClient ftpClient = null;
			FileInputStream fis = null;
			try {
				//ftpClient = new FTPHTTPClient("proxyhost", 8080, "proxyusername", "proxypassword");
				ftpClient = new FTPHTTPClient(paramProxyHost, Integer.parseInt(paramProxyPort), paramProxyUsername, paramProxyPassword);
				ftpClient.setConnectTimeout(5000);
				// connect to the FTP server
				logMessage("... connecting to the FTP server " + paramFtpServer);
				// logMessage("... username " + paramFtpUser + ", password:"+ paramFtpPassword);

				ftpClient.connect(paramFtpServer, 21);
				logMessage("... connected");
				ftpClient.login(paramFtpUser, paramFtpPassword);

				ftpClient.setDataTimeout(5000);

				// set FTP mode
				ftpClient.setFileType(FTP.BINARY_FILE_TYPE);
				ftpClient.enterLocalPassiveMode();

				// write the ZIP file to the FTP server
				logMessage("... sending file to the FTP");
				logMessage("... uploading: " + zipFileName);
				fis = new FileInputStream(zipFile);
				String remoteName = paramFtpFolder + "/" + zipFileName;
				if (!ftpClient.storeFile(remoteName, fis)) {
					throw new Exception(MessageFormat.format(
							"FTP error during storage of file. Server: {0}. User: {1}. Password: {2}. Error code: {3}",
							paramFtpServer, paramFtpUser, paramFtpPassword, ftpClient.getReplyCode()));
				}

				// exit the loop
				break;

			} catch (IOException e) {
				logStatus("Waiting to retry after Internet error");
				logError("Waiting for 5 seconds before retrying after Internet error");
				logMessage("... waiting for 5 seconds before retrying after Internet error");
				retryCount++;
				Thread.sleep(5000);
				logStatus("Running"); 
				if (retryCount == Integer.parseInt(paramFTPRetryCount)) {
					logMessage(
							"Files where not uploaded to the FTP, please upload the files manully and they can be found under FTP folder.");
					logError("FTP server has not responded after many retries.");

					// throw new Exception("FTP server has not responded after many retries");
				}

			} finally {
				// close the file input stream
				if (fis != null) {
					fis.close();
				}
				// disconnect from the FTP
				if (ftpClient != null) {
					ftpClient.disconnect();
				}
			}
		}

	}


	

}

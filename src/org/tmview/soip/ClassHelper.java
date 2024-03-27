package org.tmview.soip;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeConstants;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

public class ClassHelper {
	final static String OLD_FORMAT = "EEE MMM dd HH:mm:ss zzz yyyy";
	final static String NEW_FORMAT = "dd/MM/yyyy";
	
	final static String OLD_FORMAT1 = "yyyy-MM-dd HH:mm:ss";
	final static String NEW_FORMAT1 = "yyyy-MM-dd";

	public static Date ConvertStringToDate1(String value){
		
	
		Date date = null;
		Date finalDate = null;
		SimpleDateFormat old_formatter = new SimpleDateFormat(OLD_FORMAT1, Locale.ENGLISH);
		SimpleDateFormat new_formatter = new SimpleDateFormat(NEW_FORMAT1, Locale.ENGLISH);
		
		try {
			date = old_formatter.parse(value);			
			String d = new_formatter.format(date);
			
			finalDate = new_formatter.parse(d);
			new_formatter.format(finalDate);
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		return finalDate;
	}
	
	public static Date ConvertStringToDate(String value){
		
		Date date = null;
		Date finalDate = null;
		SimpleDateFormat old_formatter = new SimpleDateFormat(OLD_FORMAT, Locale.ENGLISH);
		SimpleDateFormat new_formatter = new SimpleDateFormat(NEW_FORMAT, Locale.ENGLISH);
		
		try {
			date = old_formatter.parse(value);			
			String d = new_formatter.format(date);
			
			finalDate = new_formatter.parse(d);
			new_formatter.format(finalDate);
			
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		return finalDate;
	}
	
	public static XMLGregorianCalendar ConvertDateToXMLGregorianCalendar(Date date) throws DatatypeConfigurationException{
		//DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		GregorianCalendar c = new GregorianCalendar();
		c.setTime(date);
		XMLGregorianCalendar xmldate2 = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
		
		return xmldate2;
	}
	
	
	public static Date createDate(String strDate) throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date dp;
		try {
			dp = sdf.parse(strDate);
			return dp;
		}
		catch(ParseException e) {
			throw new Exception("");
		}
	}
	
	public static XMLGregorianCalendar toXMLGregorianCalendar(Date date)
			throws DatatypeConfigurationException {
		GregorianCalendar gregorianCalendar = new GregorianCalendar();
		gregorianCalendar.setTime(date);

		XMLGregorianCalendar xmlGregorianCalendar = DatatypeFactory.newInstance().newXMLGregorianCalendar();
		
		xmlGregorianCalendar.setYear(gregorianCalendar.get(Calendar.YEAR));
		xmlGregorianCalendar.setMonth(gregorianCalendar.get(Calendar.MONTH) + 1);
		xmlGregorianCalendar.setDay(gregorianCalendar.get(Calendar.DAY_OF_MONTH));

		// the hour/minute/second/millis is set to 0 to prevent error generating XML
		xmlGregorianCalendar.setHour(0);
		xmlGregorianCalendar.setMinute(0);
		xmlGregorianCalendar.setSecond(0);
		xmlGregorianCalendar.setMillisecond(0);
		// the timezone is set to "undefined" to prevent a final "Z" from being added to the dates in the XML 
		xmlGregorianCalendar.setTimezone(DatatypeConstants.FIELD_UNDEFINED);

		return xmlGregorianCalendar;
	}

	public static Date toDate(XMLGregorianCalendar calendar) {
		if (calendar == null) {
			return null;
		}
		return calendar.toGregorianCalendar().getTime();
	}

	public static String MapTrademarkRecords(String actionTypeCode, String userdocTypeCode)
    {
		/*
		TM Assignement (preth.nositel)	TM Assignement (prethoden nositel)	403	005
		TM Assignment	TM Assignment	401	029
		TM Assignment	TM Assignment	401	033
		TM Assignment	TM Assignment	401	031
		TM Assignment	TM Assignment	401	009
		TM Assignment	TM Assignment	401	005
		
		
		TM Change of name or address	TM Change of name or address	167	029
		TM Change of name or address	TM Change of name or address	167	033
		
		TM Merger	TM Merger	357	029
		TM Limitation in classes	TM Limitation in classes	349	037
		TM Cancellation of licence	TM Cancellation of licence	406	017
		TM Recording of licence	TM Recording of licence	353	013
		TM Merger	TM Merger	357	033
		TM Renewal of licence	TM Renewal of licence	351	021
		
		TM recording of licence(licencor)	TM Recording of licenc	1275	013
		
		TM Merger	TM Merger	357	009
		
		TM Change of name or address	TM Change of name or address	167	038
		
		Acceptance	TM Invalidation	256	053
		TM Renewal of licence	TM Renewal of licence	351	013
		TM Change of name or address	TM Change of name or address	167	031
		TM Change of name or address	TM Change of name or address	167	005
		TM Change of name or address	TM Change of name or address	167	009
		Acceptance	TM Termination	306	055
		TM Limitation in classes	TM Limitation in classes	349	035
		*/
        String map = "";
        if (userdocTypeCode.trim().equals("005") || userdocTypeCode.trim().equals("009") || userdocTypeCode.trim().equals("029") || userdocTypeCode.trim().equals("031") || userdocTypeCode.trim().equals("033"))
        {
            map = "Trademark assignment";
        }
        else if (userdocTypeCode.trim().equals("1430"))
        {
            map = "Trademark assignment";
        }
        else if (userdocTypeCode.trim().equals("1429"))
        {
            map = "Licence to use";
        }
        else if (userdocTypeCode.trim().equals("3608") && actionTypeCode.trim().equals("4191"))
        {
            map = "Cancellation of licence";
        }
        else if (userdocTypeCode.trim().equals("5111") && actionTypeCode.trim().equals("4200"))
        {
            map = "Assignment from merger";
        }
        else if (userdocTypeCode.trim().equals("1920"))
        {
            map = "Cancellation";
        }
        else if (userdocTypeCode.trim().equals("1434"))
        {
            if (actionTypeCode.trim().equals("4324"))
                map = "Trademark's goods and services specification";
            else
                map = "Correction trademark's goods and services";
        }
        else if (userdocTypeCode.trim().equals("3849"))
        {
            map = "Trademarkd pledge";
        }
        else if (userdocTypeCode.trim().equals("1428"))
        {
            if (actionTypeCode.trim().equals("4017"))
                map = "Correction of the nationality of owner";
            else if (actionTypeCode.trim().equals("4193"))
                map = "Owner name amendements of corrections";
            else if (actionTypeCode.trim().equals("4192"))
                map = "Owner's address amendements";
            else 
                map = "Owner's name and address change";

            //if (actionTypeCode.trim().equals("4189"))
        }
        else
        {
            map = "UserdoctTypeCode=" + userdocTypeCode;
        }


        return map;
    }

}

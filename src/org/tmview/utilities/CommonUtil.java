package org.tmview.utilities;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.renderable.ParameterBlock;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.imageio.ImageIO;
import javax.media.jai.JAI;
import javax.media.jai.RenderedOp;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeConstants;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.commons.io.FileUtils;

import com.sun.media.jai.codec.ByteArraySeekableStream;
import com.sun.media.jai.codec.TIFFDecodeParam;

public final class CommonUtil {

	/*
	 * ***************************************** auxiliary methods
	 * *****************************************
	 */

	public static XMLGregorianCalendar toXMLGregorianCalendar(Date date) throws DatatypeConfigurationException {
		GregorianCalendar gregorianCalendar = new GregorianCalendar();
		gregorianCalendar.setTime(date);

		XMLGregorianCalendar xmlGregorianCalendar = DatatypeFactory.newInstance().newXMLGregorianCalendar();

		xmlGregorianCalendar.setYear(gregorianCalendar.get(Calendar.YEAR));
		xmlGregorianCalendar.setMonth(gregorianCalendar.get(Calendar.MONTH) + 1);
		xmlGregorianCalendar.setDay(gregorianCalendar.get(Calendar.DAY_OF_MONTH));

		// the hour/minute/second/millis is set to 0 to prevent error generating
		// XML
		xmlGregorianCalendar.setHour(0);
		xmlGregorianCalendar.setMinute(0);
		xmlGregorianCalendar.setSecond(0);
		xmlGregorianCalendar.setMillisecond(0);
		// the timezone is set to "undefined" to prevent a final "Z" from being
		// added to the dates in the XML
		xmlGregorianCalendar.setTimezone(DatatypeConstants.FIELD_UNDEFINED);

		return xmlGregorianCalendar;
	}

	public static Date toDate(XMLGregorianCalendar calendar) {
		if (calendar == null) {
			return null;
		}
		return calendar.toGregorianCalendar().getTime();
	}

	
	/*
	 * ********************************************************************
	 * ********** tif2jpg
	 * ********************************************************************
	 */

	public static byte[] tif2jpg(byte[] tifImageBytes) throws IOException {

		// read image from TIF bytes
		TIFFDecodeParam decodeParam = new TIFFDecodeParam();
		// decodeParam.setDecodePaletteAsShorts(true);
		ParameterBlock params = new ParameterBlock();
		params.add(new ByteArraySeekableStream(tifImageBytes));
		RenderedOp image1 = JAI.create("tiff", params);
		BufferedImage img = image1.getAsBufferedImage();

		// write image to JPG bytes
		ByteArrayOutputStream os = new ByteArrayOutputStream();
		ImageIO.write(img, "jpg", os);
		byte[] jpgImageBytes = os.toByteArray();
		os.close();

		return jpgImageBytes;
	}

	/*
	 * ********************************************************************
	 * ********** image2jpg
	 * ********************************************************************
	 */

	public static byte[] image2jpg(byte[] imageBytes) throws IOException {

		// create byte[] input and output streams
		ByteArrayInputStream bais = new ByteArrayInputStream(imageBytes);
		ByteArrayOutputStream baos = new ByteArrayOutputStream();

		// read the file to a BufferedImage
		BufferedImage image = ImageIO.read(bais);

		// write the image as a JPG
		ImageIO.write(image, "jpg", baos);

		return baos.toByteArray();

	}
	
	public static byte[] image2jpg_r(byte[] imageBytes, int preferredImageSize) throws IOException {

		// create byte[] input and output streams
		ByteArrayInputStream bais = new ByteArrayInputStream(imageBytes);
		ByteArrayOutputStream baos = new ByteArrayOutputStream();

		// read the file to a BufferedImage
		BufferedImage sourceImage = ImageIO.read(bais);

		
		// transform preferred image into a an image of (300x300 pixels)
		int width = sourceImage.getWidth();
		int height = sourceImage.getHeight();
		
		
		
		if (width > height) {
			int ratio = preferredImageSize * height / width;
			BufferedImage img = new BufferedImage(preferredImageSize, ratio, BufferedImage.TYPE_INT_RGB);
			Image scaledImage = sourceImage.getScaledInstance(preferredImageSize, ratio, Image.SCALE_SMOOTH);
			img.createGraphics().drawImage(scaledImage, 0, 0, null);
			ImageIO.write(img, "jpg", baos);
		} else {
			int ratio = preferredImageSize * width / height;
			BufferedImage img = new BufferedImage(ratio, preferredImageSize, BufferedImage.TYPE_INT_RGB);
			Image scaledImage = sourceImage.getScaledInstance(ratio, preferredImageSize, Image.SCALE_SMOOTH);
			img.createGraphics().drawImage(scaledImage, 0, 0, null);
			ImageIO.write(img, "jpg", baos);
		}
		
		
		// write the image as a JPG
		//ImageIO.write(sourceImage, "jpg", baos);

		return baos.toByteArray();

	}


	/*
	 * ********************************************************************
	 * ********** image2thumbnail
	 * ********************************************************************
	 */

	public static void image2thumbnail(String imageFileName, String thumbnailFileName) throws IOException {

		// assure all paths exist
		String allPaths = new File(thumbnailFileName).getParent();
		new File(allPaths).mkdirs();

		// read JPG image file
		FileInputStream is = new FileInputStream(imageFileName);
		BufferedImage sourceImage = ImageIO.read(is);

		// transform preferred image into a thumbnail (100x100 pixels)
		int width = sourceImage.getWidth();
		int height = sourceImage.getHeight();

		if (width > height) {
			int ratio = 100 * height / width;
			BufferedImage img = new BufferedImage(100, ratio, BufferedImage.TYPE_INT_RGB);
			Image scaledImage = sourceImage.getScaledInstance(100, ratio, Image.SCALE_SMOOTH);
			img.createGraphics().drawImage(scaledImage, 0, 0, null);
			ImageIO.write(img, "jpg", new File(thumbnailFileName));
		} else {
			int ratio = 100 * width / height;
			BufferedImage img = new BufferedImage(ratio, 100, BufferedImage.TYPE_INT_RGB);
			Image scaledImage = sourceImage.getScaledInstance(ratio, 100, Image.SCALE_SMOOTH);
			img.createGraphics().drawImage(scaledImage, 0, 0, null);
			ImageIO.write(img, "jpg", new File(thumbnailFileName));
		}
	}

	
	/*
	 * Save image to the disc
	 */

	public static void saveImageToLocalDisc(byte[] imageBytes, String path) throws IOException {
		try {
			FileOutputStream fileOuputStream = null;
			fileOuputStream = new FileOutputStream(path);
			fileOuputStream.write(imageBytes);
			fileOuputStream.close();
			fileOuputStream.flush();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getStackTrace());
		}

	}

	/*
	 * Create empty xml
	 */
	public static void createEmptyXml(String message, String path) throws IOException {
		try {
			File file = new File(path);
			  
			//Create the file
			if (file.createNewFile()){
				System.out.println("File is created!");
			}else{
				System.out.println("File already exists.");
			}
			 
			//Write Content
			FileWriter writer = new FileWriter(file);
			writer.write(message);
			writer.close();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getStackTrace());
		}
	}
	// build the S3 �subfolder� as the year, the first three digits in the
	// document number, and the next three digits.
	// Its only purpose is to avoid many resources to be located in the same S3
	// folder
	public static String buildST13Subfolder(String st13) {
		// the �(extendedST13code)� is the extended ST13 code contained in
		// column MARK.ST13
		// (including the ST3 IP Office code and the actual ST13). The structure
		// of this code is:
		// 2 characters for the ST3 IP Office code (this is not part of the
		// standard ST13).
		// 15 digits for the ST13 itself:
		// - 2 digits for the type of IP right, using 50 = trademark.
		// - 4 digits for the year
		// - 9 digits for the serial number

		return st13.substring(4, 8) + "/" + st13.substring(8, 11) + "/" + st13.substring(11, 14);
	}

	
	/*
	 * Move Files to Destination
	 */
	
	public static void moveFiles(File srcFile, File destFile, boolean overwriteDestFile) throws IOException{
		try {
			if (destFile.exists()) {
				if(overwriteDestFile){
				   FileUtils.deleteQuietly(destFile);
				   
				   FileUtils.moveFile(srcFile, destFile);
				}
				else
				{
				   throw new IOException("Destination '" + destFile + "' already exists, overriding set to false.");
				}
			}else {
				FileUtils.moveFile(srcFile, destFile);
			}
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	
}

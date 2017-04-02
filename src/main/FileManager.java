package main;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import render.Converter;

public class FileManager {

	String text = null;
	String fileLocation = null;
	
	String saveLocation = System.getProperty("user.home");
	Converter converter = new Converter();
	
	public FileManager(String fileLocation) {
		this.fileLocation = fileLocation;
	}
	
	public String getText() {
		return text;
	}
	
	public boolean checkFile() {
		File file = new File(System.getProperty("user.home") + fileLocation);
		if (file.exists()) {
			return true;
		}
		return false;
	}
	
	final protected static char[] hexArray = "0123456789ABCDEF".toCharArray();
	public static String bytesToHex(byte[] bytes) {
	    char[] hexChars = new char[bytes.length * 2];
	    for ( int j = 0; j < bytes.length; j++ ) {
	        int v = bytes[j] & 0xFF;
	        hexChars[j * 2] = hexArray[v >>> 4];
	        hexChars[j * 2 + 1] = hexArray[v & 0x0F];
	    }
	    return new String(hexChars);
	}
	
	public void loadFile() {
		File file = new File(System.getProperty("user.home") + fileLocation);
		// I found how to read files in binary on: http://stackoverflow.com/questions/31600608/read-any-file-as-a-binary-string
		byte[] bytes = new byte[(int)file.length()];
		DataInputStream dataInputStream = null;
		try {
			dataInputStream = new DataInputStream(new BufferedInputStream(new FileInputStream(System.getProperty("user.home") + fileLocation)));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			dataInputStream.readFully(bytes);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}           
		try {
			dataInputStream.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		text = bytesToHex(bytes);
	}
	
	public void saveFile(String text) throws IOException {
		OutputStream os = null;
		try {
	        //Specify the file name and path here
			File file = new File(System.getProperty("user.home") + fileLocation);
			os = new FileOutputStream(System.getProperty("user.home") + fileLocation);
			os = new DataOutputStream(os);
			
			/* This logic will make sure that the file 
			 * gets created if it is not present at the
			 * specified location*/
			if (!file.exists()) {
				// Make sure to later to add a request and asking procedure to make sure that you make a new file. Ex. DO YOU WANT TO MAKE A NEW FILE? YES NO
				file.createNewFile();
			}
			for(int i = 0; i < text.length();i+=2) {
				String j = Integer.toString((Integer.valueOf(text.substring(i, i+2), 16)));
				byte value = Byte.valueOf(j);
				System.out.println(value);
				os.write(value);
			}
			System.out.println("File written Successfully");
		} catch (IOException ioe) {
		   ioe.printStackTrace();
		} finally { 
			try{
				if(os!=null)
					os.close();
			} catch(Exception ex) {
				System.out.println("Error in closing the OutputSteam"+ex);
		    }
		}
	}
	
}

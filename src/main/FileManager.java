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
	
	public static String bTH(byte[] bytes) {
		String hex = "";
		for(int i = 0; i < bytes.length; i++) {
			String intHex = Integer.toString(bytes[i],16);
			if(hexStr.length() != 2) {
				intHex = "0" + hexStr;
			}
			hex += intHex;
		}
		System.out.println(hex);
		return hex.toUpperCase();
	}
	
	public void loadFile() {
		File file = new File(System.getProperty("user.home") + fileLocation);
		// I found how to read files in binary on: http://stackoverflow.com/questions/31600608/read-any-file-as-a-binary-string
		byte[] bytes = new byte[(int)file.length()];
		DataInputStream dIS = null;
		try {
			dIS = new DataInputStream(new BufferedInputStream(new FileInputStream(System.getProperty("user.home") + fileLocation)));
			dIS.readFully(bytes);
			dIS.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		text = bTH(bytes);
	}
	
	public void saveFile(String text) throws IOException {
		OutputStream os = null;
		try {
			//Got the idea for it from: http://stackoverflow.com/questions/1388383/java-write-decimal-hex-to-a-file-and-not-string
			File file = new File(System.getProperty("user.home") + fileLocation);
			os = new FileOutputStream(System.getProperty("user.home") + fileLocation);
			os = new DataOutputStream(os);
			
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
			System.out.println("File saved");
			if(os != null) {
				os.close();
			}
		} catch (IOException ioe) {
		   ioe.printStackTrace();
		}
	}
	
}

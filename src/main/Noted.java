package main;

import java.io.IOException;

import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.GL11;

import render.FText;
import render.FileSearcher;
import render.WindowRenderer;
import user.FKB;

public class Noted {
	
	public static int dWidth = 0;
	public static int dHeight = 0;
	static String words = "";
	public static FileManager fm;
	
	static int caretPosition = 0;
	
	public static void choosingWindow() {
		FileSearcher fs = new FileSearcher();
		/*WindowRenderer wr = new WindowRenderer();
		wr.createWindow("Choose Document");
		wr.prepare();*/
		// M m = new M();
		String fileLocation = fs.run();
		if((fileLocation.substring((fileLocation.length() - 3),fileLocation.length())).equals("CNF")) {
			words = "6A6B";
			fileLocation = fileLocation.substring(0,(fileLocation.length() - 3));
			System.out.println("Creating a new File: " + fileLocation);
			fm = new FileManager(fileLocation);
		} else {
			fm = new FileManager(fileLocation);
			fm.loadFile();
			if(fm.getText() == null) {
				words = "6A6B";
			} else {
				words = fm.getText();
			}
		}
		caretPosition = words.length() - 2;
	}
	
	static String letterIn;
	static int blink = 0;
	
	public static void main(String[] args) {
		choosingWindow();
		WindowRenderer wm = new WindowRenderer();
		wm.createWindow("Noted");
		wm.prepare();
		dWidth = Display.getWidth();
		dHeight = Display.getHeight();
		FKB kb = new FKB();
		FText a = new FText(50, 10, words, 21);
		while(!Display.isCloseRequested()) {
			GL11.glClear(GL11.GL_COLOR_BUFFER_BIT);
			letterIn = kb.checkKeys();
			if(letterIn.equals("DELETE")) {
				if(caretPosition >= 4) {
					words = words.substring(0, caretPosition - 2) + words.substring(caretPosition, words.length());
					caretPosition -= 2;
				}
				blink = 0;
			} else if(letterIn.equals("LEFT")) {
				if(caretPosition >= 4) {
					caretPosition -= 2;
				}
				blink = 0;
			} else if(letterIn.equals("RIGHT")) {
				if(caretPosition <= words.length() - 4) {
					caretPosition += 2;
				}
				blink = 0;
			} else {
				words = words.substring(0, caretPosition) + letterIn + words.substring(caretPosition,words.length());
				caretPosition += letterIn.length();
			}
			if(blink >= 0 && blink <= 7) {
				a.draw((words.substring(0, caretPosition) + "62" + words.substring(caretPosition,words.length())));
			} else {
				a.draw(words);
			}
			blink++;
			if(blink == 15) {
				blink = 0;
			}
			wm.update();
		}
		try {
			fm.saveFile(words);
		} catch (IOException e) {
			e.printStackTrace();
		}
		wm.destroy();
		words = null;
		// a.destroy();
		System.exit(0);
	}
	
}
package render;

import java.awt.Font;
import java.util.ArrayList;
import java.util.List;

import org.lwjgl.opengl.Display;
import org.newdawn.slick.Color;
import org.newdawn.slick.TrueTypeFont;

public class FText {
	
	int x;
	int y;
	int fontSize;
	TrueTypeFont font;
	String fontType = "Courier";
	int numLine = 0;
	int fontStyle = 0;
	Converter converter;
	int dy = 0; 
	
	public FText(int x, int y, String input, int fontSize ) {
		converter = new Converter();
		this.x = x;
		this.y = y;
		this.fontSize = fontSize;
		this.fontStyle = Font.PLAIN;
		Font awtFont = new Font(this.fontType, this.fontStyle, this.fontSize); //name, style (PLAIN, BOLD, or ITALIC), size
		font = new TrueTypeFont(awtFont, true); //base Font, anti-aliasing true/false
	}
	
	public void setUp() {}
	
	public void destroy() {
	}
	 
	public void changeFontType(int fontStyle) {
		this.fontStyle = fontStyle;
		Font awtFont = new Font(fontType, fontStyle, fontSize);
		font = new TrueTypeFont(awtFont,true);
	}
	
	public void changeFont(String fontName) {
		fontType = fontName;
		Font awtFont = new Font(fontType, fontStyle, fontSize);
		font = new TrueTypeFont(awtFont,true);
	}
	
	public void changeFontSize(int fontSize) {
		this.fontSize = fontSize;
		Font awtFont = new Font(fontType, fontStyle, fontSize);
		font = new TrueTypeFont(awtFont,true);
	}
	
	public void draw(String input) {
		boolean goNextLine = false;
		int maxWidth = Display.getWidth() - 50;
		String iq = null;
		int cP = 0;
		x = 50;
		y = 10 + dy;
		List<String> words = new ArrayList<String>();
		for(int i = 2; i < input.length() + 1; i += 2) {
			words.add(input.substring(i - 2, i));
		}
		for (String word:words) {
			cP++;
			if(!word.startsWith("6")) {
				if(x + font.getWidth(converter.convertToLetters(word)) > maxWidth && !word.equals("5F")) {
					x = 50;
					y += font.getHeight();
				}
				if(!word.equals("5F") && goNextLine == false) {
					iq = converter.convertToLetters(word);
					for(int i = cP; i < words.size(); i++) {
						if(words.get(i).equals("5F") || (words.get(i).startsWith("6") && !words.get(i).equals("62"))) {
							if(font.getWidth(iq) + x > maxWidth) {
								y += font.getHeight();
								x = 50;
							}
							goNextLine = true;
							break;
						} else {
							if(!words.get(i).equals("62")) {
								iq += converter.convertToLetters(words.get(i));
							}
						}
					}
				} 
				if(word.equals("5F")){
					goNextLine = false;
				}
				font.drawString(x, y, converter.convertToLetters(word), Color.black);
				x += font.getWidth(converter.convertToLetters(word));
			} else {
				if(word.equals("60")) {
					x = 50;
					y += font.getHeight();
				} else if(word.equals("61")) {
					x += font.getWidth("    ");
				} else if(word.equals("62")) {
					if(y < 0) {
						dy += font.getHeight() * 2;
					}
					if(y > Display.getHeight() - font.getHeight()) {
						dy -= font.getHeight() * 2;
					}
					font.drawString(x-6, y - 2, "|", Color.black);
					font.drawString(x-6, y + 2, "|", Color.black);
				} else if(word.equals("66")) {
					changeFontType(Font.PLAIN);
				}
			}
		}
		words.clear();
		changeFontType(Font.PLAIN);
		words = null;
	}
	
}

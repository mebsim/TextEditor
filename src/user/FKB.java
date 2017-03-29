package user;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.lwjgl.input.Keyboard;

import render.Converter;

public class FKB {
	
	String clipBoard = "";
	boolean adown = false;
	boolean areset = false;
	boolean bdown = false;
	boolean breset = false;
	boolean cdown = false;
	boolean creset = false;
	boolean ddown = false;
	boolean dreset = false;
	boolean edown = false;
	boolean ereset = false;
	boolean fdown = false;
	boolean freset = false;
	boolean gdown = false;
	boolean greset = false;
	boolean hdown = false;
	boolean hreset = false;
	boolean idown = false;
	boolean ireset = false;
	boolean jdown = false;
	boolean jreset = false;
	boolean kdown = false;
	boolean kreset = false;
	boolean ldown = false;
	boolean lreset = false;
	boolean mdown = false;
	boolean mreset = false;
	boolean ndown = false;
	boolean nreset = false;
	boolean odown = false;
	boolean oreset = false;
	boolean pdown = false;
	boolean preset = false;
	boolean qdown = false;
	boolean qreset = false;
	boolean rdown = false;
	boolean rreset = false;
	boolean sdown = false;
	boolean sreset = false;
	boolean tdown = false;
	boolean treset = false;
	boolean udown = false;
	boolean ureset = false;
	boolean vdown = false;
	boolean vreset = false;
	boolean wdown = false;
	boolean wreset = false;
	boolean xdown = false;
	boolean xreset = false;
	boolean ydown = false;
	boolean yreset = false;
	boolean zdown = false;
	boolean zreset = false;
	boolean retdown = false;
	boolean retreset = false;
	boolean deldown = false;
	boolean delreset = false;
	boolean spadown = false;
	boolean spareset = false;
	boolean perdown = false;
	boolean perreset = false;
	boolean comdown = false;
	boolean comreset = false;
	boolean onedown = false;
	boolean onereset = false;
	boolean twodown = false;
	boolean tworeset = false;
	boolean thrdown = false;
	boolean thrreset = false;
	boolean foudown = false;
	boolean foureset = false;
	boolean fivdown = false;
	boolean fivreset = false;
	boolean sixdown = false;
	boolean sixreset = false;
	boolean sevdown = false;
	boolean sevreset = false;
	boolean eigdown = false;
	boolean eigreset = false;
	boolean nindown = false;
	boolean ninreset = false;
	boolean zerdown = false;
	boolean zerreset = false;
	boolean sapdown = false;
	boolean sapreset = false;
	boolean fsldown = false;
	boolean fslreset = false;
	boolean bsldown = false;
	boolean bslreset = false;
	boolean rbrdown = false;
	boolean rbrreset = false;
	boolean lbrdown = false;
	boolean lbrreset = false;
	boolean tildown = false;
	boolean tilreset = false;
	boolean dasdown = false;
	boolean dasreset = false;
	boolean equdown = false;
	boolean equreset = false;
	boolean coldown = false;
	boolean colreset = false;
	boolean tabdown = false;
	boolean tabreset = false;
	boolean lefdown = false;
	boolean lefreset = false;
	boolean rigdown = false;
	boolean rigreset = false;
	
	int flash = 0;
	int lefhold = 0;
	int righold = 0;
	int delhold = 0;
	
	boolean save = false;
	
	Toolkit toolkit;
	Clipboard actualClipboard;
	Converter converter;

	public FKB() {
		converter = new Converter();
		toolkit = Toolkit.getDefaultToolkit();
		actualClipboard = toolkit.getSystemClipboard();
		try {
			clipBoard = (String) actualClipboard.getData(DataFlavor.stringFlavor);
		} catch (UnsupportedFlavorException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public String checkKeys() {
		if(Keyboard.isKeyDown(Keyboard.KEY_A)) {
			if(areset == false) {
				adown = true;
			}
		} else {
			areset = false;
			adown = false;
		}
		if(adown) {
			areset = true;
			adown = false;
			if(Keyboard.isKeyDown(Keyboard.KEY_LSHIFT) || Keyboard.isKeyDown(Keyboard.KEY_RSHIFT) || toolkit.getLockingKeyState(KeyEvent.VK_CAPS_LOCK)) {
				return converter.convertToNumbers("A");
			} else {
				return converter.convertToNumbers("a");
			}
		}
		if(Keyboard.isKeyDown(Keyboard.KEY_B)) {
			if(breset == false) {
				bdown = true;
			}
		} else {
			breset = false;
			bdown = false;
		}
		if(bdown) {
			breset = true;
			bdown = false;
			if(Keyboard.isKeyDown(Keyboard.KEY_LSHIFT) || Keyboard.isKeyDown(Keyboard.KEY_RSHIFT) || toolkit.getLockingKeyState(KeyEvent.VK_CAPS_LOCK)) {
				return converter.convertToNumbers("B");
			} else {
				return converter.convertToNumbers("b");
			}
		}
		if(Keyboard.isKeyDown(Keyboard.KEY_C)) {
			if(creset == false) {
				cdown = true;
			}
		} else {
			creset = false;
			cdown = false;
		}
		if(cdown) {
			/* if(Keyboard.isKeyDown(Keyboard.KEY_LMETA) || Keyboard.isKeyDown(Keyboard.KEY_RMETA)) {
				clipBoard = words.substring(leftSelect, rightSelect);
				StringSelection selection = new StringSelection(clipBoard);
				actualClipboard.setContents(selection, null);
				System.out.println(clipBoard);
			} else { */
			//}
			creset = true;
			cdown = false;
			if(Keyboard.isKeyDown(Keyboard.KEY_LSHIFT) || Keyboard.isKeyDown(Keyboard.KEY_RSHIFT) || toolkit.getLockingKeyState(KeyEvent.VK_CAPS_LOCK)) {
				return converter.convertToNumbers("C");
			} else {
				return converter.convertToNumbers("c");
			}
		}
		if(Keyboard.isKeyDown(Keyboard.KEY_D)) {
			if(dreset == false) {
				ddown = true;
			}
		} else {
			dreset = false;
			ddown = false;
		}
		if(ddown) {
			dreset = true;
			ddown = false;
			if(Keyboard.isKeyDown(Keyboard.KEY_LSHIFT) || Keyboard.isKeyDown(Keyboard.KEY_RSHIFT) || toolkit.getLockingKeyState(KeyEvent.VK_CAPS_LOCK)) {
				return converter.convertToNumbers("D");
			} else {
				return converter.convertToNumbers("d");
			}
		}
		if(Keyboard.isKeyDown(Keyboard.KEY_E)) {
			if(ereset == false) {
				edown = true;
			}
		} else {
			ereset = false;
			edown = false;
		}
		if(edown) {
			ereset = true;
			edown = false;
			if(Keyboard.isKeyDown(Keyboard.KEY_LSHIFT) || Keyboard.isKeyDown(Keyboard.KEY_RSHIFT) || toolkit.getLockingKeyState(KeyEvent.VK_CAPS_LOCK)) {
				return converter.convertToNumbers("E");
			} else {
				return converter.convertToNumbers("e");
			}
		}
		if(Keyboard.isKeyDown(Keyboard.KEY_F)) {
			if(freset == false) {
				fdown = true;
			}
		} else {
			freset = false;
			fdown = false;
		}
		if(fdown) {
			freset = true;
			fdown = false;
			if(Keyboard.isKeyDown(Keyboard.KEY_LSHIFT) || Keyboard.isKeyDown(Keyboard.KEY_RSHIFT) || toolkit.getLockingKeyState(KeyEvent.VK_CAPS_LOCK)) {
				return converter.convertToNumbers("F");
			} else {
				return converter.convertToNumbers("f");
			}
		}
		if(Keyboard.isKeyDown(Keyboard.KEY_G)) {
			if(greset == false) {
				gdown = true;
			}
		} else {
			greset = false;
			gdown = false;
		}
		if(gdown) {
			greset = true;
			gdown = false;
			if(Keyboard.isKeyDown(Keyboard.KEY_LSHIFT) || Keyboard.isKeyDown(Keyboard.KEY_RSHIFT) || toolkit.getLockingKeyState(KeyEvent.VK_CAPS_LOCK)) {
				return converter.convertToNumbers("G");
			} else {
				return converter.convertToNumbers("g");
			}
		}
		if(Keyboard.isKeyDown(Keyboard.KEY_H)) {
			if(hreset == false) {
				hdown = true;
			}
		} else {
			hreset = false;
			hdown = false;
		}
		if(hdown) {
			hreset = true;
			hdown = false;
			if(Keyboard.isKeyDown(Keyboard.KEY_LSHIFT) || Keyboard.isKeyDown(Keyboard.KEY_RSHIFT) || toolkit.getLockingKeyState(KeyEvent.VK_CAPS_LOCK)) {
				return converter.convertToNumbers("H");
			} else {
				return converter.convertToNumbers("h");
			}
		}
		if(Keyboard.isKeyDown(Keyboard.KEY_I)) {
			if(ireset == false) {
				idown = true;
			}
		} else {
			ireset = false;
			idown = false;
		}
		if(idown) {
			ireset = true;
			idown = false;
			if(Keyboard.isKeyDown(Keyboard.KEY_LSHIFT) || Keyboard.isKeyDown(Keyboard.KEY_RSHIFT) || toolkit.getLockingKeyState(KeyEvent.VK_CAPS_LOCK)) {
				return converter.convertToNumbers("I");
			} else {
				return converter.convertToNumbers("i");
			}
		}
		if(Keyboard.isKeyDown(Keyboard.KEY_J)) {
			if(jreset == false) {
				jdown = true;
			}
		} else {
			jreset = false;
			jdown = false;
		}
		if(jdown) {
			jreset = true;
			jdown = false;
			if(Keyboard.isKeyDown(Keyboard.KEY_LSHIFT) || Keyboard.isKeyDown(Keyboard.KEY_RSHIFT) || toolkit.getLockingKeyState(KeyEvent.VK_CAPS_LOCK)) {
				return converter.convertToNumbers("J");
			} else {
				return converter.convertToNumbers("j");
			}
		}
		if(Keyboard.isKeyDown(Keyboard.KEY_K)) {
			if(kreset == false) {
				kdown = true;
			}
		} else {
			kreset = false;
			kdown = false;
		}
		if(kdown) {
			kreset = true;
			kdown = false;
			if(Keyboard.isKeyDown(Keyboard.KEY_LSHIFT) || Keyboard.isKeyDown(Keyboard.KEY_RSHIFT) || toolkit.getLockingKeyState(KeyEvent.VK_CAPS_LOCK)) {
				return converter.convertToNumbers("K");
			} else {
				return converter.convertToNumbers("k");
			}
		}
		if(Keyboard.isKeyDown(Keyboard.KEY_L)) {
			if(lreset == false) {
				ldown = true;
			}
		} else {
			lreset = false;
			ldown = false;
		}
		if(ldown) {
			lreset = true;
			ldown = false;
			if(Keyboard.isKeyDown(Keyboard.KEY_LSHIFT) || Keyboard.isKeyDown(Keyboard.KEY_RSHIFT) || toolkit.getLockingKeyState(KeyEvent.VK_CAPS_LOCK)) {
				return converter.convertToNumbers("L");
			} else {
				return converter.convertToNumbers("l");
			}
		}
		if(Keyboard.isKeyDown(Keyboard.KEY_M)) {
			if(mreset == false) {
				mdown = true;
			}
		} else {
			mreset = false;
			mdown = false;
		}
		if(mdown) {
			mreset = true;
			mdown = false;
			if(Keyboard.isKeyDown(Keyboard.KEY_LSHIFT) || Keyboard.isKeyDown(Keyboard.KEY_RSHIFT) || toolkit.getLockingKeyState(KeyEvent.VK_CAPS_LOCK)) {
				return converter.convertToNumbers("M");
			} else {
				return converter.convertToNumbers("m");
			}
		}
		if(Keyboard.isKeyDown(Keyboard.KEY_N)) {
			if(nreset == false) {
				ndown = true;
			}
		} else {
			nreset = false;
			ndown = false;
		}
		if(ndown) {
			nreset = true;
			ndown = false;
			if(Keyboard.isKeyDown(Keyboard.KEY_LSHIFT) || Keyboard.isKeyDown(Keyboard.KEY_RSHIFT) || toolkit.getLockingKeyState(KeyEvent.VK_CAPS_LOCK)) {
				return converter.convertToNumbers("N");
			} else {
				return converter.convertToNumbers("n");
			}
		}
		if(Keyboard.isKeyDown(Keyboard.KEY_O)) {
			if(oreset == false) {
				odown = true;
			}
		} else {
			oreset = false;
			odown = false;
		}
		if(odown) {
			oreset = true;
			odown = false;
			if(Keyboard.isKeyDown(Keyboard.KEY_LSHIFT) || Keyboard.isKeyDown(Keyboard.KEY_RSHIFT) || toolkit.getLockingKeyState(KeyEvent.VK_CAPS_LOCK)) {
				return converter.convertToNumbers("O");
			} else {
				return converter.convertToNumbers("o");
			}
		}
		if(Keyboard.isKeyDown(Keyboard.KEY_P)) {
			if(preset == false) {
				pdown = true;
			}
		} else {
			preset = false;
			pdown = false;
		}
		if(pdown) {
			preset = true;
			pdown = false;
			if(Keyboard.isKeyDown(Keyboard.KEY_LSHIFT) || Keyboard.isKeyDown(Keyboard.KEY_RSHIFT) || toolkit.getLockingKeyState(KeyEvent.VK_CAPS_LOCK)) {
				return converter.convertToNumbers("P");
			} else {
				return converter.convertToNumbers("p");
			}
		}
		if(Keyboard.isKeyDown(Keyboard.KEY_Q)) {
			if(qreset == false) {
				qdown = true;
			}
		} else {
			qreset = false;
			qdown = false;
		}
		if(qdown) {
			qreset = true;
			qdown = false;
			if(Keyboard.isKeyDown(Keyboard.KEY_LSHIFT) || Keyboard.isKeyDown(Keyboard.KEY_RSHIFT) || toolkit.getLockingKeyState(KeyEvent.VK_CAPS_LOCK)) {
				return converter.convertToNumbers("Q");
			} else {
				return converter.convertToNumbers("q");
			}
		}
		if(Keyboard.isKeyDown(Keyboard.KEY_R)) {
			if(rreset == false) {
				rdown = true;
			}
		} else {
			rreset = false;
			rdown = false;
		}
		if(rdown) {
			rreset = true;
			rdown = false;
			if(Keyboard.isKeyDown(Keyboard.KEY_LSHIFT) || Keyboard.isKeyDown(Keyboard.KEY_RSHIFT) || toolkit.getLockingKeyState(KeyEvent.VK_CAPS_LOCK)) {
				return converter.convertToNumbers("R");
			} else {
				return converter.convertToNumbers("r");
			}
		}
		if(Keyboard.isKeyDown(Keyboard.KEY_S)) {
			if(sreset == false) {
				sdown = true;
			}
		} else {
			sreset = false;
			sdown = false;
		}
		if(sdown) {
			sreset = true;
			sdown = false;
			if(Keyboard.isKeyDown(Keyboard.KEY_LSHIFT) || Keyboard.isKeyDown(Keyboard.KEY_RSHIFT) || toolkit.getLockingKeyState(KeyEvent.VK_CAPS_LOCK)) {
				return converter.convertToNumbers("S");
			} else {
				return converter.convertToNumbers("s");
			}
		}
		if(Keyboard.isKeyDown(Keyboard.KEY_T)) {
			if(treset == false) {
				tdown = true;
			}
		} else {
			treset = false;
			tdown = false;
		}
		if(tdown) {
			treset = true;
			tdown = false;
			if(Keyboard.isKeyDown(Keyboard.KEY_LSHIFT) || Keyboard.isKeyDown(Keyboard.KEY_RSHIFT) || toolkit.getLockingKeyState(KeyEvent.VK_CAPS_LOCK)) {
				return converter.convertToNumbers("T");
			} else {
				return converter.convertToNumbers("t");
			}
		}
		if(Keyboard.isKeyDown(Keyboard.KEY_U)) {
			if(ureset == false) {
				udown = true;
			}
		} else {
			ureset = false;
			udown = false;
		}
		if(udown) {
			ureset = true;
			udown = false;
			if(Keyboard.isKeyDown(Keyboard.KEY_LSHIFT) || Keyboard.isKeyDown(Keyboard.KEY_RSHIFT) || toolkit.getLockingKeyState(KeyEvent.VK_CAPS_LOCK)) {
				return converter.convertToNumbers("U");
			} else {
				return converter.convertToNumbers("u");
			}
		}
		if(Keyboard.isKeyDown(Keyboard.KEY_V)) {
			if(vreset == false) {
				vdown = true;
			}
		} else {
			vreset = false;
			vdown = false;
		}
		if(vdown) {
			vreset = true;
			vdown = false;
			if(Keyboard.isKeyDown(Keyboard.KEY_LSHIFT) || Keyboard.isKeyDown(Keyboard.KEY_RSHIFT) || toolkit.getLockingKeyState(KeyEvent.VK_CAPS_LOCK)) {
				return converter.convertToNumbers("V");
			} else {
				return converter.convertToNumbers("v");
			}
		}
		if(Keyboard.isKeyDown(Keyboard.KEY_W)) {
			if(wreset == false) {
				wdown = true;
			}
		} else {
			wreset = false;
			wdown = false;
		}
		if(wdown) {
			wreset = true;
			wdown = false;
			if(Keyboard.isKeyDown(Keyboard.KEY_LSHIFT) || Keyboard.isKeyDown(Keyboard.KEY_RSHIFT) || toolkit.getLockingKeyState(KeyEvent.VK_CAPS_LOCK)) {
				return converter.convertToNumbers("W");
			} else {
				return converter.convertToNumbers("w");
			}
		}
		if(Keyboard.isKeyDown(Keyboard.KEY_X)) {
			if(xreset == false) {
				xdown = true;
			}
		} else {
			xreset = false;
			xdown = false;
		}
		if(xdown) {
			xreset = true;
			xdown = false;
			if(Keyboard.isKeyDown(Keyboard.KEY_LSHIFT) || Keyboard.isKeyDown(Keyboard.KEY_RSHIFT) || toolkit.getLockingKeyState(KeyEvent.VK_CAPS_LOCK)) {
				return converter.convertToNumbers("X");
			} else {
				return converter.convertToNumbers("x");
			}
		}
		if(Keyboard.isKeyDown(Keyboard.KEY_Y)) {
			if(yreset == false) {
				ydown = true;
			}
		} else {
			yreset = false;
			ydown = false;
		}
		if(ydown) {
			yreset = true;
			ydown = false;
			if(Keyboard.isKeyDown(Keyboard.KEY_LSHIFT) || Keyboard.isKeyDown(Keyboard.KEY_RSHIFT) || toolkit.getLockingKeyState(KeyEvent.VK_CAPS_LOCK)) {
				return converter.convertToNumbers("Y");
			} else {
				return converter.convertToNumbers("y");
			}
		}
		if(Keyboard.isKeyDown(Keyboard.KEY_Z)) {
			if(zreset == false) {
				zdown = true;
			}
		} else {
			zreset = false;
			zdown = false;
		}
		if(zdown) {
			zreset = true;
			zdown = false;
			if(Keyboard.isKeyDown(Keyboard.KEY_LSHIFT) || Keyboard.isKeyDown(Keyboard.KEY_RSHIFT) || toolkit.getLockingKeyState(KeyEvent.VK_CAPS_LOCK)) {
				return converter.convertToNumbers("Z");
			} else {
				return converter.convertToNumbers("z");
			}
		}
		if(Keyboard.isKeyDown(Keyboard.KEY_RETURN)) {
			if(retreset == false) {
				retdown = true;
			}
		} else {
			retreset = false;
			retdown = false;
		}
		if(retdown) {
			retdown = false;
			retreset = true;
			return converter.convertToNumbers("RETURN");
		}
		if(Keyboard.isKeyDown(Keyboard.KEY_BACK)) {
			if(delreset == false) {
				deldown = true;
			}
			if(delhold == 15) {
				deldown = true;
				delhold--;
			}
			if(delhold < 15) {
				delhold++;
			}
		} else {
			delreset = false;
			deldown = false;
			delhold = 0;
		}
		if(deldown) {
			/*if(words.length() > 2) {
				if((words.substring((caretPosition - 3), caretPosition)).equals("100") || words.substring((caretPosition - 3), caretPosition).equals("101")) {
					words = words.substring(0, caretPosition - 3) + words.substring(caretPosition, words.length());
					caretPosition -= 0;
				}
			}*/
			deldown = false;
			delreset = true;
			return "DELETE";
		}
		if(Keyboard.isKeyDown(Keyboard.KEY_SPACE)) {
			if(spareset == false) {
				spadown = true;
			}
		} else {
			spareset = false;
			spadown = false;
		}
		if(spadown) {
			spadown = false;
			spareset = true;
			return converter.convertToNumbers(" ");
		}
		if(Keyboard.isKeyDown(Keyboard.KEY_PERIOD)) {
			if(perreset == false) {
				perdown = true;
			}
		} else {
			perreset = false;
			perdown = false;
		}
		if(perdown) {
			perreset = true;
			perdown = false;
			if(Keyboard.isKeyDown(Keyboard.KEY_LSHIFT) || Keyboard.isKeyDown(Keyboard.KEY_RSHIFT)) {
				return converter.convertToNumbers(">");
			} else {
				return converter.convertToNumbers(".");
			}
		}
		if(Keyboard.isKeyDown(Keyboard.KEY_COMMA)) {
			if(comreset == false) {
				comdown = true;
			}
		} else {
			comreset = false;
			comdown = false;
		}
		if(comdown) {
			comreset = true;
			comdown = false;
			if(Keyboard.isKeyDown(Keyboard.KEY_LSHIFT) || Keyboard.isKeyDown(Keyboard.KEY_RSHIFT)) {
				return converter.convertToNumbers("<");
			} else {
				return converter.convertToNumbers(",");
			}
		}
		if(Keyboard.isKeyDown(Keyboard.KEY_APOSTROPHE)) {
			if(sapreset == false) {
				sapdown = true;
			}
		} else {
			sapreset = false;
			sapdown = false;
		}
		if(sapdown) {
			sapreset = true;
			sapdown = false;
			if(Keyboard.isKeyDown(Keyboard.KEY_LSHIFT) || Keyboard.isKeyDown(Keyboard.KEY_RSHIFT)) {
				return converter.convertToNumbers("\"");
			} else {
				return converter.convertToNumbers("\'");
			}
		}
		if(Keyboard.isKeyDown(Keyboard.KEY_SLASH)) {
			if(fslreset == false) {
				fsldown = true;
			}
		} else {
			fslreset = false;
			fsldown = false;
		}
		if(fsldown) {
			fslreset = true;
			fsldown = false;
			if(Keyboard.isKeyDown(Keyboard.KEY_LSHIFT) || Keyboard.isKeyDown(Keyboard.KEY_RSHIFT)) {
				return converter.convertToNumbers("?");
			} else {
				return converter.convertToNumbers("/");
			}
		}
		if(Keyboard.isKeyDown(Keyboard.KEY_BACKSLASH)) {
			if(bslreset == false) {
				bsldown = true;
			}
		} else {
			bslreset = false;
			bsldown = false;
		}
		if(bsldown) {
			bslreset = true;
			bsldown = false;
			if(Keyboard.isKeyDown(Keyboard.KEY_LSHIFT) || Keyboard.isKeyDown(Keyboard.KEY_RSHIFT)) {
				return converter.convertToNumbers("|");
			} else {
				return converter.convertToNumbers("\\");
			}
		}
		if(Keyboard.isKeyDown(Keyboard.KEY_LBRACKET)) {
			if(lbrreset == false) {
				lbrdown = true;
			}
		} else {
			lbrreset = false;
			lbrdown = false;
		}
		if(lbrdown) {
			lbrreset = true;
			lbrdown = false;
			if(Keyboard.isKeyDown(Keyboard.KEY_LSHIFT) || Keyboard.isKeyDown(Keyboard.KEY_RSHIFT)) {
				return converter.convertToNumbers("{");
			} else {
				return converter.convertToNumbers("[");
			}
		}
		if(Keyboard.isKeyDown(Keyboard.KEY_RBRACKET)) {
			if(rbrreset == false) {
				rbrdown = true;
			}
		} else {
			rbrreset = false;
			rbrdown = false;
		}
		if(rbrdown) {
			rbrreset = true;
			rbrdown = false;
			if(Keyboard.isKeyDown(Keyboard.KEY_LSHIFT) || Keyboard.isKeyDown(Keyboard.KEY_RSHIFT)) {
				return converter.convertToNumbers("}");
			} else {
				return converter.convertToNumbers("]");
			}
		}
		if(Keyboard.isKeyDown(Keyboard.KEY_GRAVE)) {
			if(tilreset == false) {
				lbrdown = true;
			}
		} else {
			tilreset = false;
			tildown = false;
		}
		if(tildown) {
			tilreset = true;
			tildown = false;
			if(Keyboard.isKeyDown(Keyboard.KEY_LSHIFT) || Keyboard.isKeyDown(Keyboard.KEY_RSHIFT)) {
				return converter.convertToNumbers("~");
			} else {
				return converter.convertToNumbers("`");
			}
		}
		if(Keyboard.isKeyDown(Keyboard.KEY_MINUS)) {
			if(dasreset == false) {
				dasdown = true;
			}
		} else {
			dasreset = false;
			dasdown = false;
		}
		if(dasdown) {
			dasreset = true;
			dasdown = false;
			if(Keyboard.isKeyDown(Keyboard.KEY_LSHIFT) || Keyboard.isKeyDown(Keyboard.KEY_RSHIFT)) {
				return converter.convertToNumbers("_");
			} else {
				return converter.convertToNumbers("-");
			}
		}
		if(Keyboard.isKeyDown(Keyboard.KEY_EQUALS)) {
			if(equreset == false) {
				equdown = true;
			}
		} else {
			equreset = false;
			equdown = false;
		}
		if(equdown) {
			equreset = true;
			equdown = false;
			if(Keyboard.isKeyDown(Keyboard.KEY_LSHIFT) || Keyboard.isKeyDown(Keyboard.KEY_RSHIFT)) {
				return converter.convertToNumbers("+");
			} else {
				return converter.convertToNumbers("=");
			}
		}
		if(Keyboard.isKeyDown(Keyboard.KEY_SEMICOLON)) {
			if(colreset == false) {
				coldown = true;
			}
		} else {
			colreset = false;
			coldown = false;
		}
		if(coldown) {
			colreset = true;
			coldown = false;
			if(Keyboard.isKeyDown(Keyboard.KEY_LSHIFT) || Keyboard.isKeyDown(Keyboard.KEY_RSHIFT)) {
				return converter.convertToNumbers(":");
			} else {
				return converter.convertToNumbers(";");
			}
		}
		if(Keyboard.isKeyDown(Keyboard.KEY_TAB)) {
			if(tabreset == false) {
				tabdown = true;
			}
		} else {
			tabreset = false;
			tabdown = false;
		}
		if(tabdown) {
			tabreset = true;
			tabdown = false;
			return converter.convertToNumbers("TAB");
		}
		if(Keyboard.isKeyDown(Keyboard.KEY_1)) {
			if(onereset == false) {
				onedown = true;
			}
		} else {
			onereset = false;
			onedown = false;
		}
		if(onedown) {
			onereset = true;
			onedown = false;
			if(Keyboard.isKeyDown(Keyboard.KEY_LSHIFT) || Keyboard.isKeyDown(Keyboard.KEY_RSHIFT)) {
				return converter.convertToNumbers("!");
			} else {
				return converter.convertToNumbers("1");
			}
		}
		if(Keyboard.isKeyDown(Keyboard.KEY_2)) {
			if(tworeset == false) {
				twodown = true;
			}
		} else {
			tworeset = false;
			twodown = false;
		}
		if(twodown) {
			tworeset = true;
			twodown = false;
			if(Keyboard.isKeyDown(Keyboard.KEY_LSHIFT) || Keyboard.isKeyDown(Keyboard.KEY_RSHIFT)) {
				return converter.convertToNumbers("@");
			} else {
				return converter.convertToNumbers("2");
			}
		}
		if(Keyboard.isKeyDown(Keyboard.KEY_3)) {
			if(thrreset == false) {
				thrdown = true;
			}
		} else {
			thrreset = false;
			thrdown = false;
		}
		if(thrdown) {
			thrreset = true;
			thrdown = false;
			if(Keyboard.isKeyDown(Keyboard.KEY_LSHIFT) || Keyboard.isKeyDown(Keyboard.KEY_RSHIFT)) {
				return converter.convertToNumbers("#");
			} else {
				return converter.convertToNumbers("3");
			}
		}
		if(Keyboard.isKeyDown(Keyboard.KEY_4)) {
			if(foureset == false) {
				foudown = true;
			}
		} else {
			foureset = false;
			foudown = false;
		}
		if(foudown) {
			foureset = true;
			foudown = false;
			if(Keyboard.isKeyDown(Keyboard.KEY_LSHIFT) || Keyboard.isKeyDown(Keyboard.KEY_RSHIFT)) {
				return converter.convertToNumbers("$");
			} else {
				return converter.convertToNumbers("4");
			}
		}
		if(Keyboard.isKeyDown(Keyboard.KEY_5)) {
			if(fivreset == false) {
				fivdown = true;
			}
		} else {
			fivreset = false;
			fivdown = false;
		}
		if(fivdown) {
			fivreset = true;
			fivdown = false;
			if(Keyboard.isKeyDown(Keyboard.KEY_LSHIFT) || Keyboard.isKeyDown(Keyboard.KEY_RSHIFT)) {
				return converter.convertToNumbers("%");
			} else {
				return converter.convertToNumbers("5");
			}
		}
		if(Keyboard.isKeyDown(Keyboard.KEY_6)) {
			if(sixreset == false) {
				sixdown = true;
			}
		} else {
			sixreset = false;
			sixdown = false;
		}
		if(sixdown) {
			sixreset = true;
			sixdown = false;
			if(Keyboard.isKeyDown(Keyboard.KEY_LSHIFT) || Keyboard.isKeyDown(Keyboard.KEY_RSHIFT)) {
				return converter.convertToNumbers("^");
			} else {
				return converter.convertToNumbers("6");
			}
		}
		if(Keyboard.isKeyDown(Keyboard.KEY_7)) {
			if(sevreset == false) {
				sevdown = true;
			}
		} else {
			sevreset = false;
			sevdown = false;
		}
		if(sevdown) {
			sevreset = true;
			sevdown = false;
			if(Keyboard.isKeyDown(Keyboard.KEY_LSHIFT) || Keyboard.isKeyDown(Keyboard.KEY_RSHIFT)) {
				return converter.convertToNumbers("&");
			} else {
				return converter.convertToNumbers("7");
			}
		}
		if(Keyboard.isKeyDown(Keyboard.KEY_8)) {
			if(eigreset == false) {
				eigdown = true;
			}
		} else {
			eigreset = false;
			eigdown = false;
		}
		if(eigdown) {
			eigreset = true;
			eigdown = false;
			if(Keyboard.isKeyDown(Keyboard.KEY_LSHIFT) || Keyboard.isKeyDown(Keyboard.KEY_RSHIFT)) {
				return converter.convertToNumbers("*");
			} else {
				return converter.convertToNumbers("8");
			}
		}
		if(Keyboard.isKeyDown(Keyboard.KEY_9)) {
			if(ninreset == false) {
				nindown = true;
			}
		} else {
			ninreset = false;
			nindown = false;
		}
		if(nindown) {
			ninreset = true;
			nindown = false;
			if(Keyboard.isKeyDown(Keyboard.KEY_LSHIFT) || Keyboard.isKeyDown(Keyboard.KEY_RSHIFT)) {
				return converter.convertToNumbers("(");
			} else {
				return converter.convertToNumbers("9");
			}
		}
		if(Keyboard.isKeyDown(Keyboard.KEY_0)) {
			if(zerreset == false) {
				zerdown = true;
			}
		} else {
			zerreset = false;
			zerdown = false;
		}
		if(zerdown) {
			zerreset = true;
			zerdown = false;
			if(Keyboard.isKeyDown(Keyboard.KEY_LSHIFT) || Keyboard.isKeyDown(Keyboard.KEY_RSHIFT)) {
				return converter.convertToNumbers(")");
			} else {
				return converter.convertToNumbers("0");
			}
		}
		if(Keyboard.isKeyDown(Keyboard.KEY_LEFT)) {
			if(lefreset == false) {
				lefdown = true;
			}
			if(lefhold == 10) {
				lefdown = true;
				lefhold--;
			}
			if(lefhold < 10) {
				lefhold++;
			}
		} else {
			lefreset = false;
			lefdown = false;
			lefhold = 0;
		}
		if(lefdown) {
			lefreset = true;
			lefdown = false;
			return "LEFT";
		}
		if(Keyboard.isKeyDown(Keyboard.KEY_RIGHT)) {
			if(rigreset == false) {
				rigdown = true;
			}
			if(righold == 10) {
				rigdown = true;
				righold--;
			}
			if(righold < 10) {
				righold++;
			}
		} else {
			rigreset = false;
			rigdown = false;
			righold = 0;
		}
		if(rigdown) {
			rigreset = true;
			rigdown = false;
			return "RIGHT";
		}
		return "";
	}
	
}

package render;

public class Converter {

	public String convertToNumbers(String letter) {
		if(letter.equals("a")) {
			letter = "01";
		} else if(letter.equals("A")) {
			letter = "02";
		} else if(letter.equals("b")) {
			letter = "03";
		} else if(letter.equals("B")) {
			letter = "04";
		} else if(letter.equals("c")) {
			letter = "05";
		} else if(letter.equals("C")) {
			letter = "06";
		} else if(letter.equals("d")) {
			letter = "07";
		} else if(letter.equals("D")) {
			letter = "08";
		} else if(letter.equals("e")) {
			letter = "09";
		} else if(letter.equals("E")) {
			letter = "0A";
		} else if(letter.equals("f")) {
			letter = "0B";
		} else if(letter.equals("F")) {
			letter = "0C";
		} else if(letter.equals("g")) {
			letter = "0D";
		} else if(letter.equals("G")) {
			letter = "0E";
		} else if(letter.equals("h")) {
			letter = "0F";
		} else if(letter.equals("H")) {
			letter = "10";
		} else if(letter.equals("i")) {
			letter = "11";
		} else if(letter.equals("I")) {
			letter = "12";
		} else if(letter.equals("j")) {
			letter = "13";
		} else if(letter.equals("J")) {
			letter = "14";
		} else if(letter.equals("k")) {
			letter = "15";
		} else if(letter.equals("K")) {
			letter = "16";
		} else if(letter.equals("l")) {
			letter = "17";
		} else if(letter.equals("L")) {
			letter = "18";
		} else if(letter.equals("m")) {
			letter = "19";
		} else if(letter.equals("M")) {
			letter = "1A";
		} else if(letter.equals("n")) {
			letter = "1B";
		} else if(letter.equals("N")) {
			letter = "1C";
		} else if(letter.equals("o")) {
			letter = "1D";
		} else if(letter.equals("O")) {
			letter = "1E";
		} else if(letter.equals("p")) {
			letter = "1F";
		} else if(letter.equals("P")) {
			letter = "20";
		} else if(letter.equals("q")) {
			letter = "21";
		} else if(letter.equals("Q")) {
			letter = "22";
		} else if(letter.equals("r")) {
			letter = "23";
		} else if(letter.equals("R")) {
			letter = "24";
		} else if(letter.equals("s")) {
			letter = "25";
		} else if(letter.equals("S")) {
			letter = "26";
		} else if(letter.equals("t")) {
			letter = "27";
		} else if(letter.equals("T")) {
			letter = "28";
		} else if(letter.equals("u")) {
			letter = "29";
		} else if(letter.equals("U")) {
			letter = "2A";
		} else if(letter.equals("v")) {
			letter = "2B";
		} else if(letter.equals("V")) {
			letter = "2C";
		} else if(letter.equals("w")) {
			letter = "2D";
		} else if(letter.equals("W")) {
			letter = "2E";
		} else if(letter.equals("x")) {
			letter = "2F";
		} else if(letter.equals("X")) {
			letter = "30";
		} else if(letter.equals("y")) {
			letter = "31";
		} else if(letter.equals("Y")) {
			letter = "32";
		} else if(letter.equals("z")) {
			letter = "33";
		} else if(letter.equals("Z")) {
			letter = "34";
		} else if(letter.equals("1")) {
			letter = "35";
		} else if(letter.equals("2")) {
			letter = "36";
		} else if(letter.equals("3")) {
			letter = "37";
		} else if(letter.equals("4")) {
			letter = "38";
		} else if(letter.equals("5")) {
			letter = "39";
		} else if(letter.equals("6")) {
			letter = "3A";
		} else if(letter.equals("7")) {
			letter = "3B";
		} else if(letter.equals("8")) {
			letter = "3C";
		} else if(letter.equals("9")) {
			letter = "3D";
		} else if(letter.equals("0")) {
			letter = "3E";
		} else if(letter.equals("[")) {
			letter = "3F";
		} else if(letter.equals("]")) {
			letter = "40";
		} else if(letter.equals("\\")) {
			letter = "41";
		} else if(letter.equals(";")) {
			letter = "42";
		} else if(letter.equals("\'")) {
			letter = "43";
		} else if(letter.equals(",")) {
			letter = "44";
		} else if(letter.equals(".")) {
			letter = "45";
		} else if(letter.equals("/")) {
			letter = "46";
		} else if(letter.equals("`")) {
			letter = "47";
		} else if(letter.equals("-")) {
			letter = "48";
		} else if(letter.equals("=")) {
			letter = "49";
		} else if(letter.equals("!")) {
			letter = "4A";
		} else if(letter.equals("@")) {
			letter = "4B";
		} else if(letter.equals("#")) {
			letter = "4C";
		} else if(letter.equals("$")) {
			letter = "4D";
		} else if(letter.equals("%")) {
			letter = "4E";
		} else if(letter.equals("^")) {
			letter = "4F";
		} else if(letter.equals("&")) {
			letter = "50";
		} else if(letter.equals("*")) {
			letter = "51";
		} else if(letter.equals("(")) {
			letter = "52";
		} else if(letter.equals(")")) {
			letter = "53";
		} else if(letter.equals("{")) {
			letter = "54";
		} else if(letter.equals("}")) {
			letter = "55";
		} else if(letter.equals("|")) {
			letter = "56";
		} else if(letter.equals(":")) {
			letter = "57";
		} else if(letter.equals("\"")) {
			letter = "58";
		} else if(letter.equals("<")) {
			letter = "59";
		} else if(letter.equals(">")) {
			letter = "5A";
		} else if(letter.equals("?")) {
			letter = "5B";
		} else if(letter.equals("~")) {
			letter = "5C";
		} else if(letter.equals("_")) {
			letter = "5D";
		} else if(letter.equals("+")) {
			letter = "5E";
		} else if(letter.equals(" ")) {
			letter = "5F";
		} if(letter.equals("RETURN")) {
			letter = "60";
		} else if(letter.equals("TAB")) {
			letter = "61";
		} else if(letter.equals("CURSOR")) {
			letter = "62";
		} else if(letter.equals("BOLD")) {
			letter = "63";
		} else if(letter.equals("ITALIC")) {
			letter = "64";
		} else if(letter.equals("UNDERLINE")) {
			letter = "65";
		} else if(letter.equals("PLAIN")) {
			letter = "66";
		}
		// 6A is START of the file
		// 6B is END of the file
		return letter;
	}
	
	public String convertToLetters(String letter) {
		if(letter.equals("01")) {
			letter = "a";
		} else if(letter.equals("02")) {
			letter = "A";
		} else if(letter.equals("03")) {
			letter = "b";
		} else if(letter.equals("04")) {
			letter = "B";
		} else if(letter.equals("05")) {
			letter = "c";
		} else if(letter.equals("06")) {
			letter = "C";
		} else if(letter.equals("07")) {
			letter = "d";
		} else if(letter.equals("08")) {
			letter = "D";
		} else if(letter.equals("09")) {
			letter = "e";
		} else if(letter.equals("0A")) {
			letter = "E";
		} else if(letter.equals("0B")) {
			letter = "f";
		} else if(letter.equals("0C")) {
			letter = "F";
		} else if(letter.equals("0D")) {
			letter = "g";
		} else if(letter.equals("0E")) {
			letter = "G";
		} else if(letter.equals("0F")) {
			letter = "h";
		} else if(letter.equals("10")) {
			letter = "H";
		} else if(letter.equals("11")) {
			letter = "i";
		} else if(letter.equals("12")) {
			letter = "I";
		} else if(letter.equals("13")) {
			letter = "j";
		} else if(letter.equals("14")) {
			letter = "J";
		} else if(letter.equals("15")) {
			letter = "k";
		} else if(letter.equals("16")) {
			letter = "K";
		} else if(letter.equals("17")) {
			letter = "l";
		} else if(letter.equals("18")) {
			letter = "L";
		} else if(letter.equals("19")) {
			letter = "m";
		} else if(letter.equals("1A")) {
			letter = "M";
		} else if(letter.equals("1B")) {
			letter = "n";
		} else if(letter.equals("1C")) {
			letter = "N";
		} else if(letter.equals("1D")) {
			letter = "o";
		} else if(letter.equals("1E")) {
			letter = "O";
		} else if(letter.equals("1F")) {
			letter = "p";
		} else if(letter.equals("20")) {
			letter = "P";
		} else if(letter.equals("21")) {
			letter = "q";
		} else if(letter.equals("22")) {
			letter = "Q";
		} else if(letter.equals("23")) {
			letter = "r";
		} else if(letter.equals("24")) {
			letter = "R";
		} else if(letter.equals("25")) {
			letter = "s";
		} else if(letter.equals("26")) {
			letter = "S";
		} else if(letter.equals("27")) {
			letter = "t";
		} else if(letter.equals("28")) {
			letter = "T";
		} else if(letter.equals("29")) {
			letter = "u";
		} else if(letter.equals("2A")) {
			letter = "U";
		} else if(letter.equals("2B")) {
			letter = "v";
		} else if(letter.equals("2C")) {
			letter = "V";
		} else if(letter.equals("2D")) {
			letter = "w";
		} else if(letter.equals("2E")) {
			letter = "W";
		} else if(letter.equals("2F")) {
			letter = "x";
		} else if(letter.equals("30")) {
			letter = "X";
		} else if(letter.equals("31")) {
			letter = "y";
		} else if(letter.equals("32")) {
			letter = "Y";
		} else if(letter.equals("33")) {
			letter = "z";
		} else if(letter.equals("34")) {
			letter = "Z";
		} if(letter.equals("35")) {
			letter = "1";
		} else if(letter.equals("36")) {
			letter = "2";
		} else if(letter.equals("37")) {
			letter = "3";
		} else if(letter.equals("38")) {
			letter = "4";
		} else if(letter.equals("39")) {
			letter = "5";
		} else if(letter.equals("3A")) {
			letter = "6";
		} else if(letter.equals("3B")) {
			letter = "7";
		} else if(letter.equals("3C")) {
			letter = "8";
		} else if(letter.equals("3D")) {
			letter = "9";
		} else if(letter.equals("3E")) {
			letter = "0";
		} else if(letter.equals("3F")) {
			letter = "[";
		} else if(letter.equals("40")) {
			letter = "]";
		} else if(letter.equals("41")) {
			letter = "\\";
		} else if(letter.equals("42")) {
			letter = ";";
		} else if(letter.equals("43")) {
			letter = "\'";
		} else if(letter.equals("44")) {
			letter = ",";
		} else if(letter.equals("45")) {
			letter = ".";
		} else if(letter.equals("46")) {
			letter = "/";
		} else if(letter.equals("47")) {
			letter = "`";
		} else if(letter.equals("48")) {
			letter = "-";
		} else if(letter.equals("49")) {
			letter = "=";
		} else if(letter.equals("4A")) {
			letter = "!";
		} else if(letter.equals("4B")) {
			letter = "@";
		} else if(letter.equals("4C")) {
			letter = "#";
		} else if(letter.equals("4D")) {
			letter = "$";
		} else if(letter.equals("4E")) {
			letter = "%";
		} else if(letter.equals("4F")) {
			letter = "^";
		} else if(letter.equals("50")) {
			letter = "&";
		} else if(letter.equals("51")) {
			letter = "*";
		} else if(letter.equals("52")) {
			letter = "(";
		} else if(letter.equals("53")) {
			letter = ")";
		} else if(letter.equals("54")) {
			letter = "{";
		} else if(letter.equals("55")) {
			letter = "}";
		} else if(letter.equals("56")) {
			letter = "|";
		} else if(letter.equals("57")) {
			letter = ":";
		} else if(letter.equals("58")) {
			letter = "\"";
		} else if(letter.equals("59")) {
			letter = "<";
		} else if(letter.equals("5A")) {
			letter = ">";
		} else if(letter.equals("5B")) {
			letter = "?";
		} else if(letter.equals("5C")) {
			letter = "~";
		} else if(letter.equals("5D")) {
			letter = "_";
		} else if(letter.equals("5E")) {
			letter = "+";
		} else if(letter.equals("5F")) {
			letter = " ";
		}
		return letter;
	}
	
}

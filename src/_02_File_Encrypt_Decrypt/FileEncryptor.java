package _02_File_Encrypt_Decrypt;

import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class FileEncryptor {
	// Create a program that takes a message from the user.
	// Use the methods in the String and Character classes to save
	// an encrypted form of the message to a file
	public static void main(String[] args) {
		FileWriter fr;
		try {
			fr = new FileWriter("src/_02_File_Encrypt_Decrypt/CurrentMessage.txt");
			fr.write(Encrypter(JOptionPane.showInputDialog("Enter A message")));
			fr.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static String Encrypter(String str) {
		str = str.toLowerCase();
		String re = "";
		for (int i = 0; i < str.length(); i++) {
			switch (str.charAt(i)) {
			case 'a':
				re = re + "z";
				break;
			case 'b':
				re = re + "y";
				break;
			case 'c':
				re = re + "x";
				break;
			case 'd':
				re = re + "w";
				break;
			case 'e':
				re = re + "v";
				break;
			case 'f':
				re = re + "u";
				break;
			case 'g':
				re = re + "t";
				break;
			case 'h':
				re = re + "s";
				break;
			case 'i':
				re = re + "r";
				break;
			case 'j':
				re = re + "q";
				break;
			case 'k':
				re = re + "p";
				break;
			case 'l':
				re = re + "o";
				break;
			case 'm':
				re = re + "n";
				break;
			case 'n':
				re = re + "m";
				break;
			case 'o':
				re = re + "l";
				break;
			case 'p':
				re = re + "k";
				break;
			case 'q':
				re = re + "j";
				break;
			case 'r':
				re = re + "i";
				break;
			case 's':
				re = re + "h";
				break;
			case 't':
				re = re + "g";
				break;
			case 'u':
				re = re + "f";
				break;
			case 'v':
				re = re + "e";
				break;
			case 'w':
				re = re + "d";
				break;
			case 'x':
				re = re + "c";
				break;
			case 'y':
				re = re + "b";
				break;
			case 'z':
				re = re + "a";
				break;
			default:
				re = re + str.charAt(i);
				break;
			}
		}
		return re;

	}
}

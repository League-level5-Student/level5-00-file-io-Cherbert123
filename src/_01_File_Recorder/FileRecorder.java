package _01_File_Recorder;

import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class FileRecorder {
	// Create a program that takes a message from the user and saves it to a file.
	public static void main(String[] args) {

		try {
			FileWriter writer = new FileWriter("src/_01_File_Recorder/TextHolder.txt", true);
			writer.write("\n" + JOptionPane.showInputDialog("Enter some text: "));
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

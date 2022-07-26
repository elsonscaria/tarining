package app.day5;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;


public class One {

	public static void main(String[] args) {
		
		try {
			File testF = new File("C:\\Desktop\\CONVOY.txt");
			BufferedReader in1 = new BufferedReader(new FileReader(testF));
		} catch (IOException e) {
			System.out.println("The File Not Found!");
		}
	}
}
package app.day9;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileNotFoundException;


public class Two {

	public static void main(String[] args) {
		
		FileInputStream src = null;
        FileOutputStream tgt = null;
        int temp = 0;

        try {
            try {
            	src = new FileInputStream("C:\\Users\\ASUS\\Desktop\\EHD.txt");
            	tgt = new FileOutputStream("C:\\Users\\ASUS\\Desktop\\EDR.txt");

                while ((temp = src.read()) != -1){
                	tgt.write((byte) temp);
                }

                System.out.println("File Written");
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } finally {
            try {
                if (src != null){
                	src.close();
                }
                if (tgt != null){
                	tgt.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
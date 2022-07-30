package app.day9;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Four {

	public static void main(String[] args) {
		FileReader fr = null;
        FileWriter fw = null;
        int temp = 0;

        try {
            fr = new FileReader("C:\\Users\\ASUS\\Desktop\\EDR.txt");
            fw = new FileWriter("C:\\Users\\ASUS\\Desktop\\EHD.txt");

            while ((temp = fr.read()) != -1){
                fw.write(temp);
            }

            System.out.println("File Written");

        }  catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (fr != null){
                    fr.close();
                }
                if (fw != null){
                    fw.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
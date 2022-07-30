package app.day9;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Three {

	public static void main(String[] args) {
		FileReader fr = null;

        try {
       
        	File file = new File("C:\\Users\\ASUS\\Desktop\\EDR.txt");
        	fr = new FileReader(file);

            
            char stream[] = new char[(int) file.length()];
    		
    		fr.read(stream);
    		System.out.println(stream);

        }  catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (fr != null){
                	fr.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
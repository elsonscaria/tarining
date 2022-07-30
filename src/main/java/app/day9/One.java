package app.day9;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class One {

	public static void main(String[] args) {
		FileInputStream src = null;
        int temp = 0;

        try {
            try {
                src = new FileInputStream("C:\\Users\\ASUS\\Desktop\\EDR.txt");

                temp = src.read();

                System.out.println("File Read : " + temp);

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
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}


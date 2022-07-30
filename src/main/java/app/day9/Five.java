package app.day9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class Five {

	public static void main(String[] args) {
		BufferedReader br = null;
        BufferedWriter bw = null;
        String line = null;

        try {
            Reader rd = new FileReader("C:\\Users\\ASUS\\Desktop\\EDR.txt");
            br = new BufferedReader(rd);

            Writer wr = new FileWriter("C:\\Users\\ASUS\\Desktop\\EHD.txt");
            bw = new BufferedWriter(wr);

            while ((line = br.readLine()) != null){
                bw.write(line);
                bw.flush();
            }

            System.out.println("Buffered Read Write Successful");

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (br != null){
                    br.close();
                }
                if (bw != null){
                    bw.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
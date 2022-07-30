package app.day9;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

public class Six {

	public static void main(String[] args) {
		Employee11 emp = new Employee11(403, "Conor", 27);
		FileOutputStream fos = null;
		ObjectOutputStream obj = null;
		
		try {
			fos = new FileOutputStream("C:\\Users\\ASUS\\Desktop\\EHD.txt");
			obj = new ObjectOutputStream(fos);
			obj.writeObject(emp);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fos.close();
				obj.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}

@Getter
@Setter
@AllArgsConstructor
class Employee11 implements Serializable {
	private static final long serialVersionUID = 8788L;
	private int id;
	private String name;
	private int age;
}
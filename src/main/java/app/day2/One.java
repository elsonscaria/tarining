package app.day2;

public class One{

    public static void main(String[] args) {
                int i = 3;
         		int j = 8;
         		System.out.println("int i = " + i);
         		System.out.println("int j = " + j);
         		
          		System.out.println("i + j = " + (i + j));
         		
         		System.out.println("i++ is " + (i++) + " While ++j is " + (++j));
         		
         		if(i > j)
         		{
         			System.out.println("i is bigger than j");
         		}
         		else
         		{
         			System.out.println("j is bigger than i");
         		}
         		

         		if(i == 5 && j == 5)
         		{
         			System.out.println("Both numbers equal to 5");
         		}
         		else
         		{
         			System.out.println("Both numbers not equal to 5");
         		}
    }
}
package app.day3;

public class two {

	public static void main(String[] args) {
		shape t1=new shape();
		t1.area(5);
		t1.area(8, 9);

	}

}
class shape{
	public void area(int r) {
		System.out.println("Area of Circle : "+3.14*r*r);
	}
	public void area(int p,int q) {
		System.out.println("Area of Rectangle : "+p*q);
	}
}
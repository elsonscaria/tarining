package app.day3;

public class three {

	public static void main(String[] args) {
		shapes t1=new shapes();
		shapes t2=new shapes(6);
		t1.area();
		t2.area();

	}

}
class shapes{
	int r;
	shapes(){
		r = 1;
	}
	shapes(int i){
		r = i;
	}
	public void area() {
		System.out.println("Area of Circle : "+3.14*r*r);
	}
}
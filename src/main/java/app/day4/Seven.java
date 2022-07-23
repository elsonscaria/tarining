package app.day4;

public class Seven {

	public static void main(String[] args) {
		addVal add1 = new addVal(3);
		addRef add2 = new addRef(3);
		
		System.out.println("First x : " + add1.x );
		add1.add(add1.x);
		System.out.println("Second x : " + add1.x );
		
		System.out.println("First y : " + add2.y );
		add2.add(add2);
		System.out.println("Second y : " + add2.y );
		
	}
}

class addVal {
	int x;
	
	addVal(int x) {
		this.x = x;
	}
	
	void add(int x) {
		x+=2;
	}
}

class addRef {
	int y;
	
	addRef(int y) {
		this.y = y;
	}
	
	void add(addRef ref) {
		ref.y+=2;
	}
}
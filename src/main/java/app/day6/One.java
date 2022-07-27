package app.day6;

public class One {

	public static void main(String[] args) {
		FiftyThread t1 = new FiftyThread();
		t1.start();
	}
}

class FiftyThread extends Thread {
	
	public void run() {
		
		for(int i = 1; i <= 50; i++) {
			System.out.println(i);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
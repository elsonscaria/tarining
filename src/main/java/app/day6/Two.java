package app.day6;

public class Two {

	public static void main(String[] args) {

		EvenThread even = new EvenThread();
		Thread t1 = new Thread(even);
		OddThread odd = new OddThread();
		Thread t2 = new Thread(odd);
		t1.start();
		t2.start();

	}

}

class EvenThread implements Runnable{
	public void run() {
		for(int i = 1; i <= 10; i++) {
			if(i%2==0) {
				System.out.println("Even : " + i);
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
class OddThread implements Runnable{
	public void run() {
		for(int i = 1; i <= 10; i++) {
			if(i%2==1) {
				System.out.println("Odd  : " + i);
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
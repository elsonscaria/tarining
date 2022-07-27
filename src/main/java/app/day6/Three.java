package app.day6;

import lombok.Getter;
import lombok.Setter;

public class Three {

	public static void main(String[] args) {
		ThreadPoint obj1 = new ThreadPoint();
		Thread t1 = new Thread(obj1);
		t1.start();
		
		Thread t2 = new Thread(obj1);
		t2.start();
		
	}

}

class ThreadPoint implements Runnable {
	
	PointAdd pa = new PointAdd();

	@Override
	public void run() {
		pa.addP(0.5);	
	}
	
}


class PointAdd {
	
	Attendance at = new Attendance();
	
	public synchronized void addP(double point) {
		double pt1 = at.getPt();
		double newPt = pt1 + point;
		System.out.println("Points Added : " + point);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		at.setPt(newPt);
		System.out.println("New Points : " + at.getPt());
	}
}


@Setter
@Getter
class Attendance {
	
	private double id;
	private double pt = 2;
}
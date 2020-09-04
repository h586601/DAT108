package oblig1.q3;

import java.util.Random;

public class WaitrThread extends Thread {

	private Waitr waitr;
	private Slide hamburgerQueue;
	Random rand = new Random();

	public WaitrThread(Waitr waitr, Slide hamburgerQueue) {
		this.waitr = waitr;
		this.hamburgerQueue = hamburgerQueue;
	}

	public String getWaitrName() {
		return waitr.getName();
	}

	@Override
	public void run() {
		
		hamburgerQueue.printElementer();
		while (true) {
			int randSeconds = rand.nextInt(4000);
			try {
				sleep(randSeconds + 2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			if(hamburgerQueue.getAntall() > 0) {
				System.out.println(waitr.getName() + " har hentet burger: (" + hamburgerQueue.fjern() + ") \t=>\t" + hamburgerQueue.printElementer());
			}
		}
	} // run()
}

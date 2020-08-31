package oblig1.q2;

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
	public synchronized void run() {
		while (true) {
			int randSeconds = rand.nextInt(4000);
			boolean hentet = false;
			try {
				sleep(randSeconds + 2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			synchronized (hamburgerQueue) {
				while (!hentet) {
					if (!hamburgerQueue.erTom()) {
						int burger = hamburgerQueue.fjern();
						if (burger > -1) {
							System.out.print(getWaitrName() + " har hentet burger: [" + burger + "] \t=>\t");
							hamburgerQueue.printElementer();
							hamburgerQueue.notifyAll();
							hentet = true;
						}
					} else {
						try {
							System.out.println("### Køen er nå tom! Servitør " + getWaitrName() + " venter ###");
							hamburgerQueue.wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
			} // synchronized()
		}
	} // run()
}

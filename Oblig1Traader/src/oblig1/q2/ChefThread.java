package oblig1.q2;

import java.util.Random;

public class ChefThread extends Thread {

	private Chef chef;
	private Slide hamburgerQueue;
	Random rand = new Random();

	public ChefThread(Chef chef, Slide hamburgerQueue) {
		this.chef = chef;
		this.hamburgerQueue = hamburgerQueue;
	}

	public String getChefName() {
		return chef.getName();
	}

	@Override
	public synchronized void run() {
		while (true) {
			int randSeconds = rand.nextInt(4000);
			boolean lagtTil = false;
			try {
				sleep(randSeconds + 2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			synchronized (hamburgerQueue) {
				while (!lagtTil) {
					if (!hamburgerQueue.erFull()) {
						lagtTil = hamburgerQueue.leggTil();
						System.out.print(getChefName() + " har laget burger: [" + hamburgerQueue.getAntall() + "] \t=>\t");
						hamburgerQueue.printElementer();
						hamburgerQueue.notifyAll();
					} else {
						try {
							System.out.println("### Køen er nå full! Kokken " + getChefName() + " venter ###");
							hamburgerQueue.wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
			} // synchronized()
		}
	}

	public int getRandomNumber() {
		return (int) ((Math.random() * (6000 - 2000)) + 2000);
	}

}

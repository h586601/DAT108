package oblig1.q3;

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
	public void run() {
		
		while (true) {
			int randSeconds = rand.nextInt(4000);
			try {
				sleep(randSeconds + 2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println(chef.getName() + " har laget burger: (" + hamburgerQueue.leggTil() + ") \t=>\t" + hamburgerQueue.printElementer());
			
		}
	}

}

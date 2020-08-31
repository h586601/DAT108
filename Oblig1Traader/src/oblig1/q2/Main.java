package oblig1.q2;

public class Main {

	public static void main(String[] args) {

		Slide hamburgerSlide = new Slide();
		Thread chef1 = new ChefThread(new Chef("Silje"), hamburgerSlide);
		Thread chef2 = new ChefThread(new Chef("Tom"), hamburgerSlide);
		Thread chef3 = new ChefThread(new Chef("Tore"), hamburgerSlide);
		
		Thread waitr1 = new WaitrThread(new Waitr("Fatima"), hamburgerSlide);
		Thread waitr2 = new WaitrThread(new Waitr("Helge"), hamburgerSlide);

		chef1.start();
		waitr1.start();
		chef2.start();
		waitr2.start();
		chef3.start();

		
	}

}

package oblig1.q2;

public class ChefThread extends Thread {

	private BurgerSlide slide;
	private int chefNo;

	public ChefThread(int chefNo) {
		this.chefNo = chefNo;
	}

	@Override
	public void run() {
		if(slide.isEmpty()) {
			System.out.println("### Kokk"+getChefNo()+" er klar med en hamburger, men rutsjebanen er full. Venter! ###");
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		
		System.out.println("Kokk"+getChefNo()+" legger på hamburger");
		slide.innKoe(slide.lastNo());
	}

	
	public int getChefNo() {
		return chefNo;
	}

	public int getRandomNumber() {
		return (int) ((Math.random() * (6000 - 2000)) + 2000);
	}

}

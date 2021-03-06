
public class RaceCondition {

	
	public static void main(String[] args) throws InterruptedException {

		//objekt som inneholder en tellevariabel
		//to tr�der - en teller opp og andre teller ned
		
		Teller teller = new Teller();
		
		Thread telleOpp = new TelleOpp(teller, 1000);
		Thread telleNed = new TelleNed(teller, 1000);

		telleOpp.start();
		telleNed.start();
		
		telleOpp.join();
		telleNed.join();
		
		System.out.println(teller.getVerdi());
	}

}

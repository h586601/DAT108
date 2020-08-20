
public class TelleNed extends Thread {

	private Teller teller;
	private int antallGanger;
	
	public TelleNed(Teller teller, int antallGanger) {
		this.teller = teller;
		this.antallGanger = antallGanger;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < antallGanger; i++) {
			
			
			//Kritisk seksjon
			teller.tellNed();
			
		}
	}
}

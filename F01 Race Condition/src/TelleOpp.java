
public class TelleOpp extends Thread {

	private Teller teller;
	private int antallGanger;
	
	public TelleOpp(Teller teller, int antallGanger) {
		this.teller = teller;
		this.antallGanger = antallGanger;
	}

	@Override
	public void run() {
		for (int i = 0; i < antallGanger; i++) {
			

			//Kritisk seksjon
			teller.tellOpp(); 
			
		}
	}
	
	
}

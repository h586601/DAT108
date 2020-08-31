package waitnotifymelding;

public class Main {

	public static void main(String[] args) {
		
		Melding melding = new Melding();
	
		
		Thread printtraad = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println(melding.getInnhold());	
			}
		});
		
		Thread endretraad = new Thread(new Runnable()  {
			@Override
			public void run() {
				melding.setInnhold("Dette er en melding");	
			}
		});
		
		
		printtraad.start();
		endretraad.start();
	}

}

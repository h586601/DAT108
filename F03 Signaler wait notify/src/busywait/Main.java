package busywait;

public class Main {

	private static String melding;
	
	public static void main(String[] args) {
		
		Thread printtraad = new Thread(new Runnable() {

			@Override
			public void run() {
				while (melding == null) {
					//Her spinner den rundt og rundt, så vi legger inn sleep
//					try {
//						Thread.sleep(10);
//					} catch (InterruptedException e) {
//					}
				}
				System.out.println(melding);	
			}
		});
		
		Thread endretraad = new Thread(new Runnable()  {
			@Override
			public void run() {
				melding = "Dette er en melding";
			}
		});
		
		
		printtraad.start();
		endretraad.start();
	}

}

package waitnotify;

public class Main {

	private static String melding;
	
	public static void main(String[] args) {
		
		Object lock = new Object();
		
		
		Thread printtraad = new Thread(new Runnable() {

			@Override
			public void run() {
				synchronized(lock) {
					while (melding == null) {
						try {
							lock.wait();
						} catch (InterruptedException e) {
						}
					}
				}
				
				System.out.println(melding);	
			}
		});
		
		Thread endretraad = new Thread(new Runnable()  {
			@Override
			public void run() {
				synchronized(lock) {
					melding = "Dette er en melding";
					lock.notifyAll();
				}
			}
				
		});
		
		
		printtraad.start();
		endretraad.start();
	}

}

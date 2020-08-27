package oblig1.q2;

public class Main {

	public static void main(String[] args) {
		
		Thread chef1 = new ChefThread(1);
//		Thread chef2 = new ChefThread(2);
//		Thread chef3 = new ChefThread(3);
//		
//		Thread wait1 = new WaitThread();
//		Thread wait2 = new WaitThread();

		chef1.start();
//		chef2.start();
	}

}

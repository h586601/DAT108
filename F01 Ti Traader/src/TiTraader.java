
public class TiTraader {

	public static void main(String[] args) {

		String name = Thread.currentThread().getName();
		System.out.println("Main-tråden heter " + name);
		
		for (int i=1; i<=10; i++) {
			Thread t = new Thread(new MinRunnable(), "Tråd nr. " + i);
			t.start();
		}

	}

}

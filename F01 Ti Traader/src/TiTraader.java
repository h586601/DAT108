
public class TiTraader {

	public static void main(String[] args) {

		String name = Thread.currentThread().getName();
		System.out.println("Main-tr�den heter " + name);
		
		for (int i=1; i<=10; i++) {
			Thread t = new Thread(new MinRunnable(), "Tr�d nr. " + i);
			t.start();
		}

	}

}

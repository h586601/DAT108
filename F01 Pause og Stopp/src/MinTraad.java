
public class MinTraad extends Thread {
	
	private boolean fortsette = true;
	
	public MinTraad(String navn) {
		super(navn);
	}
	
	public void doStop() {
		fortsette = false;
	}

	@Override
	public void run() {
		while(fortsette) {
			System.out.println(getName());
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			}
		}
	}
}

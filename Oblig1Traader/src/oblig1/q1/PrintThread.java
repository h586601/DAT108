package oblig1.q1;

public class PrintThread extends Thread {

	private final int MILLISEC_INTERVAL = 3000;
	private Text text;
	private boolean fortsette = true;
	
	
	public PrintThread(Text text) {
		this.text = text;
	}


	@Override
	public void run() {
		while(fortsette) {
			String msg = text.getTextmsg();
			if(!msg.toUpperCase().equals("QUIT")) {
				System.out.println(msg);
				try {
					Thread.sleep(MILLISEC_INTERVAL);
				} catch (InterruptedException e) {
				}
			} else {
				fortsette = false;
			}
		}
	}
}

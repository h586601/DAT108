package bettina;

public class MyThread extends Thread {

	private Message message;
	private boolean run = true;
	
	public MyThread(Message message) {
		this.message = message;
	}

//	public void doStop() {
//		run = false;
//	}

	@Override
	public void run() {
		while(run) {
			System.out.println(message.getContent());
			if(message.getContent().equals("quit")) {
				run = false;
				}
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}
		}
		
	}

}

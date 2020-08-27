package bettina;

public class Main {

	public static void main(String[] args) throws InterruptedException {

		Message message = new Message("First message");
		
		MessageThread messageThread = new MessageThread(message);
		Thread tread = new MyThread(message);

		messageThread.start();
		tread.start();
		
		
		Thread.sleep(3000);
	}

}

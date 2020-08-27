package oblig1.q1;

public class TextOnScreen {

	public static void main(String[] args) throws InterruptedException {
		
		Text text = new Text("Are you ready to rumble?");
		
		Thread print = new PrintThread(text);
		Thread update = new UpdateThread(text);
		
		print.start();
		update.start();
		

	}

}

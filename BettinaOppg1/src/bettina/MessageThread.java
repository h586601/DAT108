package bettina;

import javax.swing.JOptionPane;

public class MessageThread extends Thread {

	private Message message;
	private boolean run = true;
	
	public MessageThread(Message message) {
		this.message = message;
	}

	@Override
	public void run() {
		while(run) {
			String txt = JOptionPane.showInputDialog(
					"Skriv inn melding, eller quit for å avslutte");
			message.setContent(txt);
			if(txt.equals("quit")) {
			run = false;
			}
		}
	}

	
}

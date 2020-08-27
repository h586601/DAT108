package oblig1.q1;

import javax.swing.JOptionPane;

public class UpdateThread extends Thread {

	private Text textmsg;
	private boolean fortsette = true;
	
	public UpdateThread(Text textmsg) {
		this.textmsg = textmsg;
	}

	@Override
	public void run() {
		while(fortsette) {
			String txt = JOptionPane.showInputDialog(
					"Skriv inn melding, eller quit for å avslutte");
			textmsg.setTextmsg(txt);
			if(txt.toUpperCase().equals("QUIT")) {
				fortsette = false;
				System.out.println("We're finished here :)");
			}
		}
		
	}

	
}

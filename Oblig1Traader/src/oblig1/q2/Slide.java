package oblig1.q2;

public class Slide {

	private int[] slideTab;
	private int amount;

	public Slide(int[] slideTab, int amount) {
		this.slideTab = slideTab;
		this.amount = amount;
	}
	
	public Slide() {}

	public int getAmount() {
		return amount;
	}
	
	public boolean isFull() {
		return (amount >= 5);
	}
	
	public boolean isEmpty() {
		return amount == 0;
	}
}


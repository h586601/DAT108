package oblig1.q2;

public class BurgerSlide<T> implements KoeADT<T> {

	private final static int STDK = 5;
	private int front, bak, antall;
	private int[] koe;

	public BurgerSlide() {
		this(STDK);
	}

	@SuppressWarnings("unchecked")
	public BurgerSlide(int startKapasitet) {
		front = bak = antall = 0;
		koe = new int[startKapasitet];
	}

	@Override
	public void innKoe(int nummer) {

		koe[bak] = nummer;
		bak = (bak+1) % koe.length;
		antall++;

	}

	@Override
	public int utKoe() {

		if(amount() == 0) {
			throw new EmptyCollectionException("Køen");
		}

		int nummer = koe[front];
		koe[front] = 0;
		front = (front+1) % koe.length;
		antall--;

		return nummer;
	}

	@Override
	public int first() {
		if(isEmpty()) {
			throw new EmptyCollectionException("Køen");
		}
		return koe[front];
	}

	@Override
	public boolean isEmpty() {
		return (amount() == 0);
	}


	public boolean isFull() {
		return (amount() == 5);
	}

	@Override
	public int amount() {
		return antall;
	}
	
	public int lastNo() {
		return koe[bak-1];
	}

}
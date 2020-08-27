package oblig1.q2;

public interface KoeADT<T> {

	/**
	 * @param element :
	 * The element that you want to add to (the back of) the queue
	 */
	public void innKoe(int nummer);

	/**
	 * @return T element : 
	 * The element taken out/removed from the first position in the queue
	 */
	public int utKoe();

	/**
	 * @return T element :
	 * Giving a reference to the first element in the queue, without removing the element
	 */
	public int first();

	/**
	 * @return boolean : true if empty and false if not
	 */
	public boolean isEmpty();

	/**
	 * @return integer representing the amount 
	 */
	public int amount();

}

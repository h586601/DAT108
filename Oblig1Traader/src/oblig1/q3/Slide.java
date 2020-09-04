package oblig1.q3;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Slide {

	private int elementNr;
	private BlockingQueue<Integer> elementer;

	public Slide() {
		elementer = new ArrayBlockingQueue<Integer>(5);
	}

	public Slide(int plass) {
		elementer = new ArrayBlockingQueue<Integer>(plass);
	}

	public String printElementer() {
		String s = "[";
		int i = 0;

		for (Integer e : elementer) {
			i++;
			if (i > 1) {
				s += (", ");
			}
			s += "(" + e + ")";

		}
		s += "]";
		return s;

	}

	public int getElementNr() {
		return elementNr;
	}

	public int leggTil() {
		try {
			elementer.put(elementNr++);
		} catch (InterruptedException e) {
			//
		}
		return elementNr;
	}

	public int fjern() {
		try {
			return elementer.take();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return -1;
	}

	public int getAntall() {
		return elementer.size();
	}

}

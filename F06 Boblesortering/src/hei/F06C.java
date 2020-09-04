package hei;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@FunctionalInterface
interface Betingelse {
	boolean erOppfylt(int tall);
}

public class F06C {

	public static List<Integer> filter(List<Integer> listen, Betingelse betingelse) {
		List<Integer> resultat = new ArrayList<>();

		for (int tall : listen) {
			if (betingelse.erOppfylt(tall)) {
				resultat.add(tall);
			}
		}

		return resultat;
	}

	public static void main(String[] args) {

		List<Integer> listen = Arrays.asList(1, 4, -9, 5, 0, -3, 8, 16);
		List<Integer> filtrertListe;

		// Alle partall
		filtrertListe = filter(listen, tall -> tall % 2 == 0);
		System.out.println(filtrertListe);

		// Alle tall større enn 0
		filtrertListe = filter(listen, tall -> tall > 0);
		System.out.println(filtrertListe);

		// alternativ til over
		filtrertListe = filter(listen, new Betingelse() {
			@Override
			public boolean erOppfylt(int tall) {
				return tall > 0;
			}
		});

		// Alle tall større enn 5
		filtrertListe = filter(listen, storreEnn(5));
		System.out.println(filtrertListe);

		// Alle tall større enn 9
		filtrertListe = filter(listen, storreEnn(9));
		System.out.println(filtrertListe);
	}

	private static Betingelse storreEnn(int grense) {
		return tall -> tall > grense;
	}

}

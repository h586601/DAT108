package hei;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorLambda {

	public static void main(String[] args) {

		List<String> listen = Arrays.asList("Halloen", "blabla", "Knut", "Per");
		
		Collections.sort(listen);
		System.out.println(listen);
		
		//Sort alphabetically
//		Collections.sort(listen, new Comparator<String>() {
//			@Override
//			public int compare(String s1, String s2) {
//				return s1.toUpperCase().compareTo(s2.toUpperCase());
//			}
//		});	
//		System.out.println(listen);
		
		//Bruke lambda-uttrykk til å representere en Comparator
		Collections.sort(listen, (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase()));
		System.out.println(listen);
		
		//Bruke lambda-uttrykk til å sortere på String-lengde
		Collections.sort(listen, (a, b) -> a.length() - b.length());
		System.out.println(listen);
		
		//Baklengs på String-lengde
		Comparator<String> baklengsPaaLengde = (a, b) -> b.length() - a.length();
		Collections.sort(listen, baklengsPaaLengde);
		System.out.println(listen);
	}

}

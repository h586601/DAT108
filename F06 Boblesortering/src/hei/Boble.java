package hei;

import java.util.List;
import java.util.Arrays;


public class Boble {

	public static void main(String[] args) {
		
		List<Integer> listeAvTall = Arrays.asList(4,2,7,5,9,1);
		sorter(listeAvTall);
		System.out.println(listeAvTall);
	
		
		List<String> listeAvString = Arrays.asList("Aaa", "Xxx", "Bbb", "Kkk");
		sorter(listeAvString);
		System.out.println(listeAvString);
		
		
		List<Person> listeAvPersoner = Arrays.asList(
				new Person("Anne", "Persen"),
				new Person("Per", "Andersen"),
				new Person("Knut", "Svendsen"));
		sorter(listeAvPersoner);
		System.out.println(listeAvPersoner);
		
		
		//I wish to sort the people by first name. What to we do?
		Sammenligner<Person> s = new FornavnSammenligner();
		sorter2(listeAvPersoner, s);
		System.out.println(listeAvPersoner);
		
		
		//Sort by birth year
//		sorter2(listeAvPersoner, new Sammenligner<Person>() {
//			
//			@Override
//			public int sammenlign(Person a, Person b) {
//				//
//			}
//		});
		
	}
	
	
	private static <T extends Comparable> void sorter(List<T> listeAvString) {
		
		for( int i=0; i<listeAvString.size(); i++) {
			for( int j=1; j<listeAvString.size(); j++) {
				if(listeAvString.get(j-1).compareTo(listeAvString.get(j)) > 0) {
					T temp = listeAvString.get(j-1);
					listeAvString.set(j-1, listeAvString.get(j));
					listeAvString.set(j, temp);
				}
			}
		}
		
	}

private static <T extends Comparable<T>> void sorter2(List<T> listen, Sammenligner s) {
		
		for( int i=0; i<listen.size(); i++) {
			for( int j=1; j<listen.size(); j++) {
				if(s.sammenlign(listen.get(j-1), listen.get(j)) > 0) {
					T temp = listen.get(j-1);
					listen.set(j-1, listen.get(j));
					listen.set(j, temp);
				}
			}
		}
		
	}

}

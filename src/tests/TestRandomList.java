package tests;

import com.iteso.model.RandomList;

public class TestRandomList {

	public static void main(String[] args) {

		RandomList<String> list = new RandomList<>();
		list.add("uno"); list.add("dos");
		list.add("tres"); list.add("cuatro");
		System.out.println(list); // [uno, tres, cuatro, dos] ** Se generó la secuencia
		System.out.println(list); // [uno, tres, cuatro, dos] ** Ya no se generó la secuencia
		list.initSequence(); // Se generó otra secuencia
		System.out.println(list); // [uno, cuatro, tres, dos]
		for(int i = 1; i <= 10; i ++) { // Se mantiene la última secuencia generada
			String s = list.next();
			System.out.print(s + " ");
		}
		
		System.out.println(); // uno cuatro tres dos uno cuatro tres dos uno cuatro
		list.remove(2); // Elimina al elemento 2 de la secuencia y se invalida
		System.out.println(list); // [dos, cuatro, uno] ** Se generó otra secuencia
		list.add("cinco"); // Se invalida la secuencia
		
		for(int i = 1; i <= 6; i ++) {
			String s = list.next(); // En el primer next(), se generó otra secuencia
			System.out.print(s + " ");
		}
		System.out.println(); // cuatro dos uno cinco cuatro dos
		
		RandomList<Integer> list2 = new RandomList<>();
		for(int i = 0; i < 10; i ++) 
			list2.add(10 * i);
		System.out.println(list2); // [40, 20, 10, 50, 80, 30, 90, 0, 60, 70]
		for(int i = 0; i < 4; i ++) 
			System.out.print(list2.next() + " ");
		System.out.println(); // 40 20 10 50
		System.out.println(list2); // [40, 20, 10, 50, 80, 30, 90, 0, 60, 70]
		for(int i = 0; i < 3; i ++)
			System.out.print(list2.next() + " ");
		System.out.println(); // 80 30 90 ** reanuda la secuencia del último next()



	}

}

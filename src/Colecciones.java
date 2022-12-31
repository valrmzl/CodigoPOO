import java.util.*;
public class Colecciones {

	public static void main(String[] args) {
		List<String> strList = new Vector<>();
		strList.add("uno");
		strList.add("dos");
		strList.add("tres");
		strList.add("cuatro");
		strList.add("cinco");
		strList.add("seis");
		
		for(int i=0; i<strList.size(); i++)
			System.out.printf("Indice: %d,  Valor: %s\n",i,strList.get(i));
		
		System.out.println(strList);
		System.out.println("******");
		strList.set(3,"dos");
		System.out.println(strList);
		
		
		//indexof utiliza el metodo equals
		System.out.println("******");
		int i2=strList.indexOf("dos"); //aparece 2 veces, entrega el indice de la primera aparicion
		int i4=strList.indexOf("cuatro"); //no hay, entonces devuelve -1
		System.out.println(i2+ " "+ i4);
		System.out.println("******");
		for(int i=0; i<strList.size(); i++) {
			String s= strList.get(i);
			strList.set(i, s.toUpperCase());
		}
		System.out.println(strList);
		System.out.println("******");
		
		/*
		while(strVector.size()>0)   //while(!strVector.isEmpty())
			strVector.remove(0);
			*/
		
		//esta version es mas eficinete pq no implica reocrrer elementos a la izquierda 
		while(strList.size()>0)
			strList.remove(strList.size()-1);
		
		System.out.println(strList);
		
		
		//variable que apunte a todos los tipos de lista
		//la delcaracion puede ser asbtracto o una interfaz
		
		
		
		//parte 2 
		System.out.println("------------------");
		Set<Integer> intSet = new TreeSet<>();
		//Set<Integer> intSet = new HashSet<>(); //al momento de imprimir ya no lo hace en orden
		intSet.add(100);
		intSet.add(150);
		intSet.add(120);
		intSet.add(100);
		intSet.add(180);
		intSet.add(200);
		intSet.add(120);
		intSet.add(180);
		intSet.add(100);
		System.out.println(intSet.size());
		System.out.println(intSet);
		
		//a fuerzas se tiene que usar for-each
		for(int element : intSet)
			System.out.println(element);
	
		//parte 3
		Map <String, Integer> numberMap = new HashMap<>();
		//se pueden repeyir valores
		//no se reptien claves 
		numberMap.put("uno", 1);
		numberMap.put("dos", 2);
		numberMap.put("tres", 3);
		numberMap.put("cuatro", 4);
		numberMap.put("cinco", 5);
		numberMap.put("four", 4);
		numberMap.put("dos", 22);  //se reemplaza 2 por 22
		System.out.println(numberMap);
		
		
		Integer v3=numberMap.get("tres");
		Integer v7=numberMap.get("siete");
		System.out.println(v3);
		System.out.println(v7);
		
		
		
		System.out.println(numberMap.containsKey("siete"));
		System.out.println(numberMap.containsKey("uno"));
		System.out.println(numberMap.containsValue(7));
		System.out.println(numberMap.containsValue(1));
		
		
		Collection<Integer> values = numberMap.values();
		for(int v: values) System.out.println(v);
		System.out.println();
		
		Set<String> keys = numberMap.keySet();
		for(String k : keys) {
			int v=numberMap.get(k);
			System.out.println(k+","+v);
		}
		
		System.out.println("**");
		//Queue<Double> dblQueue = new ArrayDeque<>();
		Queue<Double> dblQueue = new PriorityQueue<>();  //sale de menor a mayor 

		dblQueue.offer(4.7);
		dblQueue.offer(2.6);
		dblQueue.offer(8.3);
		dblQueue.offer(5.6);
		dblQueue.offer(1.4);
		dblQueue.offer(3.2);
		
		double front= dblQueue.peek();
		System.out.println(front);
		System.out.println(dblQueue);
		
		
		//atender a  todos los elementos de la cola
		while(!dblQueue.isEmpty()) {
			double d=dblQueue.poll();
			System.out.println(d+": "+dblQueue);
		}
		
	}

}

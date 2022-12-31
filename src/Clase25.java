import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Vector;

import com.iteso.model.Date;

public class Clase25 {
	/*
	public static double average(int a, int b) {
		return (a+b)/2.0;
	}
	
	
	public static double average(int a, int b, int c) {
		return (a+b+c)/3.0;
	}
	
	public static double average(int[] array) {
		if(array.length==0) return 0;
		int s=0;
		for(int x: array) s+=x;
		return (double) s/array.length;
	}*/
	
	public static double average(int ...args) {
		if(args.length==0) return 0;
		int s=0;
		for(int x: args) s+=x;
		return (double) s/args.length;
	}
	
	public static double distance(double x, double ... list) {
		if(list.length==0) return 0;
		double suma=0;
		for(double y: list) {
			suma +=Math.abs(x-y);
		}
		
		return suma/list.length;
	}

	public static void main(String[] args) {
		/*
		System.out.println(average(8,9));
		System.out.println(average(8,9,9));
		int[] array = {7,10,8,9,10,6,7,9};
		System.out.println(average(array));
		*/
		
		/*
		System.out.println(average(8,9));
		System.out.println(average(8,9,9));
		System.out.println("***");
		System.out.println(distance(4.5));
		System.out.println(distance(3,-2));
		*/
		
		/*
		PriorityQueue<Date> dateQ = new PriorityQueue<>();
		dateQ.offer(new Date());
		dateQ.offer(new Date(25,2,2022));
		dateQ.offer(new Date(13,3,2022));
		dateQ.offer(new Date(18,3,2022));
		dateQ.offer(new Date(24,7,2021));
		System.out.println(dateQ);
		while(!dateQ.isEmpty()) {
			Date minD= dateQ.poll();
			System.out.println(minD);
		}
		*/
		
		List<String> strList = new Vector<>();
		strList.add("valeria");
		strList.add("guadalupe");
		strList.add("ramirez");
		strList.add("lopez");
		System.out.println(strList);
		Collections.shuffle(strList);
		System.out.println(strList);
		Collections.swap(strList, 0, 1);
		System.out.println(strList);
		int f1=Collections.frequency(strList, "valeria");
		System.out.println(f1);
		
	}

}

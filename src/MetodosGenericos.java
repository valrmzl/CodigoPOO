import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;
import java.util.Vector;

import com.iteso.model.Date;
import com.iteso.model.RGBColor;

public class MetodosGenericos {
	
	public static void printList(List<?> list) { //recibe un lista de lo que sea 
		for(int i=0; i<list.size();i++) {
			Object obj = list.get(i);
			System.out.printf("%2d) %s\n",i,obj);
		}
		System.out.println();
	}
	
	public static void printCollection(Collection<?> collection) { //recibe un lista de lo que sea 
		int i=0;
		for(Object obj : collection) {
			System.out.printf("%2d) %s\n",i++,obj);
		}
		System.out.println();
	}
	
	
	//cuando hay dependencia de tipos si usamos las letras
	public static <T> int frequency(T toFind, Collection<T>collection) {
		int f=0;
		for(T obj : collection) {
			if(obj.equals(toFind)) 
				f++;
		}
		return f;
	}
	
	public static int greatestInteger(Collection <Integer> collection) {
		int g= Integer.MIN_VALUE;
		for(int x: collection) {
			if(x>g) g=x;
		}
		return g;
	}
	
	
	public static double greatestNumber(Collection <? extends Number> collection) {
		double g=Double.NEGATIVE_INFINITY;
		for(Number x: collection) {
			double d = x.doubleValue();
			if(d > g) g = d;
			
			//collection.add(4.5);  no se puede hacer esto cuando
			//usamos wild car
			//pq estamos suponiendo y a lo mejor no es de eso
			// no se tiene certeeza del tipo exacto de cada objeto
			
		}
		return g;
	}
	
	
	public static <T> void changeQueue (Queue<? extends T> src, Queue<? super T> dest) {
		T polled=src.poll();
		dest.offer(polled);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> strList = new ArrayList<>();
		strList.add("uno");
		strList.add("dos");
		strList.add("tres");
		strList.add("tres");
		strList.add("tres");
		
		
		
		ArrayList<Integer> intList = new ArrayList<>();
		for(int i=1;i<=5;i++) intList.add(i*100);
		
		Vector<Date>dateVector = new Vector <>();
		dateVector.add(new Date());
		dateVector.add(new Date(15,3,2020));
		dateVector.add(new Date(28,11,2021));
		
		
		Stack <Object> objStack = new Stack <>();
		objStack.push(4.56);
		objStack.push("Hola");
		objStack.push(new Date());
		
		Queue<Double> dblQueue = new PriorityQueue<>();
		dblQueue.offer(4.5);
		dblQueue.offer(2.4);
		dblQueue.offer(3.7);
		
		/*
		Queue<RGBColor> colorQueue = new PriorityQueue<>();
		colorQueue.offer(new RGBColor());
		colorQueue.offer(new RGBColor(120,80,250));
		colorQueue.offer(new RGBColor(240,120,100));
		colorQueue.offer(new RGBColor(240,120,100));
		*/
		printList(strList);
		printList(intList);
		printList(dateVector);
		printList(objStack);
		
		System.out.println(frequency("tres", strList));
		
		//System.out.println(greatestInteger(intList));  la coleecion debio de ser crreada con Number
		//System.out.println(greatestNumber(dblQueue));
		
		System.out.println(greatestInteger(intList));  
		System.out.println(greatestNumber(dblQueue));

	}

}

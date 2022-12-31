import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.iteso.model.Date;

import java.lang.*;
public class Sesion26 {

	
	static class StringComparator implements Comparator <String>{

		@Override
		public int compare(String s1, String s2) {
			if(s1.length() < s2.length()) return -1;
			if(s1.length() == s2.length()) return s1.compareTo(s2);
			return 1;
		}

		
		
	}
	
	public static void main(String[] args) {
		Set<String>  strSet = new HashSet<>();
		strSet.add("uno");
		strSet.add("uno");
		strSet.add("dos");
		strSet.add("dos");
		System.out.println(strSet);
		
		Set<Date> dateSet = new HashSet<>();
		dateSet.add(new Date());
		dateSet.add(new Date());
		dateSet.add(new Date(3,5,2022));
		dateSet.add(new Date(3,5,2022));
	//sobreescirbir oublic int hashCode(){ en date 
		
		final int N=100;
		dateSet = new HashSet<>();
		int hashCalls=0;
		for(int i=0; i<N; i++) dateSet.add(Date.randomDate());
		
		
	}
	
	
	public static void main1(String[] args) {
		// TODO Auto-generated method stub
		List<String> strList = new ArrayList<>();
		Collections.addAll(strList, "uno","cuatro","seis","cinco","veinte","catorce","dos","ya");
		System.out.println(strList);
		Collections.sort(strList);
		System.out.println(strList);
		
		StringComparator strCmp = new StringComparator();
		Collections.sort(strList, strCmp);
		System.out.println(strList);
		
		Comparator<String> stringComparator = new Comparator<String>() {
			public int compare(String s1, String s2) {
				if(s1.length() < s2.length()) return -1;
				if(s1.length() == s2.length()) return s2.compareTo(s1);
				return -1;
				
			}
		};
		
		Collections.sort(strList, stringComparator);
		System.out.println(strList);
		
		
		//solucion utilizando expresiones lambda, aprovechando que Comparator<T> es interfaz funcional (un solo metodo)
		Comparator<String> stringComparator1 =(s1,s2) ->{
			if(s1.length() < s2.length()) return -1;
			if(s1.length() == s2.length()) return s2.compareTo(s1);
			return 0;
		};
		
		Collections.sort(strList,stringComparator1);
		System.out.println(strList);
		
	}

}

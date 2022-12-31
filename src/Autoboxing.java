
public class Autoboxing {
	
	public static void main(String[] args) {
		int i=560;
		Integer I= new Integer(i);   //boxing
		double d= 98.3;
		Double D= new Double(d);
		
		int j= I.intValue(); //unboxing
		System.out.println(j);
		double e= D.doubleValue();
		System.out.println(e);
		
		
		
		//Autoboxing a partir de java 5
		int k=1080;
		Integer K=k;
		
		int l=K;
		System.out.println(l);
		
		
		i=j+k; //auto-unboxing, saca,os el entero de k para poder sumar con j
		
		I=I+K;
	}

}

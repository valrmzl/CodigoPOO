
public class sesion4 {

	public static void main(String[] args) {
		// 5^8
		double p=Math.pow(5, 8);
		System.out.println(p);
		
		double d=Math.abs(-56.78f);
		System.out.printf("%.2f\n",d);
		
		//ceil redondea a arriba
		double c=Math.ceil(7.8);
		System.out.println(" ceil de 7.8: "+c);
		double c1=Math.ceil(7.4);
		System.out.println(" ceil de 7.4: "+c1);
		
		//round es sumarle .5 y se le quita la parte decimal
		
		double r=Math.round(4.5);
		System.out.println("round 4.5: "+r);
		
		
		
		//floor es el entero que sigue hacia abajo
		System.out.println("Floor de 6.2: "+Math.floor(6.2));
		System.out.println("Floor de 6.2: "+Math.floor(7.8));
		
		
		
		
		//PROMOCION DE TIPOS
		//se hace con el más grande
		System.out.println("Promocion de tipos: "+(3.4+5.6f+34+100L+" 100")+" se hizo string");
		
		
		//aplicar CAST para hacer reduccion, entre parentesis el tipo de dato destino
		//es necesario cuando la asignacion es tipo pequeño=grande
		double d1=35.147;
		int i1= (int)d1;
		System.out.println("Cast: "+i1);
		
		
		//operadores relacionales 
		//comparan valores numericos, logicos o caracteres, devuelven rue o false 
		
		
		
		//operador ternario
		int t1=-56;
		int t2= t1 <0 ? -1*t1 : t1;
		System.out.println("Operador ternario: "+t2);
		
		
		String s1="Vale";
		String s2="Vale";
		String s3= new String("Vale");
		String s4= new String("Vale");
		
		System.out.println(s1==s2);
		System.out.println(s1==s4);
		System.out.println(s3==s4);
		
		//tmb se puede comprar referencias directas
		System.out.println("Impresion de las referencias de cada uno de los strings: ");
		System.out.print(System.identityHashCode(s1));
		System.out.printf("   En hexa: %X\n",System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(s3));
		System.out.println(System.identityHashCode(s4));
		
		
		//Comparar contenido
		System.out.println("S1 y s2: "+ s1.equals(s2));
		System.out.println("S1 y s4: "+ s1.equals(s4));
		//ahora ver si no es el mismo contenido, es decir negarlo
		System.out.println("S1 y s2: "+ (!s1.equals(s2)));
		
		

	}

}

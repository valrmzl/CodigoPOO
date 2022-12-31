package com.iteso.math.test;

import com.iteso.math.Utils;
import com.iteso.math.exceptions.NegativeNumberFoundException;

public class TestUtils {
	//porpaga la exepcion
	//aimplifica la codificacion pq eliminamos todos los try catch
	//supone que los argumentos siempre son correctos 
	//si hay error el porgrama termina de forma prematura
	public static void main(String[] args) throws NegativeNumberFoundException {
		double x=-10;
		double sq=Utils.squareRoot(x);
		System.out.printf("La raiz de %.1f es %f\n",x,sq);
	
	
	}

	public static void main1(String[] args) {
		
	
		double x=10;
		try {
			double sq=Utils.squareRoot(x);
			System.out.printf("La raiz de %.1f es %f\n",x,sq);
		} catch (NegativeNumberFoundException e) {
			//System.out.println(e);
			e.printStackTrace();
		}
	
		double a=4, b=2, c=3;
		try {
			double x2 = Utils.solve(a, b, c);
			System.out.printf("La solución es: x= %.4f\n", x2);
		} catch (NegativeNumberFoundException e) {
			e.printStackTrace();
			System.out.println("La ecuacion no tiene solucion");
		}
		
		
		double m=Utils.magnitude(-3, 4);
		System.out.println("Magnitud: "+m);
		

	}

}

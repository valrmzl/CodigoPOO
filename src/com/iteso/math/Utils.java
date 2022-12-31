package com.iteso.math;

import com.iteso.math.exceptions.NegativeNumberFoundException;

public class Utils {
	
	
	public static double squareRoot(double x) throws NegativeNumberFoundException {
		if(x<0)
			throw new NegativeNumberFoundException(x);
		double sq = Math.sqrt(x);
		return sq;
	}
	
	
	public static double solve(double a, double b, double c) throws NegativeNumberFoundException {
		return (-b + squareRoot(b * b - 4 * a * c)) / (2*a);
		//aqui se propaga el error pq si puede suceder
	}
	
	
	public static double magnitude(double x, double y) {
		//por la dormula sabemos que no ouede haber error
		//por lo tanto se tiene que manejar sabiendo que no hara 
		double m=0;
		try {
			m = squareRoot(x*x + y * y);
		} catch (NegativeNumberFoundException e) {
		}
		return m;
	}

}

package com.iteso.math.exceptions;

public class NegativeNumberFoundException extends Exception {
	
	
	private double negativeNumber;
	public NegativeNumberFoundException(double negativeNumber) {
		super("NegativeNumberFoundException");  //super.mesagge, la excpecion subrayada
		this.negativeNumber=negativeNumber;
		
	}
	
	
	public String toString() {
		return String.format("%s\nNegative number found: %f",getMessage(), negativeNumber );
	}
	

}

package com.iteso.model;

public class Carta {
	
	public static enum Vocal {A , E , I , O, U};
	
	public static final int CORAZON=0;
	public static final int DIAMANTE=1;
	public static final int ESPADA=2;
	public static final int TREBOL=3;
	
	private int numero=2;
	private int figura;
	
	
	public Carta(int numero, int figura) {
		this.numero=numero;
		if(figura>= CORAZON && figura <= TREBOL)
			this.figura=figura;
	}
	
	
	public int getNumero() {
		return numero;
	}


	public int getFigura() {
		return figura;
	}
	
	public String toString() {
		String strFigura;
		switch(this.figura) {
			case CORAZON : strFigura="Corazón";
			case DIAMANTE : strFigura="Diamante";
			case ESPADA: strFigura="Espada";
			case TREBOL : strFigura="Trebol";
		}
		
		return "Carta [número= "+ numero+", figura= "+figura+"]";
	}
	
	
	public static void main(String[] args) {
		Carta c1 = new Carta(10, Carta.CORAZON);
		Carta c2 = new Carta(8,1);
		Carta c3= new Carta(5,6);
		System.out.println(c1.getFigura());
		System.out.println(c2.getFigura());
		System.out.println(c3.getFigura());
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
	}




}

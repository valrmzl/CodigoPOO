package com.iteso.model;

public class Baraja {
	
	private int numero=2;
	private Figura figura;
	
	public Baraja(int numero, Figura figura) {
		this.numero=numero;
		this.figura=figura;
	}
	
	public int getNumero() {
		return numero;
	}


	public Figura getFigura() {
		return figura;
	}
	
	public String toString() {
		return "Carta [número= "+ numero+", figura= "+figura+"]";
	}
	
	
	public static void main(String[] args) {
		Baraja b1 = new Baraja(10, Figura.TREBOL);
		Baraja b2 = new Baraja(8,Figura.DIAMANTE);
		Baraja b3= new Baraja(5,Figura.ESPADA);
		System.out.println(b1.getFigura());
		System.out.println(b2.getFigura());
		System.out.println(b3.getFigura());
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		
	}


}

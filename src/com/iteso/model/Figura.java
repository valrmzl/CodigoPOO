package com.iteso.model;

public enum Figura {
	//todos estos son estatic public final
	//el admisnirra sus propias instancias
	//pero no se puede instanciar 
	CORAZON("Coraz�n"),
	DIAMANTE("Diamante"),
	ESPADA("Espada"),
	TREBOL("Tr�bol");
	
	private String nombre;
	
	private Figura(String nombre){
		this.nombre=nombre;
	}
	
	
	public String toString() {
		return this.nombre;
	}

}

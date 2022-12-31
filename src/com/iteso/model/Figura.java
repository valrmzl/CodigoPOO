package com.iteso.model;

public enum Figura {
	//todos estos son estatic public final
	//el admisnirra sus propias instancias
	//pero no se puede instanciar 
	CORAZON("Corazón"),
	DIAMANTE("Diamante"),
	ESPADA("Espada"),
	TREBOL("Trébol");
	
	private String nombre;
	
	private Figura(String nombre){
		this.nombre=nombre;
	}
	
	
	public String toString() {
		return this.nombre;
	}

}

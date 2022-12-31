package com.iteso.model;

public enum Dia {
	LUNES("Lunes", "Monday", "Lundi"),
	MARTES("Martes", "Tuesday", "Mardi"),
	MIERCOLES("Miercoles","Wednesday","Mercredi"),
	JUEVES("Jueves","Thursday","Jeudi"),
	VIERNES ("Viernes","Friday","Vendredi"),
	SABADO ("Sabado","Saturday","Samedi"),
	DOMINGO ("Domingo","Sunday","Dimanche");
	
	private String español;
	private String ingles;
	private String frances;
	Idioma idioma=Idioma.ESPAÑOL;

	
	private Dia(String español, String ingles, String frances) {
		this.español=español;
		this.ingles=ingles;
		this.frances=frances;
		
	}

	
	public void cambiarIdioma(Idioma idioma) {
		this.idioma=idioma;
	}
	
	@Override
	public String toString() {
		switch(this.idioma) {
		case ESPAÑOL: return this.español;
		case INGLES: return this.ingles;
		default: return this.frances;
		}
	}

}

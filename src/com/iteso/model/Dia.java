package com.iteso.model;

public enum Dia {
	LUNES("Lunes", "Monday", "Lundi"),
	MARTES("Martes", "Tuesday", "Mardi"),
	MIERCOLES("Miercoles","Wednesday","Mercredi"),
	JUEVES("Jueves","Thursday","Jeudi"),
	VIERNES ("Viernes","Friday","Vendredi"),
	SABADO ("Sabado","Saturday","Samedi"),
	DOMINGO ("Domingo","Sunday","Dimanche");
	
	private String espa�ol;
	private String ingles;
	private String frances;
	Idioma idioma=Idioma.ESPA�OL;

	
	private Dia(String espa�ol, String ingles, String frances) {
		this.espa�ol=espa�ol;
		this.ingles=ingles;
		this.frances=frances;
		
	}

	
	public void cambiarIdioma(Idioma idioma) {
		this.idioma=idioma;
	}
	
	@Override
	public String toString() {
		switch(this.idioma) {
		case ESPA�OL: return this.espa�ol;
		case INGLES: return this.ingles;
		default: return this.frances;
		}
	}

}

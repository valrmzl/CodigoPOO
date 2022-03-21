package com.iteso.model;
public class Persona {
	
	private String nombre, apellido;
	
	public Persona(String n, String a) {
		setNombre(n);
		setApellido(a);
	}
	
	public static void toUpperCase(Persona p) {
		String apellidoMayus=p.apellido.toUpperCase();
		String nombreMayus=p.nombre.toUpperCase();
		p.apellido=apellidoMayus;
		p.nombre=nombreMayus;	
	}
	public String toString() {
		return String.format("%s %s", this.nombre, this.apellido);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	

}

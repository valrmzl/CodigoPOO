package com.iteso.model;



//objetivo:: solo permitir una instancia de la clase en Singleton en "todo el sistema"
// el patron de diseño se vera como una aplicación del modificador static 


public class Singleton {
	
	private static Singleton instance=null;
	
//constructor privado, no permitira ningun new singleton 
	
	private Singleton() {
		System.out.println("se esta creando un singleton");
	}
//metodo que me entrgue la instancia 
	//como puedo invocar el metodo si no hay isntancia? por eso debe de ser static 
	
	
	public static Singleton getInstance() {
		//lazy inicilaizacion
		//crear la instancia solamnete si no se ha creado
		//si pide la instancia por primera vez, si es null la voy a crear, si no siempre la devuelvo
		if(instance==null) instance=new Singleton();
		return instance;
	}
	
	//DATOS QUE NOS INTERESAN EN UN SISTEMA DADO
	//un singleton puede tener una parte no static, que representa la parte de interes
	
	
	private String username;
	private String name, rol;

	public String getUsername() {
		return username;
	}

//si una vairbale es final no existen setters
	public void setUsername(String username) {
		this.username = username;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getRol() {
		return rol;
	}


	public void setRol(String rol) {
		this.rol = rol;
	}
	
	
	@Override
	public String toString() {
		return String.format("%s %s %s", username, name, rol);
	}
	
}

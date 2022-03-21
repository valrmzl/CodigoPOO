package tests;

import com.iteso.model.Persona;

public class TestPersona {

	public static void main(String[] args) {
	
		Persona p1= new Persona("Valeria","Ramírez");
		System.out.println(p1);
		System.out.println("El nombre como se ingreso: "+p1.getNombre());
		Persona.toUpperCase(p1);
		System.out.println(p1);
		System.out.println("El nombre con el cambio a mayusculas: "+p1.getApellido());

	}

}

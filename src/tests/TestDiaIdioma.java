package tests;

import com.iteso.model.Dia;
import com.iteso.model.Idioma;

public class TestDiaIdioma {

	public static void main(String[] args) {
		Dia d1= Dia.LUNES;
		System.out.println(d1);
		d1.cambiarIdioma(Idioma.INGLES);
		
		System.out.println(d1);
		System.out.println("****");
		
		//imprirmir todos los dias de la semana en todos los dias dispoiles en 4 lines de codigo 
		
		for(Dia dia : Dia.values()) {
			for(Idioma idioma: Idioma.values()) {
				dia.cambiarIdioma(idioma);
				System.out.println(dia);
			}
			System.out.println("-------");
		}

	}

}

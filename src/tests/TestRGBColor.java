package tests;
import com.iteso.model.*;

public class TestRGBColor {

	public static void main(String[] args) {
		RGBColor c1= new RGBColor();   //el color predeterminado de 127
		RGBColor c2= new RGBColor(-5,200,120, "Esmeralda");
		RGBColor c3= new RGBColor(220,20,60, "Carmesi");
		RGBColor c4= new RGBColor(18,10,143,"Azul Marino");
		
		
		RGBColor c5= new RGBColor(c2.getCyan(),c2.getMagenta(),c2.getYellow(),"Esmeralda impreso");
		
		System.out.printf(" en hexadecimal %6X, %6X, %6X, %6X, %6X",c1.getRGB(),c2.getRGB(),c3.getRGB(),c4.getRGB(),c5.getRGB());
		

	}

}

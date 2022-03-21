package tests;


import windows.BasicWindow;
import windows.ExtendedWindow;
public class TestWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BasicWindow bw1= new BasicWindow();
		bw1.display(); //locacion 0,0 por default y dimension de 10x15
		bw1.reisze(100, 80);
		bw1.display();
		System.out.println("minimos de una de una ventana basica: "+BasicWindow.MIN_WIDTH+" "+BasicWindow.MIN_HEIGHT);
		
		
		//haciendo uso de una extensión
		ExtendedWindow ew1= new ExtendedWindow(50,75,400,300,"My first window");
		
		//SERVICIOS AÑADIDOS del extended
		//ver las dimensines de sus maximos
		System.out.println("maximos de una de una ventana extendida: "+ExtendedWindow.MAX_X+" "+ExtendedWindow.MAX_Y);
		ew1.move(-15, 25);
		
		//SERVICIOS HEREDADOS A extendedWindow
		
		
	}

}

package tests;

import shapes2d.Rectangle;

public class TestRectangle {

	public static void main(String[] args) {
		//Clase apuntador = new Clase();
		Rectangle r1=new Rectangle(10,6.5);
		r1.print();
		//System.out.println(r1.getBase());
		r1.setBase(-5);
		r1.setHeight(8);
		r1.print();
		//r1.base=10;
		//r1.height=6.5;
		//r1.print();
		
		
		Rectangle r2=new Rectangle();
		//r2.base=r1.perimeter()/2;
		//r2.height=2*r1.height;
		r2.print();
		
		Rectangle r3=new Rectangle();
	//	r3.base=r2.base;
		//r3.height=r1.area();
		r3.print();
		
		Rectangle r4= new Rectangle(5.2);
		r4.print();
		
		Rectangle r5= new Rectangle();
		r5.print();
		
		System.out.println(r5);
		
		String s=  "Rectangulo "+r1;
		System.out.println(s);
		
	}

}

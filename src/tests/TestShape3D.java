package tests;

import shapes3d.Shape3D;
import shapes3d.Cylinder;
import shapes3d.Sphere;

public class TestShape3D {
	
	public static double totalVolume(Shape3D[] shapes) {
		double total=0;
		for(Shape3D sh: shapes) {  //sh la figura que es POLIMORFISMO
			total+=sh.volume();    //el volume que se invoca es el del objeto ENLACE DINAMICO 
			System.out.println(sh+"\n");
		}
		
		return total;
	}
	
	
	public static void moveAll(Shape3D[] shapes, double x, double y, double z) {
		for(Shape3D sh: shapes) {
			sh.move(x, y, z);
			
		}
	}
	
	public static void resizeAllSpheres(Shape3D[] shapes, double dr) {
		//si es una esfera, trata a ala figursa como esfera y cambiale al tamaño
		for(Shape3D sh: shapes) {
			if(sh instanceof Sphere) {
				//Sphere sphere =(Sphere) sh;
				//sphere.resize(dr);
				((Sphere) sh).resize(dr);
			}
		}
	}

	public static void main(String [] args) {
		
		Sphere sph1= new Sphere(0,0,0,5);
		Cylinder cyl2= new Cylinder(3,2,-4,1.5,6.8); //stsos ya estan casadps, solo puedo apuntar a ese mismo tipo de figura
		Shape3D sh3 = new Sphere(-3,-1,5, 3.5);
		Shape3D sh4 = new Cylinder(2,-1,2,3.5,6.5);
		
		Shape3D[] shapes= {sph1, cyl2, sh3, sh4, new Sphere(2,1,-5,4.0)};
		double v=totalVolume(shapes);
		System.out.println(v);
		
	}

}

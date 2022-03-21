package shapes3d;

public class Cylinder extends Shape3D {
	
	private double radius=1, height=1;
	

	public Cylinder(double x, double y, double z,double r, double h) {
		super(x, y, z);
		if(r>0) radius=r;
		if(h>0) height=h;
		
	}
	
	public double getRadius() {
		return radius;
	}



	public double getHeight() {
		return height;
	}
	
	public void resize(double dr, double dh) {
		if(this.radius+dr>0 && this.height+dh>0) {
			this.radius+=dr;
			this.height+=dh;	
		}
	}


	@Override
	public double area() {
		
		return (2*Math.PI*Math.pow(radius,2))+(2*height*Math.PI*radius);
	}

	@Override
	public double volume() {
		
		return height*Math.PI*Math.pow(radius,2);
	}
	
	@Override
	public String toString() {
		return String.format("CILINDRO\nRadio de la base: %.1f\nAltura: %.1f\n%s", radius,height,super.toString());
	}

}

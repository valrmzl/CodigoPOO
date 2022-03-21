package shapes3d;

public class Sphere extends Shape3D {

	private double radius=1;
	
	public Sphere(double x, double y, double z, double radius) {
		super(x, y, z);
		if(radius>=0) this.radius=radius;
	}

	@Override
	public double area() {
		return 4*Math.PI*this.radius*this.radius;
	}

	@Override
	public double volume() {
		return 4.0/3*Math.PI*Math.pow(this.radius,3);
	}
	
	@Override
	public String toString() {
		return String.format("ESFERA\nRadio: %.1f\n%s",this.radius,super.toString());
	}
	
	public double getRadious() {
		return this.radius;
	}
	
	public void resize(double dr) {
		if(this.radius+dr>0)
			this.radius+=dr;
	}

}

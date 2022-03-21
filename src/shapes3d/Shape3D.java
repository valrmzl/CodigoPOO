package shapes3d;

public abstract class Shape3D {

	protected double x,y,z;
	
	public Shape3D(double x, double y, double z){
		//comviene llamar move pq estan en 0
		move(x,y,z);
		
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public double getZ() {
		return z;
	}
	
	
	public void move (double dx, double dy, double dz) {
		this.x+=dx;
		this.y+=dy;
		this.z+=dz;
	}
	
	public String toString() {
		return String.format("Coordenadas: <%.1f, %.1f, %.1f>\nArea: %.2f\nVolumen: %.2f ", this.x,this.y,this.z,area(),volume());
	}
	
	//con esto obligamos a la clase hija que tenga esos metodos
	public abstract double area();
	
	public abstract double volume();

}

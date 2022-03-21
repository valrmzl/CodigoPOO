package shapes2d;

public class Rectangle {
	//definir los atributos 
	//como hay un + hay que poner public y poner eñ tipo de datos
	private double base=1;
	private double height=1;
	
	//se recomienda tener uno tmb que no tenga nada
	public Rectangle() {
		this(1,1); //asi para llamar a otro constructor
		
	}
	
	
	//constructor, es el mismo de la clase, no tiene de vuelto, ni void, es un metodo de entrada y es el primero que se ejecuta
	public Rectangle(double base, double height){
		//this es un apuntador al objeto que se esta creando y que le de ese atributo
		//aqui si es necesario, y ya despues para buenas practicas 
		setBase(base);
		setHeight(height);
		
	}
	
	public Rectangle(double lenght) {
		this(lenght,lenght); //llama al constructor Rectangle(double base, double height) y tiene que ser la primera linea de codigo
	}
	
	
	//metodo que permite leer el atributo
	public double getBase() {
		return this.base;
		
	}
	public double getHeight() {  //tipo para lectura desde el otro archivo, consultar , de adentro hacia afuera
		return this.height;
		
	}
	
	public void setBase(double base) {
		if(base>0) this.base=base;
		
	}
	
	public void setHeight(double height) {
		if(height>0) this.height=height;
	}

	
	//definir metodo
	//los 3 trabajan con los atributos de la clase 
	public double getArea() {
		return base*height;
	}
	
	public double getPerimeter() {
		return 2*(base+height);
		
	}
	
	public void print() {
		System.out.printf("base: %.1f, height: %.1f, area: %.1f, perimeter: %.1f \n",base,height,getArea(),getPerimeter());	
	}
	
	@Override 
	public String toString() {
		return String.format("Funcion mia toString: base: %.1f, height: %.1f, area: %.1f, perimeter: %.1f",this.base,this.height,getArea(),getPerimeter());
	}
	
	public boolean equals(Object o) {
		//cast de lo general a lo particular 
		//"trata este objeto como un rectangulo"
		if(!(o instanceof Rectangle)) return false;
		Rectangle r=(Rectangle ) o;
		return this.base==r.base && this.height==r.height; //el this refiere al lado izquierdo del punto
	}

}

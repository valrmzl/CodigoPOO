package windows;

public class ExtendedWindow extends BasicWindow {

	
	//constantes de clase 
	public static final int MAX_X=1200, MAX_Y=1080;
	
	//atributos de objeto
	protected String title;
	
	//invocar constructor con super
	
	public ExtendedWindow(String title) {
		//la llamada super debe de ser la pirmer llamada
		//todo cosntructor debe de comenzar con una llamada a un oconstructor de la clase padre, si no lo tiene entonces-->
		//por omisoon , el compilador añade 'super()'
		super(); //invocar al constructor BasicWindow
		this.title=title;
	}

	public ExtendedWindow(int x, int y, int width, int height, String title) {
		super(x,y,width, height);
		this.title=title;
		
	}
	
	
	@Override 
	//sobreescriura del metodo siplay de BasicWindow
	//Estamos cancelando la llamada de BasicWindow.dispaly() desde objetos de tipo ExtendedWindow
	public void display() {
		//impirm el tirulo y lo que ya tenia el otro
		System.out.printf("Title: %s\n",this.title);
		//para que el atributo lo busque en la clase padre es:
		//con super comienza la busqueda de clase padre, y de abuelo (object en general)
		super.display();
	}
	
	
	//metodo completamnete nuevo
	public void move(int dx, int dy) {
		
		
		//la busqueda de la variable x comienza en el metodo, no hay ninguno
		//si no se encunetra lo busca en los atributos de extended window
		//si no se encuentra lo busca en los atributos del padre, del basic window, pero que sea protegio o publico
		
		//super.x, this.x, y x  refieren a mismo
		//depende de lo que use es donde va a comenzar la busqueda de ese atributo 
		super.x += dx;
		super.y +=dy;
		
		if(super.x< 0) super.x=0;
		else if(super.x>MAX_X)  super.x = MAX_X;
		
		
		if(super.y< 0) super.y=0;
		else if(super.y>MAX_Y)  super.y = MAX_Y;
		
	}

}

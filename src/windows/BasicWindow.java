package windows;

public class BasicWindow {
	
	//constantes de clase
	public static final int MIN_WIDTH=10, MIN_HEIGHT=15;
	
	//protected es como abrirlo a medias 
	protected int x, y, width, height;
	
	
	public BasicWindow(int x, int y, int w, int h) {
		this.x = x < 0 ? 0 : x;
		this.y = y < 0 ? 0 : y;
		this.width = width < MIN_WIDTH ? MIN_WIDTH : w;
		this.height = height < MIN_HEIGHT ? MIN_HEIGHT : h;
	}
	
	public BasicWindow() {
		this.x = this.y = 0;
		this.width = MIN_WIDTH;
		this.height = MIN_HEIGHT;
	}
	
	public void display() {
		System.out.printf("Location: (%d, %d)\n",this.x,this.y);
		System.out.printf("Dimensions: %d x %d\n", this.width,this.height);
		System.out.println("---------------------");
	}
	
	
	public void reisze(int dw, int dh){
		
		this.width += dw;
		this.height += dh;
		if (width < MIN_WIDTH) this.width = MIN_WIDTH;
		if (height < MIN_HEIGHT) this.height = MIN_HEIGHT;
		
	}
}

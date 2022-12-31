
package com.iteso.model;

public class RGBColor {

	private int red=0;
	private int green=0;
	private int blue=0;
	private String name ="Undefined";
	
	public RGBColor(int red, int green, int blue) throws IllegalArgumentException {
		//aqui definimos el gris con el 127
		//mandar a llamar a los setters para validar
		setRed(red);
		setGreen(green);
		setBlue(blue);
	}
	
	public RGBColor(int red, int green, int blue, String name)  throws IllegalArgumentException{
		this(red,green,blue);
		setName(name);
	}
	
	public RGBColor() { //el predetermiando 
		this(127,127,127,"Gray");
		
	}

	public int getRed()  {
		return this.red;
	}

	public void setRed(int red) throws IllegalArgumentException {  //en los sest validamos 
		if(red>=0 && red<=255) this.red = red;
		else throw new IllegalArgumentException("Invalid red value found: "+red);
	}

	public int getGreen() {
		 return this.green;
	}

	public void setGreen(int green) throws IllegalArgumentException {
		if(green>=0 && green<=255)this.green = green;
		else throw new IllegalArgumentException("Invalid green value found: "+green);
	}

	public int getBlue() {
		return this.blue;
	}

	public void setBlue(int blue) throws IllegalArgumentException {
		if(blue>=0 && blue<=255) this.blue = blue; //se valida el atributo
		else throw new IllegalArgumentException("Invalid blue value found: "+blue);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) throws IllegalArgumentException {
		if(name!=null) this.name = name;
		else throw new IllegalArgumentException("Name should not be null");
	}
	
	
	//los complementos
	
	public int getCyan() {
		return 255-getRed();
	}
	
	public int getMagenta() {
		return 255-getGreen();
	}
	
	public int getYellow() {
		return 255-getBlue();
	}
	
	public int getRGB() {
		return getBlue() | (getGreen() <<8 )| (getRed()<<16);
		
	}
	
	@Override
	public String toString() {
		return "RGBColor [red=" + red+ ", green= "+green+", blue= "+blue+", name="+name+"]";
	}
	
	public static void main(String[] args) {
		RGBColor c1= new RGBColor(100,200,50);
		System.out.println(c1);
	}
	
	


	
	

}




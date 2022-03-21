
package com.iteso.model;

public class RGBColor {

	private int red=0;
	private int green=0;
	private int blue=0;
	private String name ="Undefined";
	
	public RGBColor(int red, int green, int blue) {
		//aqui definimos el gris con el 127
		//mandar a llamar a los setters para validar
		setRed(red);
		setGreen(green);
		setBlue(blue);
	}
	
	public RGBColor(int red, int green, int blue, String name) {
		this(red,green,blue);
		setName(name);
	}
	
	public RGBColor() { //el predetermiando 
		this(127,127,127,"Gray");
		
	}

	public int getRed() {
		return this.red;
	}

	public void setRed(int red) {  //en los sest validamos 
		if(red>=0 && red<=255) this.red = red;
	}

	public int getGreen() {
		 return this.green;
	}

	public void setGreen(int green) {
		if(green>=0 && green<=255)this.green = green;
	}

	public int getBlue() {
		return this.blue;
	}

	public void setBlue(int blue) {
		if(blue>=0 && blue<=255) this.blue = blue; //se valida el atributo
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if(name!=null) this.name = name;
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


	
	

}




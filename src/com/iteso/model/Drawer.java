package com.iteso.model;

public class Drawer {

	//puede ser lo que sea, es como el void *
	private Object objectInDrawer=null; //asi indicamos que esta vacio sin necesidad de declarar otra cosa
	
	public void store(Object objectToStore) {
		//System.out.println(objectToStore.getClass()); para ver si se hizo un wrapper 
		if(this.objectInDrawer==null)
			this.objectInDrawer=objectToStore;
	}
	
	
	public Object peek() {
		return this.objectInDrawer;
	}
	
	
	public Object poll() {
		Object tmp= this.objectInDrawer;
		this.objectInDrawer=null;
		return tmp;
		
	}

	
	@Override
	public String toString() {
		if(this.objectInDrawer==null)
			return "Cajón vacio";
		else return "Cajón con: "+ this.objectInDrawer;
				
	}
	
	
	public static void main(String[] args) {
		Drawer d1= new Drawer();
		System.out.println(d1);
		
		d1.store("una cadena de texto");
		System.out.println(d1);
		
		//que pasa si le mando un primitivo??
		//se hace con un autboxing, y se pasa como un wrapper 
		
		Object o1=d1.peek();
		System.out.println(o1);
		//si estoy segura dle tipo de dato que estoy hablando, le tengo qe hacer un cast
		String s1= (String) d1.peek();
		System.out.println(s1.toUpperCase());
		


	}

}

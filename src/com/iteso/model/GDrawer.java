package com.iteso.model;

public class GDrawer<Type> { //Generic Drawer
	
	//reemplaza todos los type por lo que esa recibiendo 
	
	//puede ser lo que sea, es como el void *
	private Type objectInDrawer=null; //asi indicamos que esta vacio sin necesidad de declarar otra cosa
	
		public void store(Type objectToStore) {
			//System.out.println(objectToStore.getClass()); para ver si se hizo un wrapper 
			if(this.objectInDrawer==null)
				this.objectInDrawer=objectToStore;
		}
		
		
		public Type peek() {
			return this.objectInDrawer;
		}
		
		
		public Type poll() {
			Type tmp= this.objectInDrawer;
			this.objectInDrawer=null;
			return tmp;
			
		}

		
		@Override
		public String toString() {
			if(this.objectInDrawer==this)
				return "Cajon que se almacena a si mismo";
			if(this.objectInDrawer==null)
				return "Cajón vacio";
			else return "Cajón con: "+ this.objectInDrawer;
					
		}
			

	public static void main(String[] args) {
		GDrawer<String> gd1= new GDrawer<>();
		System.out.println(gd1);
		
		gd1.store("una cadena de texto");
		System.out.println(gd1);
		
		//si quisiera almacenar un color ya no podria 
		//ahi si ya habria error de sintaxis, pq esta recibiendo de tipo string
		
		GDrawer<RGBColor> gd2 = new GDrawer<>();
		gd2.store(new RGBColor(100,200,150));
		System.out.println(gd2);
		
		
		GDrawer<Number> gd3= new GDrawer<>();
		
		
		
		//cajon que guarde un cajonn y adentro algo
		
		GDrawer<GDrawer<RGBColor>> gd4= new GDrawer<>();
		gd4.store(gd2);
		System.out.println(gd4);
		
		//cajon que sea capaz de almacenarse a si mismo
		GDrawer<Object> gd5 =new GDrawer<>();
		gd5.store(gd5);
		System.out.println(gd5);
		
		
		
	}

}

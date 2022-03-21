
public class upper {
	
	public static class Persona{
		
		String nombre, apellido;
		
		public Persona(String n, String a) {
			this.nombre=n;
			this.apellido=a;
		}
		
		public static void toUpperCase(Persona p) {
			String apellidoMayus=p.apellido.toUpperCase();
			String nombreMayus=p.nombre.toUpperCase();
			p.apellido=apellidoMayus;
			p.nombre=nombreMayus;	
		}
		
		public String toString() {
			return String.format("%s %s", this.nombre, this.apellido);
		}
		
		public static void main(String[] args) {
			Persona p1= new Persona("Juan","Perez");
			System.out.println(p1);
			toUpperCase(p1);
			System.out.println(p1);
	
		}
		
		
		
	}
	

}

import javax.swing.JOptionPane;
public class Sesion5 {

	public static void main(String[] args) {
		
		char letra;
		for(letra='A';letra<='Z';letra++)
			System.out.print(letra+" ");
		System.out.println();
	
		//si quisiera usar esa variable ya no ouedo, pq esta incializada en el for
		
		System.out.println(letra);
		
		for(double x=0;x<Math.PI; x+=Math.PI/180)
			System.out.println(Math.sin(x));
		
		
		
		
		
		
		//try siempre lleva llaves
		try{
			String velocidadStr=JOptionPane.showInputDialog("¿Que distancia vas a recorrer? (km/h)");
			double velocidad=Double.parseDouble(velocidadStr);
			if(velocidad>90) System.out.println("Fotoinfracción");
			String distanciaStr=JOptionPane.showInputDialog("¿Que distancia vas a reocrrer (km) ");
			double distancia=Double.parseDouble(distanciaStr);
			
			//v=d/t  
			double tiempo=distancia/velocidad;
			JOptionPane.showMessageDialog(null, String.format("Llegaras en %.1f horas", tiempo));
			
		} catch (Exception ex){
			JOptionPane.showMessageDialog(null,"No se capturo un numero correcto");
			
		}
		
		JOptionPane.showMessageDialog(null, "Fin del programa");
		
		
		
		
		

	}

}

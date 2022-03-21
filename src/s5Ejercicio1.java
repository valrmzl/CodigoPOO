import javax.swing.JOptionPane;

public class s5Ejercicio1 {

	public static void main(String[] args) {
		char c1;
		for(c1 = 'A'; c1 <= 'z'; c1 ++) {
			System.out.print(c1);
		}
		System.out.println();
		System.out.println(c1);

		for(double x = 0; x < 2 * Math.PI; x += Math.PI / 180) {
			System.out.println(Math.sin(x));
		}
		
//		try {
//			String velStr = JOptionPane.showInputDialog("¿Cuál es tu velocidad actual (km/h)?");
//			double vel = Double.parseDouble(velStr);
//			//if(vel > 90) System.out.println("Fotoinfracción");		
//			String distStr = JOptionPane.showInputDialog("¿Qué distancia vas a recorrer (km)?");
//			double dist = Double.parseDouble(distStr);
//			// v = d/t,  tv = d, t = d/v
//			double t = dist / vel;
//			JOptionPane.showMessageDialog(null, String.format("Llegarás en %.1f horas", t));
//		} catch(Exception ex) {
//			System.out.println(ex);
//			JOptionPane.showMessageDialog(null, "No se capturó un número correcto");
//		} 
//		
//		JOptionPane.showMessageDialog(null, "Fin del programa");
		
		
		/*
		double vel = 0, dist = 0;
		try {
			String velStr = JOptionPane.showInputDialog("¿Cuál es tu velocidad actual > 0 (km/h)?");
			vel = Double.parseDouble(velStr);
		} catch(Exception ex) {
			System.out.println(ex);
			JOptionPane.showMessageDialog(null, "No se capturó una velocidad correcta");
		} 
				
		try {
			String distStr = JOptionPane.showInputDialog("¿Qué distancia vas a recorrer > 0 (km)?");
			dist = Double.parseDouble(distStr);
		} catch(Exception ex) {
			System.out.println(ex);
			JOptionPane.showMessageDialog(null, "No se capturó una distancia correcta");
		} 
		
		if(vel > 0 && dist > 0) {
			double t = dist / vel;
			JOptionPane.showMessageDialog(null, String.format("Llegarás en %.1f horas", t));
		}
		*/
		
		int a = 50, b = 1;
		int c = a / b;
		System.out.println(c);
//		String s1 = null;
//		String s2 = s1.toUpperCase();
//		System.out.println(s2);
//		int[] array = { 1, 2, 3 };
//		array[5] = 5;
//		System.out.println(array[0]);
		
//		Ejercicio 3: solicitar el precio de un producto (número real y mayor que cero)
		
		/*
		double precio = 0;
		do {
			String precioStr = JOptionPane.showInputDialog("Precio del producto: ");
			if(precioStr == null) break;
			if(precioStr.equals("")) continue;
			try {
				precio = Double.parseDouble(precioStr);
				if(precio <= 0) JOptionPane.showMessageDialog(null, "El precio no es mayor que $0.00");
			} catch(NumberFormatException ex) {
				JOptionPane.showMessageDialog(null, "El precio no es un número real válido");
			}
		} while(precio <= 0);
		
		if(precio > 0)
			JOptionPane.showMessageDialog(null, String.format("Precio más IVA: $%.2f", precio * 1.16));
			*/
		
		//EJERCICIO DE CONRASEÑA 
		
		String clave="abc123";
		int intentos=0;
		String contraseña;
		
		do
		{
			contraseña=JOptionPane.showInputDialog("Ingresa la contraseña: ");
			if(contraseña==null)break;
			if(contraseña.equals(""))continue;
			if(!contraseña.equals(clave))
			{
				intentos++;
				JOptionPane.showMessageDialog(null, "Esa no es la contraseña, intente de nuevo");
			}else{
				JOptionPane.showMessageDialog(null, String.format("Acertaste en %d intentos", intentos));
				break;
			}
				
			
		}while(contraseña!=clave);
		
		
	}

}


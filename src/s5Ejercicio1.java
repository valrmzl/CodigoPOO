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
//			String velStr = JOptionPane.showInputDialog("�Cu�l es tu velocidad actual (km/h)?");
//			double vel = Double.parseDouble(velStr);
//			//if(vel > 90) System.out.println("Fotoinfracci�n");		
//			String distStr = JOptionPane.showInputDialog("�Qu� distancia vas a recorrer (km)?");
//			double dist = Double.parseDouble(distStr);
//			// v = d/t,  tv = d, t = d/v
//			double t = dist / vel;
//			JOptionPane.showMessageDialog(null, String.format("Llegar�s en %.1f horas", t));
//		} catch(Exception ex) {
//			System.out.println(ex);
//			JOptionPane.showMessageDialog(null, "No se captur� un n�mero correcto");
//		} 
//		
//		JOptionPane.showMessageDialog(null, "Fin del programa");
		
		
		/*
		double vel = 0, dist = 0;
		try {
			String velStr = JOptionPane.showInputDialog("�Cu�l es tu velocidad actual > 0 (km/h)?");
			vel = Double.parseDouble(velStr);
		} catch(Exception ex) {
			System.out.println(ex);
			JOptionPane.showMessageDialog(null, "No se captur� una velocidad correcta");
		} 
				
		try {
			String distStr = JOptionPane.showInputDialog("�Qu� distancia vas a recorrer > 0 (km)?");
			dist = Double.parseDouble(distStr);
		} catch(Exception ex) {
			System.out.println(ex);
			JOptionPane.showMessageDialog(null, "No se captur� una distancia correcta");
		} 
		
		if(vel > 0 && dist > 0) {
			double t = dist / vel;
			JOptionPane.showMessageDialog(null, String.format("Llegar�s en %.1f horas", t));
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
		
//		Ejercicio 3: solicitar el precio de un producto (n�mero real y mayor que cero)
		
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
				JOptionPane.showMessageDialog(null, "El precio no es un n�mero real v�lido");
			}
		} while(precio <= 0);
		
		if(precio > 0)
			JOptionPane.showMessageDialog(null, String.format("Precio m�s IVA: $%.2f", precio * 1.16));
			*/
		
		//EJERCICIO DE CONRASE�A 
		
		String clave="abc123";
		int intentos=0;
		String contrase�a;
		
		do
		{
			contrase�a=JOptionPane.showInputDialog("Ingresa la contrase�a: ");
			if(contrase�a==null)break;
			if(contrase�a.equals(""))continue;
			if(!contrase�a.equals(clave))
			{
				intentos++;
				JOptionPane.showMessageDialog(null, "Esa no es la contrase�a, intente de nuevo");
			}else{
				JOptionPane.showMessageDialog(null, String.format("Acertaste en %d intentos", intentos));
				break;
			}
				
			
		}while(contrase�a!=clave);
		
		
	}

}


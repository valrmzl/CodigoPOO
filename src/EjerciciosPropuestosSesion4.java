import javax.swing.JOptionPane; 
public class EjerciciosPropuestosSesion4 {

	public static void main(String[] args) {
		
		/*
		 * solicitar datos personales
		 */
		/*
		String nombre=JOptionPane.showInputDialog("Nombre: ");
		String aPaterno=JOptionPane.showInputDialog("Apellido paterno: ");
		String aMaterno=JOptionPane.showInputDialog("Apellido Materno: ");
		
		JOptionPane.showMessageDialog(null, ""+aPaterno.toUpperCase()+" "+
				aMaterno.toUpperCase()+", "
				+nombre.toUpperCase(),
				"Nombre completo",
				JOptionPane.INFORMATION_MESSAGE
				);
				*/
		
		/*
		 *  datos de viaje
		 */
		
		/*
		 String velocidadStr=JOptionPane.showInputDialog("Velocidad promedio en km/h: ");
		 float velocidad=Float.parseFloat(velocidadStr);
		 String distanciaStr=JOptionPane.showInputDialog("Distancia qur falta en km: ");
		 float distancia=Float.parseFloat(distanciaStr);
		 String tiempoStr=JOptionPane.showInputDialog("Tiempo en el que tienes que llegar (min):");
		 float tiempo=Float.parseFloat(tiempoStr);
		 tiempo=tiempo/60;
		 */
		
		
		/*
		 * lenguaje favorito
		 */
		
		
		/*
		String lenguaje=JOptionPane.showInputDialog("Lenguaje mas popular: ");
		switch(lenguaje.toUpperCase())
		{
		case "JAVA":    JOptionPane.showMessageDialog(null,
					    "Su lenguaje es el mas popular",
					    "Lenguajes",
					    JOptionPane.INFORMATION_MESSAGE);
						break;
		case "C": 		JOptionPane.showMessageDialog(null,
				  		"Su leguaje es el segundo más popular",
						 "Lenguajes",
						JOptionPane.INFORMATION_MESSAGE);
						break;
		case "C++":		JOptionPane.showMessageDialog(null, 
						"Su lenguaje es el tercero mas popular",
						lenguaje,
						JOptionPane.INFORMATION_MESSAGE);
						break;
		default: 		JOptionPane.showMessageDialog(null,
						"No existe ese lenguaje" ,
						lenguaje,
						JOptionPane.INFORMATION_MESSAGE);
		
		}
		*/
		String mes=JOptionPane.showInputDialog("Mes:");
		String añoStr=JOptionPane.showInputDialog("Año: ");
		int año=Integer.parseInt(añoStr);
		int dias;
		switch(mes.toLowerCase())
		{
		case "enero":
		case "marzo":
		case "mayo":
		case "julio":
		case "agosto":
		case "octubre":
		case "diciembre":
			dias=31;
			JOptionPane.showMessageDialog(null, "El mes "+mes+" tiene "+dias+" dias",mes,JOptionPane.INFORMATION_MESSAGE);
			break;
		case "abril":
		case "junio":
		case "septiembre":
		case "noviembre":
			dias=30;
			JOptionPane.showMessageDialog(null, "El mes "+mes+" tiene "+dias+" dias",mes,JOptionPane.INFORMATION_MESSAGE);
			break;
		case "febrero":
			if((año%4==0 && año%100!=0)||año%400==0)
			{
				dias=29;
				JOptionPane.showMessageDialog(null, "El mes "+mes+" tiene "+dias+" dias, ademas de que es BISIESTO",mes,JOptionPane.INFORMATION_MESSAGE);
				break;
			}
			dias=28;
			JOptionPane.showMessageDialog(null, "El mes "+mes+" tiene "+dias+" dias",mes,JOptionPane.INFORMATION_MESSAGE);
			break;
		default: JOptionPane.showMessageDialog(null, "El mes "+mes+" no existe","Error",JOptionPane.ERROR_MESSAGE);
		}
		
		
		
		 

	}

}

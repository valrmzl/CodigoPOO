import javax.swing.JOptionPane;   //parte de la API de Java
public class Sesion3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//estatura de una persona
		float estaturaVal=1.68f;
		//tecla presioanda
		char teclaPresionada='A';
		//direccion de memoria de una variable
		int memoryAddress=0x158C_7BF6;
		//el año es bisiesto?
		boolean is2022LeapYear=false;
		//rfc de un cliente
		String itesoRFC="ITE57073PS9";
		//poblacion de la tierra
		long poblacionTierra=7837000000L;
		//masa de un planeta
		double masaJupiter=1.898e27;
		//edad de una persona
		byte edadVale=20;
		
		
		//impresion
		
		System.out.println(estaturaVal);
		System.out.println(teclaPresionada);
		System.out.println(memoryAddress);
		System.out.println(is2022LeapYear);
		System.out.println(itesoRFC);
		System.out.println(poblacionTierra);
		System.out.println(masaJupiter);
		System.out.println("Valeria tiene "+edadVale+" años");
		System.out.println("Ahora con la sintaxis de C");
		System.out.printf("La dirección de memoria es: %X\n",memoryAddress);
		System.out.printf("Tecla presionada: %c. codigo unicode: %d\n",teclaPresionada, (int) teclaPresionada);
		
		JOptionPane.showMessageDialog(null, "Este es mi primer mensaje");
		JOptionPane.showMessageDialog(null,"Hola","Titulo Val",JOptionPane.ERROR_MESSAGE);
		
		
		/*
		 * Para saber cual numero es el que le corresponde
		 */
		System.out.println(JOptionPane.PLAIN_MESSAGE);
		System.out.println(JOptionPane.ERROR_MESSAGE);
		System.out.println(JOptionPane.INFORMATION_MESSAGE);
		System.out.println(JOptionPane.WARNING_MESSAGE);
		System.out.println(JOptionPane.QUESTION_MESSAGE);
		
	
		//solicitud de datos  con cuadro de dialogo
		
		
		//este es el mas sencillo de todos
		JOptionPane.showMessageDialog(null, estaturaVal, "Estatura de Val", JOptionPane.INFORMATION_MESSAGE);
		//creando primero un formato 
		String msg=String.format("Val tiene %d años.\n Val mide %.2f m.",edadVale,estaturaVal);
		JOptionPane.showMessageDialog(null, msg,"Acerca de Val",JOptionPane.INFORMATION_MESSAGE);
		
		
		
		//ENTRADA DE TEXTO 
		
		String nombre=JOptionPane.showInputDialog("¿Como te llamas?:");
		JOptionPane.showMessageDialog(null, "Tu nombre es: "+nombre);
		JOptionPane.showMessageDialog(null, "Tu nombre es mayusculas es: "+nombre.toUpperCase());
		
		
		//todas las entradas deben de ser string y ya despues lo convertimos
		String edadStr=JOptionPane.showInputDialog("¿Cuantos años tienes?:");
		int edad=Integer.parseInt(edadStr);
		edad++;
		JOptionPane.showMessageDialog(null, "El prximo año tendras "+edad+" años");
		
		
		String estaturaStr=JOptionPane.showInputDialog("Introduce tu estatura: ");
		double estatura=Double.parseDouble(estaturaStr);
		JOptionPane.showMessageDialog(null, String.format("Tu estatura es: %.2f m", estatura));
		
		
		
		//ASIGANCIONES Y OPERADORES
		
		double estatura1, estatura2;
		
		estatura= estatura1 = estatura2 =1.75;
		
		int k=5;
		float a =k/2.5f;
		System.out.println(a);
		
		

	}

}

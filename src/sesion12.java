import javax.swing.JOptionPane; //este import es con la primera linea de dialogo
import static javax.swing.JOptionPane.showMessageDialog;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Calendar;

import com.iteso.model.Date.*;
import com.iteso.model.Date;
import com.iteso.*;

import com.iteso.model.Singleton;

public class sesion12 {
	
	public static void main1(String[] args) {
		Date d1= new Date(15,10,2008); //antes de crear este, es la primera vez que usa date y se debe de llamar al constrictor static
		System.out.println(d1);
		Date d2= new Date(15,10,1257);
		System.out.println(d2);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//JOptionPane.showMessageDialog(null, "sesion 12");
		//showMessageDialog(null,"con static al importar");
		//si quiero omitir el JOption debo de importarlo
		//System.out.println(Date.isLeap(1998));
		//System.out.println(Date.isValidDate(30,13,2007));
		
		
		
		//aplicacion modificador static que tiene que ver con diseño
		
		//patron de diseño, objetivo: para una clase dada solo tengas una instancia, y se crea cuando la pidas por primera vez
		
		
		//intentar crear varias instancias de singleton
		//Singleton s1= new Singleton();
		//Singleton s2= new Singleton();
		//como saber si s1 y s2 apuntan a instancias diferentes o a la misma?, 
		//una forma con su hashcode
		
		//System.out.printf("%X   %X\n",s1.hashCode(),s2.hashCode());
		//otra forma comparando sus referencias
		//System.out.println(s1==s2);
		//se puede osbervar que son instancias diferentes 
		
		
		//si ya no puedo crear un new porque esta privado, ahora como le hago?
		//necesitamos un singleton que me entrege algo que sea publico 
		
		Singleton s1=Singleton.getInstance();
		Singleton s2=Singleton.getInstance();
		
		
		System.out.printf("%X   %X\n",s1.hashCode(),s2.hashCode());
		System.out.println(s1==s2);
		
		
		//ahora la parte "no static" de los datos de interes;
		s1.setUsername("valrmzl");
		s1.setName("valeria");
		s1.setRol("student");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(Singleton.getInstance());
		
		
		//seguimos con aplicaciones static->> clase calendar parece singleton pero no lo es, es Fcatory
		Calendar c1=Calendar.getInstance();  //toma una foto del reloj del sistema
		Calendar c2=Calendar.getInstance();
		//sera singleton?? FALSO, no apunta al mismo objeto, 
		//por eso es fabrica, cada que lo llames crea uno nuevo por la diferencia, por eso si tiee sentido tener más obejtos
		System.out.println(c1==c2);
		
		//get y quye campo quiero, a partir de una constante
		System.out.println(("Segundos: "+c1.get(Calendar.SECOND)));
		System.out.println(("Minutos: "+c1.get(Calendar.MINUTE)));
		System.out.println(("Horas: "+c1.get(Calendar.HOUR)));
		System.out.println(("Mes: "+c1.get(Calendar.MONTH)));
		
		
		//Toda la informaciónnesta almacenada en un entero de 64 bits (fecha/hora)
		long timestamp= c1.getTimeInMillis();
		System.out.println("c1 gettimeMillis "+timestamp);
		System.out.println("c2 gettimeMillis "+c2.getTimeInMillis());
		
		
		//utlizando esquema de java 8 localDate, localTime,
		LocalDate today=LocalDate.now();
		System.out.println("hoy: "+today);
		LocalDate otherDay=today.plusDays(6).plusMonths(4).minusYears(15);
		System.out.println(otherDay);
		//preguntar si una fecha esta antes o despues e otro
		System.out.println(today.isAfter(otherDay));
		System.out.println(today.isEqual(otherDay));
		System.out.println(today.isLeapYear());
		
		//si yo quiro una fecha en particular
		LocalDate independenceDay=LocalDate.of(1821, 9, 27);
		System.out.println(independenceDay);
		
		//la hora
		LocalTime now=LocalTime.now();
		System.out.println(now);
		LocalTime time=LocalTime.of(15, 30, 10);
		time=time.plusHours(4).plusMinutes(15).plusSeconds(25);
		System.out.println(time);
		
		
		//ambas
		//LocalDateTime dateTime
		
		

	}

}




////



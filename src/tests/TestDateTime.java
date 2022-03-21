
package tests;
import com.iteso.model.*;
public class TestDateTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<24;i++) {
			DateTime dt1=new DateTime(i,6,3);
			for(int f=0;f<3;f++) {
				dt1.setFormat(f);
				System.out.println(dt1);	
			}
			System.out.println();
		}
		
		DateTime dt2= new DateTime(1,1,1);
		
		DateTime dt3= new DateTime(2,1,1);
		DateTime dt4= new DateTime(1,1,1);
		DateTime dt5= new DateTime(10,3,2022,1,1,1);
		DateTime dt6= new DateTime(10,3,2022,2,1,1);
		System.out.println(dt2.equals(dt3));
		System.out.println(dt2.equals(dt4));
		
		//si comparo un dattime con date es flaso, pues le pide la hora
		//si comparo un date con un datetime si es vrd , hasta le sobran atributos 
		System.out.println("**");
		DateTime dt8=new DateTime(31,12,2021,23,59,59);
		DateTime dt9=dt8.clone();
		System.out.println(dt8.equals(dt9));
		System.out.println(dt8);
		dt8.next();
		System.out.println(dt8);
		System.out.println("****");
		System.out.println(dt8);
		Date todate1=dt8.toDate();
		System.out.println(todate1);

		
		
		//si es un areeglonde vearias clases, ecnontrar el "ancestro en comun"
		
		
		System.out.println("*****************************************");
		System.out.println("clase del lunes 14 de sep");
		
		DateTime time= new DateTime();
		Date date=time;
		date.next();
		System.out.println(date);
		
		time.m6();    //gana el objeto, no encontro m6 y lo busco más arriba, pero el que manda a llamar
		//ese si lo tiene y despues se regresa al que si tiene
		System.out.println("--");
		date.m6();
		System.out.println("*******");
		System.out.println(dt8);
	}

}

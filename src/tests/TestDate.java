package tests;
import java.util.Arrays;

import com.iteso.model.*;

public class TestDate {
	//V A L E R I A     R A M I R E Z 

	public static void main(String[] args) {
		
	//System.out.println(Date.isValidDate(31, 12, 2800));
		//System.out.println(Date.isValidDate(29, 2, 2022));
		//System.out.println(Date.isValidDate(29, 2, 2016));
		
		//System.out.println(Date.isValidDate(1,2, 2016));
		//Date d1=new Date();
		//System.out.println(d1);
		Date d2= new Date(1,12,2001);
		Date d3= new Date(31,12,2018,1);
		Date d4= new Date(13,12,2021,2);
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(d4);
		System.out.println(d2.getMonthName());
		
		//String m2=d2.getMonthName();
		//String m3=d3.getMonthName();
		//String m4=d4.getMonthName();
		
		//System.out.println("referencia del mes de d2: "+m2.hashCode());
		//System.out.println("referencia del mes de d3: "+m3.hashCode());
		//System.out.println("referencia del mes de d3: "+m4.hashCode());
		
		/*
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(d2.isLeap());
		System.out.println(d2.isLeap());
		System.out.println("**");
		System.out.println(Date.isValidDate(29,2,1500));
		*/
		
		
		
		/*
		Date d1=new Date();
		Date d2= new Date(28,2,2022,1);
		Date d3= new Date(31,12,2020,2);
		//Aplicando overrida de toString
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		//Aplicando un next a cada dia
		d1.Next();
		d2.Next();
		d3.Next();
		System.out.println("***");
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		//Clonar fehca y verificar si son iguales
		Date d4=d2.clone();
		System.out.println("***");
		System.out.println(d4.equals(d2));
		System.out.println(d4.equals(d1));
		System.out.println("***");
		d1.setFormat(2);
		System.out.println(d1);
		
		*/
		
		
		
	
		//Date dA= new Date(1,1,2019);  // dia actua, despues de ir realizando los next, funciona como un temporal
		//Date dF= new Date(1,1,2024); //dia final , agregue uno extra para que entrara el que verdaderamnete es el final
		//Date [][][]manyDates = new Date[5][12][31];
		//Date td=dA.clone(); //td= temporal date
		
		//while(!dA.equals(dF)) {
			//manyDates[td.getYear()-2019][td.getMonth()-1][td.getDay()-1]=td;				
			//dA.Next();
			//td=dA.clone();
			//}
			
		//C I C L O   D E    I M P R E S I Ó N 
		/*
		for(Date [][] i :manyDates) {
			for(Date []i1:i) {
				for(Date i2:i1) {
					if(i2!=null) {
						Date f0= new Date(i2.getDay(),i2.getMonth(),i2.getYear(),0);
						Date f1= new Date(i2.getDay(),i2.getMonth(),i2.getYear(),1);
						Date f2= new Date(i2.getDay(),i2.getMonth(),i2.getYear(),2);	
						System.out.println(f0+"     "+f1+"       "+f2+"         ");
						if(i2.getDay()==31&& i2.getMonth()==12) 
							System.out.println("---------------------------------------------------------");
					}
			
				}
			}
		}*/
		/*
		System.out.println(manyDates[0][0][0]);
		System.out.println(manyDates[0][0][1]);
		System.out.println(manyDates[0][2][3]);
		System.out.println(manyDates[1][4][15]);
		System.out.println(manyDates[4][11][30]);
		System.out.println(manyDates[0][1][29]);
		System.out.println(manyDates[0][3][30]);
		*/
		
		//**	
	}

}

package com.iteso.model;

import java.time.LocalDate;

import javax.swing.JOptionPane;

public class Date {
	
	public static final int MIN_YEAR, MAX_YEAR;
	//variables declaradas para ejercicio 1 
	public static final String M_1="Enero";
	public static final String M_2="Febrero";
	public static final String M_3="Marzo";
	public static final String M_4="Abril";
	public static final String M_5="Mayo";
	public static final String M_6="Junio";
	public static final String M_7="Julio";
	public static final String M_8="Agosto";
	public static final String M_9="Septiembre";
	public static final String M_10="Octubre";
	public static final String M_11="Noviembre";
	public static final String M_12="Diciembre";
	public static final String[] arryMonths= {M_1,M_2,M_3,M_4,M_5,M_6,M_7,M_8,M_9,M_10,M_11,M_12};
	
	
	
	
	private int    day = 1, month = 1, year = 2017;
	//private String monthName = "Enero";
	private int    format = 0;
	
	static {
		MIN_YEAR = Integer.parseInt(JOptionPane.showInputDialog("A�o inicial:"));
		MAX_YEAR = Integer.parseInt(JOptionPane.showInputDialog("A�o final:"));
	}
	
	
	
	public Date() {
		toSystemDate();
	}
	
	public void toSystemDate() {
      LocalDate today= LocalDate.now();
      setDay(today.getDayOfMonth());
      setMonth(today.getMonthValue());
      setYear(today.getYear());
  }

	public Date(int day, int month, int year) {
		setYear(year);
		setMonth(month);
		setDay(day);
	}


	public Date(int day, int month, int year, int format) {
		this(day, month, year);
		setFormat(format);
	}

	public int getDay() {
		return this.day;
	}

	public void setDay(int day) {
		if(isValidDate(day,this.month,this.year))
			this.day = day;

	}

	public int getMonth() {
		return this.month;
	}

	public void setMonth(int month) {
		if(isValidDate(this.day,month,this.year)){
			this.month = month;
			//this.monthName=arryMonths[this.month-1];
		}
	}

	public int getYear() {
		return this.year;
	}

	public void setYear(int year) {
		if(isValidDate(this.day,this.month,year))
			this.year = year;
	}

	public int getFormat() {
		return this.format;
	}
	
	public void setFormat(int format) {
		if(format >= 0 && format <= 2) this.format = format;
	}
	
	public String getMonthName() {
		//return this.monthName;
		return arryMonths[this.month-1];
	}
	
	public String toString() {
		switch(this.format) {
			case 0  : return String.format("%02d/%02d/%02d", 
				                             this.day, this.month,this.year % 100);

			case 1  : return String.format("%d-%s-%d", 
			                 this.day, arryMonths[this.month-1].substring(0, 3), this.year);

			default : return String.format("%d de %s de %d", 
			                 this.day, arryMonths[this.month-1].toLowerCase(),   this.year);
		}
	}
	
	public boolean equals(Object o) {
		if(!(o instanceof Date)) return false;
		Date d = (Date) o;
		return this.day == d.day && this.month == d.month && this.year == d.year;
	}

	public Date clone() {
		return new Date(this.day, this.month, this.year, this.format);
	}
	
	public void next() {
		
		int dd = this.day;
		int mm = this.month;
		int yy = this.year;
		dd ++;
		if((isLeap(year) == true && day == 29 && month == 2) || 
		   (dd > 28 &&  month == 2 && isLeap(year) == false) ||
		   (dd > 30 && (month == 4 || month == 6 || month == 9 || month == 11)) ||
		    dd > 31) {
			dd = 1;
			mm ++;
			if(mm > 12) {
				mm = 1;
				yy ++;
			}
		}
		this.day = dd;
		setMonth(mm);
		this.year = yy;
	
	}
	
	public static boolean isLeap(int year) {
		return year % 400 == 0 || year % 4 == 0 && year % 100 != 0;
	}
	
	public boolean isLeap() {
		return isLeap(this.year);
	}
	
	public static boolean isValidDate(int dd, int mm, int yy) {
		if(dd < 1 || dd > 31 || mm < 1 || mm > 12 || yy < MIN_YEAR || yy > MAX_YEAR) 
			return false;
		
		else {
			if((isLeap(yy) && mm == 2 && dd == 29) ||
				(dd <= 28 && mm == 2) ||
				(dd <= 30 && (mm == 4 || mm == 6 || mm == 9 || mm == 11)) ||
				(dd <= 31 && (mm == 1 || mm == 3 || mm == 5 || mm == 7 || mm == 8 || mm == 10 || mm == 12))) 
				return true;
		}
		return false;
		
	}	
	
	
	public void m5() {
		System.out.println("m5 de date");
	}
	
	
	public void m6() {
		System.out.println("m6 de date");
		m5();
	}

	
}

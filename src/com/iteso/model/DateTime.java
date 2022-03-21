package com.iteso.model;

import java.time.LocalTime;

public class DateTime extends Date {
	
private int seconds, minutes, hours =0;
	
	public DateTime(int day, int month, int year, int format, int hours, int minutes, int seconds) { 
		super(day, month, year, format);
		setTime(hours, minutes, seconds);
	}
	
	public DateTime(int day, int month, int year, int hours, int minutes, int seconds) {
		super(day, month, year);
		setTime(hours, minutes, seconds);
	}

	public DateTime(int hours, int minutes, int seconds) {
		super();
		setTime(hours, minutes, seconds);
	}
	
	public DateTime() {
		super();
		toSystemTime();
	}

	public DateTime(Date d) {
		super(d.getDay(),d.getMonth(),d.getYear());
		toSystemTime();
	}
	
	public void toSystemTime() {
		LocalTime now=LocalTime.now();
		this.hours=now.getHour();
		this.minutes=now.getMinute();
		this.seconds=now.getSecond();
	}

	public void setTime(int hours, int minutes, int seconds) {
		setHours(hours);	
		setMinutes(minutes);
		setSeconds(seconds);
	}
	
	public int getSeconds() {
		return seconds;
	}

	public void setSeconds(int seconds) {
		if (seconds >= 0 && seconds < 60) this.seconds = seconds;
	}

	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(int minutes) {
		if (minutes >= 0 && minutes < 60) this.minutes = minutes;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		if (hours >= 0 && hours < 24) this.hours = hours;
	}
	
	public String toString() {
		if(super.getFormat()==0) {
			return String.format("[%d:%02d:%02d] %s",this.hours,this.minutes,this.seconds,super.toString());	
		}
		else {
			int temphours=this.hours;
			String AMPM="AM";
			if(this.hours>=12)  AMPM="PM";
			if(this.hours==0) {
				temphours=12;
			}
			else if(this.hours>12)
				temphours-=12;
			return String.format("[%02d:%02d:%02d %s] %s",temphours,this.minutes,this.seconds,AMPM,super.toString());	
		}
	}
	
	public boolean equals(Object o) {
		if(!(o instanceof DateTime)) return false;
		DateTime dt=(DateTime) o;
		return dt.hours==this.hours && dt.minutes==this.minutes && dt.seconds==this.seconds;
	}
	
	public DateTime clone() {
		DateTime c= new DateTime(getDay(),getMonth(),getYear(), getFormat(),this.hours,this.minutes,this.seconds);
		return c;
	}
	
	public void next() {
	       seconds++;
	        if(seconds == 60) {
	            seconds = 0;
	            minutes++;
	            if(minutes == 60) {
	                minutes = 0;
	                hours++;
	                if(hours == 24) {
	                    hours = 0;
	                    // Llamar el next de la clase padre para cambiar el día
	                    // y no reescribir código
	                    super.next();
	                }
	            }
	        }
	
	}
	
	public Date toDate() {
		return super.clone();
	}
	
	
	public void m5() {
		System.out.println("m5 de datetime");
	}


	
	
	
}

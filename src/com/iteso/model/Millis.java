package com.iteso.model;

import java.time.LocalTime;
import java.util.Calendar;

public class Millis extends DateTime {
	
	private int milliseconds=0;
	private long timestamp=0;



	public Millis(int day, int month, int year, int hours, int minutes, int seconds, int milliseconds) {
		super(day, month, year, hours, minutes, seconds);
		setMilliseconds(milliseconds);
		findTimeStamp();
		
	}

	public Millis(int hours, int minutes, int seconds) {
		super(hours, minutes, seconds);
		
		
	}

	public Millis() {
		super();
		toSystemMillis();
		
		
	}

	public Millis(Date d) {
		super(d);
		
	}
	
	//
	public void toSystemMillis() {
		Calendar c=Calendar.getInstance();
		this.timestamp=c.getTimeInMillis();
		long module=this.timestamp%1000;
		this.milliseconds=(int) module;
		
	}
	
	
	
	
	
	public int getMilliseconds() {
		return milliseconds;
	}

	public void setMilliseconds(int milliseconds) {
		if(milliseconds>=0 && milliseconds<=999)
			this.milliseconds = milliseconds;
	}

	public long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(long timestamp) {
		if(timestamp>=0 && timestamp<=Calendar.getInstance().getTimeInMillis())
		this.timestamp = timestamp;
	}

	
	
	public String toString() {
		if(super.getFormat()==0) {
			String hms=super.toString().substring(1,9);
			String d=super.toString().substring(11,19);
			return String.format("[%s.%d] %s",hms,getMilliseconds(),d);
		}else{
			return String.format("%s %d",super.toString(),getTimestamp());
		}
			
	}
	
	public void findTimeStamp() {
		
		DateTime firstEpoch = new DateTime(31,12,1969,18,0,0);
		DateTime copieDate= super.clone();
		long ts=0L;
		
		while(!firstEpoch.equals(copieDate)) {
			firstEpoch.next();
			System.out.println(firstEpoch);
			ts++;	
		}
		
		timestamp= ts*1000+ getMilliseconds();
		
		
		/*int horas=24*getDay()-1;
		timestamp = ((getYear()-1971)*31556926L + ((getMonth()-1)*2629743) +
				+ ((getHours()+horas)*3600) + (getMinutes()*60) + getSeconds())*1000 
				+ getMilliseconds();*/
			
	}

}

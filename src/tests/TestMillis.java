package tests;
import com.iteso.model.*;



public class TestMillis {
	
	public static void main(String[] args) {
		
		Millis m1= new Millis();
		System.out.println("Format= "+m1.getFormat());
		System.out.println(m1);
		m1.setFormat(1);
		System.out.println(m1);
		m1.setFormat(2);
		System.out.println(m1);
		
		
		System.out.println("-------------");
		Millis m2= new Millis(17,2,2022,21,45,52,785);
		int ms=m2.getMilliseconds();
		long ts=m2.getTimestamp();
		System.out.println(m2);
		System.out.println("ms = "+ms);
		System.out.println("ts = "+ts);
		
		
		System.out.println("-------------");
		Millis m3= new Millis(1_307_169_163_000L);
		System.out.println(m3);
		m3.setTimestamp(0L);
		System.out.println(m3);
		m3.setMilliseconds(90);
		System.out.println(m3);
		
	
		System.out.println("-------------");
		Millis m4= new Millis(31,12,1998,23,59,59,999);
		System.out.println(m4);
		m4.next();
		System.out.println(m4);
		
		
		System.out.println("-------------");
		Millis m5=m1.clone();
		System.out.println(m5);
		boolean b1=m1.equals(m5);
		System.out.println(b1);
		m5.setMilliseconds(123);
		System.out.println(m5);
		boolean b2= m1.equals(m5);
		System.out.println(b2);
		
		System.out.println("-------------");
		m1.setMonth(4);
		System.out.println(m1);
		ts=m1.getTimestamp();
		System.out.println("ts: "+ts);
		
		m2.setHours(19);
		m2.setFormat(2);
		ts=m2.getTimestamp();
		System.out.println(m2);
		System.out.println("ts: "+ts);
		
		
	}

}

package tests;
import com.iteso.model.*;



public class TestMillis {
	
	public static void main(String[] args) {
		Millis m1= new Millis();
		System.out.println(m1);
		System.out.println(m1.getFormat());
		m1.setFormat(1);
		System.out.println(m1);
		m1.setFormat(2);
		System.out.println(m1);
		System.out.println("****");
		Millis m2= new Millis(17,2,2022,21,45,52,785);
		System.out.println(m2);
		System.out.println("ms = "+m2.getMilliseconds());
		System.out.println("ts = "+m2.getTimestamp());
	}

}

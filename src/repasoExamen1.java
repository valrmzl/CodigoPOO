import javax.swing.JOptionPane;

public class repasoExamen1 {
	public static double dot(double a, double b) {
		return a*b;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year=1995;
		short age=(short)(2022-year);
	
		float weight=82.53f;
		
		byte aByte1=0x4C;
		
		byte aByte2=(byte)age;
		
		int aByte3= aByte1<<3;
		
		
		String s1 = "What String is this?"; 
		String s2 = s1.replace(" ", "").toUpperCase().replace("I", "i"); 
		System.out.println(s2);
		String s3 = s1.replace("I", "i").toUpperCase().replace(" ", ""); 
		System.out.println(s3);
		boolean b1 = s1 == new String("What String is this?"); 
		System.out.println(b1);
		boolean b2 = s2.equals(new String("What String is this?")); 
		System.out.println(b2);
		System.out.printf("%b %c\n", s2.equals(s3), s2.charAt(2)); 
		
		
		
		String value=JOptionPane.showInputDialog("valor: ");
		double x=0;
		 try { 
		  x = Double.parseDouble(value); 
		 } catch(NumberFormatException ex) { 
		  x = 1; 
		 } catch(Exception ex) { 
		  x = 2; 
		 } 
		 System.out.println(x); 
		 
		 System.out.println("**");
		 String m1="F0";
		 
		 int i=Integer.parseInt(m1,16);
		 System.out.println(i);
		 i=i>>3;
		 System.out.printf("%X %d\n",i++,i);
		 
		 //
		 int j=0b1000;
		 String m2="12"+j;
		 int k=Integer.parseInt(m2)<<2;
		 System.out.printf("%s  %X",m2,--k);
		 System.out.println();
		 
		 
		 int a=13,b=1;
		 String s="3.0";
		 try {
			 b=Integer.parseInt(s);
			 a/=b;
		 }catch(NumberFormatException ex) {
			 a=1;
		 } catch(Exception ex) {
			 b=0;
		 }
		 
		 System.out.printf("%d  %d",a,b);
		 
		 
		 
		 
	
	

	}

}

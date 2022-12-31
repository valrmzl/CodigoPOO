
public class repaso2 extends repasoExamen1{

	public static void main(String[] args) {
		double arryB[][]=new double[3][3];
		
		for(int i=0; i<3;i++) {
			for(int j=0;j<3;j++) {
				arryB[i][j]=0;	
			}
		}
		
		
		for(int i=0; i<3;i++) {
			for(int j=0;j<3;j++) {
			System.out.print("["+arryB[i][j]+"]" );
			}
			System.out.println();
		}
		
		
		
 	}
	
	

}

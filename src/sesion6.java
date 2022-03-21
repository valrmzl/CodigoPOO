import java.util.Arrays;

public class sesion6 {
	//si qusiiera que fuera invocada de otros archivos se pone public "public static"
	
	public static int median(int []intArry) {
		System.out.println(intArry.length);
		return 0;
	}

	public static void main(String[] args) {
		//los arreglos van como clase, del espacio, se va al heap, los primitivos se quedan en stack
		int N=10;
		int[] arry=new int[N];
		int arry2[]=new int[N*2];

		
		double [][] doubleMatrix= new double[N][5];
		double doubleMatrix2[][];  //null
		double []doubleMatrix3[]; //null
		
		
		
		doubleMatrix2=new double[5][N];
		
		//movimiento de apuntadores de no de datos
		arry=arry2;  //movimiento de flechas 
		arry2=new int[5]; //ahora apunta a un nuevo arreglo 
		arry2[0]=5;
		arry[2]=2*arry2[0];  //en esa posocion ahora esta el 10 
		
		
		System.out.println(Arrays.toString(arry));
		System.out.println(Arrays.toString(arry2));
		
		int arry3[]= {1,2,3,4,5,6};
		System.out.println(Arrays.toString(arry3));
		
		int [][] intMatrix= { {1,2,3},
							  {4,5},
							  {6}
							};
		
		//arry={1,2,3,4,5,6} no es valido pq ya esta declarado
		int m1=median(arry);
		int m2=median(arry2);
		int m3=median(arry3);
		
		//crear el arreglo al momento 
		int m4=median(new int[] {4,5,6} );
		
		System.out.printf("%d  %d  %d  %d\n",m1,m2,m3,m4); //por los returh
		
		int rows=doubleMatrix.length; //toma el numero de arreglos que tiene adentro NUM DE FILAS
		System.out.println(rows);
		
		int cols=doubleMatrix[6].length; //numero de columnas del arreglo 0
		for(int r=0;r<rows;r++)
			System.out.printf("%2d %2d\n",r,doubleMatrix[r].length);
		
		//ahora del arreglo que era como un triangulo
		for(int r=0;r<intMatrix.length;r++)
			System.out.printf("%2d %2d\n",r,intMatrix[r].length);
		
		char[][] charMatrix=new char[5][]; //el tamaño de la primera dimension siemore se debe de poner
		charMatrix[0]=new char[10]; //el primer renglon es una palanbra de 10 leyras
		charMatrix[1]=new char[5];
		charMatrix[3]=new char[8];
		
		charMatrix[0][0]='A';
		charMatrix[0][1]='B';
		charMatrix[0][2]='C';
		charMatrix[1][0]='X';
		charMatrix[1][1]='Y';
		System.out.println();
		for(int r=0;r<charMatrix.length;r++){
			if(charMatrix[r]==null) {
				System.out.println("null");
				continue;
			}
			for(int c=0;c<charMatrix[r].length;c++) {
				System.out.printf("%d ",(int)charMatrix[r][c]);
			}
			System.out.println();
			
		}
		//arreglos gemelos pero independientes entre si 
		arry=arry3.clone();
		arry[0]=9;
		System.out.println(Arrays.toString(arry));
		System.out.println(Arrays.toString(arry3));
		
		
		//ciclo for each para cosas que no tienen indice es muy util
		// es de inciio a fin de uno en uno
		
		String[] arryStr= {"hola","mundo","cruel","java"};
		float[] farry={4.5f,-2.6f,3.7f};
		//el primer prametr es como el current
		//el ciclo es de colo lectura, si le pusiera a mayus no aplica, no hay cambios
		for(String current:arryStr) {
			//con igual se cambia la copia no el original 
			current=current.toUpperCase(); //se crea en otro lado de manera temporal el HOLA en mayus , solo en esa iteracion 
			System.out.println(current);
			
		}
		System.out.println(Arrays.toString(arryStr));
		
		float promedio=0;
		for(float f:farry) promedio+=f;
		promedio=promedio/farry.length;
		System.out.printf("promedio: %.2f",promedio);
		System.out.println();
		
		
		for(char[] row: charMatrix) {
			if(row==null) {
				System.out.println("null");
				continue;
			}
			for(char value: row) {
				System.out.print(value+" ");
			}
			System.out.println();
		}
		
		
			
		
		
	}

}

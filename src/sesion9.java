
public class sesion9 { 
	
	public static class Vec2{
		double x, y;
		//constructor para facilitar creacion
		public Vec2(double x, double y) {
			this.x=x;
			this.y=y;
			
		}
	}
	
	//por valor
	static void toUnit(double x, double y) {
		double m=Math.sqrt(x*x+y*y);
		System.out.printf("maginutud: %.1f\n",m);
		x/=m;
		y/=m;
		//System.out.printf("<%.1f, %.1f>\n",x,y);
		//cuando la funcion termina las copias se terminan
	}
	
	//por referencia
	static void toUnit(Vec2 v) {
		double m=Math.sqrt(v.x * v.x + v.y * v.y);
		v.x/=m;
		v.y/=m;
		
	}
	
	//2 metodos con el mismo nombre es sobrecarga, el tipo devuleto no importa
	
	//pase por referencia sin efecto
	static void toUnit1(Vec2 v) {
		double m=Math.sqrt(v.x * v.x + v.y * v.y);
		v= new Vec2(v.x/m, v.y/m);
		
	}
	
	static Vec2 normalize (Vec2 v) {
		double m=Math.sqrt(v.x * v.x + v.y * v.y);
		return new Vec2(v.x/m, v.y/m);
	}
	
	
	static void toUnit(double[] v) {
		if(v.length<2) return;
		double m=Math.sqrt(v[0] * v[0] + v[1] * v[1]);
		v[0]/=m;
		v[1]/=m;
		
	}
	
	
	//pase por referencia sin efecto pq string es inmutable
	//no hay mecanismo publico para modificar su estado
	static void processString(String s) {
		s=s.toUpperCase();
		System.out.println(s);
	}
	
	static void toUpperCaseVal(String n, String a) {
		StringBuilder nombre= new StringBuilder(n.toUpperCase());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x=3, y=4;
		
		toUnit(x,y);
		System.out.printf("<%.1f, %.1f>\n",x,y);
		
		Vec2 v1=new Vec2(x,y);
		toUnit(v1);
		System.out.printf("aa <%.1f, %.1f>\n",v1.x,v1.y);
		
		
		Vec2 v2=new Vec2(x,y);
		toUnit1(v2);
		System.out.printf("<%.1f, %.1f>\n",v2.x,v2.y);
		
		
		//Vec2 vn=new Vec2 (x,y);
		//normalize(vn);
		Vec2 vn=normalize(v2);
		System.out.printf("El de devolver en la funcion: <%.1f, %.1f>\n",vn.x,vn.y);
		
		
		
		//los arreglos tmb pasan por referencia
		double[] v3= {x,y};
		toUnit(v3);
		System.out.printf("<%.1f, %.1f>\n",v3[0],v3[1]);
		
		String s="hello";
		processString(s);
		System.out.println(s);

	}

}

public class sesion11 {
	
	static class Employee {
		public static final String EMAIL_SUFFIX = "@iteso.mx";
		private final int employeeId;
		private final String name;
		private double wage;
		private int level;
		public  static final int MIN_LEVEL = 6; 
		public  static final int MAX_LEVEL = 20;
		
		public Employee(int employeeId, String name, double wage, int level) {
			this.employeeId = employeeId;
			this.name = name;
			this.wage = wage;
			setLevel(level);
			}
		public double getWage() {
			return wage;
		}
		
		public void setWage(double wage) {
			this.wage = wage;
			
		}
		
		public int getEmployeeId() {
			return employeeId;
		}
		public String getName() {
				return name;
		}
			
		public int getLevel() {
			return level;
		}
		
		public void setLevel(int level) {
			if(level >= MIN_LEVEL && level <= MAX_LEVEL) this.level = level;
		}
		
}
	public static void main(String[] args) {
		Employee e1 = new Employee(123, "Juan Pérez",  13445,  9);
		Employee e2 = new Employee(124, "José García", 16325, 10);
		Employee e3 = new Employee(125, "Pedro Palos", 12455,  8);
		System.out.println(Employee.EMAIL_SUFFIX);
		// System.out.println(e1.EMAIL_SUFFIX);
		// System.out.println(e2.EMAIL_SUFFIX);
		System.out.println(e1.getEmployeeId());
		System.out.println(e2.getName());
		e3.setWage(18000);
		System.out.println(e3.getWage());
		//e3.level = 25;
		e3.setLevel(25);
		//Employee.MAX_LEVEL ++;
		System.out.println(Employee.MAX_LEVEL);
		final int N = 1000;
		int[] array = new int[N];
		//N ++;
	}
}
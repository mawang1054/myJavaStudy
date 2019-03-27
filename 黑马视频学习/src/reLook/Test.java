package reLook;

public class Test {

	public static void main(String[] args) {
		//method1();
		
		Manager[] manager = new Manager[10];
		Employee[] employee = manager;
		employee[0] = new Employee();
		manager[0].toString();
	}

	private static void method1() {
		Employee a = new Employee(1001,"ÙøÕş",23);
		Employee b = new Employee(1001,"ÙøÕş",23);
		System.out.println(Employee.equals(a, b));
		int x;
		//System.out.println(x);
	}

}

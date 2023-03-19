
public class Main {

	public static void main(String[] args) {
		Employee employee = new Employee("John Doe", 35, 50000.0);
		
		String name = employee.getName();
		int age = employee.getAge();
		double salary = employee.getSalary();
		
		employee.setSalary(55000.0);

	}

}

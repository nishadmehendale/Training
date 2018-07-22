import java.util.*;
public class EmployeeTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Employee employee = new Employee();
		System.out.println("Enter employee name");
		String name = scanner.nextLine();
		System.out.println("Enter Monthly Basic Salary");
		double monthlyBasic = scanner.nextDouble();
		employee.setPFRate(0.1f);
		employee.setName(name);
		employee.setMonthlyBasic(monthlyBasic);
		System.out.println(employee);
		
	}

}

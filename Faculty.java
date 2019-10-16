
public class Faculty {
	String facultyName;
	Department facultyDepartment;

	public Faculty(String name, Department department) {
		this.facultyName = name;
		this.facultyDepartment = department;
	}

	public double calculateTaxes(double salary) {
		double taxedSalary;
		taxedSalary = salary - (salary * (0.2));
		return taxedSalary;

	}

}

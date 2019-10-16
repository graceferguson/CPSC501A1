
public class Employee {
	String employeeName;
	Department department;

	public Employee(String name, Department department, String section, String section2) {
		this.employeeName = name;
		this.department = department;

		if (section.equals("Faculty")) {
			if (section2.equals("Tenure")) {
				Tenure a = new Tenure(name, department);
			} else {
				Adjunct b = new Adjunct(name, department);
			}
		} else {

		}
	}

	public String getName() {
		return employeeName;
	}

	public String getDepartment() {
		return department.getDepartmentName();
	}

	public double calculateTaxes(double salary) {
		double taxedSalary;
		taxedSalary = salary - (salary * (0.2));
		return taxedSalary;

	}
}

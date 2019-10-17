
public class Faculty {
	String facultyName;
	Department facultyDepartment;
	String facultySection;

	public Faculty(String name, Department department, String section) {
		this.facultyName = name;
		this.facultyDepartment = department;
		this.facultySection = section;

//		if (section.equals("Tenure")) {
//			System.out.println("tenure");
//			Tenure a = new Tenure(name, department, section);
//		} else {
//			System.out.println("adjunct");
//			Adjunct b = new Adjunct(name, department, section);
//		}

	}

	public double calculateTaxes(double salary) {
		double taxedSalary;
		taxedSalary = salary - (salary * (0.2));
		return taxedSalary;

	}

	public String getName() {
		return facultyName;
	}

	public String getDepartment() {
		return facultyDepartment.getDepartmentName();
	}

}

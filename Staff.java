
public class Staff {
	String staffName;
	Department staffDepartment;
	String staffSection;
	String staffSection2;

	public Staff(String name, Department department, String section, String section2) {
		this.staffName = name;
		this.staffDepartment = department;
		this.staffSection = section;
		this.staffSection2 = section2;
		

	}

	public double calculateTaxes(double salary) {
		double taxedSalary;
		taxedSalary = salary - (salary * (0.2));
		return taxedSalary;

	}
}

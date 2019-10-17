
public class Staff {
	String staffName;

	public Staff(String name) {
		this.staffName = name;
		
	}

	public double calculateTaxes(double salary) {
		double taxedSalary;
		taxedSalary = salary - (salary * (0.2));
		return taxedSalary;

	}
}

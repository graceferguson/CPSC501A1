
public class EmployeeStatus {

	public static void main(String[] args) {

		Department sociology = new Department("Sociology");
		Department compSci = new Department("Computer Science");

		Faculty steve = new Faculty("Steve", sociology, "Adjunct");
		Faculty marg = new Faculty("Marg", compSci, "Tenure");
		Staff pat = new Staff("Pat");

		// keyboard input would create an object and give it a section
		// if (section.equals("Tenure")) {
		// Tenure a = new Tenure(name, department, section);
		// } else {
		// Adjunct b = new Adjunct(name, department, section);
		// }

	}

	public double calculateTaxes(double salary) {
		double taxedSalary;
		taxedSalary = salary - (salary * (0.2));
		return taxedSalary;

	}

}

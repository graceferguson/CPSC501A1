
public class Main {

	public static void main(String[] args) {

		Department art = new Department("Art");
		Department science = new Department("Science");

		Employee steve = new Employee("Steve", art, "Faculty", "Adjunct");
		Employee marg = new Employee("Marg", science, "Faculty", "Tenure");
		Staff pat = new Staff("Pat", null, "Staff", "what");

	}

}

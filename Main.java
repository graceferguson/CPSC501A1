
public class Main {

	public static void main(String[] args) {

		Department art = new Department("Art");
		Department science = new Department("Science");

		Faculty steve = new Faculty("Steve", art, "Adjunct");
		Faculty marg = new Faculty("Marg", science, "Tenure");
		Staff pat = new Staff("Pat", null, "Staff", "what");

	}

}

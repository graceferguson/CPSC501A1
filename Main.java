
public class Main {

	public static void main(String[] args) {

		Department art = new Department("Art");
		Department science = new Department("Science");

		Faculty steve = new Faculty("Steve", art, "Adjunct");
		Faculty marg = new Faculty("Marg", science, "Tenure");
		Staff pat = new Staff("Pat");

	
		//keyboard input would create an object and give it a section
//		if (section.equals("Tenure")) {
//			Tenure a = new Tenure(name, department, section);
//		} else {
//			Adjunct b = new Adjunct(name, department, section);
//		}

	}

}

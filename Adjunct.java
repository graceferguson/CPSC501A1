
public class Adjunct extends Faculty {
	String classes;

	public Adjunct(String name, Department department, String section) {
		super(name, department, section);

	}

	public void assignClasses(String subject) {
		this.classes = subject;
	}

	public String getClasses() {
		return classes;
	}
}

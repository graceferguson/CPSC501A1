
public class Adjunct extends Faculty {
	String classes;

	public Adjunct(String name, Department department) {
		super(name, department);

	}

	public void assignClasses(String subject) {
		this.classes = subject;
	}

	public String getClasses() {
		return classes;
	}
}

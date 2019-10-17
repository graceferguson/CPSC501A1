
public class Faculty {
	String facultyName;
	Department facultyDepartment;
	String facultySection;

	public Faculty(String name, Department department, String section) {
		this.facultyName = name;
		this.facultyDepartment = department;
		this.facultySection = section;
	}


	public String getName() {
		return facultyName;
	}

	public String getDepartment() {
		return facultyDepartment.getDepartmentName();
	}
	
	public String getSection() {
		return facultySection;
	}

}

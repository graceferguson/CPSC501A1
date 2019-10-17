
public class Tenure extends Faculty {
	String researchArea;
	double tenureSalary;
	double yearsEmployed;

	public Tenure(String name, Department department, String section) {
		super(name, department, section);

	}

	public void assignResearch(String topic) {
		this.researchArea = topic;
	}

	public String getResearchTopic() {
		return researchArea;
	}

	public void setSalary(double salary){
		this.tenureSalary = salary;
	}
	
	public double getSalary(){
		return tenureSalary;
	}
	
	public void setYrsEmployed(double years){
		this.yearsEmployed = years;
	}
	
	public double getYrsEmployed(){
		return yearsEmployed;
	}
	
	public double getRaise() {
		return calculateRaise();
	}

	public double calculateRaise() {
		return tenureSalary + (tenureSalary * (yearsEmployed * 0.1));
	}
}


public class Tenure extends Faculty {
	String researchArea;

	public Tenure(String name, Department department, String section) {
		super(name, department, section);

	}

	public void assignResearch(String topic) {
		this.researchArea = topic;
	}

	public String getResearchTopic() {
		return researchArea;
	}

	public double getRaise(double startingSalary, double yearsEmployed) {
		double raisedSalary = startingSalary + (startingSalary * (yearsEmployed * 0.1));
		return raisedSalary;
	}

}

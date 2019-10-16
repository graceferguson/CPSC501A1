
public class Tenure extends Faculty {
	String researchArea;

	public Tenure(String name, Department department) {
		super(name, department);

	}

	public void assignResearch(String topic) {
		this.researchArea = topic;
	}

	public String getResearchTopic() {
		return researchArea;
	}

	public double getRaise(double x, double y) {
		double raise = x + (y * 0.1);
		return raise;
	}

}

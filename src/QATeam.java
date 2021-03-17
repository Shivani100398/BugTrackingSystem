
public class QATeam extends Employee {
	private STATUS status;
	public QATeam(String name) {
		this.setName(name);
	}

	public void EnsureQuality() {
		System.out.println(this.getName()+" from QA team will verify the Quality standards.");
		
	}

	public STATUS getStatus() {
		return status;
	}

	public void setStatus(STATUS status) {
		this.status = status;
	}
}

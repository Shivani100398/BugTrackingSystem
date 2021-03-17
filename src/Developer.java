public class Developer extends Employee {
	private int BugID;
	private STATUS status;
	public Developer(String name) {
		this.setName(name);
	}
	public void AssignBug(int BugID) {
		this.BugID=BugID;
		System.out.println("Assigned Bug "+this.BugID+" to "+this.getName()+" of Development Team");
	}
	public void BugReport() {
	//TO DO:mail manager about the status report	
	}
	public STATUS getStatus() {
		return status;
	}

	public void setStatus(STATUS status) {
		this.status = status;
	}
	}


import java.util.Date;

public class Tester extends Employee {
	private int LogVersion;
	private STATUS status;
	private String SubmitOn;
	private int BugID;
	public String getSubmitOn() {
		return SubmitOn;
	}
	public void setSubmitOn(String submitOn) {
		SubmitOn = submitOn;
	}
	public Tester(String name) {
		this.setName(name);
	}
	public void OpenBug(int BugID) {
		this.BugID=BugID;
		System.out.println(this.getName()+" from Testing Team has created the bug "+this.BugID);
	}
	public void ReplicationSteps(int Logversion,String SubmitOn,STATUS status) {
		this.LogVersion=Logversion;
		this.SubmitOn=SubmitOn;
		this.status=status;
		System.out.println("Log Version: "+this.LogVersion+" Date: "+this.SubmitOn+" Current Status: "+this.status);
	}
	public int getLogVersion() {
		return LogVersion;
	}
	public void setLogVersion(int logVersion) {
		LogVersion = logVersion;
	}

	public STATUS getStatus() {
		return status;
	}
	public void setStatus(STATUS status) {
		this.status = status;
	}
	
}
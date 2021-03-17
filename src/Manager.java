public class Manager extends Employee{
	private int WorkItemID;
	private APPROVAL approval;
	public void SendMail() {
		
	}
	public int getWorkItemID() {
		return WorkItemID;
	}
	public void setWorkItemID(int workItemID) {
		WorkItemID = workItemID;
	}
	public APPROVAL getApproval() {
		return approval;
	}
	public void setApproval(APPROVAL approval) {
		this.approval = approval;
	}

	
}
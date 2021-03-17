import java.util.Date;

public class Project  {
	private String Name;
	static boolean appropriatebug;
		
	public static void main(String[] args) {
		Bug bug=new Bug();
		Developer developer=new Developer("Harry");
		Tester tester=new Tester("Sudhir");
		QATeam qa=new QATeam("Jim");
		bug.Add(58123,PRIORITY.LOW,"OP",STATUS.OPEN);
		if (bug.getStatus()==STATUS.OPEN) {
		tester.OpenBug(bug.getID());
		tester.ReplicationSteps(2,"19-03-2021",STATUS.OPEN);
		developer.AssignBug(bug.getID());
		developer.setStatus(STATUS.ASSIGNED);
		developer.setStatus(STATUS.PENDINGRETEST);			
		System.out.println(developer.getName()+" from Development Team has changed the status to "+developer.getStatus());
		//
		tester.setStatus(STATUS.VERIFIED);
		System.out.println(tester.getName()+" from Test team has "+tester.getStatus()+" bug "+bug.getID());
		//qa.setStatus(STATUS.VERIFIED);
		qa.setStatus(STATUS.CLOSED);
		System.out.println(qa.getName()+" from QA team has "+qa.getStatus()+" bug "+bug.getID());
		}
			
	}
	
	/*
	 * public void Add() {
	 * } public void Edit() {
	 * } public void Delete() {
	 * }
	 */
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getWorkItemID() {
		return WorkItemID;
	}
	public void setWorkItemID(int workItemID) {
		WorkItemID = workItemID;
	}
	public Date getAssignDate() {
		return AssignDate;
	}
	public void setAssignDate(Date assignDate) {
		AssignDate = assignDate;
	}
	public Date getLastDate() {
		return LastDate;
	}
	public void setLastDate(Date lastDate) {
		LastDate = lastDate;
	}
	private int WorkItemID;
	private Date AssignDate;
	private Date LastDate;
}
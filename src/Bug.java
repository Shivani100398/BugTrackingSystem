
public class Bug {
private int id;
private PRIORITY priority;
private String module;
private STATUS status;

public void Add(int id,PRIORITY priority,String module,STATUS status) {
	this.id=id;
	this.priority=priority;
	this.module=module;
	this.status=status;
}
public void Edit() {
	
}
public void Delete() {
	
}

public int getID() {
	return id;
}
public void setID(int iD) {
	id = iD;
}
public PRIORITY getPriority() {
	return priority;
}
public void setPriority(PRIORITY priority) {
	this.priority = priority;
}
public String getModule() {
	return module;
}
public void setModule(String module) {
	this.module = module;
}
public STATUS getStatus() {
	return status;
}
public void setStatus(STATUS status) {
	this.status = status;
}

}

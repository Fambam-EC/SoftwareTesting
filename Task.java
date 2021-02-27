package main;

public class Task {
public Task() {
	}

private String taskID;
public String name;
public String description;

public Task(String taskID, String name, String description) {
	
	if(taskID  == null || taskID.length()>10) {
		throw new IllegalArgumentException("Invalid taskID");
	}
	
	if(name == null || name.length()>20) {
		throw new IllegalArgumentException("Invalid name");
	}
	
	if(description  == null || description.length()>50) {
		throw new IllegalArgumentException("Invalid description");
	}
	
	this.taskID = taskID;
	this.name = name;
	this.description = description;
}
public void settaskID(String taskID) {
	this.taskID = taskID;
}

public void setName(String name) {
	this.name = name;
}

public void setdescription(String description) {
	this.description = description;
}
public String gettaskID() {
	return taskID;
}
public String getname() {
	return name;
}
public String getdescription() {
	return description;
}

}

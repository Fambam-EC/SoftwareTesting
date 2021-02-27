package main;

import java.util.*;
import java.lang.*;

public class TaskService {
	String taskID = null;
	String name = null;
	String description = null;
	
	ArrayList <Task> list = new ArrayList<Task> ();
	Task task = new Task();
	
public String uniquetaskID() {
		
		if (list.size() < 1) {
			return "1";
		}	else {
			return String.valueOf(Integer.parseInt(list.get(list.size()-1).gettaskID())+1);
		}
		
	}

public void addtask(Task task) {
	
	task.settaskID(uniquetaskID());
	list.add(task);
}
	
public void deletetask(String deltaskID) {
	for (int i = 0; i < list.size(); i++) {
		if (list.get(i).gettaskID().equals(deltaskID)) {
			list.remove(i);
		}
	}
}
 
public void editTask(String edittask) {
	
	for (int i = 0; i < list.size(); i++) {
		if (list.get(i).gettaskID().equals(edittask)) {
			task.setName("newValue");
			task.setdescription("newValue");
			
		}
	}
}

}


	
	
	


package creational.factory;

import java.util.ArrayList;
import java.util.List;

public abstract class Team {
	// The abstract bundle defines embed a collection of objects
	// provides a method to create itself by injection in it's no-arg constr..
 protected List<Person> persons = new ArrayList<>();

public List<Person> getPersons() {
	return persons;
}
 
public Team(){
	this.createTeam();
}

public abstract void createTeam(); 
}

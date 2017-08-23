package creational.prototype;

import java.util.HashMap;

//Register the prototypes in a registry
public class PersonRegistry {

	// We will hardcode a registry which could be a database
	private HashMap<String, Person> store = new HashMap<String, Person>();

	// This constructor create or load the registry
	public PersonRegistry() {
		createRegistry();
	}

	// the secret of the prototype patterns is here
	public Person createPerson(String type) {
		Person person = null;
		try {
			
			//The cone creates a new object each time it is called
			person = (Person) (store.get(type)).clone(); 
		} catch (CloneNotSupportedException ex) {
			ex.printStackTrace();
		}
		// If the prototype does not exist in the registry, return null;
		return person;
	}

	// A method that create registry
	private void createRegistry() {
		Student student1 = new Student();
		student1.setName("Adams");
		student1.setGrade("A");
		student1.setAge(12);

		Teacher teacher1 = new Teacher();
		teacher1.setName("Oumar");
		teacher1.setCourse("Math");
		teacher1.setAge(34);

		// Add prototypes to the store
		this.store.put("adams", student1);
		this.store.put("oumar", teacher1);

	}
}

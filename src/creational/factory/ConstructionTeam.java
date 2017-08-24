package creational.factory;

public class ConstructionTeam extends Team {

	// The bundle types override the bundle creation method
	// and add object to the collection
	@Override
	public void createTeam() {
		persons.add(new Welder());
		persons.add(new Mecanic());
	}

}

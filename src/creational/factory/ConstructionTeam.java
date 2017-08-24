package creational.factory;

public class ConstructionTeam extends Team {

	@Override
	public void createTeam() {
		persons.add(new Welder());
		persons.add(new Mecanic());
	}

}

package creational.factory;

public class SoccerTeam extends Team {
	// The bundle types override the bundle creation method
		// and add object to the collection
	@Override
	public void createTeam() {
		persons.add(new GoalKeeper());
		persons.add(new Referee());

	}

}

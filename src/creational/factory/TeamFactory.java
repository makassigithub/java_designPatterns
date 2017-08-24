package creational.factory;

public class TeamFactory {
  //The factory method class provides a static method with a type param
	//that returns bundles based on the param..
	public static Team getTeam(TeamType type) {
		switch (type) {
		case CONSTRUCTION:
			return new ConstructionTeam();

		case SOCCER:
			return new SoccerTeam();
		default:
			return null;
		}
	}
}

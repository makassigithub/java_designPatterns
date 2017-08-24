package creational.factory;

public class TeamFactory {
  //The factory method class provides a static method with a type param
	//that returns bundles based on the param..
	public static Team getTeam(String type) {
		switch (type) {
		case "construction":
			return new ConstructionTeam();

		case "soccer":
			return new SoccerTeam();
		default:
			return null;
		}
	}
}

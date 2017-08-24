package creational.factory;

public class Test {
  public static void main(String ...args) {
	  Team soccerPlayers = TeamFactory.getTeam(TeamType.SOCCER);
	     System.out.println(soccerPlayers.getPersons());
	     
	     Team constructors = TeamFactory.getTeam(TeamType.CONSTRUCTION);
	     System.out.println(constructors.getPersons());
  }
          /* Objects depends on the argument passed to the factory method
           * [creational.factory.GoalKeeper@7852e922, creational.factory.Referee@4e25154f]
		  [creational.factory.Welder@70dea4e, creational.factory.Mecanic@5c647e05]*/
}

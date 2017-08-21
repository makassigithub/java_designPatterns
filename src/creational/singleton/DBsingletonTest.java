package creational.singleton;

public class DBsingletonTest {
	
public static void main (String ...args){
	
	// How to get an instance of it 
	DBsingleton obj1 = DBsingleton.getInstance();
	System.out.println(obj1);
	
	//The singeton creates itself for the constructor is private.
	//Mysingleton ob2 = new Mysingleton();
	
	DBsingleton obj2 = DBsingleton.getInstance();
	System.out.println(obj2);
	
	//Only one instance is created 
	if(obj1==obj2) System.out.println("singleton creates only one instance");
 }	
}

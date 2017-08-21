package creational.singleton;

public class DBsingleton {

// the embbeded instance must be private static
	
// it can be eagerly-loaded when jvm starts
 private static DBsingleton instance = new DBsingleton();
 
 // A private non-arg constructor
 private DBsingleton(){
 }
 
 //A public method to get the instance.
 public static DBsingleton getInstance(){
	 return instance;
 }
}


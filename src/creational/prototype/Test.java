package creational.prototype;

public class Test {
	
 public static void main(String ...args){
	 PersonRegistry preg = new PersonRegistry();
	         Student std1 = (Student) preg.createPerson("adams");
	         
	         //I am overriding person fields
	                 std1.setAge(45);
	                 std1.setGrade("D");
	                 std1.setName("zender");
	                 
	          System.out.println(std1);
	          System.out.println(std1.getAge());
	          System.out.println(std1.getName());
	          System.out.println(std1.getGrade());
	                 
	    	  Student std2 = (Student) preg.createPerson("adams");
	    	  //I am overriding person fields
	    	                 std2.setAge(40);
	    	                 std2.setGrade("C");
	    	                 std2.setName("baba");
	    	                 
	    	     System.out.println();
	    	     System.out.println(std2);            
	    	     System.out.println(std2.getAge());
	    	   	 System.out.println(std2.getName());
	    	   	 System.out.println(std2.getGrade());
	    	   	 
	    	   	 /*
	    	   	  creational.prototype.Student@7852e922
                  45
                  zender
                  D
                  creational.prototype.Student@4e25154f
                  40
                  baba
                  C
	    	   	  */
	    	   	 //A unique instance is returned each time we require a new obejct
	    	   	 //That instance is got from a cloned object of it's type from the registry
	    	   	 //The registry is created one and servers entity. then the creation of object is no 
	    	   	 //more costly, which the purpose of the PROTOTYPE PATERN
	                
 }
}

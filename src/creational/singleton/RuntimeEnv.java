package creational.singleton;

public class RuntimeEnv {

	public static void main (String ...args){
		Runtime rn1 = Runtime.getRuntime();
		
		//We garbage collect to make to confirm that it's a Runtime object.
		        rn1.gc();
		        
		//check rn2 address,
		System.out.println(rn1);
		Runtime rn2 = Runtime.getRuntime();
		        rn2.gc();
		
		//check rn2 address,
		System.out.println(rn2);
		if(rn1==rn2) System.out.println("singleton creates only one instance");
	}
}

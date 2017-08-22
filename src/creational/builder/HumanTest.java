package creational.builder;

public class HumanTest {

	public static void main(String[] args) {
		
		System.out.println("Testing mutable instances with bean constructors");
		Human hm = new Human();
		      hm.setAge(34);
		      hm.setSex("M");
		      hm.setSkinColor("black");
		      
		System.out.println(hm.getAge());
		System.out.println(hm.getSex());
		System.out.println(hm.getSkinColor());
		
		System.out.println();
		
		System.out.println("Testing immutable instances by telescoping constructor ");
		Human2 hm2 = new Human2("F",43,"yellow");
		
		System.out.println(hm2.getAge());
		System.out.println(hm2.getSex());
		System.out.println(hm2.getSkinColor());
		
		System.out.println();
		
		System.out.println("Testing immutable instances with bulder pattern");
		
		//I use the non-arg constructor of the innerClass
		Human3.Builder builder = new Human3.Builder();
		
		//I can now call his methods to build with each property
		builder.buildWithAge(45).buildWithSex("M").buildWitSkincolor("Brown");
		
		//Now i use the outer builder class defined in the innerClass
		Human3 hm3 = builder.buildHuman3();
		System.out.println(hm3.getAge());
		System.out.println(hm3.getSex());
		System.out.println(hm3.getSkinColor());
	}

}

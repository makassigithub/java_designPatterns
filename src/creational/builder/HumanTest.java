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

	}

}

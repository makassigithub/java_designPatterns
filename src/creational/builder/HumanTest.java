package creational.builder;

public class HumanTest {

	public static void main(String[] args) {
		Human hm = new Human();
		      hm.setAge(34);
		      hm.setSex("M");
		      hm.setSkinColor("black");
		      
		System.out.println(hm.getAge());
		System.out.println(hm.getSex());
		System.out.println(hm.getSkinColor());

	}

}

package creational.prototype;

//Start with inheritance and implement clonable interface
public abstract class Person implements Cloneable {
	
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	//Override the clone()
	
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
   
}

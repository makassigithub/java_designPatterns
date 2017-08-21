package creational.builder;

public class Human {
private String sex;
private int age;



// This is called a bean model design 
// And the instance created is mutable using setters.
public Human() {
}

public String getSex() {
	return sex;
}
public void setSex(String sex) {
	this.sex = sex;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getSkinColor() {
	return skinColor;
}
public void setSkinColor(String skinColor) {
	this.skinColor = skinColor;
}
private String skinColor;



}

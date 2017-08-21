package creational.builder;

public class Human2 {
private String sex;
private int age;
private String skinColor;



// This is called a constructor telescoping 
public Human2(String sex){
	this.sex = sex;
}

public Human2(String sex, int age ){
	this(sex);
	this.age = age;

}

public Human2(String sex, int age, String color){
	this(sex,age);
	this.skinColor = color;
}

public String getSex() {
	return sex;
}

public int getAge() {
	return age;
}

public String getSkinColor() {
	return skinColor;
}


}

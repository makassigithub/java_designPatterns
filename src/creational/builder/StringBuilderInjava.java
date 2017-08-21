package creational.builder;

public class StringBuilderInjava {

	public static void main(String ...args){
		
		StringBuilder sb = new StringBuilder();
		sb.append("StringBuilder is ");
		sb.append("java built-in Builder Design Pattern");
		
		System.out.println(sb.toString());
	}
}

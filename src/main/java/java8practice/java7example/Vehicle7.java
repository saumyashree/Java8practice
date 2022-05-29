package java8practice.java7example;

public interface Vehicle7 {
	default void show() {
		System.out.println("add new feature 1");
	}
	default void showNew() {
		System.out.println("add new feature 2");
	}
void getDetails();//its by default declare public abstract
String COLOR="Red";//its by default declare public abstract
Double mileage();
}

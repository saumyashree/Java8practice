package java8practice.java7example.functioanalinterface;
@FunctionalInterface//this annotation tell compiler to check functional Interface
public interface IamFunctionalInterface {
void display();//Single abstract method
//void display1();
static void staticFn(){
	
}
static void staticFn1(){
	
}
default void defaultFn() {
	
}
default void defaultFn1() {
	
}
}

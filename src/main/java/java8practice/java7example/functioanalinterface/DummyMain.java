package java8practice.java7example.functioanalinterface;

public class DummyMain {

	public static void main(String[] args) {
Integer x=8;
IamFunctionalInterface var1= () ->{System.out.println("Hello World");};//Ifm we want to mention multiple then we will use this type 
var1.display();
IamFunctionalInterface var2= () ->System.out.println("BYE BYE");//for single line argument we will go for this
var2.display();
}
}

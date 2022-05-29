package java8practice.java7example;

public class StaticDemoImpl implements StaticDemo{
	public static void main(String[] args) {
		StaticDemo obj=new StaticDemoImpl();
		//obj.show();
	StaticDemo.show();
}
}
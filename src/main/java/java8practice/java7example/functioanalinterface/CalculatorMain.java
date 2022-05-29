package java8practice.java7example.functioanalinterface;

import java.util.Scanner;

public class CalculatorMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 1st Number");
		Double num1 = sc.nextDouble();
		System.out.println("enter 2ND Number");
		Double num2 = sc.nextDouble();
		sc.nextLine();// flusing
		System.out.println("1.Addition ,2.Subtraction, 3.Division, 4.Multiplication");
		String option = sc.nextLine();
		
		Calculator calculator= null;
		Double result=null;
		
		switch (option) {
		case "1":
			
			calculator=(Double num11, Double num22) -> {
			return num11 + num22;
		};
		result=calculator.operation(num1, num2);
			 
			break;
		case "2":calculator=(Double num11, Double num22) -> {
			return num11 - num22;
		};
		result=calculator.operation(num1, num2);
		
			break;
		case "3":calculator=(Double num11, Double num22) -> {
			return num11/num22;
		};
		result=calculator.operation(num1, num2);
			break;
		case "4":calculator=(Double num11, Double num22) -> {
			return num11*num22;
		};
		result=calculator.operation(num1, num2);
			break;

		default:
			System.out.println("wrong input Try Again");
			break;
		}
		if(result !=null) {
			System.out.println("Sucessfully"+result);
		
	}else {
		System.out.println("wRONG25");
	}
		
	}
		
	}


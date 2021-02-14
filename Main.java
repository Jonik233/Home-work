package com.company;

import javax.print.attribute.standard.PresentationDirection;
import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Input your arguments: ");
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		String  receiver = newMethod(a, b, c);
		System.out.println(receiver);
	}
	public static String newMethod(int a, int b, int c){
		String result;
		int D = b*b - 4*a*c;
		if (D < 0){
			result = "None";
		}
		else if (D == 0){
			int x = -b/(2*a);
			result = "Root: " + x;
		}
		else {
			double x1 = (-b + Math.sqrt(D))/(2*a);
			double x2 = (-b - Math.sqrt(D))/(2*a);
			result = "Root 1: " + x1 + "\n" + "Root 2: " + x2;
		}
		return result;
	}
}


package labs;

import java.util.Scanner;

public class Lab02 {

	public static void main(String[] args) {

		problem1();
		problem2();
		problem3();
		problem4();

	}


public static void problem1() {

		

		Scanner inKey = new Scanner (System.in);

		

		System.out.print("Enter a positive integer: ");

		int one = inKey.nextInt();

		System.out.print("Enter a positive integer: ");

		int two = inKey.nextInt();

		

		for (int i = 0; i < 100; i++) {

			System.out.print((int) (Math.random() * (Math.max(one,two) - Math.min(one, two) + 1)) 

							+ Math.min(one, two) 

							+ " ");

		} 

}

	public static void problem2() {
		
		Scanner inKey = new Scanner (System.in);
		System.out.println("enter the radius");
		double radius = inKey.nextDouble();
		
		System.out.println(" enter the height of a cylinder");
		double height = inKey.nextDouble();
		
		double volume = Math.PI*(radius*radius)*height;
		
		System.out.println("Volume =" + volume );
	}


	public static void problem3() {
		
		Scanner inKey = new Scanner (System.in);
		System.out.println("enter X1:");
		double X1 = inKey.nextDouble();
		System.out.println("enter Y1:");
		double Y1 = inKey.nextDouble();
		System.out.println("enter X2");
		double X2 = inKey.nextDouble();
		System.out.println("enter Y2:");
		double Y2 = inKey.nextDouble();
		
		double d = Math.sqrt(Math.pow((X2-X1),2)+ Math.pow((Y2-Y1),2));
		
		System.out.print("Distance between points = "+d);
		
		
	}

	
	
public static void problem4() {

		

		Scanner inKey = new Scanner(System.in);  

		System.out.print("Enter a-value: ");  

		double a =  inKey.nextDouble();  

		System.out.print("Enter b-value: ");  

		double b = inKey.nextDouble();  

		System.out.print("Enter c-value: ");  

		double c = inKey.nextDouble();  

		

		double d = b * b - 4.0 * a * c;  

		

		if (d > 0.0)   {  

		double x1 = (-b + Math.pow(d, 0.5)) / (2.0 * a);  

		double x2 = (-b - Math.pow(d, 0.5)) / (2.0 * a);  

		System.out.println("x1= " + x1 + " and x2= " + x2);  

		}   

		

		else if (d == 0.0)   {  

		double x1 = -b / (2.0 * a);  

		System.out.println("The root is " + x1);  

		}   

		

		else {  

		System.out.println("Roots are not real.");  

		}  

		

	}  

}



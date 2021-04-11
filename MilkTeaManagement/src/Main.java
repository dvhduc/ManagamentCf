
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shin
 */
import java.lang.Math;

import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		char flag;
		Calc calc = new Calc();
		Scanner sc = new Scanner(System.in);
		double x, y;
		int c;
		do {
			Operation();	
			System.out.print("Press 1-9 to continue: ");
			c = sc.nextInt();
			System.out.print("Input\na = ");
			x = sc.nextDouble();
			System.out.print("b = ");
			y = sc.nextDouble();
			
			if(y == 0 && (c >= 4 || c <= 6))
			{
			    c = 0;
			    System.out.println("Error! Division operation requires b # 0. Please try again");
			}
			
			switch(c) {
    			case 1: System.out.println(x + " + " + y + " = " + Calc.Add(x, y)); break;
    			case 2: System.out.println(x + " - " + y + " = " + Calc.Sub(x ,y)); break;
    			case 3: System.out.println(x + " x " + y + " = " + Calc.Mul(x, y)); break;
    			case 4: System.out.println(x + " / " + y + " = " + Calc.NDiv(x, y)); break;
    			case 5: System.out.println(x + " mod " + y + " = " + Calc.Mod(x, y)); break;
    			case 6: System.out.println(x + " div " + y + " = " + Calc.Div(x, y)); break;
    			case 7: System.out.println(x + "^(" + y + ") = " + calc.Exp(x, y)); break;
    			case 8: System.out.println("log(" + x + ")" + y + " = " + calc.Log(x, y)); break;
    			case 0: break;
			}
			System.out.print("Retry with a new calculation (y/n): ");
			flag = sc.next().charAt(0);
			 
			 
		} while(flag == 'y');
	}
	
	static void Operation() {
		System.out.println("\tOperation\n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Integer Reminder\n6. Integer Division\n7. Exponentiation\n8. Logarithm\n9. Exit");
	}
}
class Calc{
    public static double Add(double a, double b) {
        return a + b;
    }
    public static double Sub(double a, double b) {
        return a - b;
    }
    public static double Mul(double a ,double b) {
        return  a * b;
    }
    public static double NDiv(double a, double b) {
        return a / b;
    }
    public static int Mod(double a, double b) {
    	return (int)(a % b);
    }
    public static int Div(double a, double b) {
    	return (int)(a / b);
    }
    public static double Exp(double a, double b) {
        return Math.pow(a, b);
    }
    public static double Log (double a,double b) {
    	return Math.log(b) / Math.log(a);
    }
}
    


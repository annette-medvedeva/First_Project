package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	Ex_a();
		Ex_b();
		Ex_c();
		Ex_d();
		Ex_e();
		Ex_f();
		Ex_g();
		Ex_h();
		Ex_y();
		Frog();
    	Tree();
		Bunny();
    }
    public static void Ex_a(){
    	Scanner scanner=new Scanner(System.in);
    	double a;
    	System.out.println("You can Enter X:");
		System.out.println("You can Enter Y:");
    	int x = scanner.nextInt();
		int y = scanner.nextInt();
    	a=3*Math.pow(x,1/3)-7;
    	System.out.println("\nResult: 3*Math.pow(x,1/3)-7="+a);
    	System.out.println("\t\nContinue...");
		System.out.println("\t\n--------");
	}
	public static void Ex_b(){
		Scanner scanner=new Scanner(System.in);
		double b;
		System.out.println("Enter X:");
		System.out.println("Enter Y:");
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		b=4*x*3-12*y;
		System.out.println("\nResult: 4*x*3-12*y="+b);
		System.out.println("\t\nContinue...");
		System.out.println("\t\n--------");
	}
	public static void Ex_c(){
		Scanner scanner=new Scanner(System.in);
		double c;
		System.out.println("Enter X:");
		System.out.println("Enter Y:");
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		c=Math.sin(x)*((-3 + 2*y)+1);
		System.out.println("\nResult: sin(х*(-3 + 2y)+1="+c);
		System.out.println("\t\nContinue...");
		System.out.println("\t\n--------");
	}
	public static void Ex_d(){
		Scanner scanner=new Scanner(System.in);
		double d;
		System.out.println("Enter X:");
		System.out.println("Enter Y:");
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		d =122*Math.pow(x,-2);
		System.out.println("\nResult: 122*Math.pow(x,-2)="+d);
		System.out.println("\t\nContinue...");
		System.out.println("\t\n--------");
	}
	public static void Ex_e(){
		Scanner scanner=new Scanner(System.in);
		double e;
		System.out.println("Enter X:");
		System.out.println("Enter Y:");
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		e = x*4*Math.abs(485 - 179*y);
		System.out.println("\n Result: x*4*Math.abs(485 - 179*y)=" +e);
		System.out.println("\t\nContinue...");
		System.out.println("\t\n--------");
	}
	public static void Ex_f(){
		Scanner scanner=new Scanner(System.in);
		double f;
		System.out.println("Enter X:");
		System.out.println("Enter Y:");
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		f=3+Math.pow(9,x)-5/x-1;
		System.out.println("\nResult: 3+9*x-5/x-1="+f);
		System.out.println("\t\nContinue...");
		System.out.println("\t\n--------");
	}
	public static void Ex_g(){
		Scanner scanner=new Scanner(System.in);
		double g;
		System.out.println("Enter X:");
		System.out.println("Enter Y:");
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		g=(2.5*(4 - 6*x)) -5;
		System.out.println("\nResult: (2.5*(4 - 6*x)) -5= "+g);
		System.out.println("\t\nContinue...");
		System.out.println("\t\n--------");
	}
	public static void Ex_h(){
		Scanner scanner=new Scanner(System.in);
		double h;
		System.out.println("Enter X:");
		System.out.println("Enter Y:");
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		h=Math.cos(x/2)+Math.sin(x/4)+3*x/6;
		System.out.println("\nResult: Math.cos(x/2)+Math.sin(x/4)+3*x/6= "+ h);
		System.out.println("\t\nContinue...");
		System.out.println("\t\n--------");
	}
	public static void Ex_y(){
		Scanner scanner=new Scanner(System.in);
		double y;
		System.out.println("Enter X:");
		System.out.println("Enter Y:");
		int x = scanner.nextInt();
		y=Math.abs(5*x-3/Math.pow(x,2)+6+7*Math.pow(x,3)-12);
		System.out.println("\nResult: Math.abs(5*x-3/Math.pow(x,2)+6+7*Math.pow(x,3)-12) = "+y);
		System.out.println("\t\n--------");
	}
	public static void Frog(){
		System.out.println("  @..@  ");
		System.out.println(" (----) ");
		System.out.println("( >__< )");
		System.out.println("^^ ~~ ^^");
	}
	public static void Tree(){
		System.out.println("       -      ");
		System.out.println("      / \\    ");
		System.out.println("   ---   ---   ");
		System.out.println("   \\       /  ");
		System.out.println("   / -'0'- \\  ");
		System.out.println("     _0_'_   ");
		System.out.println("    _'_'0'_  ");
		System.out.println("   0'_0_'_0_ ");
		System.out.println("  _'_0_'_'_0_ ");
		System.out.println(" _0_'_0_'_0_'_ ");
		System.out.println("    [______]   ");
		System.out.println("     \\____/");
	}
	public static void Bunny(){
		System.out.println("(\\___/)");
		System.out.println("(' x ')");
		System.out.println("c(\")(\")");
	}

}

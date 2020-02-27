package bai3;

import java.util.Scanner;

public class bai3 {

	public static void main(String[] args) {
		double a;
		double b;
		double x;
		
		//ax+b=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("PT co dang ax + b = 0");
		//a
		System.out.println("Input a : ");
		a=sc.nextDouble();
		//b
		System.out.println("Input b : ");
		b=sc.nextDouble();
		if(a == 0) {
	        if (b == 0) {
	        	System.out.println("PT vo so nghiem ");
	        } else {
	        	System.out.println("PT vo nghiem ");
	        }
	    } else {
	        x = (double)-b/a;
	        System.out.println("PT co nghiem la:" +x);
	    }	   
	}

}

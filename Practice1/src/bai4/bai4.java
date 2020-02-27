package bai4;

import java.util.Scanner;

public class bai4 {

	public static void main(String[] args) {
				System.out.println("Nhap Phuong Trinh ax^2+bx+1 = 0");
				double a;
				double b;
				double c;
				c=1;
				double delta;
				Scanner sc= new Scanner(System.in);
				
				//input a
				System.out.println("Nhap a : ");
				a =sc.nextInt();
				if(a == 0)
				{
					System.out.println("Nhap lai a : ");
					a=sc.nextInt();
				}
				//input b
				System.out.println("Nhap b : ");
				b=sc.nextInt();
				delta =(b*b)-(4*a*c);
				if(delta <0) {
					System.out.println("PT vo nghiem ");
				}
				if(delta ==0) {
					System.out.println("PT co nghiem kep la : " +(-b/(2*a)));
				}
				if(delta >0)
				{
					System.out.println("PT co nghiem x1 la : "+(-b+Math.sqrt(delta ))/(2*a));
					System.out.println("PT co nghiem x2 la : "+(-b-Math.sqrt(delta ))/(2*a));
				}
			
	}

}

package bai2;

import java.util.Scanner;

public class bai2 {

	public static void main(String[] args) {
		double math;
		double physics;
		double chemistry;

		double AVG;
		String rank =null;
		Scanner sc =new Scanner(System.in);
		
		//Input Math
		System.out.println("Input math : ");
		math= sc.nextDouble();
		while(math<0 || math>10)
		{
			System.out.println("Input math again : ");
			math=sc.nextDouble();
		}
		
		//Input Physics
		System.out.println("Input physics : ");
		physics=sc.nextDouble();
		while(physics<0 || physics>10)
		{
			System.out.println("Input physics again : ");
			physics=sc.nextDouble();
		}
		
		//Input chemistry
		System.out.println("Input chemistry : ");
		chemistry=sc.nextDouble();
		while(chemistry<0 || chemistry>10)
		{
			System.out.println("Input chemistry again : ");
			chemistry=sc.nextDouble();
		}
		
		//average
		AVG =((math+physics+chemistry)/3);
		System.out.println(average);
		if( AVG >= 8.5) { rank="A";}
		if( AVG >= 7.0) { rank="B";}
		if( AVG >= 5.5) { rank="C";}
		if( AVG < 5.5) { rank="D";}
		System.out.println(rank);
	}
		

	
	

}

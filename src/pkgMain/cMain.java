package pkgMain;

import java.util.Scanner;

public class cMain{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What was the initial cost of tuition at your college?");
		double Tuition = sc.nextDouble();
		double TotalTuition = Tuition;
		System.out.println("What is the typical % increase in cost per year?");
		double PercentIncrease = 1 + (0.01*sc.nextDouble());
		
		for(int i=1;i<4;i++){
			Tuition = Math.pow(Tuition, PercentIncrease);
			TotalTuition += Tuition;
		}
		System.out.printf("The total cost of tuiton to complete a degree is $%.2f.",TotalTuition);
	}
	
}
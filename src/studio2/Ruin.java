package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
	System.out.print("Start Amount: ");
	double startAmount = in.nextDouble();
	System.out.print("Win Chance: ");
	double winChance = in.nextDouble();
	System.out.print("Win Limit: "); 
	double winLimit = in.nextDouble();
	System.out.print("Total Simulations");
	double totalSimulations = in.nextDouble();
	
	double count = startAmount; 
	
	while (count <= winLimit) {
	
	double number =	Math.random();
	
	if (number >= winChance){	
	//System.out.print(count);
	count--; 
	
	if (count <= 0) {
		System.out.println("RUIN");
	break; 
	}
	
	}
	else if (number <= winChance) {
	//System.out.print(count);
		count ++; 
		
	if (count == winLimit) {
		System.out.println("SUCCESS");
	break;
	}
	}
		
	}
	
	}
	
	}

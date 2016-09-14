package dice;

import java.util.Random;
import java.util.Scanner;

public class Lab5Dice {
public static void main(String[] args) {
	
	String roll;
	String rollAgain;

	int value;
	int value2;	
	
	// Accepting input (scan) from the user
	System.out.println("Welcome to the Grand Circus No Money Casino! Roll the dice? (y/n):");
	Scanner scan = new Scanner(System.in);

	// create a randomized variable from a static method
	Random randomValue = new Random();
	
	roll = scan.nextLine();
	
	// do-while loop used for initial roll

	do {
		if (roll.equalsIgnoreCase("y")) {
			
			//declare and initialize randomized variables
			value = randomValue.nextInt(6);
			value2 = randomValue.nextInt(6);
			System.out.println("Roll: " + (value + 1) + " and " + (value2 + 1));
			// 1 is added to each value so that die rolls are never 0
			
		} else if (roll.equalsIgnoreCase("n")) {
			
			System.out.println("Chicken!");

		}

		System.out.println("Roll Again? (y/n)");
		rollAgain = scan.nextLine();
		
	}// do-while: the condition is tested after the loop is executed

	while (rollAgain.equals("y"));// if this flips, go forward 
			
	System.out.println("Bye!");
	scan.close();	
		}// pvsm
	}// class

package dice;

import java.util.Random;
import java.util.Scanner;

public class Lab5Dice {
public static void main(String[] args) {
	
	// Declare two rolls
	String roll;
	String rollAgain;

	// Declare values to be randomized from two rolls
	int value;
	int value2;	
	
	// Ask for and accept input (scan) from the user
	System.out.println("Welcome to the Grand Circus No Money Casino! Roll the dice? (y/n):");
	Scanner scan = new Scanner(System.in);
	
	// Initialize first roll
	roll = scan.nextLine();
	
	// create a randomized variable from a static method
	Random randomValue = new Random();
	
	
	
	// do-while loop used for initial roll

	do {
		if (roll.equalsIgnoreCase("y")) {
			
			//initialize randomized variables
			value = randomValue.nextInt(6);
			value2 = randomValue.nextInt(6);
			System.out.println("Roll: " + (value + 1) + " and " + (value2 + 1));
			// 1 is added to each value so that die rolls are never 0
			
		} else if (roll.equalsIgnoreCase("n")) {
			
			System.out.println("Chicken!");

		}

		System.out.println("Roll Again? (y/n)");
		// Initialize second roll
		rollAgain = scan.nextLine();
		
	}// do-while: the condition is tested after the loop is executed

	while (rollAgain.equals("y"));// if this flips, go forward 
			
	System.out.println("Bye!");
	scan.close();	
		}// pvsm
	}// class

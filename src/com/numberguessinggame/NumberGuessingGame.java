package com.numberguessinggame;
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame 
{
	public static void main(String[] args) 
	{
		Random random=new Random();
		Scanner sc=new Scanner(System.in);
		String choice;
		do {
		int secretNumber=random.nextInt(100)+1;
		
		System.out.println("WELCOME TO GUESS THE NUMBER GAME!");
		System.out.println("Guess secret number in b/w 1 to 100");
		int guess=0;
		int attempts=0;
		
	    while(guess!=secretNumber && attempts<5) {
	    	System.out.print("Enter your guess: ");
	    	guess=sc.nextInt();
		if(guess<1 || guess>100) {
			System.out.println("Guess number between 1 to 100");
		}
		else {
			attempts++;
		if(guess<secretNumber) {
			System.out.println("Too Low!");
		}
		else if (guess>secretNumber) {
			System.out.println("Too High!");
		}
		}
	    }
	    if(guess==secretNumber) {
	    	System.out.println("Congratulations!");
	    	System.out.println("You guessed the number in "+ attempts + " attempts");
	    }
	    else {
	    	System.out.println("Game over! You have used all 5 attempts.");
	    	System.out.println("The secret number is: "+secretNumber);
	    }
	    System.out.println("Do you want to play again? (Yes/No)");
	    choice=sc.next();
		}
		while(choice.equalsIgnoreCase("yes"));
		System.out.println("Thank you for playing");
	    sc.close();
	}
}

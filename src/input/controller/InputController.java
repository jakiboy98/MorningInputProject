package input.controller;

import java.util.Scanner;

public class InputController
{
	//Declaration section for instance variables.
	//Data members are always private
	private Scanner inputScanner;
	
	public InputController()
	{
		inputScanner = new Scanner(System.in);	
	}
	
	public void start()
	{
		questions();
	}
	private void questions()
	{
		System.out.println("Please type in your name");
		String myInput;
		myInput = inputScanner.nextLine();
		System.out.println("hello there " + myInput + ", Do you like hugs?");
		System.out.println("I like hugs. Could you type your full name please?");
		String fullName = inputScanner.nextLine();
		System.out.println("Your full name is: " + fullName);
		System.out.println("My name is Adorable");
		System.out.println("How old are you");
		int age = inputScanner.nextInt();
		System.out.println("You are " + age + " years old?! Do you want a hug? ༼ つ ◕_◕ ༽つ");
	}
	
}

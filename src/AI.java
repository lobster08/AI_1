// AI - chat bot 
//Data: 6/26/16

import java.util.Scanner;

public class AI {

	private String[] welcome = {"hi", "hello", "hey"};
	private String[] exit = {"shutdown", "exit", "terminate"};
	
	
	AI() {
	/*	welcome[0] = "hi";
		welcome[1] = "hello";
		welcome[2] = "hey";
		
		exit[0] = "exit";
		exit[1] = "shutdown";
		exit[2] = "terminate";
			
		*/
	}
	
	public void compare(String input) {
		boolean found = false;
				
		for(int x=0; x < 3; x++) {					// PROBLEM HERE!!!!!!!!!
			if(welcome[x] == input) {
				found = true;
				welcome();
				break;
			}
			else if(exit[x] == input) {
				found = true;
				exit();
				break;
			}
		}
		
		if(found == false) {
		System.out.println("I'm sorry but I haven't learn how to respond to that.");
		}
				
	}	
	
	public void welcome() {
		System.out.println("Hello!");
	}
	
	public void exit() {
		System.out.println("Program terminated!");
		System.exit(0);
	}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		AI bot = new AI();
		
		System.out.print("_");
		String userInput = input.next().toLowerCase();
		
		bot.compare(userInput);
		
				
		System.out.println(userInput);
		
		input.close();
		
	}
}


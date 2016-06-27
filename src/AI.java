// AI - chat bot 
//Data: 6/26/16

import java.util.Scanner;

public class AI {

	private String[] welcome = {"hi", "hello", "hey"};
	private String[] exit = {"exit", "terminate", "shutdown"};
	
	public void compare(String input) {
		boolean found = false;
		
		for(int x=0; x < 3 || !found; x++) {
			if(welcome[x] == input) {
				found = true;
				welcome();
			}
			else if(input == exit[x]) {
				found = true;
				exit();
			}
		}
		
		if(found == false) {
		System.out.println("I'm sorry but I haven't learn how to respond to that.");
		}
		
		return;
		
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
		
		System.out.println("_");
		String userInput = input.next().toLowerCase();
		
		bot.compare(userInput);
		
		input.close();
		
	}
}


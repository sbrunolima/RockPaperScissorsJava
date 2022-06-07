import java.util.Scanner;
import java.util.Random;

public class rockpaperscissors {

	//Get player choice
	public static String playerChoice() {
		Scanner data = new Scanner(System.in);
		
		System.out.print("Enter your choice: ");
		String choice = data.nextLine();
		
		switch (choice) {
		case "rock":
			return  "Rock";
		case "paper":
			return "Paper";
		case "scissors":
			return "Scissors";
		default:
			return "Quit";
			
		}
	}
	
	//Return the Computer random choice
	public static String computerChoice() {
		Random random = new Random();
		int choice = random.nextInt(3); //random int from 0 to 2
		
		switch (choice) {
		case 0:
			return"Rock";
		case 1:
			return "Paper";
		case 2:
			return "Scissors";
		default:
			return "Quit";
		}
	}
	
	//Verify if the player or the computer won
	public static String winner(String userInput, String computerInput) {
		if (userInput == computerInput) {
			return "Tie";
		} else if (userInput == "Rock" && computerInput == "Scissors") {
			return "You Win!";
		} else if (userInput == "Scissors" && computerInput == "Paper") {
			return "You Win!";
		} else if (userInput == "Paper" && computerInput == "Rock") {
			return "You Win!";
		} else {
			return "Computer Wins!";
		}
	}
	
	public static void solve() {
		while (true) {
			System.out.println("Rock, Paper, Scissors!\n");
			String userInput = playerChoice();
			
			if (userInput == "Quit") {
				System.exit(0); //exit
			}
			
			System.out.println("You choose: " + userInput);
			String computerInput = computerChoice();
			System.out.println("Computer choose: " + computerInput);
			System.out.println(winner(userInput, computerInput));
		}
	}
	
	//Main
	public static void main(String[] args) {
		solve();
	}

}

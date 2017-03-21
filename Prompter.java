import java.util.Scanner;
public class Prompter {
	private int maxNumb;
	private String type; 
	Scanner scanner = new Scanner(System.in);
	
	public void promptForGuess(){
		System.out.println("Enter Guess");
	}
	
	public void tryAgain(){
		System.out.println("Try Again");
	}
	
	public Jar PromptforTypeAndMaxNumb(){
		
		System.out.println("Set Type");
		type = scanner.nextLine();
		
		System.out.println("Set Max Numb");
		maxNumb = scanner.nextInt();
		
		
		return new Jar(type , maxNumb);
		
	}

}

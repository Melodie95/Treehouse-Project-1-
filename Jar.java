import java.util.Random;
import java.util.Scanner;
public class Jar {
	Scanner scanner = new Scanner(System.in);
	
	private int maxNumberOfItems; 
	private int numberOfItems; 
	private String type; 
	private int guess;
	private int numberOfGuesses ; 
	
	
	
	
	public Jar(String type , int maxNumberOfItems){
		this.type = type ;
		this.maxNumberOfItems = maxNumberOfItems;
	}
	
	public int getGuess(){
		return guess;
	}
	
	public int getNumberOfitems(){
		return numberOfItems;
	}
	
	public String getType(){
		return type;
	}

	public int getNumberOfGuesses(){
		return numberOfGuesses;
	}
	public int getMaxNumberOfItems(){
		return maxNumberOfItems;
	}
	
	public void fill(){
		Random random = new Random();
		numberOfItems = random.nextInt(maxNumberOfItems) + 1 ;
	}
	
	public void guess(){
		numberOfGuesses = 0 ;
		Prompter prompter = new Prompter();
		prompter.promptForGuess();
		guess = scanner.nextInt();
		
		
		while(guess != numberOfItems){
			if(guess>maxNumberOfItems){
				throw new IllegalArgumentException();
			} else if (guess<1){
				throw new IllegalArgumentException();
			}
			prompter.tryAgain();
			guess = scanner.nextInt();
			numberOfGuesses++;
		}
		if(guess == numberOfItems){
			System.out.println("Congrats");
			numberOfGuesses++;
			System.out.printf("You got it in %d tries" ,numberOfGuesses);
		}
		
		
		
	}
}

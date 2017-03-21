public class Game {
	
	public static void main(String[] args){
		
		Prompter prompter = new Prompter();
		Jar jar = prompter.PromptforTypeAndMaxNumb();
		jar.fill();
		System.out.printf("The maximum number of %s in the jar is %d %n" ,jar.getType(), jar.getMaxNumberOfItems());
		
		System.out.printf("the number to guess is %d %n",jar.getNumberOfitems());
		try{
		jar.guess();
	
		} catch(IllegalArgumentException iae){
		System.out.println("Please choose a valid number");
			
			
			
		}
	}
}

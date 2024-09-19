/**
 *
 * @author ehabali
 * This program is inspired by the YouTube tutorial: "Create Rock Paper Scissors in Java in 10 Minutes"
 * https://www.youtube.com/watch?v=DyqMglmrido
 */
public class RockPaperScissors {
    public static void main(String[] args) {
	Random rand = new Random();
	String[] rockPaperScissor = {"rock", "paper", "scissors"};
	String com = rockPaperScissor[rand.nextInt(rockPaperScissor.length)];
		
	Scanner scrn = new Scanner(System.in);
	String userInput;
		
	while(true){
		System.out.print("Please choose a move. Rock, Paper, or Scissors: ");
		userInput = scrn.nextLine().toLowerCase();
		if(userInput.equals("rock") ||userInput.equals("paper") ||userInput.equals("scissors")){
			break;
		}
		System.out.println(userInput + " is not a valid move.");
    }
        System.out.println("Computer move: " + com);
        System.out.println("Player move: " + userInput );
        switch(userInput){
            case "rock":
                switch(com){
                    case "rock":
                        System.out.println("Draw.");
                        break;
                    case "paper":
                        System.out.println("You lose.");
                        break;
                    case "scissors":
                        System.out.println("You win!");
                        break;
                }
                break;
            case "paper":
                switch(com){
                    case "rock":
                        System.out.println("You win!");
                        break;
                    case "paper":
                        System.out.println("Draw.");
                        break;
                    case "scissors":
                        System.out.println("You lose.");
                        break;
                }
                break;
            case "scissors":
                switch(com){
                    case "rock":
                        System.out.println("You lose.");
                        break;
                    case "paper":
                        System.out.println("You win!");
                        break;
                    case "scissors":
                        System.out.println("Draw.");
                        break;
                }
                break;
            }
        }
    }
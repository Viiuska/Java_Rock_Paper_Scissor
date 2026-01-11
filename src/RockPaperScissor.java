import java.util.Random;
import java.util.SimpleTimeZone;

//Backend
public class RockPaperScissor {
    private static final String[] computerChoices = {"Rock", "Paper", "Scissor"};

    public String getComputerChoice() {
        return computerChoice;
    }

    public int getComputerScore() {
        return computerScore;
    }

    public int getPlayerScore() {
        return playerScore;
    }

    private String computerChoice;

    private int computerScore, playerScore;

    private Random random;

    //Contructor -init random obj
    public RockPaperScissor(){
        random = new Random();
    }


    public String playRockPaperScissor(String playerChoise) {
        //Computer choice
        computerChoice = computerChoices[random.nextInt(computerChoices.length)];

        String result;

        //Game logic
        if (computerChoice.equals("Rock")) {
            if (playerChoise.equals("Paper")) {
                result = "Player Wins";
                playerScore++;
            } else if (playerChoise.equals("Scissor")) {
                result = "Computer Wins";
                computerScore++;
            } else {
                result = "Draw";
            }
        } else if (computerChoice.equals("Paper")) {
            if (playerChoise.equals("Scissor")) {
                result = "Player Wins";
                playerScore++;
            } else if (playerChoise.equals("Rock")) {
                result = "Computer Wins";
                computerScore++;
            } else {
                result = "Draw";
            }

        } else {
            if (playerChoise.equals("Rock")) {
                result = "Player Wins";
                playerScore++;
            } else if (playerChoise.equals("Paper")) {
                result = "Computer Wins";
                computerScore++;
            } else {
                result = "Draw";
            }
        }

        return result;
    }

}

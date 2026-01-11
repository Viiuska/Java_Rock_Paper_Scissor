import javax.swing.*;
import java.awt.*;

//User interface
public class RockPaperScissorGUI extends JFrame {
    JButton rockButton, paperButton, scissorButton;

    public RockPaperScissorGUI(){
        super("Rock Paper Scissor");

        setSize(450, 574);

        setLayout(null);

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setLocationRelativeTo(null);

        addGuiComponents();

    }

    //GUI elements
    private  void addGuiComponents(){
        //Computer
        JLabel computerScoreLabel = new JLabel("Computer: 0");
        computerScoreLabel.setBounds(0,43,450,30);
        computerScoreLabel.setFont(new Font("Dialog", Font.BOLD, 26));
        computerScoreLabel.setHorizontalAlignment(SwingConstants.CENTER);

        add(computerScoreLabel);

        JLabel computerChoice = new JLabel("?");
        computerChoice.setBounds(175,118,98,81);
        computerChoice.setFont(new Font("Dialog", Font.PLAIN, 18));
        computerChoice.setHorizontalAlignment(SwingConstants.CENTER);

        computerChoice.setBorder(BorderFactory.createLineBorder(Color.BLUE));

        add(computerChoice);


        //Player
        JLabel playerScoreLabel = new JLabel("Player: 0");
        playerScoreLabel.setBounds(0,317,450,30);
        playerScoreLabel.setFont(new Font("Dialog", Font.BOLD, 26));
        playerScoreLabel.setHorizontalAlignment(SwingConstants.CENTER);

        add(playerScoreLabel);

        //Player Buttons
        rockButton = new JButton("Rock");
        rockButton.setBounds(40,387,105,81);
        rockButton.setFont(new Font("Dialog", Font.PLAIN, 18));

        add(rockButton);

        paperButton = new JButton("Paper");
        paperButton.setBounds(165,387,105,81);
        paperButton.setFont(new Font("Dialog", Font.PLAIN, 18));

        add(paperButton);

        scissorButton = new JButton("Scissor");
        scissorButton.setBounds(290,387,105,81);
        scissorButton.setFont(new Font("Dialog", Font.PLAIN, 18));

        add(scissorButton);

    }
}

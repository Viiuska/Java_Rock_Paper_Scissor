import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//User interface, Frontend
public class RockPaperScissorGUI extends JFrame implements ActionListener {
    JButton rockButton, paperButton, scissorButton;

    JLabel computerChoice;

    JLabel computerScoreLabel, playerScoreLabel;

    RockPaperScissor rockPaperScissor;

    public RockPaperScissorGUI(){
        super("Rock Paper Scissor");

        setSize(450, 574);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        rockPaperScissor = new RockPaperScissor();

        addGuiComponents();

    }

    //GUI elements
    private  void addGuiComponents(){
        //Computer
        computerScoreLabel = new JLabel("Computer: 0");
        computerScoreLabel.setBounds(0,43,450,30);
        computerScoreLabel.setFont(new Font("Monospaced", Font.BOLD, 26));
        computerScoreLabel.setHorizontalAlignment(SwingConstants.CENTER);

        add(computerScoreLabel);

        computerChoice = new JLabel("?");
        computerChoice.setBounds(175,118,98,81);
        computerChoice.setFont(new Font("Monospaced", Font.PLAIN, 18));
        computerChoice.setHorizontalAlignment(SwingConstants.CENTER);

        computerChoice.setBorder(BorderFactory.createLineBorder(Color.darkGray));

        add(computerChoice);


        //Player
        playerScoreLabel = new JLabel("Player: 0");
        playerScoreLabel.setBounds(0,317,450,30);
        playerScoreLabel.setFont(new Font("Monospaced", Font.BOLD, 26));
        playerScoreLabel.setHorizontalAlignment(SwingConstants.CENTER);

        add(playerScoreLabel);

        //Player Buttons
        rockButton = new JButton("Rock");
        rockButton.setBounds(40,387,115,81);
        rockButton.setFont(new Font("Monospaced", Font.PLAIN, 18));
        rockButton.addActionListener(this);
        add(rockButton);

        paperButton = new JButton("Paper");
        paperButton.setBounds(165,387,115,81);
        paperButton.setFont(new Font("Monospaced", Font.PLAIN, 18));
        paperButton.addActionListener(this);
        add(paperButton);

        scissorButton = new JButton("Scissor");
        scissorButton.setBounds(290,387,115,81);
        scissorButton.setFont(new Font("Monospaced", Font.PLAIN, 18));
        scissorButton.addActionListener(this);
        add(scissorButton);

    }

    //Display dialog
    private void showDialog(String msg){
        JDialog resultDialog = new JDialog(this, "Result", true);
        resultDialog.setSize(227,124);
        resultDialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        resultDialog.setResizable(false);

        JLabel resultLabel = new JLabel(msg);
        resultLabel.setFont(new Font("Monospaced", Font.BOLD, 18));
        resultLabel.setHorizontalAlignment(SwingConstants.CENTER);
        resultDialog.add(resultLabel, BorderLayout.CENTER);

        JButton tryAgainButton = new JButton("Try again?");
        tryAgainButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                computerChoice.setText("?");

                resultDialog.dispose();
            }
        });

        resultDialog.add(tryAgainButton, BorderLayout.SOUTH);

        resultDialog.setLocationRelativeTo(this);
        resultDialog.setVisible(true);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        String playerChoice = e.getActionCommand().toString();

        String result = rockPaperScissor.playRockPaperScissor(playerChoice);

        computerChoice.setText(rockPaperScissor.getComputerChoice());

        computerScoreLabel.setText("Computer: "+ rockPaperScissor.getComputerChoice());
        playerScoreLabel.setText("Player: "+ rockPaperScissor.getPlayerScore());

        showDialog(result);

    }
}

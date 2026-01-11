import javax.swing.*;
import java.awt.*;

//User interface
public class RockPaperScissorGUI extends JFrame {
    public RockPaperScissorGUI(){
        super("Rock Paper Scissor");

        setSize(450, 574);

        setLayout(null);

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setLocationRelativeTo(null);

        addGuiComponents();

    }

    //Text elements
    private  void addGuiComponents(){
        JLabel computerScoreLabel = new JLabel("Computer: 0");

        computerScoreLabel.setBounds(0,43,450,30);

        computerScoreLabel.setFont(new Font("Dialog", Font.BOLD, 26));

        computerScoreLabel.setHorizontalAlignment(SwingConstants.CENTER);

        add(computerScoreLabel);
    }
}

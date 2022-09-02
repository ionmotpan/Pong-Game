import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class GameFrame extends JFrame {
    GamePanel panel;

    public GameFrame(){
        ImageIcon icon = new ImageIcon("ball.png");
        this.setIconImage(icon.getImage());
        this.setTitle("Pong Game");
        panel = new GamePanel();
        this.add(panel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setBackground(Color.BLACK);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }


}

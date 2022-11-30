import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    
    MyFrame(){
        this.setSize(420,420);
        this.setTitle("this title goes here");
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true); // this wille make frame visible

        ImageIcon image = new ImageIcon("logo1.png");
        this.setIconImage(image.getImage());
        this.getContentPane().setBackground(Color.black);
    }
}

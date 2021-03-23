import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame{

    MyFrame() {

        // JLabel = a GUI display area for a string of text, an image, or both
        ImageIcon foodVariety = new ImageIcon("foodVariety.jpg");
        Border border01 = BorderFactory.createLineBorder(Color.BLUE,5);

        JLabel label = new JLabel(); // create a label
        label.setText("Welcome to Recipes to Infinity"); // set text of label
        label.setIcon(foodVariety);
        //label.setHorizontalTextPosition(JLabel.CENTER); // set text LEFT, CENTER, RIGHT of imageicon
        label.setVerticalTextPosition(JLabel.CENTER); // set text TOP, CENTER, BOTTOM of imageIcon
        label.setForeground(new Color(0,0,0));
        label.setBackground(Color.green);
        label.setOpaque(true);
        label.setBorder(border01);
        label.setFont(new Font("Times New Roman", Font.BOLD, 35));


        JFrame frame = new JFrame();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Recipes to Infinity");
        this.setSize(650,650);
        this.setVisible(true);
        this.add(label);
        ImageIcon image = new ImageIcon("img.png"); // Create an ImageIcon of French Fries
        this.setIconImage(image.getImage()); // change icon of frame
        this.getContentPane().setBackground(new Color(0,255,255)); // Change color of background
        // adding button to the frame

    }

}

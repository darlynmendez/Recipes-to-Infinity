package gui;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.*;
import javax.swing.border.LineBorder;

public class RTIUI {
   static int cbWidth =50;
   static int cbHeight=25;
   static int windowSizewidth = 800;
   static int windowSizeHeight = 600;
   static int panel1Sizewidth = 800;
   static int panel1SizeHeight = 600;
   static int titleBoundx = 300;
   static int titleBoundy = 150;
   static int titleBoundWidth = 20;
   static int titleBoundHeight = 20;
   static int ingredientsBoundx = 20;
   static int ingredientsBoundy = 20;
   static int ingredientsBoundWidth = 20;
   static int ingredientsBoundHeight = 20;
   static int recipeBoundx = 40;
   static int recipeBoundy = 40;
   static int recipeBoundWidth = 40;
   static int recipeBoundHeight = 40;
   static int farmersBoundx = 40;
   static int farmersBoundy = 40;
   static int farmersBoundWidth = 40;
   static int farmersBoundHeight = 40;
   static int panel1Boundx = 0;
   static int panel1Boundy = 0;
   static int panel1BoundWidth = 800;
   static int panel1BoundHeight = 400;
   static int pane12Boundx = 0;
   static int pane12Boundy = 400;
   static int pane12BoundWidth = 800;
   static int pane12BoundHeight = 400;
   static int titleFont1 = 1;
   static int titleFont2 = 1;
   
   static JButton button;
   
   //Ingredient button
   public static JButton ingredientsButton(){
       //create button for 
      button = new JButton("Ingredient search"); 
      button.setBounds(ingredientsBoundx,ingredientsBoundy,ingredientsBoundWidth,ingredientsBoundHeight);
      button.setVisible(true);
      return button;
    }
   
   //Recipe button
   public static JButton recipeButton(){
       //create button for 
      button = new JButton("Recipe Search"); 
      button.setBounds(recipeBoundx,recipeBoundy,recipeBoundWidth,recipeBoundHeight);
      button.setVisible(true);
      return button;
    }
   
   //Farmers Market button
   public static JButton farmersButton(){
       //create button for 
      button = new JButton("Farmer's Market"); 
      button.setBounds(farmersBoundx,farmersBoundy,farmersBoundWidth,farmersBoundHeight);
      button.setVisible(true);
      return button;
    }
   
   //create label for title
   public static JLabel title(){
        //create frame for title
        JLabel title = new JLabel("Recipes To Infinity");
        //set font
        title.setFont(new Font("Verdana",titleFont1,titleFont2));
        //set color
        title.setBorder(new LineBorder(Color.BLACK));
        //set bounds
        title.setBounds(titleBoundx,titleBoundy,titleBoundWidth,titleBoundHeight);
        title.setSize(titleBoundWidth, titleBoundHeight);
        return title; 
    }
   
   //panel1 method
   static JPanel panel1(){
        //create Jpanel/add title
        JPanel panel1= new JPanel();
        //title size
        panel1.setSize(panel1Sizewidth,panel1SizeHeight);
        //set color
        panel1.setBackground(Color.GREEN);
        panel1.setBounds(panel1Boundx, panel1Boundy, panel1BoundWidth, panel1BoundHeight);
        //add to panel
        panel1.add(title());
        return panel1;
   }
   
   //panel2 method
   static JPanel panel2(){
       //create Jpanel/add title
        JPanel panel2= new JPanel();
        //set color
        panel2.setBackground(Color.GREEN);
       //panel2.setLocation(10, 10);
        panel2.setBounds(pane12Boundx, pane12Boundy, pane12BoundWidth, pane12BoundHeight);
        //add to panel
        panel2.add(recipeButton());
        panel2.add(ingredientsButton());
        panel2.add(farmersButton());
        // panel2.add(searchFor());
        return panel2;

   }
   
    public static JFrame Gui(){
         JFrame window = new JFrame();
        //give window a title
        window.setTitle("Recipes To Infinity");
        //set Jframe to null
        window.setLayout(null);
        //set width and length of window
        window.setSize(windowSizewidth,windowSizeHeight);
        
        //set close window
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //stop resize
        window.setResizable(false);
        //set in middle of the screen
        window.setLocationRelativeTo(null);
         //add panel to jframe
        window.add(panel1());
         window.add(panel2());
         //make widow visible
        window.setVisible(true);
        return window;
    }
}
   /*
          public static Box searchbox(){
         Box box = Box.createHorizontalBox();
       box.add(new JLabel("Search"));
       JTextField search = new JTextField();
       box.add(search);
       JButton searchButton = new JButton("Search");
       search.setActionCommand("search");
       //search.addActionListener((ActionListener this);
       box.add(searchButton);
       box.setVisible(true);
       return box;
    }
    */
/*

//season drop down box
    public static JComboBox comboBox(){
         String seasons[]={"Spring","Summer","Fall","Winter"};
         //put seasons in choice box
        JComboBox cb = new JComboBox(seasons);
          //set size
        cb.setSize(cbWidth,cbHeight);
        //set visible
        cb.setVisible(true);
        return cb;
    }
public static JLabel addimage(){
        //create and import image
        JLabel label = new JLabel(new ImageIcon("src//IMG_22001.png"));

        //set label size
        label.setBounds(200,100,20,20);
        return label;
    }
static JPanel panel3(){
        JPanel panel3= new JPanel();
        panel3.setLayout(null);
       panel3.setPreferredSize(new Dimension(400,300));
       // panel3.setBounds(800, 600,0,0);
        panel3.setBackground(Color.WHITE);
        panel3.add(addimage());
        return panel3;
   }
//create label for search
   public static JLabel searchFor(){
        //create frame for title
        JLabel slabel = new JLabel("Search By");
        //set font
        slabel.setFont(new Font("Verdana",1,20));
        //set color
        slabel.setBorder(new LineBorder(Color.BLACK));
        //set bounds
        slabel.setBounds(20,0,20,20);
        slabel.setSize(titleBoundWidth, titleBoundHeight);
        return slabel;
    }
   */
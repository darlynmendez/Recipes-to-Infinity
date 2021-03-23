import javax.swing.*;
import java.awt.*;

public class SeasonalIngredientsWindow {
    JFrame seasonalPage = new JFrame();
    JLabel theMarchIngredientsAre = new JLabel("The Seasonal March Ingredients Are:");
    JLabel marchIngredients = new JLabel("Artichokes, arugula, avocado, asparagus, beets" +
            ", bok choy, brocolli, brussel sprouts, cabbage, carrots, cauliflower, celeriac," +
            "collard greens, cucumber, endive, funnel, leeks, parsnips, onions, potatoes," +
            "radishes, radicchio, spinach, sunchokes, sweet potato, turnips");
    JLabel marchIngredientsTwo = new JLabel("brocolli, brussel sprouts, cabbage, carrots, cauliflower");

    SeasonalIngredientsWindow() {
        marchIngredients.setBounds(500,500,400,400);
        marchIngredients.setFont(new Font("Times New Roman",Font.BOLD, 20));
        marchIngredientsTwo.setBounds(500,500,500,500);
        marchIngredientsTwo.setFont(new Font("Times New Roman", Font.BOLD,20));
        theMarchIngredientsAre.setBounds(500,500,330,330);
        theMarchIngredientsAre.setFont(new Font("Times New Roman", Font.BOLD,20));

        seasonalPage.add(marchIngredients);
        seasonalPage.add(marchIngredientsTwo);
        seasonalPage.add(theMarchIngredientsAre);
        seasonalPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        seasonalPage.setSize(420,420);
        seasonalPage.setLayout(null);
        seasonalPage.setVisible(true);
    }
}

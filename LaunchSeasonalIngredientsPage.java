import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LaunchSeasonalIngredientsPage implements ActionListener {

    JFrame startPage = new JFrame();
    JButton start = new JButton("Start");

    LaunchSeasonalIngredientsPage() {

        start.setBounds(100,160,200,40);
        start.setFocusable(false);
        start.addActionListener(this);

        startPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        startPage.setSize(420,420);
        startPage.setLayout(null);
        startPage.setVisible(true);
        startPage.add(start);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == start) {
            SeasonalIngredientsWindow window01 = new SeasonalIngredientsWindow();
        }
    }
}

package Weather;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WeatherApp extends JFrame {

    JLabel title;
    JPanel top;
    JButton random, find;

    WeatherApp(){

        setSize(320, 450);
        top= new JPanel(new GridLayout(3, 1));

        //elements for Panel
        title= new JLabel("Forecaster App");
        title.setFont( new Font("Arial Black", Font.BOLD, 26));
        title.setBackground(Color.WHITE);
        title.setOpaque(true);
        title.setHorizontalAlignment(SwingConstants.CENTER);

        Font font= new Font("Arial Black", Font.PLAIN, 15);
        Color bg= new Color(0, 150, 255);

         //random Forecast Button
        random= new JButton("Random Forecast");
        random.setFont( font );
        random.setForeground(Color.WHITE);
        random.setBackground(bg);
        random.setOpaque(true);
        random.setBorder(new LineBorder(Color.WHITE, 5));

        //find forecast button
        find= new JButton("Find Forecast");
        find.setFont( font );
        find.setForeground(Color.WHITE);
        find.setBackground(bg);
        find.setOpaque(true);
        find.setBorder(new LineBorder(Color.WHITE, 3));

        //add title, and buttons to panel
        top.add(title);
        top.add(random);
        top.add(find);
        //add top panel to frame and show
        add(top);
        setVisible(true);

        random.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                RandomForecast randomForecast= new RandomForecast();
                dispose();
            }
        });
        find.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FindForecast findForecast= new FindForecast();
                dispose();
            }
        });

    } //constructor ends

    public static void main(String[] args) {
        new WeatherApp();
    }


}

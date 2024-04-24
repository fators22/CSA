package Weather;

import javax.swing.*;
import java.awt.*;

public class RandomForecast extends JFrame {

    JButton home, getRandom;;
    JLabel title, subtitle, city, low, high, condition, icon;

    JPanel panel1, panel2;


    RandomForecast(){
        setSize(320, 450);
        setLayout(null);
        panel1= new JPanel();
        panel2 = new JPanel();
        panel1.setLayout(null);
        panel2.setLayout(null);
        add(panel1);
        add(panel2);
        panel1.setBounds(0, 0, 320, 150 );
        panel2.setBounds(0, 150, 320, 300 );
        panel1.setBackground(new Color(255,255,255));
        panel2.setBackground(new Color(0,155,255));

        title = new JLabel("Random Forecaster!");
        title.setBounds(0, 0, 280, 40 );
        title.setFont(new Font("Arial", 1, 22));
        subtitle = new JLabel("What is the weather in ..");
        subtitle.setBounds(75, 65, 180, 20 );
        subtitle.setFont(new Font("Arial", 1, 13));
        home = new JButton(new ImageIcon("home.png"));

        home.setBounds(280, 0, 40, 40 );
        getRandom = new JButton("Get Forecast");
        getRandom.setBounds(75, 90, 180, 40 );
        getRandom.setFont( new Font("Arial", 1, 15));
        getRandom.setBackground(new Color(0,155,255));
        getRandom.setOpaque(false);
        panel1.add(title);
        panel1.add(subtitle);
        panel1.add(home);
        panel1.add(getRandom);

        city= new JLabel("CITY");
        city.setBounds(15, 15, 280, 40 );
        city.setFont(new Font("Arial", 1, 18));
        city.setBackground(new Color(0,155,255));
        city.setForeground(new Color(255,255,255));
        city.setHorizontalAlignment(0);

        high= new JLabel("HIGH");
        high.setBounds(15, 60, 125, 67 );
        high.setFont(new Font("Arial", 1, 13));
        high.setBackground(new Color(0,155,255));
        high.setForeground(new Color(255,255,255));
        high.setHorizontalAlignment(0);

        panel2.add(city);
        panel2.add(high);


        setVisible(true);
        setResizable(false); 
        // Disable resizing so that exact measurements are not distorted


        }


    public static void main(String[] args) {
        new RandomForecast();
    }




}

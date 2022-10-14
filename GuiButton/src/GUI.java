import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//@ZoePiper 0ct 2022
// make a gui button
//source:https://www.youtube.com/watch?v=5o3fMLPY7qY
public class GUI implements ActionListener {
    private int count=0;
    private JLabel label;
    private JFrame frame;
    private JButton button;
    private JPanel panel;
    public GUI (){ //constructor
         frame = new JFrame(); //make the window

         JButton button = new JButton("Press Button.\nGet a cookie");
        button.addActionListener(this);

         label = new JLabel("Number of cookies: 0"); // first default text

         panel =new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));// make border object
        panel.setLayout(new GridLayout(0,1));//
        panel.add(button);
        panel.add(label);

        //standard options for panel
        frame.add(panel,BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("My GUI");
        frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new GUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        label.setText("Number of cookies: "+ count );

    }
}

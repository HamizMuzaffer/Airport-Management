
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
 class exitframe extends JFrame {
	 JLabel mainlabel,label;
	 JButton mybutton;
	 
exitframe() {
	setTitle("NHU International Airlines");
    setSize(600, 600);
    setLocationRelativeTo(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    getContentPane().setBackground(new Color(0x0096FF));
    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
       Container c = getContentPane();
    c.setLayout(null);
	
    
    JLabel mainlabel = new JLabel("Thanks For Choosing Us!");

    mainlabel.setBounds(110,-100,400,400); 
    mainlabel.setForeground(Color.white);
    mainlabel.setFont(new Font("Boiling Demo Black",Font.PLAIN,30)); 
    
    JLabel label = new JLabel();

    
    String imagePath  = "F:\\Hamiz\\Nazeer Hussain University\\OOP'S\\NHU International Airlines\\NHU Airlines\\src\\thankyou.png";
    ImageIcon image1 = new ImageIcon(imagePath);
    label.setBounds(-50,50,400,400);
    label.setIcon(image1);
    
    JButton mybutton = new JButton ();
	 mybutton.setText("Return To Menu");
	 mybutton.setForeground(Color.white);
	 mybutton.setBackground(Color.black);
	 mybutton.setBounds(210,330,150,40);
    mybutton.setPreferredSize(new Dimension(150,40));		
  
    mybutton.setFocusable(false);
   mybutton.addActionListener(new ActionListener() {
       public void actionPerformed(ActionEvent e) {
      	 WelcomeScreen frame = new  WelcomeScreen();
           frame.setVisible(true);
      	 
         
      	 
      }
  });
    
    c.add(mainlabel);
    c.add(label);
    c.add(mybutton);
    
}



}

public class exit {
    public static void main(String[] args) {
        exitframe frame = new exitframe();
        frame.setVisible(true);
    }
}


import javax.swing.*;
import java.awt.*;


class Frame extends JFrame{
    JLabel l1,l2,l3,l4;
    JButton b1,b2,b3,b4;
    public Frame(){
        getContentPane().setBackground(new Color(0,255,0));
        setLayout(null);
        setLocation(500,100);
        setSize(500,500);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        b1=new JButton("Butt 1");
        b1.setBounds(50, 100,100,100);
        add(b1);
        b2=new JButton("Butt 2");
        b2.setBounds(150, 100,100,100);
        add(b2);
        b3=new JButton("Butt 3");
        b3.setBounds(250, 100,100,100);
        add(b3);
 
        b4=new JButton("Butt 4");
        b4.setBounds(350, 100,100,100);
        add(b4);
       
 
        setVisible(true);
    }
}
 
public class exp62 extends Frame{
    public static void main(String[] args) {
        new Frame();
    }
}
import javax.swing.*;
import java.awt.*;


class Frame extends JFrame{

    JLabel l1,l2,l3,l4;
    JButton b1,b2,b3,b4;

    public Frame(){
        getContentPane().setBackground(new Color(101,0,10));
        setLayout(null);
        setLocation(100,100);
        setSize(1000,900);
        
        // setResizable(false);

        b1=new JButton("Button 1");
        b1.setBounds(50,100,100,100);

        l1= new JLabel("Button 1 was clicked");
        l1.setBounds(50,215,150,100);
        l1.setForeground(Color.WHITE); // Setting the color to blue as an example
        // l1.setFont(new Font("Arial",Font.ITALIC,16));
        
        b1.addActionListener(e->
        {add(l1);}

        );

        add(b1);
        

        b2=new JButton("Button 2");
        b2.setBounds(200,100,100,100);
        add(b2);

        l2= new JLabel("Button 2was created");
        l2.setBounds(200,215,150,100);
        l2.setForeground(Color.WHITE);

        b2.addActionListener(e->
        {add(l2);});

        add(b2);

        // b3=new JButton("Button 3");
        // b3.setBounds(25,200,10,400);
        // add(b3);

        setVisible(true);
    }
}


public class e62 extends Frame{

    public static void main(String[] args) {
        new Frame();
    }
    
}

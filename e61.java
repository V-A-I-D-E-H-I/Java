import javax.swing.*;
import java.awt.*;

class Frame extends JFrame{
    JLabel name, street, city, pincode;
    JTextField namet, streett, cityt, pincodet;
    JButton MI;

    public Frame(){
        getContentPane().setBackground(new Color(120, 40, 78));
        setLayout(null);
        setLocation(300,50);

        setSize(600,550);
        // setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        name= new JLabel("Enter name");
        name.setBounds(50,50,200,40);
        // name.setFont(new Font("Arial",Font.BOLD,32));
        add(name);
        namet = new JTextField();
        namet.setBounds(200, 50,200,40);
        add(namet);

        street= new JLabel("Enter street");
        street.setBounds(50,150,200,40);
        add(street);
        streett = new JTextField();
        streett.setBounds(200, 150,200,40);
        add(streett);

        city= new JLabel("Enter city");
        city.setBounds(50,250,200,40);
        add(city);
        cityt = new JTextField();
        cityt.setBounds(200, 250,200,40);
        add(cityt);

        pincode= new JLabel("Enter pincode");
        pincode.setBounds(50,350,150,40);
        add(pincode);
        pincodet = new JTextField();
        pincodet.setBounds(200, 350,200,40);
        add(pincodet);

        MI= new JButton("MyInfo");
        MI.setBounds(250, 430,100,40);
        
        MI.addActionListener(e->
        {
            String textName= namet.getText().toString();
            String textCity= cityt.getText().toString();
            String textStreet= streett.getText().toString();
            String textPin= pincodet.getText().toString();

            if(textName.isEmpty()||textCity.isEmpty())
            {
                JOptionPane.showMessageDialog(this,"Please","Invalid", JOptionPane.WARNING_MESSAGE);
            }
            else{
                namet.setFont(new Font("Arial", Font.ITALIC,32));
                cityt.setFont(new Font("Arial", Font.ITALIC,32));
                streett.setFont(new Font("Arial", Font.ITALIC,32));
                pincodet.setFont(new Font("Arial", Font.ITALIC,32));

            }
        });

        add(MI);

        setVisible(true);

    }
}

public class e61 extends JFrame {

    public static void main(String[] args) {
        new Frame();
        
    }
    
}

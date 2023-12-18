import javax.swing.*;
import java.awt.*;

class Frame extends JFrame {
    private String answer = "";

    public Frame() {
        super("Calculator");

        //main Panel
        JPanel calc = new JPanel();
        calc.setLayout(new BorderLayout());

        JTextField tfield = new JTextField();
        tfield.setPreferredSize(new Dimension(300, 50));

        //pannel for the numbers
        JPanel pan = new JPanel();
        pan.setLayout(new GridLayout(4, 3));

        JButton b1= new JButton("1");
        b1.addActionListener(e->
        {
            String buttonText = b1.getText();
            answer+=buttonText;
            tfield.setText(answer);
        });
        pan.add(b1);

        JButton b2= new JButton("2");
        b2.addActionListener(e->
        {
            String buttonText = b2.getText();
            answer+=buttonText;
            tfield.setText(answer);
        });
        pan.add(b2);

        // JButton plus= new JButton("+");
        
        
        JButton b3= new JButton("3");
        pan.add(b3);
        JButton b4= new JButton("4");
        pan.add(b4);
        JButton b5= new JButton("5");
        pan.add(b5);
        JButton b6= new JButton("6");
        pan.add(b6);
        JButton b7= new JButton("7");
        pan.add(b7);
        JButton b8= new JButton("8");
        pan.add(b8);
        JButton b9= new JButton("9");
        pan.add(b9);
        JButton b10= new JButton("+");
        b10.addActionListener(e->
        {
            String buttonText = b10.getText();
            answer+=buttonText;
            tfield.setText(answer);
        });
        pan.add(b10);
        JButton b11= new JButton("-");
        pan.add(b11);
        JButton b12= new JButton("*");
        pan.add(b12);

        JButton equal = new JButton("=");
        equal.addActionListener(e -> {

            
            double e1=answer.charAt(0)-'0';
            char s=answer.charAt(1);
            double e2=answer.charAt(2)-'0';

            String res="";

            if(s=='+'){
               res=Double.toString(e1+e2);
            }

            tfield.setText(res); // Set the text field with the result
        });
        pan.add(equal);

        JButton clear = new JButton("clear");
        clear.addActionListener(e -> {
            tfield.setText("");
            answer="";
        });
        pan.add(clear);

        calc.add(tfield, BorderLayout.NORTH);
        calc.add(pan, BorderLayout.CENTER);

        add(calc);
        pack();
        setVisible(true);
    }
}


public class e633 extends Frame {
    public static void main(String[] args) {
        new Frame();
    }
}

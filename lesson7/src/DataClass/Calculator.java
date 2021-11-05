package DataClass;

import java.awt.event.*;
import javax.swing.*;

//import.javax.accessibility.AccessibleContext;

import javax.swing.*;

public class Calculator {
    public static void main(String[] args) {
        JFrame f = new JFrame("Calculator");

        final JTextField firstNumber = new JTextField();
        final JTextField secondNumber = new JTextField();
        final JLabel answer = new JLabel();


        firstNumber.setBounds(50, 50, 50, 20);
        secondNumber.setBounds(150, 50, 50, 20);
        answer.setBounds(250, 50, 50, 20);

        JButton b = new JButton("+");
        b.setBounds(50, 100, 95, 30);
        JButton c = new JButton("-");
        c.setBounds(200, 100, 95, 30);
        JButton d = new JButton("*");
        d.setBounds(400, 100, 95, 30);

        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                int a = Integer.parseInt(firstNumber.getText());
                int b = Integer.parseInt(secondNumber.getText());
                answer.setText(String.valueOf(a + b));

            }
        });
        c.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                int a = Integer.parseInt(firstNumber.getText());
                int b = Integer.parseInt(secondNumber.getText());
                answer.setText(String.valueOf(a - b));
            }
        });
        d.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                float a = Float.parseFloat(firstNumber.getText());
                float b = Float.parseFloat(secondNumber.getText());
                answer.setText(String.valueOf(a * b));
            }
        });
        f.add(d);
        f.add(c);
        f.add(b);
        f.add(firstNumber);
        f.add(secondNumber);
        f.add(answer);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }


}

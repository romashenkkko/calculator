package DataClass;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingGraphic {
    public static void main(String[] args) {
        JFrame f = new JFrame("Button Example");
        final JTextField tf = new JTextField("нажмите на кнопку ");
        JButton b = new JButton("Click Here");
        b.setBounds(100, 100, 95, 30);
        tf.setBounds(50, 50, 150, 20);
        f.add(b);
        f.add(tf);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                tf.setText("Privetik");
            }
        });
    }
}

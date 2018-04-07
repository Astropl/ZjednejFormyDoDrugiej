package SDA;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PierwszaForma extends JFrame {


    private JButton btn1 = new JButton("Nacisnij aby przekazac cos");

    private JTextField textField = new JTextField("tu cos");

    PierwszaForma pierwszaForma;
    DrugaForma drugaForma;

    public PierwszaForma() {
        textField = new JTextField("Przekaz do drugiej formatki");

        setTitle("pirwsza");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(null);
        setBounds(200, 200, 500, 500);
        add(btn1);
        btn1.setBounds(100, 200, 200, 50);
        add(textField);
        textField.setBounds(100, 100, 200, 50);
        setVisible(true);

        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String drugiTextFieldGet = drugaForma.textField.getText();
                String drugiTextFieldSet = drugaForma.textField.setText(textField.getText());
                System.out.println(textField.getText());



            }
        });
    }







    public void setTextField(JTextField textField) {
        this.textField = textField;
    }




}

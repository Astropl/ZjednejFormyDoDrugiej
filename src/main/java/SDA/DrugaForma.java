package SDA;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DrugaForma extends JFrame {

    JButton btn1 = new JButton("Podaj cos");
    JTextField textField;


    public DrugaForma() {
        textField = new JTextField("tu ma sie pokazac text z pierwszej formatki");
        setTitle("druga");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(null);
        setBounds(800, 200, 500, 500);
        //add(btn1);
        btn1.setBounds(10, 200, 100, 50);

        add(textField);
        textField.setBounds(100, 200, 250, 50);


        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println(textField.getText());


                //String b = drugaForma.textField.setText(;
                //drugaForma.textField.setText(a);
            }
        });
    }

    public String getTextField() {

        return null;
    }
    public String setTextField (String imie)
    {
        textField.setText(imie);
        return imie;
    }
}









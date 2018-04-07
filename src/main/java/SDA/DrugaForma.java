package SDA;


import javax.swing.*;
import java.awt.event.ActionEvent;

public class DrugaForma extends JFrame {

    private JButton btn1 = new JButton("Podaj cos");
    private JTextField textField = new JTextField("tu drugi text box");


    public DrugaForma() {
        textField = new JTextField("tu cos 222");
        setTitle("druga");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(null);
        setBounds(800, 200, 500, 500);
        add(btn1);
        btn1.setBounds(10, 200, 100, 50);

        add(textField);
        textField.setBounds(200, 200, 100, 50);


    }
    public void actionPerformed(ActionEvent e)
    {
        System.out.println("cos tam");
    }

    public JTextField getTextField() {
        return textField.getText();
    }

    public void setTextField(JTextField textField) {
        this.textField = textField;
        textField.setText(String.valueOf(textField));
    }
}

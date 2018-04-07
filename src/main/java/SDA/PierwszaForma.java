package SDA;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PierwszaForma extends JFrame {


    private JButton btn1 = new JButton("Podaj cos");

    private JTextField textField = new JTextField("tu cos");

    PierwszaForma pierwszaForma;
    DrugaForma drugaForma;

    public PierwszaForma() {
        textField = new JTextField("tu cos 2");
        setTitle("pirwsza");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(null);
        setBounds(200, 200, 500, 500);
        add(btn1);
        btn1.setBounds(10, 200, 100, 50);
        add(textField);
        textField.setBounds(200, 200, 100, 50);
        setVisible(true);

        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println(textField.getText());
                System.out.println(drugaForma.getTextField()+" dodoaje");
                String a = pierwszaForma.textField.getText();
                setTextField(textField);
                //String b = drugaForma.textField.setText(;
                //drugaForma.textField.setText(a);
            }
        });
    }

    public JButton getBtn1() {
        return btn1;
    }

    public void setBtn1(JButton btn1) {
        this.btn1 = btn1;
    }

    public JTextField getTextField() {
        return textField;
    }

    public void setTextField(JTextField textField) {
        this.textField = textField;
    }

    public PierwszaForma getPierwszaForma() {
        return pierwszaForma;
    }

    public void setPierwszaForma(PierwszaForma pierwszaForma) {
        this.pierwszaForma = pierwszaForma;
    }

    public DrugaForma getDrugaForma() {
        return drugaForma;
    }

    public void setDrugaForma(DrugaForma drugaForma) {
        this.drugaForma = drugaForma;
    }
}

package GUI;

import calcolatriceModel.Calcolatrice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcolatriceGUI extends JFrame implements ActionListener {

    private Calcolatrice calcolatrice;
    private JTextField jTextField;

    private final static int LARGHEZZA = 700;
    private final static int LUNGHEZZA = 400;


    public CalcolatriceGUI(String title, Calcolatrice calcolatrice) throws HeadlessException {
        super(title);
        setSize(LARGHEZZA,LUNGHEZZA);
        setLayout(new BorderLayout());
        setResizable(false);

        this.calcolatrice = calcolatrice;

        PannelloPulsanti pannelloPulsanti = new PannelloPulsanti();
        add(pannelloPulsanti, BorderLayout.CENTER);

        for (Button b: pannelloPulsanti.getAllButtons()) {
            b.addActionListener(this);
        }

        Font font1 = new Font("SansSerif", Font.BOLD, 25);

        jTextField = new JTextField();
        jTextField.setEditable(false);
        jTextField.setBackground(Color.BLACK);
        jTextField.setForeground(Color.GREEN);
        jTextField.setHorizontalAlignment(JTextField.RIGHT);
        jTextField.setFont(font1);
        jTextField.setPreferredSize(new Dimension(LARGHEZZA,120));
        add(jTextField,BorderLayout.NORTH);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
            calcolatrice.key(Integer.parseInt(e.getActionCommand()));
            jTextField.setText(calcolatrice.getDisplay());
    }
}

package GUI;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

   class PannelloPulsanti extends JPanel {
    private ArrayList<Button> allButtons;

        PannelloPulsanti() {
        setLayout(new GridLayout(4,5));

        allButtons = new ArrayList<>();

        Button button7 = new Button("7");
        add(button7);
        allButtons.add(button7);

        Button button8 = new Button("8");
        add(button8);
        allButtons.add(button8);


        Button button9 = new Button("9");
        add(button9);
        allButtons.add(button9);


        Button buttonAdd = new Button("+");
        buttonAdd.setActionCommand("12");
        add(buttonAdd);
        allButtons.add(buttonAdd);

        Button buttonCE = new Button("CE");
        buttonCE.setActionCommand("-1");

        add(buttonCE);
        allButtons.add(buttonCE);


        Button button4 = new Button("4");
        add(button4);
        allButtons.add(button4);


        Button button5 = new Button("5");
        add(button5);
        allButtons.add(button5);


        Button button6 = new Button("6");
        add(button6);
        allButtons.add(button6);


        Button buttonMinus = new Button("-");
        buttonMinus.setActionCommand("13");
        add(buttonMinus);
        allButtons.add(buttonMinus);

        Button buttonMPlus = new Button("M+");
        buttonMPlus.setActionCommand("17");
        add(buttonMPlus);
        allButtons.add(buttonMPlus);

        Button button1 = new Button("1");
        add(button1);
        allButtons.add(button1);

        Button button2 = new Button("2");
        add(button2);
        allButtons.add(button2);

        Button button3 = new Button("3");
        add(button3);
        allButtons.add(button3);

        Button buttonX = new Button("x");
        buttonX.setActionCommand("14");

        add(buttonX);
        allButtons.add(buttonX);


        Button buttonMR = new Button("MR");
        add(buttonMR);
        buttonMR.setActionCommand("18");

        allButtons.add(buttonMR);

        Button button0 = new Button("0");
        add(button0);
        allButtons.add(button0);


        Button buttonDot = new Button(".");
        buttonDot.setActionCommand("11");
        add(buttonDot);
        allButtons.add(buttonDot);


        Button buttonEqual = new Button("=");
        buttonEqual.setActionCommand("16");

        add(buttonEqual);
        allButtons.add(buttonEqual);

        Button buttonDivide = new Button(":");
        buttonDivide.setActionCommand("15");
        add(buttonDivide);
        allButtons.add(buttonDivide);

        Button buttonMC = new Button("MC");
        buttonMC.setActionCommand("19");

        add(buttonMC);
        allButtons.add(buttonMC);
    }

     ArrayList<Button> getAllButtons() {
        return allButtons;
    }


}

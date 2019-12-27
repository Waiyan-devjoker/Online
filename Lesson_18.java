package Lesson_1;

import javax.swing.*;

public class Lesson_18 {

    public static void main(String[] args) {

        String num1 = JOptionPane.showInputDialog("Num 1");
        String num2 = JOptionPane.showInputDialog("Num 2");
        String OPT  = JOptionPane.showInputDialog("OPT");

        String p = "+";


        int i1 = Integer.parseInt(num1);
        int i2 = Integer.parseInt(num2);

        System.out.println(OPT);

        int trp =  OPT.equals("+") ? (i1+i2) : 0 ;


        System.out.println(OPT);

        JOptionPane.showMessageDialog(null,"Total : "+ trp);




    }


}

/*

Input num1 : 30
Input num2 : 40
Input OPT  : +


Message

Total : 70



 */
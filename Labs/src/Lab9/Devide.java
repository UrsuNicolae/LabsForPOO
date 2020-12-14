package Lab9;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Devide extends Frame
{
    Devide()
    {
        JFrame f = new JFrame("Lab9");
        JButton divide = new JButton("=");

        Font fnt1  = new Font(Font.SANS_SERIF,  Font.BOLD, 20);
        Font fnt3  = new Font(Font.MONOSPACED,  Font.BOLD, 20);
        Font fnt4  = new Font(Font.SANS_SERIF,  Font.BOLD, 40);

        JTextField dividendInput = new JTextField();
        JTextField divisorInput = new JTextField();

        JLabel quotientF = new JLabel();
        JLabel divS = new JLabel();
        JLabel error = new JLabel();
        JLabel advice = new JLabel();
        error.setFont(fnt1);
        advice.setFont(fnt1);
        divS.setFont(fnt4);
        divS.setText("/");
        divide.setFont(fnt4);

        JLabel welc = new JLabel();
        welc.setFont(fnt1);

        welc.setOpaque(true);
        quotientF.setOpaque(true);
        divide.setOpaque(true);
        dividendInput.setOpaque(true);
        divisorInput.setOpaque(true);
        dividendInput.setFont(fnt3);
        divisorInput.setFont(fnt3);
        quotientF.setFont(fnt3);



        Border border = BorderFactory.createLineBorder(Color.BLACK, 3);
        Border border1 = BorderFactory.createLineBorder(Color.BLACK, 3);

        quotientF.setBorder(border);
        dividendInput.setBorder(border);
        divisorInput.setBorder(border);
        welc.setBorder(border1);

        divide.setBackground(Color.BLACK);
        divide.setForeground(Color.WHITE);
        divS.setBackground(Color.BLACK);
        quotientF.setBackground(Color.white);
        quotientF.setForeground(Color.BLACK);
        dividendInput.setBackground(Color.white);
        divisorInput.setBackground(Color.white);
        dividendInput.setForeground(Color.BLACK);
        divisorInput.setForeground(Color.BLACK);

        welc.setForeground(Color.lightGray);
        welc.setText(" Input your numbers and reveal the mystery");
        welc.setForeground(Color.black);

        dividendInput.setBounds(10, 120, 140, 40);
        divisorInput.setBounds(175, 120, 140, 40);
        divide.setBounds(320, 120, 70, 40);
        quotientF.setBounds(400, 120, 140, 40);
        welc.setBounds(20, 50, 430, 50);
        divS.setBounds(155, 120, 20, 40);


        error.setBounds(20, 150, 500, 50);
        advice.setBounds(20, 200, 500, 50);

        f.add(error);
        f.add(advice);
        f.add(dividendInput);
        f.add(divisorInput);
        f.add(divide);
        f.add(quotientF);
        f.add(welc);
        f.add(divS);

        f.getContentPane().setBackground(Color.GRAY);
        f.setSize(600, 300);
        f.setResizable(false);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        divide.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ev) {

                advice.setVisible(false);
                error.setVisible(false);
                quotientF.setText("");

                try {

                    float dividend = Float.parseFloat(dividendInput.getText());
                    float divisor = Float.parseFloat(divisorInput.getText());
                    Float quotient = dividend/divisor;

                    if (divisor == 13)
                        throw new UnluckyException();

                    else if (!Float.isFinite(quotient))
                        throw new ArithmeticException();

                    quotientF.setText(String.valueOf(quotient));
                }

                catch(UnluckyException e) {

                    error.setText(e.excetptionMessage());
                    advice.setText(e.getAdvice());

                    error.setVisible(true);
                    advice.setVisible(true);
                }

                catch(NumberFormatException e) {
                    error.setText("Error ->" + e.getMessage());
                    advice.setText("Advice -> No letters and empty fields!");

                    error.setVisible(true);
                    advice.setVisible(true);
                }

                catch(ArithmeticException e) {
                    error.setText("Error -> That is just disgusting");
                    advice.setText("Advice -> Do not divide by 0 !!!");

                    error.setVisible(true);
                    advice.setVisible(true);
                }
            }
        });
    }



}

import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.border.SoftBevelBorder;

public class Main {

    public static void main(String[] args) throws Exception
    {
        new Calc();
    }
}

class Calc extends JFrame implements ActionListener
{
    private static String opr = "", temp = "";
    private static double num1=0, num2=0, ans;

    private JFrame frame;
    private JPanel panel;
    private JTextField textfield1, textfield2;
    private JButton b[] = new JButton[20];

    public Calc() throws IOException //for reading and displaying image
    {

        frame = new JFrame();
        textfield1 = new JTextField();
        textfield2 = new JTextField();
        panel = new JPanel();

        b[0] = new JButton("C");

        //to display image on button 2 (b2)
        BufferedImage buttonIcon = ImageIO.read(new File("2-512.png"));
        Image dimg = buttonIcon.getScaledInstance(30,30,
                Image.SCALE_SMOOTH);
        ImageIcon imageIcon = new ImageIcon(dimg);
        b[1] = new JButton(new ImageIcon(dimg));

        b[2] = new JButton("%");
        b[3] = new JButton("/");
        b[4] = new JButton("7");
        b[5] = new JButton("8");
        b[6] = new JButton("9");
        b[7] = new JButton("x");
        b[8] = new JButton("4");
        b[9] = new JButton("5");
        b[10] = new JButton("6");
        b[11] = new JButton("-");
        b[12] = new JButton("1");
        b[13] = new JButton("2");
        b[14] = new JButton("3");
        b[15] = new JButton("+");
        b[16] = new JButton(".");
        b[17] = new JButton("0");
        b[18] = new JButton("=");
        b[19] = new JButton("");




       //setBounds()


        textfield1.setBounds(6,6,332,40);
        textfield2.setBounds(6,46,332,66);


        b[0].setBounds(5,114,80,50);
        b[1].setBounds(90,114,80,50);
        b[2].setBounds(175,114,80,50);
        b[3].setBounds(260,114,80,50);

        b[4].setBounds(5,169,80,50);
        b[5].setBounds(90,169,80,50);
        b[6].setBounds(175,169,80,50);
        b[7].setBounds(260,169,80,50);

        b[8].setBounds(5,224,80,50);
        b[9].setBounds(90,224,80,50);
        b[10].setBounds(175,224,80,50);
        b[11].setBounds(260,224,80,50);

        b[12].setBounds(5,279,80,50);
        b[13].setBounds(90,279,80,50);
        b[14].setBounds(175,279,80,50);
        b[15].setBounds(260,279,80,50);

        b[16].setBounds(5,334,80,50);
        b[17].setBounds(90,334,80,50);
        b[18].setBounds(175,334,165,50);




        //setting button properties

        for(int i=0; i<20; i++)
        {
            b[i].setFont(new Font("Tahoma", Font.BOLD, 20));
            b[i].setCursor(new Cursor(java.awt.Cursor.HAND_CURSOR));
            b[i].setBorder(new SoftBevelBorder(BevelBorder.RAISED));
        }



        //setting textfield properties
/*

        //uncomment for a different border style
        textfield1.setBorder(BorderFactory.createMatteBorder(2, 2, 0, 2, Color.black));
        textfield2.setBorder(BorderFactory.createMatteBorder(0, 2, 2, 2, Color.black));
*/
        Border loweredbevel = BorderFactory.createLoweredBevelBorder();
        textfield2.setBorder(loweredbevel);
        textfield1.setBorder(loweredbevel);

        textfield1.setFocusable(false);
        textfield2.setFocusable(true);

        textfield1.setHorizontalAlignment(JTextField.RIGHT);
        textfield2.setHorizontalAlignment(JTextField.RIGHT);

        textfield1.setFont(new Font("Tahoma", 1, 20));
        textfield2.setFont(new Font("Tahoma", 1, 30));

        textfield1.setForeground(new Color(157,157,157)); //sets text color of textfield1







        //to change button color on hover

        for(int i=0; i<20; i++)
        {   final int j = i;
            b[j].addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    b[j].setBackground(new Color(201, 200, 200));
                }

                public void mouseExited(java.awt.event.MouseEvent evt) {
                    b[j].setBackground(UIManager.getColor("control"));
                }
            });
        }





        //adding button actionListners


        for(int i=0; i<20; i++)
        {
            b[i].addActionListener(this);
        }





        //adding everything to frame


        frame.add(textfield1);
        frame.add(textfield2);

        for(int i=0; i<20; i++)
        {
            frame.add(b[i]);
        }


        b[19].setVisible(false);   //adding extra button as last button takes up whole space of JFrame









       /*

        p1.setBounds(0,0,400,200);
        p2.setBounds(0,220,400,200);

        b1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        b1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));*/


        frame.setResizable(false);
        frame.setVisible(true);
        frame.setSize(350, 423);
        frame.setDefaultCloseOperation(3);

    }


    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == b[12])                                  // 1
        {
            textfield2.setText(textfield2.getText() + "1");
        }
        else if (e.getSource() == b[13])                             // 2
        {
            textfield2.setText(textfield2.getText() + "2");
        }
        else if (e.getSource() == b[14])                             // 3
        {
            textfield2.setText(textfield2.getText() + "3");
        }
        else if (e.getSource() == b[8])                             // 4
        {
            textfield2.setText(textfield2.getText() + "4");
        }
        else if (e.getSource() == b[9])                             // 5
        {
            textfield2.setText(textfield2.getText() + "5");
        }
        else if (e.getSource() == b[10])                             // 6
        {
            textfield2.setText(textfield2.getText() + "6");
        }
        else if (e.getSource() == b[4])                             // 7
        {
            textfield2.setText(textfield2.getText() + "7");
        }
        else if (e.getSource() == b[5])                             // 8
        {
            textfield2.setText(textfield2.getText() + "8");
        }
        else if (e.getSource() == b[6])                             // 9
        {
            textfield2.setText(textfield2.getText() + "9");
        }
        else if (e.getSource() == b[17])                             // 0
        {
            textfield2.setText(textfield2.getText() + "0");
        }
        else if (e.getSource() == b[16])                             // . decimal
        {
            if(!(textfield2.getText() == null || (textfield2.getText()).isEmpty()))   // add a decimal only when there is something in textfield2
            {
                double temp1 = Double.parseDouble(textfield2.getText());
                if(temp1%1 == 0)                        //if value does not already contain a decimal point
                {
                    int temp2 = (int)temp1;
                    textfield2.setText(temp2 + ".");    //then add a decimal point
                }                                       //else do nothing
            }
            else
            {
                textfield2.setText("0.");
            }
        }
        else if (e.getSource() == b[0])                             // clear
        {
            textfield1.setText("");
            textfield2.setText("");
            num1 = num2 = 0;
        }
        else if (e.getSource() == b[1])                             // backspace
        {
            if(!(textfield2.getText() == null || (textfield2.getText()).isEmpty()))   // backspace only when there is something in textfield2
            {
                textfield2.setText(textfield2.getText().substring(0, textfield2.getText ().length() - 1));
            }
        }
        else if (e.getSource() == b[2])                             // % percentage and not modulus(as used in a regular calculator)
        {
            temp = "%";
            operator();
        }
        else if (e.getSource() == b[3])                             // / division
        {
            temp = "/";
            operator();
        }
        else if (e.getSource() == b[7])                             // * multiplication
        {
            temp = "*";
            operator();
        }
        else if (e.getSource() == b[11])                             // - subtraction
        {
            temp = "-";
            operator();
        }
        else if (e.getSource() == b[15])                             // + addition
        {
            temp = "+";
            operator();
        }
        else if(e.getSource() == b[18])                                                     // = equals
        {
            if(!(textfield2.getText() == null || (textfield2.getText()).isEmpty()))   // do something only when there is something in textfield2
            {
                if (opr == "" || opr == null || opr.isEmpty())               //if number 2 is not input, take input in num1(and it will be the result)
                {
                    num1 = Double.parseDouble(textfield2.getText());
                }
                num2 = Double.parseDouble(textfield2.getText());
                result();
                textfield1.setText(ans + "");
                textfield2.setText("");
            }
            //if textfield is empty, do nothing
        }


    }
    public void result()
    {
        switch(opr)
        {
            case "+":
                ans = num1 + num2;
                break;
            case "-":
                ans = num1 - num2;
                break;
            case "*":
                ans = num1 * num2;
                break;
            case "/":
                ans = num1 / num2;
                break;
            case "%":
                ans = num1 * num2 / 100;
                break;
            default:
                ans = num1;
        }


        num1 = ans;
        opr = "";
        /*
        textfield1.setText(ans+opr);

        num1 = ans;
        num2 = 0;  //setting values to zero to remove errors*/


    }
    public void operator()
    {
        if(opr == "" || num1 ==0)
        {
            if(textfield2.getText() == null || (textfield2.getText()).isEmpty())  //if textfield2 is empty
            {
                if(textfield1.getText() == null || (textfield1.getText()).isEmpty())   // when textfield1 is also empty, do nothing
                {
                }
                else
                {
                        opr = temp;
                        num1 = Double.parseDouble(textfield1.getText());
                        textfield2.setText("");
                        textfield1.setText(num1 + "");
                }
            }
            else
            {
                opr = temp;
                num1 = Double.parseDouble(textfield2.getText());
                textfield2.setText("");
                textfield1.setText(num1+"");
            }
        }
        else
        {
            if(textfield2.getText() == null || (textfield2.getText()).isEmpty())
                num2 = Double.parseDouble(textfield1.getText());
            else
                num2 = Double.parseDouble(textfield2.getText());
            result();
            textfield2.setText("");
            textfield1.setText(ans+"");
            opr = temp;
        }
    }

}

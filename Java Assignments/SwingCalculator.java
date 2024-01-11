import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingCalculator extends JFrame implements ActionListener {
    private String s1, s2, s3, s4, s5;
    private int c, n;
    private JTextField t1;
    private JButton l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13, l14, l15, l16, l21, l22, l23, l24;
    private Font f;
    private Color c1, c2;

    public SwingCalculator() {
        setSize(510, 510);
        setTitle("CALCULATOR");
        setVisible(true);
        setLayout(null);
        f = new Font("Times New Roman", Font.BOLD, 15);
        setFont(f);
        c1 = new Color(27, 52, 82);
        c2 = new Color(252, 161, 3);

        JPanel outer = new JPanel();
        outer.setLayout(null);
        outer.setBounds(80, 80, 328, 355);
        outer.setBackground(Color.GRAY);
        t1 = new JTextField("0");
        t1.setBackground(c1);
        t1.setForeground(Color.WHITE);
        t1.setBounds(22, 20, 285, 55);

        JPanel p = new JPanel(new GridLayout(5, 4, 5, 5));
        p.setBounds(22, 80, 290, 260);
        p.setBackground(Color.GRAY);
        l21 = new JButton("C");

        l21.setBackground(c2);
        l21.setForeground(Color.WHITE);
        l21.addActionListener(this);

        l23 = new JButton("DEL");
        l23.setBackground(c2);
        l23.setForeground(Color.WHITE);
        l23.addActionListener(this);
        l22 = new JButton("Sqrt");
        l22.setBackground(Color.BLACK);
        l22.setForeground(Color.WHITE);
        l22.addActionListener(this);

        l15 = new JButton("/");
        l15.setBackground(Color.BLACK);
        l15.setForeground(Color.WHITE);
        l15.addActionListener(this);

        l1 = new JButton("1");
        l1.addActionListener(this);
        l2 = new JButton("2");
        l2.addActionListener(this);
        l3 = new JButton("3");
        l3.addActionListener(this);
        l10 = new JButton("*");
        l10.setBackground(Color.BLACK);
        l10.setForeground(Color.WHITE);
        l10.addActionListener(this);
        l4 = new JButton("4");
        l4.addActionListener(this);
        l5 = new JButton("5");
        l5.addActionListener(this);
        l6 = new JButton("6");
        l6.addActionListener(this);
        l11 = new JButton("+");
        l11.setBackground(Color.BLACK);
        l11.setForeground(Color.WHITE);

        l11.addActionListener(this);
        l7 = new JButton("7");
        l7.addActionListener(this);
        l8 = new JButton("8");
        l8.addActionListener(this);
        l9 = new JButton("9");
        l9.addActionListener(this);
        l12 = new JButton("-");
        l12.setBackground(Color.BLACK);
        l12.setForeground(Color.WHITE);
        l12.addActionListener(this);
        l13 = new JButton("00");
        l13.addActionListener(this);
        l14 = new JButton("0");
        l14.setBackground(Color.BLACK);
        l14.setForeground(Color.WHITE);
        l14.addActionListener(this);

        l24 = new JButton("%");
        l24.setBackground(Color.BLACK);
        l24.setForeground(Color.WHITE);
        l24.addActionListener(this);
        l16 = new JButton("=");
        l16.setBackground(c2);
        l16.setForeground(Color.WHITE);
        l16.addActionListener(this);
     add(outer);
 outer.add(t1); outer.add(p); p.add(l23); p.add(l21);
 p.add(l22); p.add(l15); p.add(l1); p.add(l2);
 p.add(l3); p.add(l10);
 p.add(l4); p.add(l5); p.add(l6); p.add(l11); p.add(l7); p.add(l8);
 p.add(l9); p.add(l12); 
 p.add(l13); p.add(l14); p.add(l24); 
 p.add(l16);
 }
 public void actionPerformed(ActionEvent e) {
  
 if(e.getActionCommand()=="1")
 {
 s3=t1.getText();
 s4="1";
 s5=s3+s4;
 t1.setText(s5);
 }
 if(e.getSource()==l2)
 {
 s3=t1.getText();
 s4="2";
 s5=s3+s4;
 t1.setText(s5);
 }
 if(e.getSource()==l13)
 {
 s3=t1.getText();
 s4="00";
 s5=s3+s4;
 t1.setText(s5);
 }
 if(e.getSource()==l14)
 {
 s3=t1.getText();
 s4="0";
 s5=s3+s4;
 t1.setText(s5);
 }
 if(e.getSource()==l3)
 {
 s3=t1.getText();
 s4="3";
 s5=s3+s4;
 t1.setText(s5);
 }
 if(e.getSource()==l4)
 {
 s3=t1.getText();
 s4="4";
 s5=s3+s4;
 t1.setText(s5);
 }
 if(e.getSource()==l5)
 {
  
 s3=t1.getText();
 s4="5";
 s5=s3+s4;
 t1.setText(s5);
 }
 if(e.getSource()==l6)
 {
 s3=t1.getText();
 s4="6";
 s5=s3+s4;
 t1.setText(s5);
 }
 if(e.getSource()==l7)
 {
 s3=t1.getText();
 s4="7";
 s5=s3+s4;
 t1.setText(s5);
 }
 if(e.getSource()==l8)
 {
 s3=t1.getText();
 s4="8";
 s5=s3+s4;
 t1.setText(s5);
 }
 if(e.getSource()==l9)
 {
 s3=t1.getText();
 s4="9";
 s5=s3+s4;
 t1.setText(s5);
 }
 if(e.getSource()==l10)
 {
 s1=t1.getText();
 t1.setText("");
 c=3;
 }
 if(e.getSource()==l11)
 {
 s1=t1.getText();
 t1.setText("");
 c=1;
 }
  
 if(e.getSource()==l12)
 {
 s1=t1.getText();
 t1.setText("");
 c=2;
 }
 if(e.getSource()==l23)
 {
 s1=t1.getText();
 s1=s1.substring(0,(s1.length()-1));
 t1.setText(s1);
 }
 if(e.getSource()==l21)
 {
 t1.setText(" ");
 }
 if(e.getSource()==l24)
 {
 s1=t1.getText();
 t1.setText("");
 c=5; 
 }
 if(e.getSource()==l15)
 {
 s1=t1.getText();
 t1.setText("");
 c=4;
 }
 if(e.getSource()==l22)
 {
 s1=t1.getText();
 t1.setText("");
 c=6;
 }
 if(e.getSource()==l16)
 {
 s2=t1.getText();
 if(c==1)
 {
 n = Integer.parseInt(s1)+Integer.parseInt(s2);
 t1.setText(String.valueOf(n));
 }
 else
 if(c==2)
 {
  
 n = Integer.parseInt(s1)-Integer.parseInt(s2);
 t1.setText(String.valueOf(n));
 }
 else
 if(c==3)
 {
 n = Integer.parseInt(s1)*Integer.parseInt(s2);
 t1.setText(String.valueOf(n));
 }
 if(c==4)
 {
 try
 {
 if((Integer.parseInt(s2))!=0)
{
 n = Integer.parseInt(s1)/Integer.parseInt(s2);
 t1.setText(String.valueOf(n));
 }
else
 t1.setText("infinite");
 }
 catch(Exception i){}
 }
 if(c==5)
 {
 n = Integer.parseInt(s1)%Integer.parseInt(s2);
 t1.setText(String.valueOf(n));
 }
 if(c==6)
 {
 Double d=Double.parseDouble(s1);
 Double res=Math.sqrt(d);
 t1.setText(String.valueOf(res));
 }
 } 
}
 public static void main(String[] args) {
 SwingCalculator b=new SwingCalculator();
 }
}
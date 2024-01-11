import java.awt.*;
import java.awt.event.*;
public class calci extends Frame implements ActionListener
{
	int c,n;
    float fv;
	String s1,s2,s3,s4,s5;	
	Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20;
	Panel p,p1;
	TextField tf;
	GridLayout g;
	calci()
	{
		setSize(600,600);
		setTitle("Calculator");
		setLayout(null);

        Font f=new Font("Arial",Font.BOLD,15);
        setFont(f);
        Color col = new Color(40,44,67);
        Color col2 = new Color(255,128,0);

        p = new Panel();

        p1 = new Panel();
        p1.setLayout(null);
		p1.setBounds(50,50,400,400);
        p1.setBackground(col);
        p1.setVisible(true);
        add(p1);
        p1.add(p);

		
		
		b1 = new Button("sqrt");
		b1.addActionListener(this);
		b2 = new Button("C");
		b2.addActionListener(this);
		b3 = new Button("%");
		b3.addActionListener(this);
		b4 = new Button("+");
        b4.setBackground(col2);
		b4.addActionListener(this);
		b5 = new Button("7");
		b5.addActionListener(this);
		b6 = new Button("8");
		b6.addActionListener(this);
		b7 = new Button("9");
		b7.addActionListener(this);
		b8 = new Button("-");
        b8.setBackground(col2);
		b8.addActionListener(this);
		b9 = new Button("4");
		b9.addActionListener(this);
		b10 = new Button("5");
		b10.addActionListener(this);
		b11 = new Button("6");
		b11.addActionListener(this);
		b12 = new Button("*");
        b12.setBackground(col2);
		b12.addActionListener(this);
		b13 = new Button("1");
		b13.addActionListener(this);
		b14 = new Button("2");
		b14.addActionListener(this);
		b15 = new Button("3");
		b15.addActionListener(this);
		b16 = new Button("/");
        b16.setBackground(col2);
		b16.addActionListener(this);
		b17 = new Button("00");
		b17.addActionListener(this);
        b18 = new Button("0");
		b18.addActionListener(this);
        b19 = new Button(".");
		b19.addActionListener(this);
        b20 = new Button("=");
        b20.setBackground(col2);
		b20.addActionListener(this);
		tf = new TextField("0",20);
        tf.setBounds(50,20,300,50);
		p1.add(tf);
		g = new GridLayout(5,4,2,2);
		p.setLayout(g);
		p.setBounds(50,80,300,300);
        p.setBackground(Color.BLACK);
		p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(b4);
        p.add(b5);
        p.add(b6);
        p.add(b7);
        p.add(b8);
        p.add(b9);
		p.add(b10);
        p.add(b11);
        p.add(b12);
        p.add(b13);
        p.add(b14);
        p.add(b15);
        p.add(b16);
        p.add(b17);
        p.add(b18);
        p.add(b19);
        p.add(b20);
	
		
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e)
	{
        if(e.getSource()==b1)
		{
			s1 = tf.getText();
			tf.setText("");
			c=6;
		}
         if(e.getSource()==b2)
		{
			s3 = tf.getText();
			s4 = "";
			tf.setText(s4);
		}
        if(e.getSource()==b3)
		{
			s1 = tf.getText();
			tf.setText("");
			c=5;
		}
        if(e.getSource()==b4)
		{
			s1 = tf.getText();
			tf.setText("");
			c=1;
		}
        if(e.getSource()==b5)
		{
			s3 = tf.getText();
			s4 = "7";
			s5 = s3+s4;
			tf.setText(s5);
		}
		if(e.getSource()==b6)
		{
			s3 = tf.getText();
			s4 = "8";
			s5 = s3+s4;
			tf.setText(s5);
		}
		if(e.getSource()==b7)
		{
			s3 = tf.getText();
			s4 = "9";
			s5 = s3+s4;
			tf.setText(s5);
		}
        if(e.getSource()==b8)
		{
			s1 = tf.getText();
			tf.setText("");
			c=2;
		}
        if(e.getSource()==b9)
		{
			s3 = tf.getText();
			s4 = "4";
			s5 = s3+s4;
			tf.setText(s5);
		}
		if(e.getSource()==b10)
		{
			s3 = tf.getText();
			s4 = "5";
			s5 = s3+s4;
			tf.setText(s5);
		}
		if(e.getSource()==b11)
		{
			s3 = tf.getText();
			s4 = "6";
			s5 = s3+s4;
			tf.setText(s5);
		}
        if(e.getSource()==b12)
		{
			s1 = tf.getText();
			tf.setText("");
			c=3;
		}
        if(e.getSource()==b13)
		{
			s3 = tf.getText();
			s4 = "1";
			s5 = s3+s4;
			tf.setText(s5);
		}
		if(e.getSource()==b14)
		{
			s3 = tf.getText();
			s4 = "2";
			s5 = s3+s4;
			tf.setText(s5);
		}if(e.getSource()==b15)
		{
			s3 = tf.getText();
			s4 = "3";
			s5 = s3+s4;
			tf.setText(s5);
        }
        if(e.getSource()==b16)
		{
			s1 = tf.getText();
			tf.setText("");
			c=4;
		}
        if(e.getSource()==b17)
		{
			s3 = tf.getText();
			s4 = "00";
			s5 = s3+s4;
			tf.setText(s5);
		}
		if(e.getSource()==b18)
		{
			s3 = tf.getText();
			s4 = "0";
			s5 = s3+s4;
			tf.setText(s5);
		}
        if(e.getSource()==b19)
		{
			s3 = tf.getText();
			s4 = ".";
			s5 = s3+s4;
			tf.setText(s5);
		}
		if(e.getSource()==b20)
		{
			s2 = tf.getText();
			if(c==1)
			{
				n = Integer.parseInt(s1)+Integer.parseInt(s2);
				tf.setText(String.valueOf(n));
			}
			else
			if(c==2)
			{
				n = Integer.parseInt(s1)-Integer.parseInt(s2);
				tf.setText(String.valueOf(n));
			}
			else
			if(c==3)
			{
				n = Integer.parseInt(s1)*Integer.parseInt(s2);
				tf.setText(String.valueOf(n));
			}
			else if(c==4)
			{
                n = Integer.parseInt(s1)/Integer.parseInt(s2);
				tf.setText(String.valueOf(n));
            }
			else if(c==5)
			{
				n = Integer.parseInt(s1)%Integer.parseInt(s2);
				tf.setText(String.valueOf(n));
			}
            else if(c==6)
            {
                fv = (float)Math.sqrt(Integer.parseInt(s1));
				tf.setText(String.valueOf(fv));
            }
		}
		
	}

	public static void main(String[] abc)
	{
		calci v = new calci();
	}
}
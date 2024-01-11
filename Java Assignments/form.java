import java.awt.*;
import java.awt.event.*;
class form extends Frame
{
    form()
    {
       
        Color c= new Color(204,204,204);
        Color col=new Color(0,153,0);
        Color col1=new Color(225,225,225);
        setBackground(c);

        Label l1=new Label("         Registration Form");
        Font f=new Font("Arial",Font.ITALIC,20);
        l1.setFont(f);
        add(l1);
        l1.setBounds(180,50,280,30);
        l1.setBackground(col1);

        Font f1=new Font("Arial",Font.ITALIC,15);
        setFont(f1);
        Label l2=new Label("Name");
        add(l2);
        l2.setBounds(80,130,100,30);
        l2.setBackground(col1);
        TextField t2=new TextField();
        add(t2);
        t2.setBounds(200,130,300,30);

        Label l3=new Label("Mobile no");
        add(l3);
        l3.setBounds(80,170,100,30);
        l3.setBackground(col1);
        TextField t3=new TextField();
        add(t3);
        t3.setBounds(200,170,300,30);

        Label l4=new Label("Email");
        add(l4);
        l4.setBounds(80,210,100,30);
        l4.setBackground(col1);
        TextField t4=new TextField();
        add(t4);
        t4.setBounds(200,210,300,30);

        
        Label l5=new Label("Courses");
        add(l5);
        l5.setBounds(80,260,100,30);
        l5.setBackground(col1);

        Checkbox c1=new Checkbox("Java");
        add(c1);
        c1.setBounds(200,260,100,40);
        Checkbox c2=new Checkbox("C++");
        add(c2);
        c2.setBounds(200,300,100,40);
        Checkbox c3=new Checkbox("Php");
        add(c3);
        c3.setBounds(200,340,100,40);
        
        Label l6=new Label("Gender");
        add(l6);
        l6.setBounds(80,380,100,30);
        l6.setBackground(col1);
        CheckboxGroup g1=new CheckboxGroup();
        Checkbox c4=new Checkbox("Male",g1,false);
        add(c4);
        c4.setBounds(200,370,100,60);
        Checkbox c5=new Checkbox("Female",g1,false);
        add(c5);
        c5.setBounds(300,370,100,60);       

        Label l7=new Label("Birth Date");
        add(l7);
        l7.setBounds(80,430,100,30);
        l7.setBackground(col1);

        //day
        Choice day=new Choice();
        day.add("1");
        day.add("2");
        day.add("3");
        day.add("4");
        day.add("5");
        day.add("6");
        day.add("7");
        day.add("8");
        day.add("9");
        day.add("10");
        day.add("11");
        day.add("12");
        day.add("13");
        day.add("14");
        day.add("15");
        day.add("16");
        day.add("17");
        day.add("18");
        day.add("19");
        day.add("20");
        day.add("21");
        day.add("22");
        day.add("23");
        day.add("24");
        day.add("25");
        day.add("26");
        day.add("27");
        day.add("28");
        day.add("29");
        day.add("30");
        day.add("31");

        add(day);
        day.setBounds(200,430,100,30);
        Label l8=new Label("Day");
        add(l8);
        l8.setBounds(200,460,50,30);

        //month
        Choice month=new Choice();
        month.add("January");
        month.add("February");
        month.add("January");
        month.add("March");
        month.add("April");
        month.add("May");
        month.add("June");
        month.add("July");
        month.add("August");
        month.add("September");
        month.add("October");
        month.add("November");
        month.add("December");
        add(month);
        month.setBounds(320,430,100,30);
        Label l9=new Label("Month");
        add(l9);
        l9.setBounds(320,460,50,30);

        //year
        Choice year=new Choice();
        year.add("2001");
        year.add("2002");
        year.add("2003");
        year.add("2004");
        year.add("2005");


        add(year);
        year.setBounds(440,430,100,30);
        Label l10=new Label("Year");
        add(l10);
        l10.setBounds(440,460,50,30);
        
        Button b1=new Button("Sumbit");
        add(b1);
        b1.setBounds(100,500,400,30);
        b1.setBackground(col);

       
       

        setSize(600,600);
        setLayout(null);
        setVisible(true);
        setTitle("Registration form");
    }
    public static void main(String args[])
    {
        form f=new form();
    }
}
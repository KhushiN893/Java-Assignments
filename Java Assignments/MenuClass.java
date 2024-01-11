import java.awt.*;
import java.awt.event.*;
public class MenuClass extends Frame {
 String msg = "";
 MenuBar mb1;
 Menu m1,m2;
 MenuItem i1,i2,i3;
 MenuClass m11;
 //Constructor
 public MenuClass()
 {
 setTitle("MENU PROGRAM");
 setSize(800 ,400);
 setVisible(true);
 setLayout(null);
 //adding MenuBar
 mb1 = new MenuBar();
 setMenuBar(mb1);
 //adding Menus
 m1 = new Menu("MENU-A");
 m2 = new Menu("MENU-B");
 mb1.add(m1);
 mb1.add(m2);
 //adding MenuItems
 i1 = new MenuItem("UP");
 i2 = new MenuItem("DOWN");
 i3 = new MenuItem("RESET");
 m1.add(i1);
 m1.add(i2);
 m2.add(i3);
 }
 public static void main(String[] args) {
 new MenuClass();
 }
}


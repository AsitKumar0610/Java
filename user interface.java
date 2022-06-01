import javax.swing.*;
import java.awt.event.*;
class A extends JFrame implements ActionListener
{
JTextField tf1 ;
JTextField tf2 ;
JtextField tf3 ;
A()
{
JLabel l1 = new JLabel("Number 1");
JLabel l2 = new JLabel("Number 2");
JLabel l3 = new JLabel ("Result");

tf1 = new JTextField(20);
tf2 = new JTextField(20);
tf3 = new JLabel("Result");

JButton b1 = new JButton("SUM");

etLayout(new FlowLayout());
add(l1);
add(tf1);
add(l2);
add(tf2);
add(b1);
add(l3);
add(tf3);
b1.addActionListener(this);
}
public void actionPerformed(ActionEvent e)
{
String s1 = String.valueOf(Integer.parseInt(tf1.getText()) +Integer.parseInt(tf2.getText()));
tf3.setText(s1);
}
public static void main (String args[])
{
A d=new A();
d.setSize(300,400);
d.setVisible(true);
}
}

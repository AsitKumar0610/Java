import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class B extends JFrame implements ActionListener
{
    JTextField tf1;
    //JCheckBox c1,c2 ;
    JRadioButton jb1,jb2 ;
    B()
    {
        tf1=new JTextField(20);
        JButton b1 = new JButton("click");
        jb1 = new JRadioButton("Male");
        jb2 = new JRadioButton("Female");
        ButtonGroup bg = new ButtonGroup ();
        bg.add(jb1);
        bg.add(jb2);
        setLayout(new FlowLayout());
        add (tf1);
        add (jb1);
        add (jb2);
        add (b1);

        b1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(jb1.isSelected())
        {
            tf1.setText("Male");
        }
        if(jb2.isSelected())
        {
            tf1.setText("Female");
        }
    }
    public static void main (String args[])
    {
        B  d=new B();
        d.setSize(300,400);
        d.setVisible(true);
    }
}



import javax.swing.*;
import java.awt.event.*;
class D extends JFrame 
{
    D()
{
addWindowListener(new pp());
}
class pp extends WindowAdapter 
{
public void windowClosing(WindowEvent e)
{
    System.exit(0) ;
}
}

public static void main (String args[])
{
    D d = new D();
    d.setSize(300,400);
    d.setVisible(true);
}
}

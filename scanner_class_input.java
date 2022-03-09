import java.util.*;
class Student
{
int roll ;
String name,branch,uni;
public void set(int r,String n,String b,String u)
{
this.name=n;
this.roll=r;
this.branch=b;
this.uni=u ;
}
public void display()
{
System.out.println(" Name : " + name + " Roll no. : " + roll + " Branch : " + branch + " University : " + uni); 
}
public static void main (String args[])
{

	Scanner k = new Scanner(System.in);
	int x = k.nextInt();
	String a =  k.nextLine();
	String b = k.nextLine();
	String c = k.nextLine();

Student obj = new Student() ;
obj.set(x,a,b,c);
obj.display();
}
}

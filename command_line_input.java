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
int x=Integer.parseInt(args[0]);
String a=(args[1]);
String b=(args[2]);
String c=(args[3]);

Student obj = new Student() ;
obj.set(x,a,b,c);
obj.display();
}
}

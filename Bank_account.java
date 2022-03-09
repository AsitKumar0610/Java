import java.util.*;
class Account
{
long account ;
float amount ;
String name ;
 void insert(String a, long b , float c)
{
this.account = b ;
this.amount = c ;
this.name = a ;
}
 void deposit(float d)
{
	amount = amount + d;
	System.out.println("Amount Deposited");
}

 void withdraw(float e)
{	if(e > amount){
	System.out.println("Money not available");}
	else{
	amount = amount - e ;
	System.out.println("Withdrawal Successfull !!!");
	}
}

 void check_balance()
{
	System.out.println("Your amount is : " + amount );
}

 void details()
{	
	System.out.println("Name : " + name);
	System.out.println("Account No : " + account);
	System.out.println("Amount Available : " + amount);
}
public static void main(String args[])
{	
	
	Scanner k = new Scanner(System.in);

	System.out.println("Enter your name : ");
	String x = k.nextLine();
	
	System.out.println();
	System.out.println("Enter account no. : ");
	long y = k.nextLong();
	
	System.out.println();
	System.out.println("Enter the amount : ");
	float z = k.nextFloat();

	Account obj = new Account();
	obj.insert(x,y,z);

	System.out.println();
	System.out.println("DEPOSIT AMOUNT: ");
	float dep = k.nextFloat();
	obj.deposit(dep); 

	System.out.println();
	System.out.println("ENTER AMOUNT TO WITHDRAW : ");
	float wit = k.nextFloat();
	obj.withdraw(wit);

	System.out.println();
	System.out.println("Checking Amount !!!!");
	obj.check_balance();

	System.out.println();
	System.out.println("Printing Details!!!");
	obj.details();
}
}

			//using oops concept  automated teller machine
package pack;

import java.util.InputMismatchException;
import java.util.Scanner;

class Currentaccount
{ 
  int deposite;	
  int withraw;
        public void SimpleInterest()
  {
	System.out.println("5% simple interest----CURRENT ACCOUNT USERS------:");
  }
	public int Deposit(int acc,int dep)
	{
		this.deposite=acc+dep;
		return deposite;
	}
	public int Withra(int with)
	{
		this.withraw=deposite-with;
		return withraw;
	}	
}
// using like single inheritance
class Savingaccount extends Currentaccount
{
	int deposite;
	int withraw;
	public int Deposite(int acc,int dep)
	{
		this.deposite=acc+dep;
		return deposite;
	}
	public int Withraw(int with)
	{
		this.withraw=deposite-with;
		return withraw;
	}	
}
class New
{
	String name;
	long phone;
	boolean c;
	//like overloading 
	public String newuser(String name)
	{ 
		this.name=name;
		
		
		return name;
	}
	public long newuser(long ph)
	{
		this.phone=ph;
		return phone;
	}
	public void newuser(String a,String b)
	{
		this.c=a.equals(b);
	   if(c==true)  
	   {
		   System.out.println("-------------------------SET PASSWORD SUCCESSFUL-------------");
			System.out.println("------WELCOME TO HDFC BANK THANKYOU------");

		}
	   else
	   {
		   System.out.println("-------------------------PASSWORD MISMATCH TRY AGAIN THANKYOU----------------------");
	   }
	}
}

public class Atmmachine {

	public static void main(String[] args) {
	
			try
			{	
	    Scanner sc=new Scanner(System.in);
		Savingaccount sav=new Savingaccount();
		New ne=new New();
		System.out.println("*****************WELCOME TO HDFC ATM MACHINE********************");
		System.out.println("---------- CHOOSE YOUR ACCOUNT TYPE --------");
		System.out.println("             1.NEW USER GENARATE OUR ATM ACCOUNT------");
		System.out.println("             2.SAVINGS ACCOUNT-----");	
		System.out.println("             3.CURRENT ACCOUNT-----");
		int a=sc.nextInt();
		switch(a)
		{
		case 1:
			System.out.println("---ENTER USER NAME---");
			String name=sc.next();
			String username=ne.newuser(name);
			System.out.println("---ENTER USER PHONE NUMBER---");
			Long ph=sc.nextLong();
			Long phonenum=ne.newuser(ph);
			System.out.println("-----SET USER FOUR DIGIT ATMPIN------");
			String pass1=sc.next();
			System.out.println("------CONFORM USER FOUR DIGIT ATMPIN-----");
			String pass2=sc.next();
			ne.newuser(pass1,pass2);
			System.out.println("USER NAME---:"+username);
			System.out.println("USER PHONENUMBER----"+phonenum);
			
        break;
        case 2:
	    	System.out.println("ENTER YOUR ATMPIN-----");
			String pin=sc.next();
			System.out.println("AGAIN ENTER YOUR ATMPIN---");
			String pin1=sc.next();
			if(pin.equals(pin1))
			{
				System.out.println("************ATMPIN SUCCESSFUL***********");
			}
			else
			{
				System.out.println("**************WROUNGPIN  --------TRY  AGAIN**********");
			}
			
			System.out.println("---------------ENTER ACCOUNT BALANCE----------");
			int accountbal=sc.nextInt();
			System.out.println("--------------ENTER YOUR DEPOSIT AMOUNT---------");
			int depamount=sc.nextInt();
			int savingaccount=sav.Deposite(accountbal,depamount);
			System.out.println("--------------------YOUR DEPOSITE SUCCESSFUL---------------");
			System.out.println("--------------------REMAINING BALANCE:$"+savingaccount);
			System.out.println("---------------------ENTER YOUR WITHRAWAL AMOUNT---------------");
			int withamount=sc.nextInt();
			int withaccount=sav.Withraw(withamount);
			System.out.println("--------------------YOUR WITHRAW SUCCESSFUL------------------");
			System.out.println("---------------------REMAINING BALANCE$:"+withaccount);
			break;
		case 3:
			
	    	System.out.println("ENTER YOUR ATMPIN-----");
			String pin2=sc.next();
			System.out.println("AGAIN ENTER YOUR ATMPIN");
			String pin3=sc.next();
			if(pin2.equals(pin3))
			{
				System.out.println("************ATMPIN SUCCESSFUL***********");
			}
			else
			{
				System.out.println("**************WROUNGPIN  --------TRY  AGAIN**********");
			}
			
			sav.SimpleInterest();
			System.out.println("***************ENTER YOUR ACCOUNT BALANCE*************:");
			int accountbalance=sc.nextInt();
			System.out.println("---------------ENTER YOUR DEPOSITE BALANCE?*?*?*?*?:");
			int depositeamount=sc.nextInt();
	    	int depcurrent=sav.Deposit(accountbalance,depositeamount);
	    	System.out.println("-------------YOUR DEPOSITE HAS BEEN  SUCCESSFUL-----------");
	    	System.out.println("--------------REMAINING BALANCE:$"+depcurrent);
	    	System.out.println("*************ENTER YOUR WITHRAW AMOUNT?*?*?*?*?*?*?:");
	    	int withrawamount=sc.nextInt();
	        int withcurrent=sav.Withra(withrawamount);
	        System.out.println("-----------YOUR WITHRAWAL HAS BEEN SUCCESSFUL--------------");
	        System.out.println("------------REMAINING BALANCE:$"+withcurrent);
	        break;	
		
		     default :
		    	 System.out.println("WRONG USER ENTRY ONLY ENTER VALUE 1 OR 2 OR 3: ");
		}    	 
		sc.close();

			}
			catch(InputMismatchException e)
			{
				System.out.println(e+"------ONLY INEGERS ARE ALLOWED------");
			}
			
	}

}


import java.util.Scanner;

class BankDetails
{
private String accno;
private String name;
private String acc_Type;
private long balance; 

Scanner sc = new Scanner (System.in);

public void openAccount()
{
System.out.println("Enter the account number");
accno = sc.next();

System.out.println("Enter the account type");
acc_Type = sc.next();

System.out.println("Enter the name");
name = sc.next();

System.out.println("Enter the balance");
balance = sc.nextInt();

}

public void showAccount()
{
	System.out.println("Account number is:"+" "+accno);
	System.out.println("Account type is:"+" "+acc_Type);
	System.out.println("Name of account is:"+" "+name);
	System.out.println("Current available balance is:"+" "+balance);
}

public void deposit()
{
long amt;
System.out.println("Enter the amount you want to deposit");
amt = sc.nextLong();

balance = balance + amt;

}
public void withdrawl()
{
long amt;
System.out.println("Enter the amount you want to withdrawl");
amt = sc.nextLong();

if(balance>=amt)
{
	balance = balance - amt;
	System.out.println("Balance after withdrawl:"+" "+balance);
}
else
{
System.out.println("your amout is less than"+" "+amt+"\n"+"Transcation failed!!");	
}
}

public boolean search(String ac_no)
{
if(accno.equals(ac_no))
{
	showAccount();
	return(true);
}
return(false);
}

}

public class BankApplication {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		

	
	
	
	
	}

}

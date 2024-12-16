class BankAccount
{
String acnumber;
String acholder;
double bal;
BankAccount()
{
acnumber="000";
acholder="XXXX";
bal=0.0;
}
BankAccount(String acnumber,String acholder,double bal)
{
this.acnumber=acnumber;
this.acholder=acholder;
this.bal=bal;
}
double deposit(double x)
{
bal+=x;
return bal;
}
double withdraw(double x)
{
if(x<bal)
{
bal-=x;
return bal;
}
else
{
System.out.println("Insufficient Balance");
return 0;
}
}
void display()
{
System.out.println("Account Number: "+acnumber);
System.out.println("Account Holder: "+acholder);
System.out.println("Current Balance: "+bal);
}
}
class Main
{
public static void main(String[] args)
{
BankAccount a=new BankAccount("12345","Jobin",50000);
BankAccount b=new BankAccount("12346","Jonathan",60000);
BankAccount c=new BankAccount("12347","Karthik",70000);
a.display();
System.out.println("Depositing an amount of 1000/-");
a.deposit(1000);
a.display();
System.out.println("Withdrawing an amount of 30000/-");
a.withdraw(30000);
a.display();
}
}

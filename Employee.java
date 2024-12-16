class Employee
{
String ID;
String name;
double salary;
Employee()
{
ID="000";
name="XXXX";
salary=0.0;
}
Employee(String ID,String name,double salary)
{
this.ID=ID;
this.name=name;
this.salary=salary;
}
double raise(double x)
{
salary=salary+(salary*x/100);
return salary;
}
void display()
{
System.out.println("Employee Number: "+ID);
System.out.println("Employee Name: "+name);
System.out.println("Current Salary: "+salary);
}
}
class Main
{
public static void main(String[] args)
{
Employee a=new Employee("12345","Jobin",50000);
Employee b=new Employee("12346","Jonathan",60000);
Employee c=new Employee("12347","Karthik",70000);
a.display();
System.out.println("Raising the Salary of Mr.Jobin by 10%..");
a.raise(10);
a.display();
}
}

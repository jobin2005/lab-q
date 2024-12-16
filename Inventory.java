class Item
{
String ID;
String name;
int q;
Item()
{
ID="000";
name="XXXX";
q=0;
}
Item(String ID,String name,int q)
{
this.ID=ID;
this.name=name;
this.q=q;
}
int restock(int x)
{
q+=x;
return q;
}
int sell(int x)
{
if(q>0)
{
q-=x;
return q;
}
else
{
System.out.println("Insufficient Stock");
return 0;
}
}
void display()
{
System.out.println("Item ID: "+ID);
System.out.println("Item Name: "+name);
System.out.println("Current quantity: "+q+" kg");
}
}
class Main
{
public static void main(String[] args)
{
Item a=new Item("01","Pepper",50);
Item b=new Item("02","Cardamom",60);
Item c=new Item("03","Chilly",70);
a.display();
System.out.println("Restocking 10 kilo pepper");
a.restock(10);
a.display();
System.out.println("Selling 30 kilo pepper");
a.sell(30);
a.display();
}
}

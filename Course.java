class Course
{
String ID;
String name;
int count;
Course()
{
ID="000";
name="XXXXX";
count=0;
}
Course(String ID,String name,int count)
{
this.ID=ID;
this.name=name;
this.count=count;
}
int enroll()
{
return count++;
}
int withdraw()
{
if(count>0)
{
return count--;
}
else
{
System.out.println("No students to withdraw..");
return 0;
}
}
void display()
{
System.out.println("Course ID: "+ID);
System.out.println("Course Name: "+name);
System.out.println("Enrollment count: "+count);
}
}
class Main
{
public static void main(String[] args)
{
Course p=new Course("CSE101","BASICS OF C",25);
Course q=new Course("CSE102","BASICS OF JAVA",30);
Course r=new Course("CSE103","BASICS OF PYTHON",35);
System.out.println("Course 1 Info: ");
p.display();
p.enroll();
p.display();
p.withdraw();
p.display();
}
}

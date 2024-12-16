package pack1;
import java.util.*;
public class Teacher
{
    String name;
    String sub;
    Scanner s=new Scanner(System.in);
    public void readinfo()
    {
        System.out.println("Enter Name of faculty: ");
        name=s.nextLine();
        System.out.println("Enter Department of faculty: ");
        sub=s.nextLine();

    }
    public void displayinfo()
    {
        System.out.println("Faculty Name: "+name);
        System.out.println("Department Name: "+sub);

    }
}

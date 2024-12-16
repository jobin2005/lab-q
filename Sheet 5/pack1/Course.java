package pack1;
import java.util.*;
public class Course
{
    String coursename;
    String code;
    Scanner s=new Scanner(System.in);
    public void readinfo()
    {
        System.out.println("Enter Name of Course: ");
        coursename=s.nextLine();
        System.out.println("Enter Course code: ");
        code=s.nextLine();

    }
    public void displayinfo()
    {
        System.out.println("Course Name: "+coursename);
        System.out.println("Course Code: "+code);

    }
}

package pack2;
import pack1.*;
public class College
{
    private Teacher t=new Teacher();
    private Course c=new Course();
    /*public College()
    {
        t=new Teacher();
        c=new Course();
    }*/
    public void accept()
    {
        t.readinfo();
        c.readinfo();

    }
    public void display()
    {
        System.out.println("College Info: ");
        t.displayinfo();
        c.displayinfo();
    }

}

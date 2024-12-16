import java.lang.Math;
class Cylinder
{
  private double r;
  double hei;
  double vol;
  Cylinder()
  {
    r=1.0;
    hei=1.0;
    vol=3.14;
  }
  Cylinder(double r)
  {
    this.r=r;
    hei=1.0;
    vol=Calc_vol();
  }
  Cylinder(double r,double hei)
  {
    this.r=r;
    this.hei=hei;
    vol=Calc_vol();
  }
  double Calc_vol()
  {
    double v=(Math.PI)*(Math.pow(r,2))*hei;
    return v;
  }
  void display()
  {
    System.out.println("Radius of Cylinder: "+r+" units");
    System.out.println("Height of Cylinder: "+hei+" units");
    System.out.println("Volume of Cylinder: "+vol+" cubic units");
    System.out.println();
  }
}
class Main
{
  public static void main(String[] args)
  {
    Cylinder c1=new Cylinder();
    Cylinder c2=new Cylinder(2);
    Cylinder c3=new Cylinder(2,5);
    c1.display();
    c2.display();
    c3.display();
  }
}

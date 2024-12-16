class student
{
  String name,ID;
  double[] marks;
  double avg;
  student()
  {
    name="XXXX";
    ID="YYYY";
    avg=0.0;
    marks=new double[5];
  }
  student(String ID,String name,double[] marks)
  {
    this.name=name;
    this.ID=ID;
    this.marks=marks;
    avg=Calc_avg();
  }
  double Calc_avg()
  {
    double sum=0.0;
    for(int i=0;i<5;i++)
    {
       sum+=marks[i];
    }
    double av=sum/5;
    return av;
  } 
  static student highest(student[] s)
  {
    student high=s[0];
    for(int i=1;i<5;i++)
    {
      if(s[i].avg>high.avg)
      {
        high=s[i];
      }
    }
    return high;
  }
  void display()
  {
    System.out.println("ID: "+ID);
    System.out.println("Name: "+name);
    System.out.println("Average Marks: "+avg);
  }
}
class Main
{
  public static void main(String[] args)
  {
    student s1=new student("A1","Mamal S",new double[]{50,50,50,50,50});
    student s2=new student("A2","Amal K",new double[]{49,49,50,40,50});
    student s3=new student("A3","Porel M",new double[]{42,41,36,39,50});
    student s4=new student("A4","Kishan A",new double[]{50,47,41,43,42});
    student s5=new student("A5","Sanju S V",new double[]{48,47,46,45,50});
    student topper=student.highest(new student[]{s1,s2,s3,s4,s5});
    System.out.println("Details of the Topper: ");
    topper.display();
  }
}

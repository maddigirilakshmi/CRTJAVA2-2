class Student 
{
    int admno;
    String name;
    void get(int admno,String name)
    {
        this.admno=admno;
        this.name=name;
    }
    void show()
    {
        System.out.println("Adamissin no="+admno);
        System.out.println("Name="+name);
    }
}
class Marks extends Student
{
    int math,phy,che;
    void getMarks(int math,int phy,int che)
    {
        this.math=math;
        this.phy=phy;
        this.che=che;
    }
    void showMarks()
    {
        System.out.println("maths="+math);
        System.out.println("physics="+phy);
        System.out.println("chemisty="+che);
    }
}
class Result extends Marks
{
    void showResult()
    {
         System.out.println("total="+(math+phy+che));
        System.out.println("average="+(math+phy+che)/3);
    }
}
class Single1
{
    public static void main(String[] args)
    {
        Result r1=new Result();
        r1.get(111,"Kaif");
        r1.getMarks(88,67,89);
        r1.show();
        r1.showMarks();
    }
}
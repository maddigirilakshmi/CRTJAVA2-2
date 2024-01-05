class Student 
{
    int admno;
    String name;
    void get(int admno,String namee)
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
        System.out.println("total="+(math+phy+che));
        System.out.println("average="+(math+phy+che)/3);
    }
}
class Single
{
    public static void main(String[] args)
    {
        Marks m1=new Marks();
        m1.get(111,"sajid");
        m1.getMarks(88,67,89);
        m1.show();
        m1.showMarks();
    }
}
class Student1
{
    int admno;
    String name;
    Student1(int x,String y)
    {
        admno=x;
        name=y;
    }
    void show()
    {
        System.out.println("Admno="+admno+"  Name="+name);
    }
    public static void main(String[] args)
    {
        Student1 s1=new Student1(222,"rrr");
        s1.show();
    }
}
class Student2
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
        System.out.println("Admno="+admno+"  Name="+name);
    }
    public static void main(String[] args)
    {
        Student2 s1=new Student2();
        s1.get(222,"jjj");
        s1.show();
        Student2 s2=new Student2();
        s2.get(888,"kgh");
        s2.show();
    }
}
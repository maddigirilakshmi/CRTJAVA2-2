class Sample5
{
    int a=10;
    static int b=20;
    void m1()
    {
        System.out.println("a="+a+"  b="+b);
    }
    static void m2()
    {
        Sample5 s=new Sample5();
         System.out.println("a="+s.a+"  b="+s.b);
    }
    public static void main(String[] args)
    {
        Sample5 s1=new Sample5();
        s1.m1();
        s1.m2();
    }
}
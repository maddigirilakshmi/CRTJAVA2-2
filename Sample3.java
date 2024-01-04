class Sample3
{
    Void m1()
    {
        System.out.println("m1 method");
    }
    Sample3()
    {
        System.out.println("constucter");
    }
    public static void main(String[] args)
    {
        Sample3 s1=new Sample3();
        Sample3 s2=new Sample3();
        s1.m1();
    }
}
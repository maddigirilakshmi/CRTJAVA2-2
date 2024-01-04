class Sample4
{
    void m1()
    {
        System.out.println("Tnstance method");
    }
    static void m2()
    {
        System.out.println("static mrthod");
    }
    public static void main(String[] args)
    {
        //Sample4.m1();
        Sample4.m2();
        Sample4 s1=new Sample4();
        s1.m1();
        s1.m2();
    }
}
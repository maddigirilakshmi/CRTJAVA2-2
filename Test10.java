class First
{
    void add(int a,int b)
    {
        System.out.println(a+b);
    }
    void add(int a,int b,int c)
    {
        System.out.println(a+b+c);
    }
}
class Second extends First
{
    void add(int a,int b,int c,int d)
    {
        
        System.out.println(a+b+c+d);
    }
}
class Test10
{
    public static void main(String args[])
    {
        Second f1=new Second();
        f1.add(22,76);
        f1.add(434,67,984);
        f1.add(6534,9875,9487,98734);
    }
}
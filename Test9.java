class First
{
    void show(int x)
    {
        System.out.println("one arg int method");
    }
    void show(int x,int y)
    {
        System.out.println("two arg int method");
    }
}
class Test9
{
    public static void main(String args[])
    {
        First f1=new First();
        f1.show(6588);
        f1.show(769324);
        f1.show(67);
    }
}
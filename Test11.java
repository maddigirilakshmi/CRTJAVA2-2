class First
{
    void show(float x,float y)
    {
        System.out.println("two arg float method");
    }
    void show(double d)
    {
        System.out.println("one arg double method");
    }
}
class Test11
{
    public static void main(String[] args)
    {
        First f1=new First();
        f1.show(46.9);
        f1.show(25,98);
        f1.show(46.8f);
//        f1.show(3.9,97.9);
    }
}
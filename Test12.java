class First
{
void show(double...a)
{
    System.out.println("var arg method");
}
void show(double x,double y)
{
    System.out.println("two arg double method");
}
}
class Test12
{
    public static void main(String[] args)
    {
        First f1=new First();
        f1.show(345.9,987.9);
        f1.show();
        f1.show(23,56,985,89,8765,89,69,49,48,50,68,965);
    }
}
class Test5
{
    int a=10;
    static int b=20;
    void show()
    {
        int c=30;
       System.out.println("a="+a);
       System.out.println("a="+b);
       System.out.println("a="+c);
    }
    void display()
    {
    System.out.println("a="+a);
    System.out.println("a="+b);
    //System.out.println("a="+c);
} 
public static void main(String[] args)
{
    Test5 s1=new Test5();
    s1.show();
    s1.display();
}

}

class Test4
{
    int a=10;
    static int b=20;
    public static void main(String[] args)
    {
        Test4 s1=new Test4();
        Test4 s2=new Test4();
        System.out.println(s1.a+" "+s1.b);
        System.out.println(s2.a+" "+s2.b);
        s1.a=888;
        s1.b=999;
         System.out.println(s1.a+" "+s1.b);
        System.out.println(s2.a+" "+s2.b);
        
    }
}
class Display
{
    public synchronized void wish(String wish)
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("Good morning");
            try 
            {
            Thread.sleep(1000);    
            }
            catch(InterruptedException e) 
            {
            }
            System.out.print("name");
        }
    }
}
class MyThread extends Thread
{
    Display d;
    String name;
    MyThread(Display d,String name)
    {
        this.d=d;
        this.name=name;
    }
    public void run()
    {
        d.wish(name);
    }
}
class Test20
{
    public static void main(String[] args)
    {
        Display d1=new Display();
        MyThread t1=new MyThread(d1,"virat");
         MyThread t2=new MyThread(d1,"siraj");
         t1.start();
         t2.start();
        
    }
}
    

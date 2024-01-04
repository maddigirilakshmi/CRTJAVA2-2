class Student
{
    int admno;
    String name;
    void get(int x,String y)
    {
        admno=x;
        name=y;
    }
    void show()
    {
        System.out.println("admission no="+admno+"  name="+name);
    }
    }
    class test
    {
        public static void main(String[] args)
        {
           Student s1=new Student();
           s1.get(111,"lakshmi");
           s1.show();
           Student s2=new Student();
           s2.get(222,"sailu");
           s2.show();
        }
    }    
    

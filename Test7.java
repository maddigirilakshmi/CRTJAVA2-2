class FirstYear
{
    void branch()
    {
System.out.println("ECE");              
    }
    void subject()
    {
    System.out.println("C LA&C PHY CHE");
    }
    void backlogs()
    {
        System.out.println("PHY");
    }
}
class SecondYear
  {
    void subject()
    {
        FirstYear f1=new FirstYear();
        f1.branch();
        f1.subject();
        f1.backlogs();
        System.out.println("AC DLD CV&T");
    }
}
class Test7
{
    public static void main(String[] args)
    {
        SecondYear s1=new SecondYear();
        s1.subject();
    }
}
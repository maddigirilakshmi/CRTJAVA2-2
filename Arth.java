import java.util.*;
class Arth
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
int a,b,r;
a=s.nextInt();
b=s.nextInt();
System.out.println("1.addition\n2.subration\n3.multiplication\n4.division");
System.out.println("enter your choise");
int ch=s.nextInt();
switch(ch)
{
case 1:
r=a+b;
System.out.println("sum="+r);
break;
case 2:
r=a-b;
System.out.println("sub="+r);
break;
case 3:
r=a*b;
System.out.println("multi="+r);
break;
case 4:
r=a/b;
System.out.println("div="+r);
break;
default:
System.out.println("invalid choise");
}
}
}
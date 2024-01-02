import java.util.*;
class Loop6
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
int d,n,r=0;
System.out.println("enter n value");
n=s.nextInt();
while(n>0)
{
d=n%10;
n=n/10;
r=r*+d;
}
System.out.println(r);
}
}



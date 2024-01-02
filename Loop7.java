import java.util.*;
class Loop6
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
int d,n,r=0,x;
System.out.println("enter n value");
n=s.nextInt();
x=n;
while(n>0)
{
d=n%10;
n=n/10;
r=r+d*d*d;
}
if(r==x)
{
System.out.println("armstrong");
}
else
 {
System.out.println("not a armstrong");
}
}
}



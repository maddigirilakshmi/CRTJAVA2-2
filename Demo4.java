import java.util.*;
class Demo4
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
int i,n,c=0;
n=s.nextInt();
for(i=1;i<=n;i++)
{
if(n%i==0)
c=c+1;
}
if(c==3)
System.out.println(n+"is not a prime number");
else
System.out.println(n+"is not a prime number");
}
}
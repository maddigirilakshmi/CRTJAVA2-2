import java.util.*;
class Demo3
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
int i,n;
System.out.println("enter n value");
n=s.nextInt();
for(i=1;i<=n;i++)
{
System.out.println(i+"*"+n+"="+i*n);
}
}
}
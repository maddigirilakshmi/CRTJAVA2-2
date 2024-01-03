import java.util.*;
class Array10
{
public static void main(String[] args)
	{
	Scanner s=new Scanner(System.in);
	int a[],i,n,sum=0;
	float avg;
	System.out.println("enter the size of array");
	n=s.nextInt();
	a=new int[n];
	System.out.println("enter n value");
	for(i=0;i<n;i++)
		{
		a[i]=s.nextInt();
		}
		for(i=0;i<n;i++)
		{
			sum=sum+a[i];
		}
		avg=(float)sum/n;
		System.out.println("sum of the elements="+sum);
			System.out.println("average="+avg);
	}
}




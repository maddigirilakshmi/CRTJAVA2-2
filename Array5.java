import java.util.*;
class Main
{
public static void main(String[] args)
	{
	Scanner s=new Scanner(System.in);
	int a[],i;
	System.out.println("enter the size of array");
	a=new int[5];
	System.out.println("enter 5 value");
	for(i=0;i<5;i++)
		{
		a[i]=s.nextInt();
		}
		System.out.println("the values are");
		for(i=0;i<5;i++)
		{
			System.out.println(a[i]+" ");
		}
	}
}

import java.util.*;
class Test 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int a;
		a=s.nextInt();
		System.out.println("enter a number");
		if(a>0)
		{
			System.out.println("positive no");
		}
		else
			if(a<0)
		{
			System.out.println("negative");
		}
		else
		{
			System.out.println("zero");
		}
	}
}

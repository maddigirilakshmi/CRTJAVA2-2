import java.util.*;
class Test  
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int a;
		System.out.println("enter a number");
		a=s.nextInt();
		if(a%4==0 && a%100==0 || a%400==0)
		{
			System.out.println("leap year");
		}
		else
		{
			System.out.println(" not a leap year");
		}
	}
}

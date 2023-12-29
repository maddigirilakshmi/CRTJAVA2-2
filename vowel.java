import java,util.*;
class Test  
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		char a;
		System.out.println("enter a character");
		a=s.next().charAt(0);
		if(a=='a'|| a=='e' || a=='i' || a=='o' || a=='u')
		{
			System.out.println("vowel");
		}
		else
		{
			System.out.println("consonants");
			
		}
	}
}
s
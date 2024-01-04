public class Main
{
	int a;
	String b;
	void get(int x,String y)
	{
		a=x;
	    b=y;
    }
		void show()
		{
			System.out.println("a="+a+" b="+b);
		}

	public static void main(String[] args) 
	{
		int a,b;                                                                                                                                                                                          
		Main s1=new Main();
		Main s2=new Main();
		s1.get(12,"sajid");
		s2.get(435,"kaif");
		s1.show();
		s2.show();
	
	}
}

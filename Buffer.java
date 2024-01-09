import java.io.*;
class Buffer
{
	public static void main(String[] args)throws Exception
	{
		FileWriter f1=new FileWriter("python.txt");
		BufferedWriter b1=new BufferedWriter(f1);
		b1.write("simple language");
		b1.newLine();
		b1.write("interpreted language");
		b1.newLine();
		b1.write("free software");
		b1.close();
		f1.close();
}
}
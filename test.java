import java.io.*;
import java.math.*;

public class test 
{
	public static void main(String[] args)
	{
	
		IO io = new IO();

		io.pln("Enter an integer");
		int a = io.iread();
		io.pln(a);
		io.p(a); 
		io.p("\n");	
	
		io.pln("Enter a double");
		double b = io.dread();
		io.pln(b);
		io.p(b);
		io.p("\n");		

		io.pln("Enter a long");
		long c = io.lread();
		io.pln(c);
		io.p(c);
		io.p("\n");

		io.pln("Enter a biginteger");
		BigInteger e = io.bread();
		io.pln(e);
		io.p(e);
		io.p("\n");

		io.pln("Integer array");
		int[] f = {5, 6 , 7};
		io.p(f);

		io.pln("Double array");
		double[] g = {8, 9 , 10};
		io.p(g);

		io.pln("Long array");
		long[] h = {11, 12, 13};
		io.p(h);

		io.pln("BigInteger array");
		BigInteger[] i = {new BigInteger("14"), new BigInteger("15"), new BigInteger("16")};
		io.p(i);
	}
}

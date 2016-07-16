import java.io.*;
import java.text.*;
import java.math.*;
import java.util.*;

class IO
{
	BufferedReader in;
	OutputStream out;
    public IO()
	{
		try 
		{
			in = new BufferedReader(new InputStreamReader(System.in));
			out = new BufferedOutputStream (System.out);
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			System.exit(1);
		}
	}

	/* Read an Integer */
	public int iread()
	{
		try
		{
			return Integer.parseInt(readword());
		}
		catch(NumberFormatException e)
		{
			e.printStackTrace();
			System.exit(1);
			return -1;
		}
		
	}

	/********************/
	/* Read a double */
	public double dread()
	{
		try	
		{
			return Double.parseDouble(readword());
		}
		catch(NumberFormatException e)
		{
			e.printStackTrace();
			System.exit(1);
			return -1;
		}
	}
	      
	/*******************/
	/* Read a long */
	public long lread() 
	{
		try
		{
			return Long.parseLong(readword());
		}
		catch(NumberFormatException e)
		{
			e.printStackTrace();
			System.exit(1);
			return -1;
		}
	}
	
	/************************/
	/* Read a single word */
	public String readword()
	{
		StringBuilder b = new StringBuilder();
		int c;
		try
		{
			c = in.read();
			while (c >= 0 && c <= ' ')
				c = in.read();
			if (c < 0)
				return "";
			while (c > ' ') {
				b.append((char) c);
				c = in.read();
			}
			return b.toString();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.exit(1);
			return "";
		}
	}
	
	/************************/
	/* Read an entire line */
	public String readLine()
	{
		try
		{
			return in.readLine();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.exit(1);	
			return "";
		}
	}
	
	/************************/
	/* Read a BigInteger */
	public BigInteger bread()
	{
		return new BigInteger(this.readword());
	}

	/*************************/
	/*        PRINTING       */
	/*************************/
	/* Print an integer */
	public void p(int obj)
	{
		try
		{
			out.write((obj+"").getBytes());
			out.flush();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.exit(1);
		}
	}

	/***************************/
	/* Print an integer with newline */
	public void pln(int obj)
	{
		try
		{
			out.write((obj+"\n").getBytes());
			out.flush();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.exit(1);
		}
	}

	/**************************/
	/* Print a long */
	public void p(long obj)
	{
		try
		{
			out.write((obj+"").getBytes());
			out.flush();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.exit(1);
		}
	}

	/***************************/
	/* Print a long with newline */
	public void pln(long obj)
	{
		try
		{
			out.write((obj+"\n").getBytes());
			out.flush();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.exit(1);
		}
	}

	/**************************/
	/* Print a double */
	public void p(double obj)
	{
		try
		{
			out.write((obj+"").getBytes());
			out.flush();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.exit(1);
		}
	}

	/***************************/
	/* Print a double with newline */
	public void pln(double obj)
	{
		try
		{
			out.write((obj+"\n").getBytes());
			out.flush();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.exit(1);
		}
	}
	
	/******************/
	/* Print a string */
	public void p(String obj)
	{
		try
		{
			out.write((obj).getBytes());
			out.flush();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.exit(1);
		}
	}
	
	/*****************************/
	/* Print a string with newline */
	public void pln(String obj)
	{
		try
		{
			out.write((obj+"\n").getBytes());
			out.flush();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.exit(1);
		}
	}

	/***************************/
	/* Print a BigInteger */
	public void p(BigInteger obj)
	{
		try
		{
			out.write((obj+"").getBytes());
			out.flush();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.exit(1);
		}
	}
	
	/*****************************/
	/* Print a BigInteger with newline */
	public void pln(BigInteger obj)
	{
		try
		{
			out.write((obj+"\n").getBytes());
			out.flush();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.exit(1);
		}
	}

	/**********************************/
	/* Print a string array */
	public void p(String[] obj)
	{
		try
		{
			for(String str: obj)
				out.write((str + "  ").getBytes());
			out.write("\n".getBytes());
			out.flush();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.exit(1);
		}
	}
	
	/*******************************/
	/* Print an integer array */
	public void p(int[] obj)
	{
		try
		{
			for(int el: obj)
				out.write((el + "  ").getBytes());
			out.write("\n".getBytes());
			out.flush();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.exit(1);
		}
	}

	/********************************/
	/* Print a double array */
	public void p(double[] obj)
	{
		try
		{
			for(double el: obj)
				out.write((el + "  ").getBytes());
			out.write("\n".getBytes());
			out.flush();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.exit(1);
		}
	}
	
	/********************************/
	/* Print a long array */
	public void p(long[] obj)
	{
		try
		{
			for(long el: obj)
				out.write((el + "  ").getBytes());
			out.write("\n".getBytes());
			out.flush();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.exit(1);
		}
	}

	/********************************/
	/* Print a BigInteger array */
	public void p(BigInteger[] obj)
	{
		try
		{
			for(BigInteger el: obj)
				out.write((el+" ").getBytes());
			out.write("\n".getBytes());
			out.flush();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.exit(1);
		}
	}

}

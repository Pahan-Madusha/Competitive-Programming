import java.io.*;
import java.text.*;
import java.math.*;
import java.util.*;

class IO
{
	BufferedReader in;
    public IO()
	{
		try 
		{
			in = new BufferedReader(new InputStreamReader(System.in));
			//in = new BufferedReader(new FileReader(taskname + ".in"));

		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			System.exit(1);
		}
	}

	/******************/
	/**********       */
	public int iread()
	{
		try
		{
			return Integer.parseInt(readword());
		}
		catch(Exception e)
		{
			return -1;
		}
		
	}

	/********************/
	/*************      */
	public double dread()
	{
		try	
		{
			return Double.parseDouble(readword());
		}
		catch(Exception e)
		{
			return -1;
		}
	}
	      
	/*******************/
	/***********       */
	public long lread() 
	{
		try
		{
			return Long.parseLong(readword());
		}
		catch(Exception e)
		{
			return -1;
		}
	}
	
	/************************/
	/*************         */
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
			return "";
		}
	}
	
	/************************/
	/*************         */
	public String readLine()
	{
		try
		{
			return in.readLine();
		}
		catch(Exception e)
		{
			return "";
		}
	}
	
	/*************************/
	/***********             */
	public void print(int obj)
	{
		System.out.print(obj);
	}

	/***************************/
	/***********               */
	public void println(int obj)
	{
		System.out.println(obj);
	}
	
	/******************/
	/*****************/
	public void println(String obj)
	{
		System.out.println(obj);
	}
	
	/******************/
	/*****************/
	public void print(String obj)
	{
		System.out.print(obj);
	}
	
	/******************/
	/*****************/
	public void printArray(String[] obj)
	{
		for(String str: obj)
			System.out.println(str);
	}
	
	/******************/
	/*****************/
	public void printArray(int[] obj)
	{
		for(int str: obj)
			System.out.println(str);
	}
	
	/******************/
	/*****************/
	public void printArray(long[] obj)
	{
		for(long str: obj)
			System.out.println(str);
	}

}

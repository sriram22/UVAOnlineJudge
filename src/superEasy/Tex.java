package superEasy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Tex {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int count=0;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		String line="";
		while (sc.hasNextInt())
		{
			String s1=sc.next();
			

			if(s1.contains("\""))
			{
				if(count%2==0)
				{
					sb.append(s1.replace("\"", "``"));
				}
				else
				{
					sb.append(s1.replace("\"", "''"));
				}
				count++;
			}
			else
			{
				sb.append(s1);
			}
			
			sb.append(" ");
		}
		
		sc.close();
		PrintWriter pw=new PrintWriter(new OutputStreamWriter(System.out)); 
		pw.println(sb);
		pw.flush();
		pw.close();
		
	}
}

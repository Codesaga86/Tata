package basic;

import java.util.Scanner;

public class LeapYearwithScannerclass 
{
	public static void main(String args[]) 
	{
	Scanner sc =new Scanner (System.in);
	System.out.println("Enter a anumber -");
			int i =sc.nextInt();
			
			if(((i%4==0)&&(i%100!=0)||(i%400==0))) 
			{
				System.out.print(i+" is leap year.");
			}
			else 
			{
				System.out.print(i+" is not leap year.");
			}
			
	}

}

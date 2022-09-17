//Programms of Java//
package basic;

public class LeapyearwithForLoop {
	public static void main(String args[])
	{
		for(int i=2010;i<=2020;i++)
		{
		if(((i%4==0)&&(i%100!=0)||(i%400==0)))
		{
			
			System.out.println(i+" is leap year.");
		} 
		/*else
		{
			System.out.print(i+" is not leap year.");
		}*/
		} 
		
	}

}

//palindromeNumberProgrammes// 
package basic;

public class PalindromeNumbers 
{
	public static void main(String args[])
	{
		int n, rev, rem, num;
		n=123;
		rev=0;
		num=n;
		while(n!=0) 
		{
		  rem=n%10;
		  n=n/10;
		  rev=(rev*10)+rem;
		}
		System.out.println("Reverse number is "+rev);
		
	if(rev==num) 
	{
		System.out.println(num+ " number is palindrome");
	}
	else 
	{
		System.out.println(num+ " number is not palindrome");
	}
}
}
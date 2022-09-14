/*9) WAM to test if all digits in a given number are in increasing order (allow -ves).*/
import java.util.*;
public class L6P9
{
	public static void main(String[] args)
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		n=sc.nextInt();
		isDecending(n);
	}
	public static void isDecending(int n)
	{
		boolean flag=false;
		int a = n % 10;
		n = n/10;
		while(n>0)
		{
			if(a<=n%10)
			{
				flag=true;
				break;
			}
			a=n%10;
			n=n/10;
		}
		if(flag)
		{
           System.out.println("Digits are not in increasing order.");
		}
		else
		{
           System.out.println("Digits are in increasing order.");
		}
	}
}
/*12) WAM to return the if a given digit is present in a given number.*/

import java.util.*;
public class L6P12
{
	public static void main(String[] args)
	{
		int n,digit;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		n=sc.nextInt();
		System.out.println("Enter the digit:");
		digit=sc.nextInt();
		boolean r = isPresent(n,digit);
		if(r)
			System.out.println("The digit is present");
		else
			System.out.println("The Digit is absent");
	}
	public static boolean isPresent(int n,int digit)
	{
		while (n>0)
		{
			if(n%10==digit)
				return true;
			n=n/10;
		}
		return false;
	}
}
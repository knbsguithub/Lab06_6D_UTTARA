/*2) WAP to test if a given number is divisible by 3. Do this for both +ve and -ve ints.*/

import java.util.*;
public class L6P2
{
	public static void main(String[] args)
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		n=sc.nextInt();
		System.out.println(isDivisible(n));
	}
	public static boolean isDivisible(int n)
	{
		if(n%3==0)
			return true;
		else
			return false;
	}
}
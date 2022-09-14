/*3) WAP to test if a given number is prime.*/

import java.util.*;
public class L6P3
{
	public static void main(String[] args)
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		n=sc.nextInt();
		isPrime(n);
	}
	public static void isPrime(int n)
	{
		int count=0;
		if (n<=1)
			count++;
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		if(count>0)
			System.out.println("The Number is not Prime");
		else
			System.out.println("The number is Prime");
	}
}
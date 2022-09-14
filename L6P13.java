/*13) WAP to identify if an int number is a palindrome! Generate all palindromes from 10 till 1 million 
and print to monitor.*/

import java.util.*;
public class L6P13
{
	public static void main(String[] args)
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		n=sc.nextInt();
		isPalindrome(n);
		System.out.println(generatePalindrome());
	}
	public static void isPalindrome(int n)
	{
		int reversedNum = 0, remainder;
		int originalNum = n;
		while (n != 0) 
		{
		  remainder = n % 10;
		  reversedNum = reversedNum * 10 + remainder;
		  n /= 10;
		}
		if (originalNum == reversedNum)
		{
			System.out.println(originalNum + " is Palindrome.");
		}
		else 
		{
			System.out.println(originalNum + " is not Palindrome.");
		}
	}
	
}
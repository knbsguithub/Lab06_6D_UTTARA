/*1) WAP to test if a given number 
is even (use % first and then anding with 1 using bitwise & operator to test)*/

import java.util.*;
public class L6P1
{
	public static void main(String[] args)
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		n=sc.nextInt();
		/*if(n%2!=0)
		{
			System.out.println("Number is Odd");
		}
		else
		{
			System.out.println("Number is Even");
		}*/
		if ((n ^ 1) == n + 1)
            System.out.println("Number is Even");
        else
            System.out.println("Number is Odd");
		
		/*here when the number is passed with bitwise xor then if the number
		reports the value which is equal to n+1 then considered Even
		if not its conisdered Odd
		for example 
		07 - 0111
		01 - 0001
		---------
		ans- 0110 - 6 in binary format which is less than that of the number 07
		hence it is odd 
		that way applies for the even numvber */
		
		/*for bitwise and it should be equal to one for an odd number */
		
		/* for bitwise or it has to be greater than the entered number*/
	}
}
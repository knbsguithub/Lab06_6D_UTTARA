/*14. WAP to test whether 2 numbers given as inputs contains the same digits, 
for ex: 121, 112, 211 contain the same digits (repetitions don’t matter)!*/

import java.util.*;
public class L6P14
{
	public static void main(String[] args)
	{
		int n1,n2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number 1:");
		n1=sc.nextInt();
		System.out.println("Enter number 2");
		n2=sc.nextInt();
		boolean r = isCommon(n1,n2);
		if(r)
			System.out.println("it has common numbers");
		else
			System.out.println("has different numbers");
	}
	public static boolean isCommon(int n1,int n2)
	{
		int count=0;
		while(n1>0&&n2>0)
		{
			int a=n1%10;
			int b=n2%10;
			n1=n1/10;
			n2=n2/10;
			if(n1==n2||n1==b||a==n2||a==b)
				count++;
		}
		if(count>0)
			return true;
		else
			return false;
	}       
}
	
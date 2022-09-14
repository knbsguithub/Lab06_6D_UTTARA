/*5) Given 3 numbers, return the correct average of them.*/

import java.util.*;
public class L6P5
{
	public static void main(String[] args)
	{
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 3 numbers:");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		System.out.println(avg(a,b,c));
	}
	public static float avg(int a,int b,int c)
	{
		float average;
		average=(float)(a+b+c)/3;
		return average;
	}
}
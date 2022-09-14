/*11) WAM to return the sum of all the digits in a given number*/
import java.util.*;
public class L6P11
{
	public static int sumOfDigits(int n)
	{
		int r,sum=0;
		while(n!=0)
		{
			r=n%10;
			sum=sum+r;
			n=n/10;
		}
		return sum;
	}
	public static void main(String[] args)
	{
		int n;
		System.out.println("Enter a number:");
		Scanner sc= new Scanner(System.in);
		n=sc.nextInt();
		System.out.println("the sum of the digit " +n+ " is " +sumOfDigits(n));
	}
}
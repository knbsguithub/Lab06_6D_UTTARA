/*10) WAM to test if all digits in a given number are the same*/
import java.util.*;
public class L6P10
{
	public static void main(String[] args)
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		n=sc.nextInt();
		isDigitsSame(n);
	}
	public static void isDigitsSame(int n)
	{
		int lastNo,nextNum;
		boolean flag=false;
		lastNo=n%10;
		while(n!=0)
		{
			nextNum=n%10;
			n=n/10;
			if(lastNo!=nextNum)
				flag=true;
		}
		if(flag)
			System.out.println("Not Same");
		else
			System.out.println("They are same");
	}
}
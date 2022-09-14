import java.util.*;
public class L6P7
{
	public static void main(String[] args)
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		n=sc.nextInt();
		int r=powerOfTwo(n);
		if (r==1)
			System.out.println("Power of TWO");
		else
			System.out.println("NOT Power of TWO");
	}
	public static int powerOfTwo(int n)
    {
        if (n == 0)
            return 0;
         
        while (n != 1)
        {
            if (n % 2 != 0)
                return 0;
            n = n / 2;
        }
        return 1;
    }
}
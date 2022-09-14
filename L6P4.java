/*4) WAP to generate all primes within an positive int number given. 
Can you reuse the method coded for 4th problem?*/

import java.util.*;
public class L6P4
{
	public static void main(String[] args)
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a range:");
		n=sc.nextInt();
		generatePrime(n);
	}
	public static void generatePrime(int n)
	{
		int i,count=0;
		for (i = 0; i <= n; i++) 
		{
            if (i == 1 || i == 0)
				continue;
			count=1;
            for (int j = 2; j <= i / 2; ++j) {
                if (i % j == 0) {
                    count = 0;
                    break;
                }
            }
            if (count== 1)
                System.out.println(i);
		}
	}
}
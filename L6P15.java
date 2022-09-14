/*15) WAP to test GCD of 2 int numbers given as parameter*/
import java.util.*;
public class L6P15
{  
	public static void main(String[] args)   
	{  
	int n1,n2;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter 2 numbers:");
	n1=sc.nextInt();
	n2=sc.nextInt();
	while(n1!=n2)   
	{  
		if(n1>n2)  
			n1=n1-n2;  
		else  
			n2=n2-n1;  
	}  
	System.out.printf("GCD of n1 and n2 is: " +n2);  
	}  
}  
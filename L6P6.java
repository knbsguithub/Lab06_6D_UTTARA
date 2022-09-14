/*6) WAP to test number of bits set to 1 in a positive int given.
	int num = <value>;
	int count = 0;
	for(int i = 0 ; i < 31 ; i++)
	{
	if((num & 1) == 1) //do you understand this?
	count++;
	num = num >> 1;
	}
	return count;
*/

public class L6P6
{
	public static void main(String[] args)
	{
		int num = 10;
		System.out.println(setToOne(num));
	}
	public static int setToOne(int num)
	{
		int count = 0;
		for(int i = 0 ; i < 31 ; i++)
		{
			if((num & 1) == 1) 
			count++;
			num = num >> 1;
		}
		return count;
	}
}
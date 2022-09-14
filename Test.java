	public class Test{
		public static void main(String[] args)
	{
		int originalNum;
		int reversedNum = 0,remainder;
			for(int i=10;i<=1000000;i++)
			{
				originalNum=i;
				while (i != 0) 
				{
				  remainder = i % 10;
				  reversedNum = reversedNum * 10 + remainder;
				  i /= 10;
				}
				if (originalNum == reversedNum)
				{
					System.out.println(reversedNum);
				}
			}
	}
	}
	
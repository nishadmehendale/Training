import java.util.*;
class rangeArm
{
	public static void main(String args [])
	{
		int i;
		System.out.println("Armstrong numbers in 100 to 199 are");
		for(i=100;i<1000;i++)
		{
			arms(i);
		}
	}
	public static void arms(int n)
	{
		int d,copy = n,sum = 0;
		while(n > 0)
		{
			d = n%10;
			n = n/10;
			d = d*d*d;
			sum+=d;
		}
		if(sum == copy)
		{
			System.out.println(copy);
		}
	}
}
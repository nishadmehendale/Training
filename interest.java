import java.util.*;
class interest
{
	public static void main(String args [])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter principle amount");
		int p = sc.nextInt();
		System.out.println("Enter rate of interest");
		float r = sc.nextFloat();
		System.out.println("Enter number of years");
		int n = sc.nextInt();
		double s,c,a;
		s = (double)(p*n*r)/100;
		a = (double)p*Math.pow((1f+r/100f),n);
		c = a - p;
		System.out.println("Simple Interest");
		System.out.println(s);
		System.out.println("Compound Interest");
		System.out.println(c);
	}
}
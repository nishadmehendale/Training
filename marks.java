import java.util.*;
class marks
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter marks of subject 1");
		int m1 = sc.nextInt();
		System.out.println("Enter marks of subject 2");
		int m2 = sc.nextInt();
		System.out.println("Enter marks of subject 3");
		int m3 = sc.nextInt();
		if(m1>60 && m2>60 && m3>60)
		{
			System.out.println("Passed");
		}
		else if((m1>60 && m2>60) || (m1>60 && m3>60) ||(m2>60 && m3>60))
		{
			System.out.println("Promoted");
		}
		else
		{
			System.out.println("Fail");
		}
	}
}
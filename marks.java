import java.util.*;
class marks
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(system.in);
		System.out.println("Enter marks of subject 1");
		m1 = sc.nextInt();
		System.out.println("Enter marks of subject 2");
		m2 = sc.nextInt();
		System.out.println("Enter marks of subject 3");
		m3 = sc.nextInt();
		if(m1>60 && m2>60 && m3>60)
		{
			System.out.println("Passed");
		}
		else if((m1>60 && m2>60) || (m1>60 && m3>60) ||(m2>60 && m3>60)
		{
			System.out.println("Promoted");
		}
		else
		{
			System.out.println("Fail");
		}
	}
}
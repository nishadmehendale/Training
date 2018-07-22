
import java.util.Scanner;
import java.util.*;
public class TestTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of triangles");
		int num = sc.nextInt();
		Triangle[] triangle = new Triangle[num];
		for(int i=0;i<num;i++) {
			triangle[i] = new Triangle();
			System.out.println("Enter length of Side 1");
			double side1 = sc.nextDouble();
			System.out.println("Enter length of Side 2");
			double side2 = sc.nextDouble();
			System.out.println("Enter length of Side 3");
			double side3 = sc.nextDouble();
			triangle[i].setSide1(side1);
			triangle[i].setSide2(side2);
			triangle[i].setSide3(side3);
		}
		int isosceles[] = new int[num];
		int equilateral[] = new int[num];
		int right[] = new int[num];
		int scalene[] = new int[num];
		isosceles = triangle[0].isIsosceles(triangle);
		equilateral = triangle[0].isEquilateral(triangle);
		right = triangle[0].isRight(triangle);
		scalene = triangle[0].isScalene(triangle);
		for(int i = 0; i<num;i++) {
			if(equilateral[i] == 1)
				System.out.println((i+1) +" Triangle is equilateral");
			else if(isosceles[i] == 1)
				System.out.println((i+1) +" Triangle is isosceles");
			if(right[i] == 1)
				System.out.println((i+1) +" Triangle is right angled triangle");
			if(scalene[i] == 1)
				System.out.println((i+1) +" Triangle is scalene");
		}
	}

}


public class Triangle {
	private double side1;
	private double side2;
	private double side3;

	public double getSide1() {
		return side1;
	}

	public void setSide1(double side1) {
		this.side1 = side1;
	}

	public double getSide2() {
		return side2;
	}

	public void setSide2(double side2) {
		this.side2 = side2;
	}

	public double getSide3() {
		return side3;
	}

	public void setSide3(double side3) {
		this.side3 = side3;
	}
	public int[] isRight(Triangle triangle[]) {
		int type[], i;
		type = new int[triangle.length];
		for (i = 0; i < triangle.length; i++)
			type[i] = 0;
		for (i = 0; i < triangle.length; i++) {
			double square1 = triangle[i].getSide1() * triangle[i].getSide1();
			double square2 = triangle[i].getSide2() * triangle[i].getSide2();
			double square3 = triangle[i].getSide3() * triangle[i].getSide3();
			if (square1 == (square2 + square3) || square2 == (square1 + square3) || square3 == (square2 + square1))
				type[i] = 1;
		}
		return type;
	}
	public int[] isEquilateral(Triangle triangle[]) {
		int type[], i;
		type = new int[triangle.length];
		for (i = 0; i < triangle.length; i++)
			type[i] = 0;
		for (i = 0; i < triangle.length; i++) {
			if (triangle[i].getSide1() == triangle[i].getSide2() && triangle[i].getSide1() == triangle[i].getSide3())
				type[i] = 1;
		}
		return type;
	}
	public int[] isIsosceles(Triangle triangle[]) {
		int type[], i;
		type = new int[triangle.length];
		for (i = 0; i < triangle.length; i++)
			type[i] = 0;
		for (i = 0; i < triangle.length; i++) {
			if (triangle[i].getSide1() == triangle[i].getSide2() || triangle[i].getSide3() == triangle[i].getSide2()
					|| triangle[i].getSide1() == triangle[i].getSide3())
				type[i] = 1;
		}
		return type;
	}
	public int[] isScalene(Triangle triangle[]) {
		int type[], i;
		type = new int[triangle.length];
		for (i = 0; i < triangle.length; i++)
			type[i] = 0;
		for (i = 0; i < triangle.length; i++) {
			if (triangle[i].getSide1() != triangle[i].getSide2() && triangle[i].getSide2() != triangle[i].getSide3() && triangle[i].getSide1() != triangle[i].getSide3())
				type[i] = 1;
		}
		return type;
	}
}

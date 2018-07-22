
//Tests Rectangle Class and Evaluates Area and Circumference
public class TestRectangle {

	public static void main(String[] args) {
		Rectangle rectangle1 = new Rectangle();
		rectangle1.setLength(5.5f);
		rectangle1.setBreadth(4.5f);
		System.out.println(rectangle1);
		Rectangle rectangle2 = new Rectangle();
		rectangle2.setLength(0.5f);
		rectangle2.setBreadth(5.5f);
		System.out.println(rectangle2);
		if(rectangle1.checkArea(rectangle2)) {
			System.out.println("Same Area with different sides");
		}
		else {
			System.out.println("Different area");
		}
		
	}

}
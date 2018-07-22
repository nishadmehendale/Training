
public class Rectangle {
	private float length;
	private float breadth;
	public float getLength() {
		return length;
	}
	public void setLength(float length) {
		if(length > 0.0f)
			this.length = length;
	}
	public float getBreadth() {
		return breadth;
	}
	public void setBreadth(float breadth) {
		if(breadth > 0.0f) 
			this.breadth = breadth;
	}
	public float area()
	{
		float area = length * breadth;
		return area;
	}
	public float circumference()
	{
		float circumference = 2 * (length + breadth);
		return circumference;
	}
	public boolean checkArea(Rectangle rectangle) {
		boolean flag = false;
		if(this.breadth != rectangle.breadth && this.length != rectangle.length) {
		if(this.area() == rectangle.area())
			flag = true;
		else
			flag = false;
		}
		return flag;
	}
	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", breadth=" + breadth + ", area()=" + area() + ", circumference()="
				+ circumference() + "]";
	}
}

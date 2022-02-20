package homeworkJAVA;
public class ShapeEncapsulation {

	public static void main(String[] args) {
		Shape getSqaureArea = new Shape();
		System.out.println(getSqaureArea.getAreaSquare(6));

		Shape getRectangleArea = new Shape();
		System.out.println(getRectangleArea.getAreaRectangle(5, 8));

		Shape getCircleArea = new Shape();
		System.out.println(getCircleArea.getAreaCircle(5.0));

		Shape[] shapeArray = { getSqaureArea, getRectangleArea, getCircleArea };
		System.out.println(shapeArray.length);
	}
}

class Shape {

	private int length;
	private int width;
	private int area;
	private double radius;
	final private double PI_VALUE = 3.14;
	private double area1;

	public Shape() {
	}

	public Shape(double radius) {
		this.radius = radius;
	}

	public Shape(int length) {
		this.length = length;
	}

	public Shape(int length, int width) {
		this.length = length;
		this.width = length;
	}

	public int getAreaSquare(int length) {
		return area = length * length;
	}

	public int getAreaRectangle(int length, int width) {
		return area = length * width;
	}

	public double getAreaCircle(double radius) {
		radius = radius * radius;
		return area1 = radius * PI_VALUE;
	}

	  public int getLength() { return length; }
	  
	  public void setLength(int length) { this.length = length; }
	  
	  public int getWidth() { return width; }
	  
	  public void setWidth(int width) { this.width = width; }
	 }

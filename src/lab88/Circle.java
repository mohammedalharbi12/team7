package lab88;

public class Circle {
	private double xCoordinate;
	private double yCoordinate;
	private double radius;
final double PI=3.14;
static double  numberOfCircles;
	public Circle() {
		
		numberOfCircles++;
	}
	
	public Circle(double x, double y, double radius) {
		this.xCoordinate=x;
		this.yCoordinate=y;
		this.radius=radius;	
		 numberOfCircles++;
	}
	public void setCenter(double x, double y) {
		this.xCoordinate=x;
		this.yCoordinate=y;
	}
	public void setRadius(double r) {
	this.radius=r;
	}
	public double getRadius() {
	return radius;
	}
	public double getArea() {
		return calculateArea();
	}
	private double calculateArea() {
		return  PI*(radius*getRadius());
	}
	private double  calculateCircumference() {
		return PI* (2*radius);
	}
	 public double getCircumference() {
		 
		 return calculateCircumference();
	 }
	public static double getNumberOfCircles() {
		return numberOfCircles;
	}
}

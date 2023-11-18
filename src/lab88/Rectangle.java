package lab88;

public class Rectangle {
double length;
double width;
//Rectangle(){}
Rectangle(){
this(2.0,3.5);
}
Rectangle(double length , double width){
this.length = length;
this.width = width;
}
double getArea(){
double area = length*width;
return area;
}
double getPerimeter(){
double perimeter = 2* (length + width);
return perimeter;
}


public static void main(String args[]){
Rectangle r1 = new Rectangle();
Rectangle r2 = new Rectangle();
Rectangle r3 = new Rectangle();
Rectangle r4 = r1;
System.out.println("The Area of the Rectangle r1 is: " + r1.getArea());
System.out.println("The Area of the Rectangle r1 is: " + 
r1.getPerimeter());
r4.width = 8.3;
r4.length = 15.0;
System.out.println("The Area of the Rectangle r1 is: " + r1.getArea());
System.out.println("The Area of the Rectangle r1 is: " + 
r1.getPerimeter());
}
}

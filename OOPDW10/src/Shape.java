//run time polymorphism
// using the parent reference and child object

// parent
class Shape {

	public double calculateArea() {
		return 0;
	}
}

// child
class Circle extends Shape 
{
	private double radius;
	public Circle (double radius)
	{
		this.radius = radius;
	}
	public double calculateArea() {
		return Math.PI * radius * radius;
	}
}

//child
class Rectangle extends Shape 
{
	private double width;
	private double height;
	public Rectangle (double width, double height)
	{
		this.width = width;
		this.height = height;
	}
	public double calculateArea() {
		return height * width;
	}
}
package PolymorephismDemo;

public class AreaShape {

	 String color;
	    double borderWidth;
	    String shapeName;

	    AreaShape() // default
	    {
	        System.out.println("Shape default constructor");
	        color = "default";
	        borderWidth = 4.5;
	        shapeName = "not entered";
	    }

	    AreaShape(String shapeName, String color, double borderWidth) // parameterized
	    {
	        System.out.println("Shape parameterized constructor");
	        this.shapeName = shapeName;
	        this.color = color;
	        this.borderWidth = borderWidth;
	    }

	    double area() // generic area method
	    {
	        return 0;
	    }

	    void display() {
	        System.out.println("Shape: " + shapeName);
	        System.out.println("Color: " + color);
	        System.out.println("Border Width: " + borderWidth);
	    }
	}

	// Rectangle class
	class Rectangle extends AreaShape {
	    double length;
	    double breadth;

	    Rectangle() {
	        super();
	        System.out.println("Rectangle default constructor");
	        length = 5.6;
	        breadth = 4.5;
	    }

	    Rectangle(String color, double borderWidth, double length, double breadth) {
	        super("Rectangle", color, borderWidth);
	        System.out.println("Rectangle parameterized constructor");
	        this.length = length;
	        this.breadth = breadth;
	    }

	    double area() {
	        return length * breadth;
	    }

	    void display() {
	        super.display();
	        System.out.println("Length: " + length);
	        System.out.println("Breadth: " + breadth);
	        System.out.println("Area of Rectangle: " + area());
	    }
	}

	// Circle class
	class Circle extends AreaShape {
	    double radius;

	    Circle() {
	        super();
	        System.out.println("Circle default constructor");
	        radius = 4.5;
	    }

	    Circle(String color, double borderWidth, double radius) {
	        super("Circle", color, borderWidth);
	        System.out.println("Circle parameterized constructor");
	        this.radius = radius;
	    }

	    double area() {
	        return 3.14 * radius * radius;
	    }

	    void display() {
	        super.display();
	        System.out.println("Radius: " + radius);
	        System.out.println("Area of Circle: " + area());
	    }
	}

	// Triangle class
	class Triangle extends AreaShape {
	    double base;
	    double height;

	    Triangle() {
	        super();
	        System.out.println("Triangle default constructor");
	        base = 4.3;
	        height = 6.5;
	    }

	    Triangle(String color, double borderWidth, double base, double height) {
	        super("Triangle", color, borderWidth);
	        System.out.println("Triangle parameterized constructor");
	        this.base = base;
	        this.height = height;
	    }

	    double area() {
	        return 0.5 * base * height;
	    }

	    void display() {
	        super.display();
	        System.out.println("Base: " + base);
	        System.out.println("Height: " + height);
	        System.out.println("Area of Triangle: " + area());
	    }
	}

	// Demo class
	class DemoShape {
	    public static void main(String[] args) {
	        AreaShape a;

	        System.out.println("--- Rectangle ---");
	        a = new Rectangle("Blue", 2.5, 5, 7);
	        a.display();

	        System.out.println("\n--- Circle ---");
	        a = new Circle("Red", 1.5, 4);
	        a.display();

	        System.out.println("\n--- Triangle ---");
	        a = new Triangle("Green", 3.0, 6, 8);
	        a.display();
	    }

	}



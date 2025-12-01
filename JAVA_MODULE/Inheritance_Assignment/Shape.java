package inheritanceDemo;

public class Shape {
	 String color;
	    double borderWidth;
	    String shapeName;

	    Shape()//default
	    {
	    	super();
	    	System.out.println("shape default constructor");
	    	color="default";
	    	borderWidth=4.5;
	    	shapeName="not entered";
	    }
	    Shape(String shapeName, String color, double borderWidth) //parameterized 
	    {
	    	 System.out.println("shape parameterized constructor");
	        this.shapeName = shapeName;
	        this.color = color;
	        this.borderWidth = borderWidth;
	    }

	    void display() {
	        System.out.println("Shape: " + shapeName);
	        System.out.println("Color: " + color);
	        System.out.println("Border Width: " + borderWidth);
	    }

	    public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}

		public double getBorderWidth() {
			return borderWidth;
		}

		public void setBorderWidth(double borderWidth) {
			this.borderWidth = borderWidth;
		}

		public String getShapeName() {
			return shapeName;
		}

		public void setShapeName(String shapeName) {
			this.shapeName = shapeName;
		}

		double area() {   // generic area method
	        return 0;
	    }
	}//shape class ends here

	class Rectangle extends Shape {
	    double length;
	    double breadth;
	    Rectangle()//default
	    {
	    	super();
	    	System.out.println("reclangle default constructor");
	    	length=5.6;
	    	breadth=4.5;
	    	
	    }
	    Rectangle(String color, double borderWidth, double length, double breadth) {
	        super("Rectangle", color, borderWidth);
	        System.out.println("reclangle parameterized constructor");
	        this.length = length;
	        this.breadth = breadth;
	    }

	    double area() {
	        return length * breadth;
	    }

	    public double getLength() {
			return length;
		}
		public void setLength(double length) {
			this.length = length;
		}
		public double getBreadth() {
			return breadth;
		}
		public void setBreadth(double breadth) {
			this.breadth = breadth;
		}
		void display() {
	        super.display();
	        System.out.println("Length: " + length);
	        System.out.println("Breadth: " + breadth);
	        System.out.println("Area of Rectangle: " + area());
	    }
	}//reclangle class ends here
	class Circle extends Shape {
	    double radius;
	    Circle()//default
	    {
	    	super();
	    	System.out.println("circle default constructor");
	    	radius=4.5;
	    	
	    }
	    Circle(String color, double borderWidth, double radius)//parameterized
	    {
	        super("Circle", color, borderWidth);
	        System.out.println("circle parameterized constructor");
	        this.radius = radius;
	    }

	    public double getRadius() {
			return radius;
		}
		public void setRadius(double radius) {
			this.radius = radius;
		}
		double area() {
	        return 3.1416 * radius * radius;
	    }

	    void display() {
	        super.display();
	        System.out.println("Radius: " + radius);
	        System.out.println("Area of Circle: " + area());
	    }
	}//circle class ends here
	class Triangle extends Shape {
	    double base;
	    double height;
	    Triangle()//default
	    {
	    	super();
	    	System.out.println("triangle default constructor");
	    	base=4.3;
	    	height=6.5;
	    }
	    Triangle(String color, double borderWidth, double base, double height)//parameterized
	    {
	        super("Triangle", color, borderWidth);
	        System.out.println("triangle parameterized constructor");
	        this.base = base;
	        this.height = height;
	    }

	    public double getBase() {
			return base;
		}
		public void setBase(double base) {
			this.base = base;
		}
		public double getHeight() {
			return height;
		}
		public void setHeight(double height) {
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
	}//triangle class ends here

	class DemoShape {
	    public static void main(String[] args) {
	        System.out.println("--- Rectangle ---");
	        Rectangle r = new Rectangle("Blue", 2.5, 10, 5);
	        r.display();

	        System.out.println("\n--- Circle ---");
	        Circle c = new Circle("Red", 1.5, 7);
	        c.display();

	        System.out.println("\n--- Triangle ---");
	        Triangle t = new Triangle("Green", 3.0, 8, 6);
	        t.display();
	    }//main ends here
	}//demo class ends here



 class Shape {
	public void area() {
		System.out.println("I have an Area");
	}
public void points() {	
	System.out.println("I made from bunch of points");
	}
public void perimeter() {
	System.out.println("i have perimeter");
}
 
}


class Circle extends Shape {
	@Override
	public void perimeter() {
		System.out.println("i have circumference");
		//super.perimeter();
		
	}
	
	public void radius() {
		System.out.println("i have my own radius ");
		
	}
	public void methodOfArea() {
		System.out.println("my area is equal to 3.14 x r x r");
		
	}
	public void methodOfCircumference() {
		System.out.println("my circumference is equal to 2x3.14xr");
	}
	
	
}


class Square extends Shape {
	public void side() {
		System.out.println("my side is equal ");
		
	}
	public void methodOfArea() {
		System.out.println("my area is equal sidexside");
		
	}
	public void methodOfPerimeter() {
		System.out.println(" my area is equal to 4xside");
	}
	
	
}


class Triangle extends Shape {
	public void side() {
		System.out.println("my side depend on my types");
		
	}
	public void methodOfArea() {
		System.out.println("my area is 1/2 xbase xheight");
		
	}
	public void methodOfPerimeter() {
		System.out.println("my perimeter is equal 3 X side");
	}
	
	
}

class ShapeCaller{
	
	public void call(Shape shape) {
		
		shape.area();
		shape.points();
		shape.perimeter();
		System.out.println();
		System.out.println();
		
		if(shape instanceof Circle) {
			Circle circle = (Circle) shape;
			
			circle.methodOfArea();
			circle.methodOfCircumference();
		}
		
		else if(shape instanceof Square) {
			Square square = (Square) shape;
			
			 square.methodOfArea();
			square.methodOfPerimeter();
		}
		
		
		
		else if(shape instanceof Triangle) {
			Triangle triangle = (Triangle) shape;
			
		
			triangle.methodOfArea();
			triangle.methodOfPerimeter();
		}
		
	}
	
}



 class TypesOfShapes{
	
	public static void main(String argv[]) {
		
		ShapeCaller shape = new ShapeCaller();
		
		System.out.println("Circle");
		shape.call(new Circle()) ;
		System.out.println("*********************************************");
		System.out.println();
		 
		System.out.println("Square");
		shape.call(new Square());
		System.out.println("********************************************");
		System.out.println();
		
		System.out.println("Triangle");
		shape.call(new Triangle());
		System.out.println("*********************************************");
		System.out.println();
		
		
		
		
	}
	
}




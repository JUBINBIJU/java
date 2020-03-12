class Rectangle{

	private double length,breadth;

	Rectangle(int a , int b){
		length=a;
		breadth=b;
	}

	Rectangle(){
		this(10,10);
	}

	public double findArea(){
		double a =length*breadth;
		display("Area",a);
		return a;
	}

	public double findPerimeter(){
		double p=(length+breadth)*2;
		display("Perimeter",p);
		return p;
	}
	private void display(String s,double a){
		System.out.println("Length : "+ length +"\nBreadth : "+ breadth+ "\n"+s+" : "+a);
	}
}

class Square extends Rectangle{

	private int side;
	Square(int a){
		super(a,a);
		side=a;
	}
}

public class RectangleDemo{

	public static void main(String[] args){
		Rectangle a=new Rectangle(3,4);
		a.findArea();
		a.findPerimeter();
		Square b=new Square(5);
		b.findArea();
		b.findPerimeter();
	}
}

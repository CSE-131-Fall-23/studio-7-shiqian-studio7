package studio7;


public class Rectangle {
	private double length;
	private double width;
	
	public Rectangle(double length, double width) {
		this.length=length;
		this.width=width;
		
	}
	
	public double Area(){
		double Area= length*width;
		return Area;
	}
	public void Perimeter() {
		double Perimeter= (length+width)*2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rectangle1=new Rectangle(2.0,3.0);
		Rectangle rectangle2=new Rectangle(3.0,5.0);
		if(rectangle1.Area()> rectangle2.Area()) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
		
		
		

	}

}


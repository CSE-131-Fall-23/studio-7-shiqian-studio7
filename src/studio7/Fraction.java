package studio7;

public class Fraction {
	
	private int numerator;
	private int denominator;
	
	public Fraction(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}
	
	public Fraction Addition(Fraction F) {
		int commondenom = denominator * F.denominator;
		int num = numerator + F.numerator;
		Fraction fractionsum = new Fraction(num,commondenom);
		return fractionsum;
	}
	
	public Fraction Product(Fraction F) {
		int denomproduct = denominator * F.denominator;
		int numproduct = numerator * F.numerator;
		Fraction fractionproduct = new Fraction(numproduct,denomproduct);
		return fractionproduct;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fraction fraction1=new Fraction(1,2);
		Fraction fraction2=new Fraction(3,4);
		System.out.print("fraction: " + Addition().numerator + "/" + );

	}

}

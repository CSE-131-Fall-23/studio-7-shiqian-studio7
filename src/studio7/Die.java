package studio7;

public class Die {
	private int n;
	
	public Die(int n) {
		this.n=n;
	}
	
	public int Random() {
		int Random=(int)(Math.random()*n + 1);
		return Random;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Die die=new Die(5);
		System.out.print("Random number: " + die.Random());

	}

}

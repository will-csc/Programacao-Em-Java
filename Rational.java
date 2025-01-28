public class Rational{
	int numerator;
	int denominator;

	public Rational(){
		this.numerator = 0;
		this.denominator = 1;
	}
	public Rational(int n, int d){
		this.numerator = n;
		this.denominator = d;
	}
	public void printRational(){
		System.out.printf("\nNumerator: %d\nDenominator: %d\nThe number: %.2f",this.numerator,this.denominator, (double) this.numerator / this.denominator);
	}
	public String toString() {
	    double result = (double) this.numerator / this.denominator; // Realiza a divisão
	    String text = String.valueOf(result); // Converte o resultado para String
	    System.out.println("\nIn text format: "+text);
	    return text;
	}
	public void negateNumbers(){
		this.numerator = this.numerator * (-1);
		this.denominator = this.denominator * (-1);
		System.out.printf("\n\nNew Numbers:\nNumerator: %d\nDenominator: %d",this.numerator,this.denominator);
	}
	public void invertNumbers(){
		int oldNumerator = this.numerator;

		this.numerator = this.denominator;
		this.denominator = oldNumerator;
		System.out.printf("\n\nNew Numbers:\nNumerator: %d\nDenominator: %d",this.numerator,this.denominator);
	}
	public double toDouble(){
		double newNumber = (double) (this.numerator / this.denominator);
		System.out.println("\nThe number converted to double is: "+newNumber);
		return newNumber;
	}
	public void reduce(){
		int b = this.numerator;
		int a = this.denominator;

		while(b != 0){
			int temp = b;
			b = a % b;
			a = temp;
		}
		System.out.println("The GDC is: "+a);
	}
	public Rational add(Rational other){
		int newNumerator = this.numerator * other.denominator + other.numerator * this.denominator;
		int newDenominator = this.denominator * other.denominator;
		return new Rational(newNumerator, newDenominator);
	}
}




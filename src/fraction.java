public class fraction {
	private int numerator;
	private int denominator;
	fraction(int n, int d) {
		setNum(n);
		setDen(d);
	}
	public void setNum(n) {
		numerator = n;
	}
	public void setDen(d) {
		denominator = d;
	}
	public int getNum() {
		return numerator;
	}
	public int getDem() {
		return denominator;
	}
	public double toDecimal() {
		return numerator/denominator;
	}
	public fraction simplify() {
		
	}
	 	//simplify() - returns a new Fraction object representing a simplified version of the fraction
	//toString() - overrides toString() from Object and returns a string with the fraction written "numerator/denominator". When you print out a Fraction, now it should be written correctly instead of showing the memory address
	//equals(Fraction f) - overrides equals() from Object and returns true if the fraction and f are equivalent fractions.

}

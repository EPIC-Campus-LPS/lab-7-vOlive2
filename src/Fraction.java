import java.lang.Math;
public class Fraction {
	private int numerator;
	private int denominator;
	Fraction() {
		setNum(0);
		setDen(1);
	}
	Fraction(int n) {
		setNum(n);
		setDen(1);
	}
	Fraction(int n, int d) {
		setNum(n);
		setDen(d);
	}
	public void setNum(int n) {
		numerator = n;
	}
	public void setDen(int d) {
		denominator = d;
	}
	public int getNum() {
		return numerator;
	}
	public int getDen() {
		return denominator;
	}
	public double toDecimal() {
		return numerator/denominator;
	}
	public Fraction simplify() {
		int g = 1;
		for(int i = 0; i < denominator; i++) {
			if(denominator % i == 0 && numerator % i == 0) {g = i;}
		}
		Fraction simpled = new Fraction (numerator/g, denominator/g);
		return simpled;
	}
	@Override
	public String toString() {
		return "" + numerator + "/" + denominator;
	}
	public boolean equals(Fraction f) {
		return (f.getNum() == getNum() && f.getDen() == getDen());
	}
	
	
	//equals(Fraction f) - overrides equals() from Object and returns true if the fraction and f are equivalent fractions.

}

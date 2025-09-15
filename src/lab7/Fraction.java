package lab7;

public class Fraction {
	private int numerator;
	private int denominator;
	public Fraction() {
		numerator=0;
		denominator=1;
	}
	public Fraction(int n) {
		numerator=n;
		denominator=1;
	}
	public Fraction(int n, int d) {
		numerator=n;
		denominator=d;
	}
	public int getNumerator() {
		return numerator;
	}
	public int getDenominator() {
		return denominator;
	}
	public double toDecimal() {
		return (double) numerator/denominator;
	}
	public Fraction simplify() {
		int n=numerator;
		for (int i=1;i<n;i++) {
			if (numerator%i==0&&denominator%i==0) {
				numerator/=i;
				denominator/=i;
			}
		}
		return this;
	}
	public boolean equals(Fraction f) {
		if (numerator==f.getNumerator()&&denominator==f.getDenominator())
			return true;
		else
			return false;
	}
	public String toString() {
		return numerator+"/"+denominator;
	}
}

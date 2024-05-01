public class Rational implements Addable<Rational> {
    private int numerator;
    private int denominator;

    public Rational(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getDenominator() {
        return denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

    public int intQuotient() {
        return numerator/denominator;
    }
    public double doubleQuotient() {
        return (double) numerator/denominator;
    }

    public String mixedFraction() {
        if(numerator/denominator == 0) {
            return this.toString();
        } else if (numerator%denominator == 0) {
            return String.valueOf(numerator/denominator);
        } else {
            return (numerator / denominator) + " " + numerator % denominator + "/" + denominator;
        }
    }

    @Override
    public Rational adds(Rational addend) {
        denominator *= addend.getDenominator();
        numerator *= addend.getDenominator();
        numerator += addend.getNumerator() * denominator;
    }

    @Override
    public Rational increment() {
        return null;
    }
}

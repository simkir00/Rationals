/**
 * The type Rational.
 */
public class Rational {
    private int numerator, denominator;

    /**
     * Instantiates a new Rational.
     */
    public Rational() {
        this(0, 1);
    }

    /**
     * Instantiates a new Rational.
     *
     * @param rat the rat
     */
    public Rational(Rational rat) {
        this(rat.getNumerator(), rat.getDenominator());
    }


    /**
     * Instantiates a new Rational.
     * Constructor. Creates a Rational class object with a specified numerator and denominator
     * <p>
     * Throws:
     * IllegalArgumentException: when input denominator is 0
     *
     * @param numerator   the numerator
     * @param denominator the denominator
     */
    public Rational(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Can't be divided by zero");
        } else{
            int tmp = Utility.gcd(numerator, denominator);
            if (denominator < 0) {
                numerator = -numerator;
                denominator = -denominator;
            }
            this.numerator=numerator / tmp;
            this.denominator=denominator / tmp;
        }
    }

    public static void swap(int a, int b) {
        int tmp;
        tmp = a;
        a = b;
        b = a;
    }

    /**
     * Gets numerator.
     *
     * @return the numerator
     */
    public int getNumerator() {
        return numerator;
    }

    /**
     * Sets numerator.
     *
     * @param numerator the numerator
     */
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    /**
     * Gets denominator.
     *
     * @return the denominator
     */
    public int getDenominator() {
        return denominator;
    }

    /**
     * Sets denominator.
     *
     * @param denominator the denominator
     */
    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    /**
     * Add rational.
     * <p>
     * Function which adds one Rational object (this) to another (rat) no changing current objects
     *
     * @param rat the rational
     * @return rat the rational -- new Rational object; summary of Rationals this and rat
     */
    public Rational add(Rational rat) {
        Rational res = new Rational();
        int res_num = this.numerator * (Utility.lcm(this.denominator, rat.denominator) / this.denominator)
                + rat.numerator * (Utility.lcm(this.denominator, rat.denominator) / rat.denominator);
        int res_denom = Utility.lcm(this.denominator, rat.denominator);
        int gcd = Utility.gcd(res_num, res_denom);
        res_num /= gcd;
        res_denom /= gcd;
        res.setNumerator(res_num);
        res.setDenominator(res_denom);
        return res;
    }

    /**
     * To double double.
     *
     * @return the double
     */
    public double toDouble() {
        return (double) numerator / denominator;
    }

    @Override
    public String toString() {
        return String.format("%d/%d", numerator, denominator);
    }
}

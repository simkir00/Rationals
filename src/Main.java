import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int d = in.nextInt();
        Rational r1 = new Rational(n, d);
        System.out.printf("Input rational: %s\nIn a double form: %.2f\n", r1, r1.toDouble());
        Rational r2 = new Rational(r1.add(new Rational(1, 6)));
        System.out.printf("New rational: %s\n", r2);

        RationalList arr1 = new RationalList().addRational(r1).addRational(r2);
        System.out.printf("Rational array: %s\n", arr1);

        RationalList arr2 = new RationalList(arr1);
        arr2.addRational(r1.add(r2));
        System.out.printf("New rational array: %s\n", arr2);
        Rational r3 = arr2.getRational(3);
        System.out.printf("Third element of the set: %s\n", r3);

        Polinom pol = new Polinom(arr2);
        System.out.printf("Polinom: %s\n", pol);
        System.out.printf("Result of calculating (x = 3): %f\n", pol.calculate(3));

        Rational r4 = new Rational(r2.multiply(r3));
        System.out.printf("Result of multiplying %s and %s: %s\n", r2, r3, r4);

        Rational r5 = r4.inverse();
        System.out.printf("Result of inversion %s: %s\n", r4, r5);
    }
}
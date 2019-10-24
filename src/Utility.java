public class Utility {
    public static int gcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (a != 0 && b != 0) {
            if (a > b)
                a %= b;
            else
                b %= a;
        }
        return a + b;
    }

    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
}

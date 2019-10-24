public class Polinom extends RationalList {

    private int degree;

    public Polinom() {
        super();
        this.degree = 0;
    }

    public Polinom(RationalList set) {
        super(set);
        degree = this.array.size() - 1;
    }

    public double calculate(double x) {
        double result = 0;
        for (int i = 0; i < this.array.size(); i++) {
            result += this.array.get(i).toDouble() * Math.pow(x, this.degree - i);
        }
        return result;
    }

    @Override
    public String toString() {
        String res = "";
        for (int i = 0; i < this.array.size() - 1; i++) {
            res += this.array.get(i) + "x^" + (array.size() - 1 - i) + " + ";
        }
        res += this.array.get(array.size() - 1);
        return res;
    }
}

import java.util.ArrayList;
import java.util.List;

public class RationalList {
    protected List<Rational> array = new ArrayList<>();
    private Rational cachedMax;
    private Rational cachedMin;


    public RationalList() {
    }

    public RationalList(RationalList set) {
        for (int i = 0; i < set.array.size(); i++) {
            this.array.add(set.array.get(i));
        }
        this.cachedMax = set.cachedMax;
        this.cachedMin = set.cachedMin;
    }


    public RationalList addRational(Rational x) {
        if (array.size() == 0 || x.toDouble() > cachedMax.toDouble()) {
            cachedMax = x;
        }
        if (array.size() == 0 || x.toDouble() < cachedMin.toDouble()) {
            cachedMin = x;
        }
        array.add(x);
        return this;
    }

    public Rational getRational(int index) {
        return array.get(index - 1);
    }

    public Rational getMax(){
        return this.cachedMax;
    }

    public Rational getMin(){
        return this.cachedMin;
    }

    @Override
    public String toString() {
        String str = "";
        for (int i = 0; i < array.size(); i++) {
            str += array.get(i) + " ";
        }
        return str;
    }
}
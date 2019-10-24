import java.util.ArrayList;
import java.util.List;

public class RationalList {
    protected List<Rational> array = new ArrayList<>();

    public RationalList() {
    }

    public RationalList(RationalList set) {
        for (int i = 0; i < set.array.size(); i++) {
            this.array.add(set.array.get(i));
        }
    }


    public RationalList addRational(Rational x) {
        array.add(x);
        return this;
    }

    public Rational getRational(int index) {
        return array.get(index - 1);
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
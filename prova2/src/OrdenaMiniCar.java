import java.util.Comparator;

public class OrdenaMiniCar implements Comparator<Minicarregadora> {
    @Override
    public int compare(Minicarregadora m1, Minicarregadora m2) {
        return m1.toString().compareTo(m2.toString());
    }
}


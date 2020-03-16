import java.util.HashMap;
import java.util.Objects;

public class Quantity {

    public HashMap<Quantity.unit, Double> quantity = new HashMap<>();
    enum unit {Inches, Yards, Foot};

    public int value;

    public Quantity(Quantity.unit unit, double value){
        quantity.put(unit, value);

    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Quantity quantity1 = (Quantity) o;
        return value == quantity1.value &&
                Objects.equals(quantity, quantity1.quantity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(quantity, value);
    }
}


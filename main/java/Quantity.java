import java.util.HashMap;
import java.util.Objects;

public class Quantity {

    public HashMap<Quantity.unit, Double> quantity = new HashMap<>();
    enum unit {Inches, Yards, Foot};
    public double value;

    public Quantity(Quantity.unit unit, double value){

        quantity.put(Quantity.unit.Yards, 36.0);
        quantity.put(Quantity.unit.Foot, 12.0);
        quantity.put(Quantity.unit.Inches, 1.0);
        this.value = value*quantity.get(unit);


    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Quantity quantity1 = (Quantity) o;
        return Double.compare(quantity1.value, value) == 0 &&
                Objects.equals(quantity, quantity1.quantity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(quantity, value);
    }
}


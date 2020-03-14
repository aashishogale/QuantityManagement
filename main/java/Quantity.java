import java.util.Objects;

public class Quantity {

    public String unit;
    public int value;

    public Quantity(String unit, int value){
        this.unit = unit;
        this.value = value;
    }

    

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Quantity quantity = (Quantity) o;
        return value == quantity.value &&
                Objects.equals(unit, quantity.unit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(unit, value);
    }
}


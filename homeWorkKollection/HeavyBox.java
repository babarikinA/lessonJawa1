package homeWorkKollection;

import java.util.Objects;

public class HeavyBox {

    private int weight;

    public HeavyBox(int weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HeavyBox heavyBox = (HeavyBox) o;
        return weight == heavyBox.weight;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(weight);
    }

    @Override
    public String toString() {
        return "HeavyBox{" +
                "weight=" + weight +
                '}';
    }


}

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Product {

    private String name;
    private int productId;

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", productId=" + productId +
                '}';
    }

    public Product(String name, int productId) {
        this.name = name;
        this.productId = productId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public int getProductId() {
        return productId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return productId == product.productId && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, productId);
    }
}
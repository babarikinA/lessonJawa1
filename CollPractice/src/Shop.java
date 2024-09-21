import java.util.ArrayList;
import java.util.List;

public class Shop {

    List<Product> productList = new ArrayList<>();

    public void add(Product product) {
        boolean productExsist = false;
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId().equals(product.getId())) {

                productExsist = true;
            }
        }

        if (!productExsist){
            productList.add(product);
        }

    }


}

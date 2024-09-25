import java.util.ArrayList;
import java.util.List;

public class Tusk1 {

    public static void main(String[] args) {
        Product product = new Product();
        Product product1 = new Product();
        Product product2 = new Product();
        Product product3 = new Product();
        Product product4 = new Product();
        Product product5 = new Product();
        Product product6 = new Product();
        Product product7 = new Product();
        Product product8 = new Product();
        Product product9 = new Product();

        product.setName("Яблоко");
        product.setProductId(0);

        product1.setName("Банан");
        product1.setProductId(1);

        product2.setName("Арбуз");
        product2.setProductId(2);

        product3.setName("Виноград");
        product3.setProductId(3);

        product4.setName("Слива");
        product4.setProductId(4);

        product5.setName("Абрикос");
        product5.setProductId(5);

        product6.setName("Вишня");
        product6.setProductId(6);

        product7.setName("Клубника");
        product7.setProductId(7);

        product8.setName("Груша");
        product8.setProductId(8);

        product9.setName("Апельсин");
        product9.setProductId(9);

        List<Product> productList = new ArrayList<>();

        productList.add(product);
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        productList.add(product4);
        productList.add(product5);
        productList.add(product6);
        productList.add(product7);
        productList.add(product8);
        productList.add(product9);

        System.out.println(productList);
        System.out.println(productList.size()); // получили 10

        productList.get(1).setProductId(0);// меняем айди второго продукта на 0
        System.out.println(productList);// проверяем
        

    }

}

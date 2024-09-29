import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Tusk3 {

    public static void main(String[] args) {

        Product product = new Product("Яблоко", 0);
        Product product1 = new Product("Банан", 1);
        Product product2 = new Product("Арбуз", 2);
        Product product3 = new Product("Виноград", 3);
        Product product4 = new Product("Слива", 4);

        List<Product> productList = new ArrayList<>();

        productList.add(product);
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        productList.add(product4);

       String first = productList.get(0).getName();
       System.out.println(first);

       int last = productList.size();
       System.out.println(last);

       productList.get(4).setName(first);
       System.out.println(productList.get(4));

        Optional<Product> prod = productList.parallelStream().findAny();// сделать паралельным стримом
        Product x = prod.orElse(new Product("Манго", 5));
        System.out.println(x);

        Optional<Product> prod1 = productList.stream().findFirst();
        Product pro = prod1.orElseThrow(()-> new RuntimeException("error"));
        System.out.println(pro);









    }

}
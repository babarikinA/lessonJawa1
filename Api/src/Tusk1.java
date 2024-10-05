import java.util.ArrayList;
import java.util.List;

public class Tusk1 {

    public static void main(String[] args) {

        Product product = new Product("Яблоко", 0);
        Product product1 = new Product("Банан", 1);
        Product product2 = new Product("Арбуз", 2);
        Product product3 = new Product("Виноград", 3);
        Product product4 = new Product("Слива", 4);
        Product product5 = new Product("Абрикос", 5);
        Product product6 = new Product("Вишня", 6);
        Product product7 = new Product("Клубника", 7);
        Product product8 = new Product("Груша", 8);
        Product product9 = new Product("Апельсин", 9);

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

        productList.get(1).setProductId(0);
        System.out.println(productList);

        productList.stream()
                .filter(i -> i.getProductId() != 0)
                .skip(5)                          // При этом фильтрация и все последующие опреации должны выполняться с 5 продукта в коллекции
                .sorted(new Compar())               //   В этой же цепочке вызовов методов выполнить сортировку имени проектов по возрастанию.
                .distinct()                        //  В этой же цепочке вызовов методов удалите все дубликаты.
                .forEach((p) -> {// -- не пониаю как использовать в данной ситуции стринг билдер
                    StringBuilder f = new StringBuilder(p.getName());
                    System.out.println(f.reverse());
                });
        System.out.println(productList);
    }
}




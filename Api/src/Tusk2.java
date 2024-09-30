import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Tusk2 {

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

        productList.get(productList.size() - 1).setProductId(0);  // меняем айди последнего продукта на 0
        System.out.println(productList);                        // проверяем

        productList = productList.stream()
                .filter(i -> i.getProductId() != 0)   //      С помощью Stream API отфильтровать продукты по условию productId не ровно 0.
                .limit(4)                    //           При этом фильтрация и все последующие опреации должны выполняться только для первых 4 продуктов в коллекции
                .distinct()                         //          В этой же цепочке вызовов методов удалите все дубликаты.
                .sorted(new Compar())              //           В этой же цепочке вызовов методов выполнить сортировку имени проектов по возрастанию.
                .collect(Collectors.toList());
        System.out.println(productList);
    }

}

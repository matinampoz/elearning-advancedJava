package ch7.compare;

import java.util.*;
import java.util.stream.Collectors;

public class ProductDemo {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products = Arrays.asList(
                new Product("Milk", 2.20, 2),
                new Product("Eggs", 1.5, 5),
                new Product("Honey", 8.30, 3),
                new Product("Oranges", 3.5, 2)
        );

        //sort products by using Comparable
        Collections.sort(products);
        System.out.println("1-sort products by using Comparable");
        products.forEach(System.out::println);

        System.out.println();

        //sort products by using Comparator
        //Anonymous class
        products.sort(new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getQuantity() - o2.getQuantity();
            }
        });
        System.out.println("2-sort products by using Comparator");
        products.forEach(System.out::println);

        System.out.println();

        //sort products with Lambda
        products.sort((p1, p2) -> p1.getQuantity() - p2.getQuantity());
        //2ος τροπος
        products.sort(Comparator.comparingInt(Product::getQuantity));
        System.out.println("3-sort products with Lambda");
        products.forEach(System.out::println);

        System.out.println();

        //Reversed Sort by Price
        products.sort(Comparator.comparingDouble(Product::getPrice).reversed());
        System.out.println("4-Reversed Sort by Price");
        products.forEach(System.out::println);

        System.out.println();

        //Sort with streams, δεν επηρεαζεται η αρχικη λίστα
        List<Product> sortedproducts = products
                .stream()
                .sorted(Comparator.comparingInt(Product::getQuantity))
                .collect(Collectors.toList());
        System.out.println("5-Sort with streams");
        sortedproducts.forEach(System.out::println);

        System.out.println();

        //το στριμ φιλτραρει ως προς το quantity = 2, επιστρεφει στριμ(κανει map) ως προς το description - επιστρεφει δηλ μονο το description και τελος κανει collect το description απο το pipeline και το βαζει σε μία λιστα sortedProductsByPrice
        List<String> sortedProductsByPrice = products
                .stream()
                .filter(product -> product.getQuantity() == 2)
                .sorted(Comparator.comparingDouble(Product::getPrice))
                .map(Product::getDescription)
                .collect(Collectors.toList());
        System.out.println("6-Sort with streams");
        sortedProductsByPrice.forEach(System.out::println);
    }
}

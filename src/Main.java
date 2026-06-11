import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        List<Product> products = new ArrayList<>();
        products.add(new Product("Libro Java", "Books", 120.0));
        products.add(new Product("Pannolini Pampers", "Baby", 30.0));
        products.add(new Product("Macchinina", "Boys", 50.0));
        products.add(new Product("Romanzo Fantasy", "Books", 80.0));
        products.add(new Product("Felpa Ragazzi", "Boys", 40.0));



        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("Mario Rossi", 1));
        customers.add(new Customer("Luca Bianchi", 2));
        customers.add(new Customer("Anna Verdi", 2));


        List<Order> orders = new ArrayList<>();

        orders.add(new Order(
                "DELIVERED",
                LocalDate.of(2021, 2, 10),
                LocalDate.of(2021, 2, 15),
                List.of(products.get(0), products.get(2)),
                customers.get(1)
        ));

        orders.add(new Order(
                "PENDING",
                LocalDate.of(2021, 3, 5),
                LocalDate.of(2021, 3, 12),
                List.of(products.get(1)),
                customers.get(0)
        ));

        orders.add(new Order(
                "DELIVERED",
                LocalDate.of(2021, 1, 20),
                LocalDate.of(2021, 1, 25),
                List.of(products.get(3), products.get(4)),
                customers.get(2)
        ));


        List<Product> ex1 = products.stream()
        .filter(p -> p.getCategory().equalsIgnoreCase("Books"))
        .filter(p->p.getPrice()>100).toList();
        System.out.println("\nesercizio 1");
ex1.forEach(System.out::println);

List<Order> ex2=orders.stream()
        .filter(order -> order.getProducts()
                .stream().anyMatch(product -> product.getCategory().equalsIgnoreCase("baby"))).toList();
        System.out.println("\nesercizio 2");
        ex2.forEach(System.out::println);
        List<Product> ex3 = products.stream()
                .filter(product -> product.getCategory().equalsIgnoreCase("boys"))
                .map(p -> new Product(
                        p.getName(),
                        p.getCategory(),
                        p.getPrice() * 0.9
                ))
                .toList();
        System.out.println("\nesercizio 3");
        ex3.forEach(System.out::println);
        List<Order> ex4 = orders.stream()
                .filter(order ->
                order.getCustomer().getTier() == 2 &&
                        order.getOrderDate().isAfter(LocalDate.of(2021, 2, 1)) &&
                        order.getOrderDate().isBefore(LocalDate.of(2021, 4, 1))
        )

                .toList();

        System.out.println("\nesercizio 3");
        ex4.forEach(System.out::println);

    }
}

import java.time.LocalDate;
import java.util.List;
import java.util.Random;

public class Order {
    private final int id ;
    private  String status;
    private  LocalDate orderDate;
    private  LocalDate deliveryDate;
    private  List<Product> products;
    private  Customer customer;
    private Random rnd=new Random();
    public Order( String status, LocalDate orderDate, LocalDate deliveryDate,
                 List<Product> products, Customer customer) {
        this.id = rnd.nextInt(1, 1000);
        this.status = status;
        this.orderDate = orderDate;
        this.deliveryDate = deliveryDate;
        this.products = products;
        this.customer = customer;
    }
    public int getId() {
        return id;
    }

    public String getStatus() {
        return status;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }

    public List<Product> getProducts() {
        return products;
    }

    public Customer getCustomer() {
        return customer;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", status='" + status + '\'' +
                ", orderDate=" + orderDate +
                ", deliveryDate=" + deliveryDate +
                ", products=" + products +
                ", customer=" + customer +
                '}';
    }
}

import java.util.List;
import java.util.Random;

public class Product {
    private final int id;
    private String name;
    private String category;
    private double price;

    private Random rnd=new Random();

    public Product ( String name,String category,double price){
        this.id = rnd.nextInt(1, 1000);
        this.name=name;
        this.category=category;
        this.price=price;
    }

    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getCategory(){
        return category;
    }
    public double getPrice(){
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                '}';
    }
}

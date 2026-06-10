import java.util.Random;

public class Customer {
    private final int id;
    private String name;
    private Integer tier;
    private Random rnd=new Random();
    public Customer(String name, Integer tier){
        this.id = rnd.nextInt(1, 1000);
        this.name=name;
        this.tier=tier;
    }
    public int getId(){
        return id;
    }
    public  String getName(){
        return name;
    }
    public Integer getTier(){
        return tier;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", tier=" + tier +
                '}';
    }
}

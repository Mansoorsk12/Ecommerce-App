import java.util.Date;

public class Order {
    private double amount;
    private Date date;

    public Order(double amount) {
        this.amount = amount;
        this.date = new Date();
    }

    public void printOrder() {
        System.out.println("Order placed on: " + date);
        System.out.println("Order amount: Rs." + amount);
    }
}

class Order {
    String item;
    int quantity;

    Order(String item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }

    double getTotal() {
        return quantity * 100;
    }
}

public class OrderMain {
    public static void main(String[] args) {
        Order o = new Order("Keyboard", 2);
        System.out.println("Total: " + o.getTotal());
    }
}

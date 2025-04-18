class Customer {
    String name;
    int units;

    Customer(String name, int units) {
        this.name = name;
        this.units = units;
    }

    double calculateBill() {
        return units * 7.5;
    }
}

public class Bill {
    public static void main(String[] args) {
        Customer c = new Customer("Riya", 120);
        System.out.println("Bill: " + c.calculateBill());
    }
}

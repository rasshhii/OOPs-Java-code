class Account {
    String name;
    double balance;

    Account(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        if(balance >= amount) {
            balance -= amount;
        }
    }

    void display() {
        System.out.println(name + " - Balance: " + balance);
    }
}

public class Bank {
    public static void main(String[] args) {
        Account a = new Account("Rashi", 1000);
        a.deposit(500);
        a.withdraw(200);
        a.display();
    }
}

class Calculator {
    double add(double a, double b) {
        return a + b;
    }

    double subtract(double a, double b) {
        return a - b;
    }

    double multiply(double a, double b) {
        return a * b;
    }

    double divide(double a, double b) {
        return b != 0 ? a / b : 0;
    }
}

public class CalcMain {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println(c.add(5, 3));
        System.out.println(c.subtract(10, 2));
    }
}

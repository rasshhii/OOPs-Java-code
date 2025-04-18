class Temp {
    double toFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    double toCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }
}

public class Convert {
    public static void main(String[] args) {
        Temp t = new Temp();
        System.out.println(t.toFahrenheit(30));
        System.out.println(t.toCelsius(86));
    }
}

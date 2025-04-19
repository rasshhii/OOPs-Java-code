public class OverloadExample {
    void show() {
        System.out.println("No arguments");
    }

    void show(int a) {
        System.out.println("One int argument: " + a);
    }

    void show(String s) {
        System.out.println("One String argument: " + s);
    }

    public static void main(String[] args) {
        OverloadExample obj = new OverloadExample();
        obj.show();
        obj.show(10);
        obj.show("Hello");
    }
}

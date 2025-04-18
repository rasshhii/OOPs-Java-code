class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    boolean canVote() {
        return age >= 18;
    }
}

public class VoteCheck {
    public static void main(String[] args) {
        Person p = new Person("Rashi", 17);
        System.out.println(p.canVote() ? "Eligible" : "Not Eligible");
    }
}

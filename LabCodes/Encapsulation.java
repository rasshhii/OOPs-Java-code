class Person {
    private String name;
    private int age;


    public String getName() {
        return name;
    }

    
    public void setName(String name) {
        this.name = name;
    }

    
    public int getAge() {
        return age;
    }

    
    public void setAge(int age) {
        this.age = age;
    }
}

public class EncapsulationExample {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("Rashi");
        p.setAge(18);
        System.out.println("Name: " + p.getName());
        System.out.println("Age: " + p.getAge());
    }
}

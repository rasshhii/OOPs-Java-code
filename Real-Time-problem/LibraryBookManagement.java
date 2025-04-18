class Book {
    String title;
    String author;
    int copies;

    Book(String title, String author, int copies) {
        this.title = title;
        this.author = author;
        this.copies = copies;
    }

    void display() {
        System.out.println(title + " by " + author + " - " + copies + " copies");
    }
}

public class Library {
    public static void main(String[] args) {
        Book b1 = new Book("Java Basics", "Ravi", 5);
        Book b2 = new Book("OOP Concepts", "Sneha", 3);
        b1.display();
        b2.display();
    }
}

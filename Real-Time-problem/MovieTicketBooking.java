class Ticket {
    String movie;
    int seat;

    Ticket(String movie, int seat) {
        this.movie = movie;
        this.seat = seat;
    }

    void showTicket() {
        System.out.println("Movie: " + movie + ", Seat: " + seat);
    }
}

public class BookTicket {
    public static void main(String[] args) {
        Ticket t = new Ticket("Avengers", 25);
        t.showTicket();
    }
}

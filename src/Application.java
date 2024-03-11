public class Application {
    public static void main(String[] args) {
        BookingSystem bookingSystem1 = new BookingSystem(6);
        bookingSystem1.createVehicles();
        bookingSystem1.printStatus();
    }
}

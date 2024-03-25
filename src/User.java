import java.util.ArrayList;

public class User {
    private double balance;
    private boolean isUserDone = false;
    private ArrayList<Booking> bookings;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public boolean getisUserDone(){
        return isUserDone;
    }
    public void setisUserDone(boolean isUserDone) {
        this.isUserDone = isUserDone;
    }
    public void addBookings(Booking booking) {
        bookings.add(booking);
    }
    public void displayBookedVehicles(Booking booking){
        System.out.println(booking);
    }

}

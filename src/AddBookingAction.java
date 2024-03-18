import java.util.ArrayList;
import java.util.List;
public class AddBookingAction extends Action{
    private Booking myBooking;

    public AddBookingAction(Booking myBooking){
        this.myBooking = myBooking;
    }

    @Override
    public String execute(BookingSystem bookingSystem) {
        bookingSystem.addBookings(myBooking);
        return myBooking + " is successfully added to the Booking System!";
    }

    public String menuDescription() {
        return "Add the following vehicle to the Booking System:\n" + myBooking;
    }

}
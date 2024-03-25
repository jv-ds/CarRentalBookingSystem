public class AddBookingAction extends Action{
    private Booking myBooking;
    private User myUser;

    public AddBookingAction(Booking myBooking){
        this.myBooking = myBooking;
    }

    @Override
    public String execute(User myUser) {
        myUser.addBookings(myBooking);
        return myBooking + " is successfully added to the Booking System!";
    }

    public String menuDescription() {
        return "Add the following vehicle to the Booking System:\n" + myBooking;
    }

}
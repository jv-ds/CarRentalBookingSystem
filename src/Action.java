import java.util.ArrayList;
public interface Action {
    String execute(User user, BookingSystem bookingSystem);

    String menuDescription();
}

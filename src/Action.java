import java.util.ArrayList;
public abstract class Action {

    public String execute(BookingSystem bookingSystem){         //double check type of method!
        return "Test1";
    }

    public abstract String execute(User myUser);

    public String menuDescription(){           //double check type of method!
        return "Test2";
    }

}

import java.util.ArrayList;
import java.util.List;

public class BookingSystem {
    private Vehicle[] vehicles;

    public BookingSystem(int size){
        vehicles = new Vehicle[size];          //creates array of size 6 for vehicles
        //bookings = new ArrayList<>();
    }

    public void createVehicles(){
        vehicles[0] = new Sedan("Lexus", 2023, 200.00,500, "ELECTRIC");
        vehicles[1] = new Sedan("BMW", 2022, 150, 600, "PETROL");
        vehicles[2] = new SUV("Tesla", 2023, 300, 5, "ELECTRIC");
        vehicles[3] = new SUV("Mercedes", 2020, 500, 7, "DIESEL");
        vehicles[4] = new Truck("Ford", 2019, 400, 1.0);
        vehicles[5] = new Truck("Volkswagen", 2020, 450, 1.2);
    }

    public void displayVehicles(){
        for(int i = 0; i < vehicles.length; i++){
            System.out.printf("\nBooking Item (%s)\n",i+1);     //displays booking item number based on vehicle in array
            System.out.println(vehicles[i].toString());
        }
    }

    public void printStatus() {
        System.out.println("Welcome to FIT2099 Booking System");
        createVehicles();
        addBookingForVehicle();
        System.out.println("Thank you for visiting FIT2099 Booking System!");
        //System.out.println("\n\nThank you for visiting FIT2099 Booking System!\n");
    }


    public void addBookingForVehicle() {
        while(true){
            List<Action> actions = new ArrayList<>();
            //TODO: create add booking actions by looping through all available vehicles here, see hint message above.
            for(Vehicle loopvehicle: vehicles){
                Booking currBooking = new Booking(loopvehicle);
                AddBookingAction curraddBookingAction = new AddBookingAction(currBooking); //we want to be generated from vehicle
                //addBookings(currBooking);
                actions.add(curraddBookingAction);
            }

            System.out.println("#########################################");
            Action curraction = Menu.showMenu(actions);
            System.out.println(curraction.execute(this));
            break;
        }
    }


}
public class BookingSystem {
    private Vehicle[] vehicles;



    public void printStatus() {
        System.out.println("Welcome to FIT2099 Booking System");
        System.out.println("Thank you for visiting FIT2099 Booking System!");

        Vehicle vehicle1 = new Sedan("Honda", 2014, 14000.00, 400, "PETROL");
        System.out.println(vehicle1.toString());

        Vehicle vehicle2 = new SUV("Honda", 2014, 14000.00, 5, "PETROL");
        System.out.println(vehicle2.toString());

        Vehicle vehicle3= new Truck("Ford", 2019, 400.00, 1.0);
        System.out.println(vehicle3.toString());
    }


}
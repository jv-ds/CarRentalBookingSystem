public class Booking {
    private Vehicle bookingVehicle;
    public Booking(Vehicle vehicle){
        this.bookingVehicle = vehicle;
    }
    @Override
    public String toString(){
        return bookingVehicle.toString();
    }
}

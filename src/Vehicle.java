public class Vehicle {
    private String brand;
    private int year;
    private double price;

    // Constructor for vehicle
    public Vehicle(String brand, int year, double price){
        this.brand = brand;
        this.year = year;
        this.price = price;
    }

    @Override
    public String toString() {
        return  "\nBrand: " + brand +
                "\nYear: " + year +
                "\nPrice: " + String.format("%.2f", price) + " per day"
                ;
    }
}

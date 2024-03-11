public class Truck extends Vehicle{
    private double loading;

    public Truck (String brand, int year, double price, double loading){
        super(brand,year, price);
        this.loading = loading;
    }

    @Override
    public String toString(){
        return super.toString() +
                "\nLoading: " + loading;
    }

}

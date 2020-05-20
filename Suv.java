
public class Suv extends Vehicle {
    // constructor inheriting all the methods and properties of Vehicle parent class
    public Suv(String VIN, double wholesaleCost, double retailPrice, int modelYEar, String make, String model,
            String color, VehicleClassification vehicleClass) {
        super(VIN, wholesaleCost, retailPrice, modelYEar, make, model, color, vehicleClass);
    }
}
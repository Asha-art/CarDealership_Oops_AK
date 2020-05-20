
public class Car extends Vehicle {
    // constructor inheriting all the methods and properties of Vehicle parent class
    public Car(String VIN, double wholesaleCost, double retailPrice, int modelYEar, String make, String model,
            String color, VehicleClassification vehicleClass) {
        super(VIN, wholesaleCost, retailPrice, modelYEar, make, model, color, vehicleClass);
    }

    @Override
    public double getTargetMargin() {
        // return this.getRetailPrice() - this.getWholesaleCost() - 1000;
        return super.getTargetMargin() - 1000;
    }

}
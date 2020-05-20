public class LightTruck extends Vehicle {
    private long towingCapacity, grossCombinedWeight, truckWeight;
    private boolean isFourWheeled;

    public LightTruck(String VIN, double wholesaleCost, double retailPrice, int modelYear, String make, String model,
            String color, long towingCapacity, long grossCombinedWeight, long truckWeight, boolean isFourWheeled,
            VehicleClassification vehicleClass) {
        super(VIN, wholesaleCost, retailPrice, modelYear, make, model, color, vehicleClass);
        this.towingCapacity = towingCapacity;
        this.grossCombinedWeight = grossCombinedWeight;
        this.truckWeight = truckWeight;
        this.isFourWheeled = isFourWheeled;
    }

    // Getters
    public long getTowingCapacity() {
        return towingCapacity;
    }

    public long getTruckWeight() {
        return truckWeight;
    }

    public long getGrossCombinedWeight() {
        return grossCombinedWeight;
    }

    public boolean getIsFourWheeled() {
        return isFourWheeled;
    }

    // Setters
    public void setTowingCapacity(long towingCapacity) {
        this.towingCapacity = towingCapacity;
    }

    public void setTruckWeight(long weight) {
        this.truckWeight = weight;
    }

    // Method to automatically calculate GCW if no params given
    public void setGrossCombinedWeight() {
        this.grossCombinedWeight = this.truckWeight + this.towingCapacity;
    }

    // Method overload to manually set GCW if param is provided
    public void setGrossCombinedWeight(long weight) {
        this.grossCombinedWeight = weight;
    }

    public void set(boolean isFourWheeled) {
        this.isFourWheeled = isFourWheeled;
    }

    @Override
    public String toString() {
        // Get the string output from our superclass method Ex: 2018 Kia Sorrento and
        // store that in a variable for us to use
        String str = super.toString();
        if (isFourWheeled) {
            str += ", (4 Wheel Drive)";
        }
        return str;
    }
}
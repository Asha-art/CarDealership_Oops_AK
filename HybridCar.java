
public class HybridCar extends Car {

    private int batteryLife, MPG;
    private String chargerType;

    public HybridCar(String VIN, double wholesaleCost, double retailPrice, int modelYEar, String make, String model,
            String color, int batteryLife, int MPG, String chargerType, VehicleClassification vehicleClass) {
        super(VIN, wholesaleCost, retailPrice, modelYEar, make, model, color, vehicleClass);
        // TODO Auto-generated constructor stub
        this.batteryLife = batteryLife;
        this.MPG = MPG;
        this.chargerType = chargerType;
    }

    // getters
    public int getBatteryLife() {
        return batteryLife;
    }

    public int getMpg() {
        return MPG;
    }

    public String getChargerType() {
        return chargerType;
    }

    // setters
    public void setBatteryLife(int batteryLife) {
        this.batteryLife = batteryLife;
    }

    public void setMpg(int MPG) {
        this.MPG = MPG;
    }

    public void setChargerType(String chargerType) {
        this.chargerType = chargerType;
    }

}
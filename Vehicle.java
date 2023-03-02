
public class Vehicle {
    private int fuel;
    private String topSpeed;
    protected void setFuel(int i) {
        this.fuel = i;
    }
    protected void setTopSpeed(String n) {
        this.topSpeed = n;
    }
    protected int getFuel() {
        return this.fuel;
    }
    protected String getTopSpeed() {
        return this.topSpeed;
    }
    public void showInfo() {
        System.out.println("Fuel is " + getFuel() + " litre and Top Speed is " + getTopSpeed() + " m/s.");
    }
}

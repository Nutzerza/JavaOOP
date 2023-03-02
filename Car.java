
public class Car extends Vehicle {
    private String typeEngine;
    public void setTypeEngine(String t) {
        this.typeEngine = t;
    }
    public String getTypeEngine() {
        return this.typeEngine;
    }
    public void showCarInfo() {
        System.out.println("Car engine is " + getTypeEngine() + ".");
        showInfo();
    }
    public void setCarInfo(int s, String t, String y) {
        setFuel(s);
        setTopSpeed(t);
        setTypeEngine(y);
    }
    public void move() {
        if ((getFuel()-50)<0) {
            System.out.println("Please add fuel.");
        }
        else {
            setFuel(getFuel()-50);
            System.out.println("Move.");
        }
    }
}

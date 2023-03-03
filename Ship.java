
public class Ship extends Vehicle implements Floatable {
    public Ship() {
        this(0.0);
    }
    public Ship(double fuel) {
        super(fuel);
    }
    public void move() {
        move(1);
    }
    public void move(int distance) {
        for(int i=1; i<=distance; i++) {
            fl0at();
            if (getFuel()<50) {
                break;
            }
        }
    }
    @Override
    public void fl0at() {
        if (getFuel() >= 50) {
            setFuel(getFuel() - 50);
            System.out.println("Ship moves");
        }
        else {
            System.out.println("Fuel is not enough.");
        }
    }
    @Override
    public void startEngine() {
        if (getFuel() >= 10) {
            setFuel(getFuel() - 10);
            System.out.println("Engine starts.");
        }
        else {
            System.out.println("Fuel is not enough.");
        }
    }
    @Override
    public void stopEngine() {
        System.out.println("Engine stops");
    }
    @Override
    public void honk() {
        System.out.println("Shhhhh");
    }
}

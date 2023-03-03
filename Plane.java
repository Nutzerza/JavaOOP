
public class Plane extends Vehicle implements Flyable {
    private String airline;
    private String boeing;
    private static final int MAX_FLYER;
    public Plane() {
        this(0.0, "", "");
    }
    public Plane(double fuel, String airline, String boeing) {
        super(fuel);
        this.airline = airline;
        this.boeing = boeing;
    }
    public void setAirline(String airline) {
        this.airline = airline;
    }
    public String getAirline() {
        return this.airline;
    }
    public void setBoeing(String boeing) {
        this.boeing = boeing;
    }
    public String getBoeing() {
        return this.boeing;
    }
}

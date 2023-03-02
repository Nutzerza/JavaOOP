
public class Programmer extends Employee {
    private int happiness;
    public void coding(String str) {
        if (getEnergy() >= 30) {
            System.out.println("Your code is " + str);
        }
        else {
            System.out.println("Error Error Error");
        }
        setEnergy(getEnergy()-30);
        setHappiness(getHappiness()-30);
    }
    public void coding(char str) {
        int num = 1;
        if (getEnergy() >= 30) {
            if (this instanceof SeniorProgrammer) {
                System.out.println("I'm coding about " + str);
            }
            else {
                System.out.println("Your code is " + str);
                num = 6;
            }
        }
        else {
            System.out.println("Error Error Error");
        }
        setEnergy(getEnergy()-(5*num));
        setHappiness(getHappiness()-(5*num));
    }
    public int getHappiness() {
        return this.happiness;
    }
    public void setHappiness(int happiness) {
        this.happiness = happiness;
    }
}
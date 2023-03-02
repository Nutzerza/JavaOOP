import java.util.*;
public class MoneyPerOil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How much oil : ");
        double oil = input.nextDouble();
        System.out.println("Money to pay for oil : " + (oil*30));
    }
}

import java.util.*;
public class BuyComputer {
    public static void main(String[] args) {
        double price = 375.99;
        Scanner input = new Scanner(System.in);
        System.out.println("Which size monitor do you want? (38/43)");
        int size = input.nextInt();
        System.out.println("Do you want DVD-ROM? (1 is Yes / 2 is No)");
        int dvd = input.nextInt();
        System.out.println("Do you want printer? (1 is Yes / 2 is No)");
        int printer = input.nextInt();
        System.out.println("====== Your order ======");
        System.out.println("computer ----> 375.99$");
        if (size == 38) {
            System.out.println("38'Monitor ----> 75.99$");
            price += 75.99;
        } else if (size == 43) {
            System.out.println("73'Monitor ----> 99.99$");
            price += 99.99;
        } if (dvd == 1) {
            System.out.println("DVD-Rom ----> 65.99$");
            price += 65.99;
        } if (printer == 1) {
            System.out.println("Printer ----> 125.00$");
            price += 120;
        }
        System.out.println("====== Total price ----> " + price + " ======");
    }
}

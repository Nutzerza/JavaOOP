import java.util.*;
public class SqureArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input your length : ");
        double length = input.nextDouble();
        System.out.println("This is your squre area : " + (Math.pow(length, 2)));
    }
}
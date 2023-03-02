import java.util.*;
public class HourMinToSec {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input your hour : ");
        int hour = input.nextInt();
        System.out.print("Input your min : ");
        int minute = input.nextInt();
        System.out.println("This is your second : " + ((hour*3600)+(minute*60)));
    }
}
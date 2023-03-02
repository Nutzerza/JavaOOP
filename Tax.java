import java.util.*;
public class Tax{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input money : ");
        double money = input.nextDouble();
        if (money > 50000){
            System.out.println(money*1.1);
        } else if (money > 0 && money <= 50000) {
            System.out.println(money*1.05);
        } else {
            System.out.println("Pls Input money > 0");
        }
    }
}

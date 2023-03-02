import java.util.*;
public class Bank{
    public static void main(String[] args) {
        Scanner inputMoney = new Scanner(System.in);
        Scanner inputType = new Scanner(System.in);
        System.out.print("Input your money : ");
        double money = inputMoney.nextDouble();
        System.out.print("Input your type (A, B, C or X) : ");
        String bankType = inputType.nextLine();
        if (money > 0) {
            switch (bankType) {
                case "A": case "a": System.out.println(money*1.015);
                    break;
                case "B": case "b": System.out.println(money*1.02);
                    break;
                case "C": case "c": System.out.println(money*1.015);
                    break;
                case "X": case "x": System.out.println(money*1.05);
                    break;
                default: System.out.println("Pls Enter only A B C X");
            }
        } else {
            System.out.println("Pls Enter Money >= 0");
        }
        
    }
}

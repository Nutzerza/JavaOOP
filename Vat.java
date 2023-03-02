import java.util.*;
public class Vat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input your cost : ");
        int cost = input.nextInt();
        System.out.println("This is cost sum vat : " + (cost*1.07));
    }
}
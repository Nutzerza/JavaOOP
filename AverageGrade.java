import java.util.*;
public class AverageGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Score X : ");
        double x = input.nextDouble();
        System.out.print("Score Y : ");
        double y = input.nextDouble();
        System.out.print("Score Z : ");
        double z = input.nextDouble();
        System.out.println("Average score is " + ((x+y+z)/3));
    }
}
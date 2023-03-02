import java.util.*;
public class Salary{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double salary=0, bonus;
        /**Get data**/
        System.out.print("Please inser your name : ");
        String name = input.nextLine();
        System.out.print("Please insert your age : ");
        int age = input.nextInt();
        System.out.print("Please insert number of working day : ");
        int workDay = input.nextInt();
        System.out.print("Please insert number of absent day : ");
        int absDay = input.nextInt();
        System.out.print("Please insert your weight : ");
        double weight = input.nextDouble();

        if (age<21 && age>60) {
            System.out.println("Age must between 21 and 60");
        } else if (weight<10) {
            if (weight < 0) {
                System.out.println("Weight must be positive");
            } else {
                System.out.println("Underweight");
            }
        } else if (workDay<0 || absDay<0) {
            System.out.println("Day must be positive num");
        } else {
            if (age>=21 && age<=30) {
                salary = (workDay * 300) - (absDay * 50);
            } else if (age>=31 && age<=40) {
                salary = (workDay * 500) - (absDay * 50);
            } else if (age>41 && age<=50) {
                salary = (workDay * 1000) - (absDay *25);
            } else if (age>51 && age<=60) {
                salary = (workDay * 5000);
            }

            if (weight>=10 && weight<=60) {
                bonus = 5000;
            } else if (weight>=61 && weight<=90) {
                bonus = 5000 - ((weight-60)*10);
            } else {
                bonus = 0;
            }

            System.out.println("Hi, "+name);
            System.out.println("Your salary is "+salary+" Baht");
            System.out.println("Your salary and bonus is "+(salary+bonus)+" Baht");
        }
    }
}
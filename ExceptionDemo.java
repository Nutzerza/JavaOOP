
public class ExceptionDemo {
    public static void main(String[] args) {
        try{
            double numA = Double.parseDouble(args[0]);
            double numB = Double.parseDouble(args[1]);
            double numC = Double.parseDouble(args[2]);
            double x1 = (-numB+Math.sqrt((numB*numB)-(4*numA*numC)))/(2*numA);
            double x2 = (-numB-Math.sqrt((numB*numB)-(4*numA*numC)))/(2*numA);
            System.out.println("x1: " + x1);
            System.out.println("x2: " + x2);
        } catch(NumberFormatException ne) {
            System.out.println("Please input data in number format only.");
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Please enter 3 numbers as a, b, and c respectively.");
        }
    }
}

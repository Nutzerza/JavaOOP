
public class Main {

    public static void main(String[] args) throws WithdrawException {
        try {
        CheckingAccount acct1 = new CheckingAccount(1000, "A001", 500);
        Customer cust = new Customer("Sompong", "Sookjai", acct1);
        cust.getAcct().deposit(500);
        cust.getAcct().withdraw(1800);
        cust.getAcct().withdraw(300);
        cust.getAcct().deposit(1000);
        cust.getAcct().withdraw(200);
        } catch (WithdrawException we) {
            System.out.println(we.toString());
        } finally {
            System.out.println("Thank you.");
        }
    }
}

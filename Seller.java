
public class Seller extends Employee {
    public Food sell(Employee e) {
        if (Food.getPrice() > e.getWallet().getBalance()) {
            System.out.println("Your money is not enough.");
            return null;
        }
        else {
            getWallet().setBalance(getWallet().getBalance()+Food.getPrice());
            e.getWallet().setBalance(e.getWallet().getBalance()-Food.getPrice());
            Food f = new Food();
            return f;
        }
    }
}

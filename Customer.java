//import java.util.*;
public class Customer {

    private String firstName;
    private String lastName;
//    2
    private Account acct[];
    private int numOfAccount;
//    3
//    private ArrayList<Account> acct;
    public Customer() {
        this("", "");
    }
    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
//        2
        acct = new Account[5];
//        3
//        acct = new ArrayList<Account>();
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getFirstName() {
        return this.firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getLastName() {
        return this.lastName;
    }
    public void addAccount(Account acct) {
//        2
        this.acct[getNumOfAccount()] = acct;
        this.numOfAccount += 1;
//        3
//        this.acct.add(acct);
    }
    public Account getAccount(int index) {
//        2
        return this.acct[index];
//        3
//        return this.acct.get(index);
    }
    public int getNumOfAccount() {
//        2
        return this.numOfAccount;
//        3
//        return this.acct.size();
    }
    @Override
    public String toString() {
        return getFirstName() + " " + getLastName() + " " + getNumOfAccount();
    }
    public boolean equals(Customer c) {
        return getFirstName().equals(c.getFirstName()) & getLastName().equals(c.getLastName());
    }
}   
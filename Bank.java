
public class Bank {
//    1
    private Account acct[];
    private int numAcct;
    public Bank() {
        acct = new Account[10];
    }
    public void addAccount(Account ac) {
        acct[getNumAccount()] = ac;
        this.numAcct += 1;
    }
    public Account getAccount(int index) {
        return acct[index];
    }
    public int getNumAccount() {
        return this.numAcct;
        
    }
    
}

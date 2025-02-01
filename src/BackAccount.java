public class BankAccount  {
    private String Owner;
    private double balance;

    public BankAccount (String Owner, double startingBalance){
        this.Owner = Owner;
        this.balance = Math.max (startingBalance, 0);
    }

    public String getOwner (){
        return Owner;
    }
    public double getBalance() {
        return balance;
    }

    public void deposit (double amount) {
        if (amount > 0) {
            this.balance += amount;
        }
    }

    public boolean withdraw (double amount){
        if (amount > 0 && amount <= this.balance){
        this.balance -= amount;
        return true;
        }
    return false;
    }
}

public class BackAccount {
    private String owner;
    private double balance;

    public BackAccount(String owner, int startingBalance) {
        this.owner = owner;
        this.balance = Math.max(startingBalance, 0);
    }
    public String getOwner() {
        return owner;
    }
    public double getBalance() {
        return balance;
    }
    public double deposit(double amount) {
        if (amount > 0) {
            this.balance= this.balance + amount;
            return amount;
        }
        return 0;
    }
    public double withdraw(double amount) {
        if (amount <= this.balance) {
            this.balance = this.balance - amount;
            return amount;
        }
        return 0;
    }


}

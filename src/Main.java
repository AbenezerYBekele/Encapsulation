public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount= new BankAccount("Wonder Woman",2500);
        bankAccount.withdraw(300);
        bankAccount.deposit(500);
        bankAccount.withdraw(1100);

        System.out.println("Owner: "+ bankAccount.getOwner());
        System.out.println("Balance: "+ bankAccount.getBalance());
    }
}

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BackAccount backAccount= new BackAccount("Wonder Woman",2500);
        backAccount.withdraw(300);
        backAccount.deposit(500);
        backAccount.withdraw(1100);

        System.out.println(backAccount.getOwner());
        System.out.println(backAccount.getBalance());


    }
}
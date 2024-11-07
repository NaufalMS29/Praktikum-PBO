public class Main {
    public static void main(String[] args) {
        ATM atm = new ATM("Jakarta");
        ATM.BankAccount account = atm.new BankAccount("0011223344");
        account.displayAccountInfo();
        account.deposit(1000000);
        account.displayAccountInfo();
        account.withdraw(50000);
        account.displayAccountInfo();
    }
}

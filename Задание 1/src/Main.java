public class Main {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Анна");
        BankAccount acc2 = new BankAccount("Игорь");

        acc1.deposit(500);
        acc1.withdraw(100);
        acc1.transfer(acc2, 200);

        System.out.println("Баланс Анны: " + acc1.balance);
        System.out.println("Баланс Игоря: " + acc2.balance);
    }
}

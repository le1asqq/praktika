import java.time.LocalDateTime;

public class BankAccount {
    String ownerName;
    int balance;
    LocalDateTime openedAt;
    boolean isBlocked;

    // Конструктор: только имя, остальное — начальные значения
    public BankAccount(String ownerName) {
        this.ownerName = ownerName;
        this.balance = 0;
        this.openedAt = LocalDateTime.now();
        this.isBlocked = false;
    }

    // Пополнение счёта
    public boolean deposit(int amount) {
        if (isBlocked || amount <= 0) return false;
        balance += amount;
        return true;
    }

    // Снятие денег
    public boolean withdraw(int amount) {
        if (isBlocked || amount <= 0 || amount > balance) return false;
        balance -= amount;
        return true;
    }

    // Перевод на другой счёт
    public boolean transfer(BankAccount otherAccount, int amount) {
        if (isBlocked || otherAccount.isBlocked || amount <= 0 || amount > balance) return false;
        balance -= amount;
        otherAccount.balance += amount;
        return true;
    }
}

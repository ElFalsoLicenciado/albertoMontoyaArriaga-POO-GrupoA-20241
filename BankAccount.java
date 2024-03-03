public class BankAccount {
    private long accountNumber;
    private double amount;
    private char accType;

    public BankAccount(long accountNumber,char accType) {
        this.accountNumber = accountNumber;
        this.accType = accType;
        
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
public class BankAccount {
    private long accountNumber;
    private double amount;
    private char accType;

    public BankAccount(long accountNumber,char accType) {
        this.accountNumber = accountNumber;
        this.accType = accType;
        System.out.printf("Account number: %s & account type: %s %n" ,getAccountNumber(), getAccountType());

    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public char getAccountType(){
        return accType;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
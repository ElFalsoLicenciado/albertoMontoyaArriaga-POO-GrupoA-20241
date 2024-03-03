public class BankAccount {
    private long accountNumber;
    private double amount;
    private char accType;

    public BankAccount(long accountNumber,char accType) {
        this.accountNumber = accountNumber;
        this.accType = accType;
        System.out.printf("New accout: account number: %s & account type: %s %n" ,getAccountNumber(), getAccountType());

    }

    public BankAccount(long accountNumber,char accType, double amount) {
        this.accountNumber = accountNumber;
        this.accType = accType;
        setAmount(amount);
        System.out.printf("New accout: account number: %s, account type: %s & current money: $%s %n" ,getAccountNumber(), getAccountType(),getAmount());
        
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
        if(getAccountType()=='A'){
            if (amount<=50000.00 || amount>=1.00) {
                this.amount = amount;        
            }else{
                System.out.println("Not possible");
            }    
        }else if(getAccountType()=='B'){
            if (amount<=100000.00 || amount>=1.00) {
                this.amount = amount;        
            }else{
                System.out.println("Not possible");
            }    
        
        }else if(getAccountType()=='C'){
            if (amount>=1.00) {
                this.amount = amount;        
            }else{
                System.out.println("Not possible");
            }    
        
        }
    }    
}
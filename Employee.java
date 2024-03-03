public class Employee {
    private String name;
    private String lastName;
    private BankAccount account;
    private boolean status=false;

    public Employee(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
        System.out.printf("Registred employee: %s %s %n", this.name,this.lastName);
    }

    public Employee(String name, String lastName, long accountNumber, char accType, boolean status) {
        this.name = name;
        this.lastName = lastName;
        System.out.printf("Registred employee: %s %s %n", this.name,this.lastName);
        this.account = new BankAccount(accountNumber, accType);
        this.status = status;
    }

    public Employee(String name, String lastName, long accountNumber, char accType, double amount  ,boolean status) {
        this.name = name;
        this.lastName = lastName;
        System.out.printf("Registred employee: %s %s %n", this.name,this.lastName);
        this.account = new BankAccount(accountNumber, accType, amount);
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBankAccount(long accountNumber, char accType, boolean status){
        this.account = new BankAccount(accountNumber, accType);
        this.status = status;
    }

    public String getAccount(){
        String seeAcc = "None";
        if(getStatus()==true){
           seeAcc = "Account number: "+account.getAccountNumber()+", current money: $"+account.getAmount()+" & account type: "+account.getAccountType();
            return seeAcc;
        }
        else{
            return seeAcc;
        }
    }

    private boolean getStatus(){
        return status;
    }

}
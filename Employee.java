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
        if((accType=='A' || accType=='B' || accType=='C') && accountNumber>=1){
            System.out.printf("Registred employee: %s %s %n", this.name,this.lastName);
        this.account = new BankAccount(accountNumber, accType);
        this.status = status;
        } else{
            System.out.println("Invalid account");
        }
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

    public void addFounds(double amount, String c){
        if (getStatus()==true) {
            account.addAmount(amount, c);    
        }else{
            System.out.println("There's no account registred.");
        }
        
    }

    public void takeFounds(double amount, String c){
        if (getStatus()==true) {
            account.takeAmount(amount, c);    
        }else{
            System.out.println("There's no account registred.");
        }
    }

    private boolean getStatus(){
        return status;
    }

}
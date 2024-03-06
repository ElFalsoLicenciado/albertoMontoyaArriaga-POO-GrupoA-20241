import java.util.*;
public class Employee {
    private String name;
    private String lastName;
    private boolean status=false;
    private ArrayList<BankAccount> accounts = new ArrayList<BankAccount> ();

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
        accounts.add(new BankAccount(accountNumber, accType));
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
        accounts.add(new BankAccount(accountNumber, accType));
        this.status = status;
    }

    public String getAccount(int p){
        String seeAcc = "None";
        if(getStatus()==true){
           seeAcc = "Account number: "+accounts.get(p-1).getAccountNumber()+", current money: $"+accounts.get(p-1).getAmount()+" & account type: "+accounts.get(p-1).getAccountType();
            return seeAcc;
        }
        else{
            return seeAcc;
        }
    }

    public void addFounds(int p, double amount, String c){
        if (getStatus()==true) {
            accounts.get(p-1).addAmount(amount, c);   
        }else{
            System.out.println("There's no account registred.");
        }
        
    }

    public void takeFounds(int p,double amount, String c){
        if (getStatus()==true) {
            accounts.get(p-1).takeAmount(amount, c);    
        }else{
            System.out.println("There's no account registred.");
        }
    }

    private boolean getStatus(){
        return status;
    }

}
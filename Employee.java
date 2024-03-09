import java.util.*;

public class Employee {
    private String name;
    private String lastName;
    private ArrayList<BankAccount> accounts = new ArrayList<BankAccount> ();

    public Employee(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
        System.out.printf("%n Registred employee: %s %s %n", this.name,this.lastName);
    }

    public Employee(String name, String lastName, char accType) {
        this.name = name;
        this.lastName = lastName;
        System.out.printf("%n Registred employee: %s %s %n", this.name,this.lastName);
        accounts.add(new BankAccount(accType));

    }

    public Employee (String name, String lastName, char accType, double amount, String con){
        this.name = name;
        this.lastName = lastName;
        System.out.printf("%n Registred employee: %s %s %n", this.name,this.lastName);
        accounts.add(new BankAccount(accType, amount, con));
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

    public void setBankAccount(char accType){
        accounts.add(new BankAccount(accType));
    }

    public String getAccount(int p){
        String seeAcc = "None";
        if(getStatus(p)==true){
           seeAcc = "Account number: "+accounts.get(p-1).getAccountNumber()+", current money: $"+accounts.get(p-1).getAmount()+" & account type: "+accounts.get(p-1).getAccountType();
            return seeAcc;
        }
        else{
            return seeAcc;
        }
    }

    public void setType(int p, char type){
        if(getStatus(p)==true){
        accounts.get(p-1).setType(type);
        }else{
            System.out.println("There's no account.");
        }
    }

    public void addFounds(int p, double amount, String c){
        if (getStatus(p)==true) {
            accounts.get(p-1).addAmount(amount, c);   
        }else{
            System.out.println("There's no account registred.");
        }
        
    }

    public void takeFounds(int p,double amount, String c){
        if (getStatus(p)==true) {
            accounts.get(p-1).takeAmount(amount, c);    
        }else{
            System.out.println("The account is not valid.");
        }
    }

    private boolean getStatus(int p){
        boolean f = accounts.get(p-1).getStatus();
        return f;
    }

}
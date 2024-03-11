import java.util.ArrayList;

public class Employee {
    private String name;
    private String lastName;
    private ArrayList<BankAccount> accounts = new ArrayList<>();
    private ArrayList<BankAccount> invalidAccs = new ArrayList<>();
    private boolean f = false;

    public ArrayList<BankAccount> getInvalidAccs() {
        return invalidAccs;
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

    public boolean getValidity(){
        return f;
    }

    public void setValidity(boolean f){
        this.f=f;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public ArrayList<BankAccount> getAccounts() {
        return accounts;
    }

    public void getFunds(int i) {
        System.out.println(accounts.get(i).getFunds());
    }

    public void showAccounts() {
        int i = 1;

        System.out.printf("| %-3s | %-4s | %-6s | %-8s | %-14s |%n", "#", "ID", "Type", "Status", "Funds");
        for (BankAccount toShow : accounts) {
            System.out.printf("| %-3s | %-4s | %-6s | %-8s | %-14s |%n", i,toShow.getAccNumber(), toShow.getAccType(), toShow.isValidAcc(), toShow.getFunds());
            i ++;
        }
    }

    
}

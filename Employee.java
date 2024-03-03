public class Employee {
    private String name;
    private String lastName;
    private BankAccount account;
    private boolean status=false;

    public Employee(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public Employee(String name, String lastName, long accountNumber, char accType, boolean status) {
        this.name = name;
        this.lastName = lastName;
        this.account = new BankAccount(accountNumber, accType);
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

    public BankAccount getAccount() {
        return account;
    }
}
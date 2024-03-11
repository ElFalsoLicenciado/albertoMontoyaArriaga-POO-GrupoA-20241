import java.util.Random;

public class BankAccount {
    private double funds = 0;
    private int accNumber;
    private char accType;
    private double mxFunds;
    private double mnFunds;
    private boolean validAcc = true;
    private Random r = new Random();

    public BankAccount(){
        accNumber = r.nextInt(1000, 9999);
    }

    public String isValidAcc() {
        String status;
        if(validAcc==true){
            status="Active";
        }else{
            status="Inactive";
        }
        return status;
    }

    public void setValidAcc(boolean validAcc) {
        this.validAcc = validAcc;
    }

    public double getFunds() {
        return funds;
    }

    public int getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(int accNumber) {
        this.accNumber = accNumber;
    }

    public char getAccType() {
        return accType;
    }

    public void setAccType(char accType) {
        this.accType = accType;

        switch (accType) {
            case 'a':  mxFunds = 50000; mnFunds = 1000; break;
            case 'b': mxFunds = 100000; mnFunds = 5000; break;
            case 'c': mxFunds = Double.MAX_VALUE; mnFunds = 10000; break;
            default : {
                System.out.println("Could not create or modify that account type");
                validAcc = false;
                this.accType = '~';
            }
        }
    }

    public void addFunds(double amount) {
        if (funds + amount > mxFunds || amount < 0) {
            System.out.println("Could not deposit that amount");
        } else {
            funds = funds + amount;
        }
    }

    public void takeFunds(double amount) {
        if (funds - amount < mnFunds || amount < 0) {
            System.out.println("Could not withdraw that amount");
        } else {
            funds = funds - amount;
        }
    }
}

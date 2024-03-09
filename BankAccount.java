import java.util.Random;

public class BankAccount {
    private long accountNumber;
    private double amount=0.00;
    private double mxamount;
    private double mnamount;
    private char accType;
    private boolean validity = true;
    private Random r1 = new Random();


        public BankAccount(char accType) {
            boolean flag = false;
            flag = setAccountType(accType);
            if (flag==true) {
                this.accountNumber = r1.nextInt(99999);
                System.out.printf("New accout: account number: %s & account type: %s %n" ,getAccountNumber(), getAccountType());    
            }else{
                System.out.println("Incorrect account type");
                
            }
            
        }

        public BankAccount(char accType, double amount, String con) {
            boolean flag = false;
            flag = setAccountType(accType);

            if (flag==true) {
                this.accountNumber = r1.nextInt(99999);
                addAmount(amount, con);
                System.out.printf("New accout: account number: %s, account type: %s & current money: $%s %n" ,getAccountNumber(), getAccountType(),getAmount());    
            }else{
                System.out.println("Incorrect account type");
            }
                    
        }  

        public long getAccountNumber() {
            return accountNumber;
        }

        public void setAccountNumber(long accountNumber) {
            this.accountNumber = accountNumber;
        }
        
        public boolean setAccountType(char type){
            boolean f = false;
            switch (type) {
                
                    case 'a':
                    mxamount = 50000.00;
                    mnamount = 1000.00;
                    this.accType = 'A';
                    break;
                
                    case 'b':
                    mxamount = 100000.00;
                    mnamount = 5000.00;
                    this.accType = 'B';
                    f = true;
                    break;
                
                    case 'c':
                    mxamount = Double.MAX_VALUE;
                    mnamount = 10000.00;
                    this.accType = 'C';
                    f = true;
                    break;
                
                    default:
                    System.out.println("Invalid type of account");
                    f = false;
                    break;
            }
            return f;
        }
    
        
        public char getAccountType(){
            return accType;
        }

        public double getAmount() {
        return amount;
        }

        public void setStatus(boolean validity){
            this.validity = validity; 
        }
    

        public boolean getStatus(){
            return validity;
        }

        public void addAmount(double amount, String c) {
                if ((amount>=0.00)&&((this.amount+amount)<=mxamount)) {
                    if(Confirmation(c)==true) {
                        this.amount =this.amount+amount;
                        System.out.printf("You added $%s %n",amount);
                        System.out.printf("You have $%s in your account.%n",getAmount());

                    }else{
                        System.out.println("Cancelled.");
                    }
                }else if ((amount>=0.00)&&((this.amount+amount)>mxamount)){
                    if(Confirmation(c)==true) {
                        System.out.println("You can't have more than: $"+mxamount);

                    }else{
                        System.out.println("Cancelled.");
                    }

                }else{
                    System.out.println("Not possible");
                }
        }

        public void takeAmount(double amount, String c) {
            if ((amount>=0.00)&&((this.amount-amount)>=mnamount)) {
                if(Confirmation(c)==true) {
                    this.amount =this.amount-amount;
                    System.out.printf("You took $%s %n",amount);
                    System.out.printf("You have $%s in your account.%n",getAmount());
                }else{
                    System.out.println("Cancelled.");
                }
            }else if ((amount>=0.00)&&((this.amount-amount)<mnamount)){
                if(Confirmation(c)==true) {
                    System.out.println("You can't have less than: $"+mnamount);
                }else{
                    System.out.println("Cancelled.");
                }
            }else{
                System.out.println("Not possible");
            }
        }    
 


    public boolean Confirmation(String c){
        boolean f=false;
        if (c.equalsIgnoreCase("y")||c.equalsIgnoreCase("yes")) {
            f = true;
        }else if (c.equalsIgnoreCase("n")||c.equalsIgnoreCase("no")){
            f = false;
        }
        return f;
    }


}

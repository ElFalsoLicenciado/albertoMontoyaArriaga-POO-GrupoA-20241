public class BankAccount {
    private long accountNumber;
    private double amount;
    private char accType;

    public BankAccount(long accountNumber,char accType) {
        this.accountNumber = accountNumber;
        this.accType = accType;
        System.out.printf("New accout: account number: %s & account type: %s %n" ,getAccountNumber(), getAccountType());

    }

    public BankAccount(long accountNumber,char accType, double amount, String con) {
        this.accountNumber = accountNumber;
        this.accType = accType;
        addAmount(amount, con);
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
    

    public void addAmount(double amount, String c) {
        if(getAccountType()=='A'){
            if ((amount>=0.00)&&((this.amount+amount)<=50000.00)) {
                if(Confirmation(c)==true) {
                    this.amount =this.amount+amount;
                    System.out.printf("You added $%s %n",amount);
                    System.out.printf("You have $%s in your account.%n",getAmount());

                }else{
                    System.out.println("Cancelled.");
                }
            } else if ((amount>=0.00)&&((this.amount+amount)>50000.00)){
                if(Confirmation(c)==true) {
                    System.out.println("Not enough space");

                }else{
                    System.out.println("Cancelled.");
                }

            }else{
                System.out.println("Not possible");
            }

        }else if(getAccountType()=='B'){
            if ((amount>=0.00)&&((this.amount+amount)<=100000.00)) {
                if(Confirmation(c)==true) {
                    this.amount =this.amount+amount;
                    System.out.printf("You added $%s %n",amount);
                    System.out.printf("You have $%s in your account.%n",getAmount());

                }else{
                    System.out.println("Cancelled");
                }

            } else if ((amount>=0.00)&&((this.amount+amount)>100000.00)){
                if(Confirmation(c)==true) {
                    System.out.println("Not enough space");

                }else{
                    System.out.println("Cancelled.");
                }
                           
            }else{
                System.out.println("Not possible");
            }   
        
        }else if(getAccountType()=='C'){
            if (amount>=0.00) {
                if(Confirmation(c)==true) {
                    this.amount =this.amount+amount;
                    System.out.printf("You added $%s %n",amount);
                    System.out.printf("You have $%s in your account.%n",getAmount());       
                }else{
                System.out.println("Cancelled.");
                }

            }else{
                System.out.println("Not possible");
            }    
        
        }
    }

    public void takeAmount(double amount, String c) {
        if(getAccountType()=='A'){
            if ((amount>=0.00)&&((this.amount-amount)>=1000.00)) {
                if(Confirmation(c)==true) {
                    this.amount = this.amount-amount;
                    System.out.printf("You took $%s %n",amount);
                    System.out.printf("You have $%s in your account.%n",getAmount());

                }else{
                    System.out.println("Cancelled.");
                }

            }else if ((amount>=0.00)&&((this.amount-amount)<1000.00)){
                if(Confirmation(c)==true) {
                    System.out.println("You can't have less than $1,000.00");

                }else{
                    System.out.println("Cancelled.");
                }
                                           
            }else{
                System.out.println("Not possible");
            }

        }else if(getAccountType()=='B'){
            if ((amount>=0.00)&&((this.amount-amount)>=5000.00)) {
                if(Confirmation(c)==true) {
                    this.amount =this.amount-amount;
                    System.out.printf("You took $%s %n",amount);
                    System.out.printf("You have $%s in your account.%n",getAmount());

                }else{
                    System.out.println("Cancelled");
                }

            }else if ((amount>=0.00)&&((this.amount-amount)<5000.00)){
                if(Confirmation(c)==true) {
                    System.out.println("You can't have less than $5,000.00");

                }else{
                    System.out.println("Cancelled.");
                }
                           
            }else{
                System.out.println("Not possible");
            }   
        
        }else if(getAccountType()=='C'){
            if ((amount>=0.00)&&((this.amount-amount)>=10000.00)) {
                if(Confirmation(c)==true) {
                    this.amount =this.amount-amount;
                    System.out.printf("You took $%s %n",amount);
                    System.out.printf("You have $%s in your account.%n",getAmount());
               
                }else{
                System.out.println("Cancelled.");
                }

            }else if((amount>=0.00)&&((this.amount-amount)<10000.00)){
                if(Confirmation(c)==true) {
                    System.out.println("You can't have less than $5,000.00");

                }else{
                    System.out.println("Cancelled.");
                }
                
            }else{
                System.out.println("Not possible");
            }    
        
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
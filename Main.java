import java.util.*;
public class Main {

    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        
        System.out.println("1. Register employee 2. Register employee and bank account. 3. Register employee and bank account + funds.");
        int o = sc.nextInt();

        if (o==1) {
            System.out.println("Write your name.");
            String na = sc2.nextLine();
            System.out.println("Write your lastname");
            String ln = sc2.nextLine();
            Employee em1 = new Employee(na, ln);

        } else if (o==2){
            System.out.println("Write your name.");
            String na = sc2.nextLine();
            System.out.println("Write your lastname");
            String ln = sc2.nextLine();
            
            System.out.println("Write your account number and account type for the bank.");
            long accn = sc.nextLong();
            System.out.println("A type: $50,000 max, B type: $100,000 and C type: unlimited.");
            char acct = sc.next().charAt(0);

                if ((acct=='A'|| acct=='B'|| acct=='C')&&(accn>=1)){
                    Employee em1 = new Employee(na, ln,accn, acct,true);
                    System.out.println(em1.getAccount());
                    
                
                }else {
                    System.out.println("Invalid input, please try again");
                }    
        }else if (o==3){
            System.out.println("Write your name.");
            String na = sc2.nextLine();
            System.out.println("Write your lastname");
            String ln = sc2.nextLine();
            
            System.out.println("Write your account number and account type for the bank.");
            long accn = sc.nextLong();
            System.out.println("A type: $50,000 max, B type: $100,000 and C type: unlimited.");
            char acct = sc.next().charAt(0);
            if ((acct=='A'|| acct=='B'|| acct=='C')&&(accn>=1)){
                System.out.println("Type the amount of money you want");
                double am = sc.nextDouble(); 
                Employee em1 = new Employee(na, ln,accn, acct,am,true);
                System.out.println(em1.getAccount());
                
                }else {
                    System.out.println("Invalid input, please try again");
                }    
        }else{
            System.out.println("Invalid input");
        }
        

    }

}
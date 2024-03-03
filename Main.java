import java.util.*;
public class Main {

    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("1. Register employee 2. Register employee and bank account.");
        
        if (sc.nextInt()==1) {
            System.out.println("Write your name and last name.");
            String n = sc.nextLine();
            String ln = sc.nextLine();
            Employee em1 = new Employee(n, ln);

        } else if (sc.nextInt()==2){
            System.out.println("Write your name and last name.");
            String n = sc.nextLine();
            String ln = sc.nextLine();
            
            System.out.println("Write your account number and account type for the bank.");
            long accn = sc.nextLong();
            System.out.println("A type: $50,000 max, B type: $100,000 and C type: unlimited.");
            char acct = sc.next().charAt(1);

                if ((acct=='A'|| acct=='B'|| acct=='C')&&(accn>=1)){
                    Employee em1 = new Employee(n, ln,accn, acct,true);
            }
            System.out.println("Invalid input, please try again");
        
        }else{
            System.out.println("Invalid number");
        }
        

    }

}
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

            Employee em1 = new Employee(na, ln,accn, acct,true);
            System.out.println(em1.getAccount(0));
                

        } else if (o==3){
            System.out.printf("Write your name: ");
            String na = sc2.nextLine();
            System.out.printf("%nWrite your lastname: ");
            String ln = sc2.nextLine();
            
            System.out.printf("%nWrite your account number:");
            long accn = sc.nextLong();
            System.out.printf("%nAccount type: %nA type: $50,000 max, B type: $100,000 and C type: unlimited. ");
            char acct = sc.next().charAt(0);

                Employee em1 = new Employee(na, ln,accn, acct,true);

                /*     System.out.println("Type the amount of money you want");
                double am = sc.nextDouble(); 
                System.out.println("Are you sure?");
                String con = sc2.nextLine(); */
                
                em1.addFounds(1,10000.0, "y");
                System.out.println(em1.getAccount(1));

                em1.addFounds(1,4000.00, "y");
                System.out.println(em1.getAccount(1));


                /*     System.out.println("Type the amount of money you need");
                am = sc.nextDouble(); 
                System.out.println("Are you sure?");
                con = sc2.nextLine(); */



                em1.takeFounds(1,1000.00, "y");
                System.out.println(em1.getAccount(1));


        }else{
            System.out.println("Invalid input");
        }
        

    }

}
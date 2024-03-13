import java.util.*;

public class Bank {
    private static Scanner sc = new Scanner(System.in);
    private static String ui;
    private static boolean flag = false;

    private static ArrayList <BankAccount> bankAccounts = new ArrayList<BankAccount>();
    private static ArrayList<Employee> empList = new ArrayList<>();




    public static BankAccount createAccount() {
        char type='~';
        BankAccount empAcc = new BankAccount();

        do {
            System.out.println("What type of account do you want?");
            System.out.println("A type: MAX $50 000\nB type: MAX $100 000\nC type: unlimited\n");    
            do {
                try {
                    ui = sc.nextLine();
                    ui = ui.toLowerCase();
                    type = ui.charAt(0);
                    flag=true;            
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input\n");
                }
            
            } while (flag==false);
            flag = false;

        }while(confirmation()==false);

        empAcc.setAccType(type);
        bankAccounts.add(empAcc);
        return empAcc;
    }

    public static Employee createEmployee() {
        Employee cl = new Employee();

        System.out.print("\nGive me your name? ");
        ui = sc.nextLine();
        cl.setName(ui);

        System.out.print("\nGive me your last name? ");
        ui = sc.nextLine();
        cl.setLastName(ui);
        System.out.println();

        empList.add(cl); 
        return cl;
    }

    public static void showEmployees() {
        int i = 1;

        System.out.printf("\n| %-3s | %-15s |%n", "No.", "Name");
        for (Employee us : empList) {
            System.out.printf("| %-3s | %-15s |", i, us.getName() + " " + us.getLastName());
            System.out.println(""); 
            i++;
        }

    }

    public static ArrayList<Employee> getEmployees(){
        return empList;
    }

    public static void showInvalidAccs(Employee emp) {
        int i = 1;

        System.out.printf("\n| %-3s | %-4s | %-5s | %-7s |%n", "#","ID", "Type", "Status");
        for (BankAccount toShow : emp.getInvalidAccs()) {
            if (toShow.isValidAcc()=="Off") {
                System.out.printf("| %-3s | %-4s | %-5s | %-7s |%n",i, toShow.getAccNumber(), toShow.getAccType(), toShow.isValidAcc());
                i++;
            }
        }
    }

    public static void showAccounts(){
        int i = 1;
        if (bankAccounts.isEmpty()) {
            System.out.println("The list is empty.");
        
        }else{
            System.out.printf("\n| %-3s | %-4s | %-5s | %-7s | %-10s | %-12s %n", "#","ID", "Type", "Status","Funds", "Employee");
            for(Employee emp : empList){
                for(BankAccount toShow : emp.getAccounts()){
                    System.out.printf("| %-3s | %-4s | %-5s | %-7s | %-10s | %-12s %-15s %n",i, toShow.getAccNumber(), toShow.getAccType(), toShow.isValidAcc(),toShow.getFunds(),emp.getName(),emp.getLastName());
                    i++;
                }
                for(BankAccount toShow : emp.getInvalidAccs()){
                    System.out.printf("| %-3s | %-4s | %-5s | %-7s | %-10s | %-12s %-15s %n",i, toShow.getAccNumber(), toShow.getAccType(), toShow.isValidAcc(),toShow.getFunds(),emp.getName(),emp.getLastName());
                    i++;
                }
            }
        }
    }

    
    public static void changeAccType(Employee emp) {
        BankAccount toChange;
        int p=0;

        if(emp.getValidity()==true){

            if (emp.getInvalidAccs().isEmpty()) {
                System.out.println("\nTheres no accounts to change.");
            }else {
                Bank.showInvalidAccs(emp);
                System.out.print("\nWhat account do you want to change? ");
                
                do{
                    try {
                        p = sc.nextInt();   
                        flag = true;
                        sc.nextLine();                        
                    }catch (InputMismatchException e) {
                        System.out.println("Invalid input. \n");
                        Bank.showInvalidAccs(emp);
                        System.out.print("\nWhat account do you want to change? ");
                        sc.nextLine();
                    }

                }while(flag == false);
                flag = false;
                
                if(p<1 || p>emp.getInvalidAccs().size()){
                    System.out.println("Out of bounds");
                }else{
                    toChange = emp.getInvalidAccs().get(p-1);
                    char type;
                    
                    do {
                        System.out.println("\nWhat type of account do you want?");
                        System.out.println("A type: MAX $50 000\nB type: MAX $100 000\nC type: unlimited\n");    
                        do {
                            try {
                                ui = sc.nextLine();
                                ui = ui.toLowerCase();
                                type = ui.charAt(0);
                                flag=true;            
                            } catch (InputMismatchException e) {
                                System.out.println("Invalid input\n");
                            }
                        
                        } while (flag==false);
                        flag = false;
            
                    }while(confirmation()==false);
            
                    emp.getAccounts().add(toChange);
                    emp.getInvalidAccs().remove(toChange);
                }
            }
        } else{
            System.out.println("\nYou haven't registred an account");
        }
    }

    public static boolean confirmation(){
        System.out.print("\nAre you sure? ");
        ui = sc.nextLine();
        System.out.println("");
        boolean f=false;    

        if (ui.equalsIgnoreCase("y")||ui.equalsIgnoreCase("yes")) {
            f = true;
        }else{
            f = false;
        }
        return f;
    }

    
}
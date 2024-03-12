import java.util.*;

public class UtilityMethods {
    static Scanner sc = new Scanner(System.in);
    static String ui;
    static boolean flag = false;

    public static BankAccount createAccount() {
        char type='~';
        BankAccount empAcc = new BankAccount();

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
                System.out.println("What type of account do you want?");
                System.out.println("A type: MAX $50 000\nB type: MAX $100 000\nC type: unlimited\n");
                
            }
        } while (flag==false);

        empAcc.setAccType(type);
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

        EmpsRepo.empList.add(cl); 
        return cl;
    }

    public static void showInvalidAccs(Employee emp) {
        int i = 1;

        System.out.printf("\n| %-3s | %-4s | %-5s | %-7s |%n", "#","ID", "Type", "Status");
        for (BankAccount toShow : emp.getInvalidAccs()) {
            if (toShow.isValidAcc()=="Inactive") {
                System.out.printf("| %-3s | %-4s | %-5s | %-7s |%n",i, toShow.getAccNumber(), toShow.getAccType(), toShow.isValidAcc());
                i++;
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
                UtilityMethods.showInvalidAccs(emp);
                System.out.print("\nWhat account do you want to change? ");
                
                do{
                    try {
                        p = sc.nextInt();   
                        flag = true;
                        sc.nextLine();                        
                    }catch (InputMismatchException e) {
                        System.out.println("Invalid input. \n");
                        UtilityMethods.showInvalidAccs(emp);
                        System.out.print("\nWhat account do you want to change? ");
                        sc.nextLine();
                    }

                }while(flag == false);
                flag = false;
                
                if(p<1 || p>emp.getInvalidAccs().size()){
                    System.out.println("Out of bounds");
                }else{
                    toChange = emp.getInvalidAccs().get(p-1);
                    System.out.print("\nChange the account type: ");
                    char type = sc.nextLine().charAt(0);

                    if (type == 'a' || type == 'b' || type == 'c') {
                        toChange.setAccType(type);
                        toChange.setValidAcc(true);
                        emp.getAccounts().add(toChange);
                        emp.getInvalidAccs().remove(toChange);
                    }else{
                        System.out.println("Invalid type of account.");
                    }
                }
            }
        } else{
            System.out.println("\nYou haven't registred an account");
        }
    }

}

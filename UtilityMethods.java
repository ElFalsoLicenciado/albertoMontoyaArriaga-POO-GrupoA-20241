import java.util.*;

public class UtilityMethods {
    static Scanner sc = new Scanner(System.in);
    static String ui;

    public static BankAccount createAccount() {
        char type;
        BankAccount empAcc = new BankAccount();

        System.out.println("What type of account do you want?");
        System.out.println("A type: MAX $50 000\nB type: MAX $100 000\nC type: unlimited");
        ui = sc.nextLine();
        ui = ui.toLowerCase();
        type = ui.charAt(0);
        System.out.println();
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
        int p;

        if(emp.getValidity()==true){

            if (emp.getInvalidAccs().isEmpty()) {
                System.out.println("\nTheres no accounts to change.");
            } else {
                UtilityMethods.showInvalidAccs(emp);
                System.out.print("\nWhat account do you want to change? ");
                p = sc.nextInt();
                sc.nextLine();

                toChange = emp.getInvalidAccs().get(p - 1);

                System.out.print("\nChange the account type: ");
                ui = sc.nextLine().substring(0,1);
                ui = ui.toLowerCase();
                char type = ui.charAt(0);
                toChange.setAccType(type);
                sc.nextLine();

                if (type == 'a' || type == 'b' || type == 'c') {
                    toChange.setValidAcc(true);
                    emp.getInvalidAccs().remove(toChange);
                }
            }
        } else{
            System.out.println("\nYou haven't registred an account");
        }
    }

}

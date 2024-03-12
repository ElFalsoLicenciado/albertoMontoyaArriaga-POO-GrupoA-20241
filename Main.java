
import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opt = -1, p=0; double q=0;
        Employee employeeTrial;
        BankAccount trialAccount;
        boolean f = false;

        while (opt != 0) {
            System.out.println("1. Register an employee.");
            System.out.println("2. Select employee.");
            System.out.println("0. Go back.");
            
                do
                    {
                    try{
                        opt = sc.nextInt();   
                        f = true;
                    }catch (InputMismatchException e){
                        System.out.println("Invalid input.");
                        System.out.println("\n1. Register an employee.");
                        System.out.println("2. Select employee.");
                        System.out.println("0. Go back.");
                        sc.nextLine();
                    }
                }while(f==false);

                f = false;
            

                switch (opt) {
                    case  1 : 
                        System.out.println("\n1. Register an employee.\n2. Register an employee + bank account.\n3. Register an employee + bank account & funds.");
                        System.out.println("4. Employee list.\n0. Quit.");
                        
                    do
                    {
                        try{
                            opt = sc.nextInt();   
                            f = true;
                        }catch (InputMismatchException e){
                            System.out.println("Invalid input.");
                            System.out.println("\n1. Register an employee.\n2. Register an employee + bank account.\n3. Register an employee + bank account & funds.");
                            System.out.println("4. Employee list.\n0. Quit.");
                            sc.nextLine();
                        }
                    }while(f==false);
                
                    f = false;
                    
                    switch (opt) {
                                case 1 :
                                    employeeTrial = UtilityMethods.createEmployee();
                                break;
                                case 2 :
                                    employeeTrial = UtilityMethods.createEmployee();
                                    trialAccount = UtilityMethods.createAccount();
                                    employeeTrial.getAccounts().add(trialAccount);
                                    employeeTrial.setValidity(true);
                                break;
                                case 3 : 
                                    employeeTrial = UtilityMethods.createEmployee();
                                    trialAccount = UtilityMethods.createAccount();
                                    employeeTrial.getAccounts().add(trialAccount);
                                    employeeTrial.setValidity(true);
                    
                                    if (trialAccount.isValidAcc()=="Active") {
                                        System.out.print("Funds: $");
                                        employeeTrial.getFunds(0);
                                    
                                        System.out.print("\n Write the amount you want to add ");

                                        do
                                        {
                                            try{
                                                q = sc.nextDouble();   
                                                f = true;
                                            }catch (InputMismatchException e){
                                                System.out.println("Invalid input.");
                                                System.out.print("Write the amount you want to add ");
                                            sc.nextLine();
                                            }
                                        }while(f==false);

                                        f = false;
                                
                                        employeeTrial.getAccounts().get(0).addFunds(q); 
                                        System.out.print("Current funds: $");
                                        employeeTrial.getFunds(0); 
                                 
                                    } else {
                                        System.out.println("Cannot deposit to such account, invalid account.");
                                    }
                                
                                break;

                                case 4 : 
                                    int i = 1;
                                    System.out.println("");
                                    for (Employee toShow : EmpsRepo.empList) {
                                        System.out.println(i + ". " + toShow.getName() + " " + toShow.getLastName());
                                        i ++;
                                    }
                                    System.out.println("\n");
                                break;
                                case 0 :
                                    System.out.println("\nReturning");
                                    opt = -1;
                                break;
                            }
                        break; 
                        case 2 : 
                            if (EmpsRepo.empList.isEmpty()) {
                                System.out.println("Theres no employees registred, please register one.");
                            } else {
                                int p2=0;
                                Employee emp;
                                EmpsRepo.showEmployees();
                                System.out.print("\nSelect an employee ");
                            
                                    do
                                        {
                                        try{
                                            p2 = sc.nextInt();   
                                            f = true;
                                        }catch (InputMismatchException e){
                                            System.out.println("Invalid input.");
                                            System.out.print("\nSelect an employee ");
                                        sc.nextLine();
                                        }
                                    }while(f==false);
                                    
                                    f = false;
                                    
                                    if (p2<1 || p2>EmpsRepo.empList.size()) {
                                        System.out.println("Out of bonds.");
                                    }else{
                                    emp = EmpsRepo.empList.get(p2 - 1);
                                    
                                    byClient(emp);
                                    }
                            }
                        break;

                        case 0 : 
                            System.out.println("Cheers");
                        break;

                        default : 
                            System.out.println("Not possible ");
                        break;    
                }
        }

    }

    public static void byClient(Employee emp) {
        int opt=0, p=0;
        double q=0;
        BankAccount theAccount;
        boolean f = false;

            do {
            System.out.println("\n1. Deposit funds.\n2. Withdraw funds.\n3. Manage bank accounts\n0. Return.");
                
                do
                {
                    try{
                        opt = sc.nextInt();   
                        f = true;
                    }catch (InputMismatchException e){
                        System.out.println("Invalid input. \n");
                        System.out.println("\n1. Deposit funds.\n2. Withdraw funds.\n3. Manage bank accounts\n0. Return.");
                        System.out.print("Select an option. ");
            
                        sc.nextLine();
                    }
                }while(f==false);
                
                f = false;
            
                switch (opt) {
                    case 1 :
                        if(emp.getValidity()==true){
                        emp.showAccounts();
                        System.out.print("\nWhich bank account? ");
                            
                            do
                            {
                                try{
                                    p = sc.nextInt();   
                                    f = true;
                                }catch (InputMismatchException e){
                                    System.out.println("Invalid input. \n");
                                    emp.showAccounts();
                                    System.out.println("\nWhich bank account? ");
                                    sc.nextLine();
                                }
                            
                            }while(f==false);
                            
                            f = false;

                        if(p<1 || p>emp.getAccounts().size()){
                                    System.out.println("Out of bounds");
                        }else{
                        theAccount = emp.getAccounts().get(p - 1);

                            if (theAccount.isValidAcc()=="Active") {
                                System.out.print("\nWrite the amount you want to add ");
                                do
                                {
                                    try{
                                        q = sc.nextDouble();   
                                        f = true;
                                    }catch (InputMismatchException e){
                                        System.out.println("Invalid input. \n");
                                        emp.showAccounts();
                                        System.out.print ("\nWrite the amount you want to add ");
                                        sc.nextLine();
                                    }
                                }while(f==false);
                            f = false;
                                theAccount.addFunds(q);
                            } else {
                                System.out.println("\nCannot deposit to such account, invalid account.");
                            }
                        }
                        }else{
                        System.out.println("You have no account registred.");
                        }

                    break;

                    case 2 :
                    if(emp.getValidity()==true){
                        emp.showAccounts();
                        System.out.print("\nWhich bank account? " );
                            
                            do
                            {
                                try{
                                    p = sc.nextInt();   
                                    f = true;
                                }catch (InputMismatchException e){
                                    System.out.println("Invalid input. \n");
                                    emp.showAccounts();
                                    System.out.println("\nWhich bank account? ");
                                    sc.nextLine();
                                }
                            }while(f==false);

                        f = false;

                        if(p<1 || p>emp.getAccounts().size()){
                            System.out.println("Out of bounds");
                        }else{
                        theAccount = emp.getAccounts().get(p - 1);
                        
                        if (theAccount.isValidAcc()=="Active") {
                        System.out.print ("\nWrite the amount you want to take ");
                            do
                            {
                                try{
                                    q = sc.nextDouble();   
                                    f = true;
                                }catch (InputMismatchException e){
                                    System.out.println("Invalid input. \n");
                                    emp.showAccounts();
                                    System.out.print ("\nWrite the amount you want to take ");
                                    sc.nextLine();
                                }
                            }while(f==false);
                        
                        f = false;

                        theAccount.takeFunds(q);
                        }else{
                            System.out.println("\nCannot deposit to such account, invalid account.");
                        }
                    }    
                    }else{
                        System.out.println("\nYou have no account registred.");
                    }
                    
                    break;

                    case 3 :
                    System.out.print("\n1. Create a bank account\n2. Activate an existing account\n3. Show accounts \n0. Return\n ");
                        do
                        {
                            try{
                                p = sc.nextInt();   
                                f = true;
                            }catch (InputMismatchException e){
                                System.out.println("Invalid input. \n");
                                System.out.println("\n1. Create a bank account\n2. Activate an existing account\n3. Show accounts \n0. Return " );
                                sc.nextLine();
                            }
                        }while(f==false);
                    f = false;
                    
                        switch (p) {
                            case 1 : 
                                BankAccount newAcc = UtilityMethods.createAccount();
                                emp.getAccounts().add(newAcc);
                                emp.setValidity(true);
                            break;

                            case 2 : 
                                UtilityMethods.changeAccType(emp); 
                            break;

                            case 3 :
                                emp.showAccounts();
                            break;
                            
                            case 0 : 
                                System.out.println("\nReturning"); 
                            break;

                            default : 
                                System.out.println("Not possible.");
                            break;
                        }
                        break;

                    case 0 : System.out.println("\nReturning");
                    break;
                    
                    default : System.out.println("Not possible.");
                    break;
                }
            } while (opt != 0);
    }
}

class EmpsRepo {
    public static ArrayList<Employee> empList = new ArrayList<>();

    public static void showEmployees() {
        int i = 1;

        System.out.printf("\n| %-3s | %-15s |%n", "No.", "Name");
        for (Employee us : empList) {
            System.out.printf("| %-3s | %-15s |", i, us.getName() + " " + us.getLastName());
            System.out.println(""); 
            i++;
        }
    }
}
public class Empleado {
     
    double baseSalary;
    double bonus;
    int extraH;
     
     public Empleado(double baseSalary){
        this.baseSalary = baseSalary;
        calculateWage(baseSalary);
     }

     public Empleado (double baseSalary, double bonus){
        this.baseSalary = baseSalary;
        this.bonus = bonus;
        calculateWage(baseSalary, bonus);
     }

     public Empleado (double baseSalary, double bonus, int extraH){
        this.baseSalary = baseSalary;
        this.bonus = bonus;
        this.extraH = extraH;
        calculateWage(baseSalary, bonus, extraH);
     }

     public void calculateWage(double baseSalary){
        double wage = baseSalary;
        System.out.printf("You have a wage of: $%s%n",wage);
        System.out.println();
     }

     public void calculateWage(double baseSalary, double bonus){
        double wage = baseSalary+bonus;
        wage = Math.round(wage * 100.0) / 100.0;
        System.out.printf("You have a wage of: $%s%n",wage);
        System.out.println();
     }

     public void calculateWage(double baseSalary, double bonus, int extraH){
      double wage = baseSalary+bonus+(extraH*20);
      wage = Math.round(wage * 100.0) / 100.0;
      System.out.printf("You have a wage of: $%s%n",wage);
      System.out.println();  
     }

}

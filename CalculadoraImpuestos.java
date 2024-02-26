public class CalculadoraImpuestos {
    
    int income;
    double taxRate;
    double dividends;
    double exemptions;


    public CalculadoraImpuestos (int income){
        this.income=income;
        calculateTaxes(income);
    }


    public CalculadoraImpuestos (int income, double taxRate){
        this.income=income;
        this.taxRate=taxRate;
        calculateTaxes(income,taxRate);
    }


    public CalculadoraImpuestos (double taxRate, double dividends, double exemptions){
        this.taxRate=taxRate;
        this.dividends=dividends;
        this.exemptions=exemptions;
        calculateTaxes(taxRate,dividends,exemptions);
    }

    public void calculateTaxes(int income){
        double tax= income*0.15;
        tax = Math.round(tax*100.0)/100.0;
        System.out.printf("You have to pay: %s%n",tax);
        System.out.println();
        
    }

    public void calculateTaxes(int income, double taxRate){
        double tax = income * (taxRate/100.0);
        tax = Math.round(tax*100.0)/100.0;
        System.out.printf("You have to pay: %s%n",tax);
        System.out.println();
    }

    public void calculateTaxes( double taxRate, double dividends, double exemptions){
        
        double tax = dividends * (taxRate/100.0);
        tax = Math.round(tax*100.0)/100.0;
            
        if(tax>exemptions){
            tax=tax-exemptions;
            tax = Math.round(tax*100.0)/100.0;
        }
        else {
            tax =0.0;
        }

        System.out.printf("You have to pay: %s%n",tax);
        System.out.println();
    }

}

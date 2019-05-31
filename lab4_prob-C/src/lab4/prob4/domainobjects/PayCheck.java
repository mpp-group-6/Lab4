package lab4.prob4.domainobjects;

public final class PayCheck
{
    final private Double grossPay;
    
    final private Double fica;
    
    final private Double state;
    
    final private Double local;
    
    final private Double medicare;
    
    final private Double socialSecurity;
    
    PayCheck(Double grossPay, Double ficaTax, Double stateTax, Double localTax, Double medicareTax, Double socialSecurityTax) {
        this.grossPay = grossPay;
        fica = ficaTax;
        state = stateTax;
        local = localTax;
        medicare = medicareTax;
        socialSecurity = socialSecurityTax;
    }

    public Double getNetPay() {
        return grossPay - fica - state - local - medicare - socialSecurity;
    }
    
    public void print() {
        System.out.println("******Pay Check******");
        System.out.println("*********************");
        System.out.println(String.format("%1$15s", "Gross Pay:") + grossPay);
        System.out.println(String.format("%1$15s", "Fica Tax:")  + fica);
        System.out.println(String.format("%1$15s", "State Tax:")  + state);
        System.out.println(String.format("%1$15s", "Local Tax:")  + local);
        System.out.println(String.format("%1$15s", "Medicare:")  + medicare);
        System.out.println(String.format("%1$15s", "Net:")  + getNetPay());
    }
}

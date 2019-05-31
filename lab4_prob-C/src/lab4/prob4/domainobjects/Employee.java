package lab4.prob4.domainobjects;

public abstract class Employee
{
    private String empId;

    public String getEmpId()
    {
        return empId;
    }
    
    public Employee(String id) {
        empId = id;
    }
    
    public void print() {
        System.out.println("*********Employee*********");
        System.out.println("**************************");
        System.out.println("Employee id: " + empId);
        System.out.println();
    }
    
    public PayCheck calCompensation(Integer month, Integer year) {
        Double grossPay = calGrossPay(month, year);
        Double ficaRate = 23/100.0;
        Double stateRate = 5/100.0;
        Double localRate = 1/100.0;
        Double medicareRate = 3/100.0;
        Double socialSecurityRate = 7.5/100.0;
        return new PayCheck(grossPay, grossPay * ficaRate, grossPay * stateRate, grossPay * localRate, 
            grossPay * medicareRate, grossPay * socialSecurityRate);
        
    }
    
    
    public abstract Double calGrossPay(Integer month, Integer year);
    
    
    
    
}

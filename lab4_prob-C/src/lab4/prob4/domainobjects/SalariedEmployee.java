package lab4.prob4.domainobjects;

public class SalariedEmployee extends Employee
{
    private Double salary;
    
    public SalariedEmployee(String empId, Double grossSalary) {
        super(empId);
        this.salary = grossSalary;
    }

    @Override
    public Double calGrossPay(Integer month, Integer year)
    {
        return salary;
    }

}

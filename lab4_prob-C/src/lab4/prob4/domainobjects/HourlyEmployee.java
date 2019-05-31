package lab4.prob4.domainobjects;

public class HourlyEmployee extends Employee
{
    private Double hourlyWage;
    
    private Integer hoursPerWeek;
    
    public HourlyEmployee(String empId, Double hourlyWage, Integer hoursPerWeek) {
        super(empId);
        this.hourlyWage = hourlyWage;
        this.hoursPerWeek = hoursPerWeek;
    }

    @Override
    public Double calGrossPay(Integer month, Integer year)
    {
        Integer weeksPerMonth = 4;      //assumption from question
        return hourlyWage * hoursPerWeek * weeksPerMonth;
    }

}

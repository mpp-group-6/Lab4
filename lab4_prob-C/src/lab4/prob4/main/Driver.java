package lab4.prob4.main;

import java.time.LocalDate;

import lab4.prob4.domainobjects.CommissionedEmployee;
import lab4.prob4.domainobjects.Employee;
import lab4.prob4.domainobjects.HourlyEmployee;
import lab4.prob4.domainobjects.Order;
import lab4.prob4.domainobjects.SalariedEmployee;

public class Driver
{

    public static void main(String[] args)
    {
        Integer month = 5;              // may
        Integer year  = 2019;
        Double hourlyWage = 30.0;
        Integer hoursPerWeek = 40;
        Employee hourly = new HourlyEmployee("peter-hourly", hourlyWage, hoursPerWeek);
        Double commission = 0.05;           // 15%
        Double baseSalary = 500.0;           // 500USD
        CommissionedEmployee commissionedEmployee = new CommissionedEmployee("james-commision", commission, baseSalary);
        commissionedEmployee.addOrder(new Order(1, LocalDate.of(year, month-1, 18), 100000.0));
        commissionedEmployee.addOrder(new Order(1, LocalDate.of(year, month, 18), 200000.0));
        commissionedEmployee.addOrder(new Order(1, LocalDate.of(year, month, 20), 50000.0));
        commissionedEmployee.addOrder(new Order(1, LocalDate.of(year, month+1, 10), 100000.0));
        commissionedEmployee.addOrder(new Order(1, LocalDate.of(year, month+1, 1), 700000.0));
        Double grossSalary = 6000.0;         // gross salary
        Employee salariedEmployee = new SalariedEmployee("jerry-salaried", grossSalary);
        Employee[] employees = {hourly, commissionedEmployee, salariedEmployee};
        for(Employee employee: employees) {
            employee.print();
            System.out.println("***Compensation Details***");
            System.out.println("**************************");
            employee.calCompensation(month, year).print();
            System.out.println();
        }
    }

}

package lab4.prob4.domainobjects;

import java.util.ArrayList;
import java.util.List;

public class CommissionedEmployee extends Employee
{
    private Double commission;
    private Double baseSalary;
    private List<Order> orders = new ArrayList<Order>();
    
    public CommissionedEmployee(String empId, Double commission, Double baseSalary) {
        super(empId);
        this.commission = commission;
        this.baseSalary = baseSalary;
    }
    
    public void addOrder(Order order) {
        orders.add(order);
    }

    @Override
    public Double calGrossPay(Integer month, Integer year)
    {
        Double commissionPay = commission * orders.stream()
            .filter(order-> order.getOrderDate().getMonthValue() == month && order.getOrderDate().getYear() == year)        // get orders for this month and year
            .mapToDouble(order->order.getOrderAmount()).sum();
        return baseSalary + commissionPay;
    }

}

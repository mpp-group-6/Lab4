package lab4.prob4.domainobjects;

import java.time.LocalDate;

public class Order
{
    private final Integer orderNo;
    private final LocalDate orderDate;
    private final Double orderAmount;
    
    public Order(Integer orderNo, LocalDate orderDate, Double orderAmount) {
        this.orderNo = orderNo;
        this.orderDate = orderDate;
        this.orderAmount = orderAmount;
    }

    public Double getOrderAmount()
    {
        return orderAmount;
    }

    public LocalDate getOrderDate()
    {
        return orderDate;
    }
}

package be.tlemos.domain.orders;

import java.time.LocalDate;

public class ItemGroup {

    private int ItemGroupId;
    private String itemName;
    private int orderedAmount;
    private LocalDate orderDate;
    private LocalDate shippingDate;
    private double subtotal;

    public ItemGroup(int itemGroupId, String itemName, int orderedAmount, LocalDate shippingDate, double subtotal) {
        this.ItemGroupId = itemGroupId;
        this.itemName = itemName;
        this.orderedAmount = orderedAmount;
        this.orderDate = LocalDate.now();
        this.shippingDate = shippingDate;
        this.subtotal = subtotal;
    }

//    public LocalDate calculateShippingDate(){
//        return orderDate.plusDays(1);
//        // todo: calculate if item not in stock
//    }

//    public String getItem() {
//        return item;
//    }

    public int getOrderedAmount() {
        return orderedAmount;
    }

    public void setOrderedAmount(int orderedAmount) {
        this.orderedAmount = orderedAmount;
    }

    public LocalDate getShippingDate() {
        return shippingDate;
    }

    public void setShippingDate(LocalDate shippingDate) {
        this.shippingDate = shippingDate;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public double getSubtotal() {
        return subtotal;
    }


}

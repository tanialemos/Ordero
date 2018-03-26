package be.tlemos.domain.orders;

import be.tlemos.domain.items.Item;

import java.time.LocalDate;

public class ItemGroup {

    private int ItemGroupId;
    private Item item;
    private int orderedAmount;
    private LocalDate orderDate;
    private LocalDate shippingDate;
    private double subtotal;

    public ItemGroup(int itemGroupId, Item item, int orderedAmount) {
        this.ItemGroupId = itemGroupId;
        this.item = item;
        this.orderedAmount = orderedAmount;
        this.orderDate = LocalDate.now();
        this.shippingDate = calculateShippingDate();
        this.subtotal = calculateSubTotal();
    }

    public LocalDate calculateShippingDate(){
        return orderDate.plusDays(1);
        // todo: calculate if item not in stock
    }

    public double calculateSubTotal(){
        return item.getPrice() * orderedAmount;
    }

    public Item getItem() {
        return item;
    }

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
}

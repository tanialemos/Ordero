package be.tlemos.domain.orders;

import java.time.LocalDate;

public class ItemGroup {

    private int ItemGroupId;
    private String itemId;
    private int orderedAmount;
    private LocalDate shippingDate;
    private double subtotal;

    public ItemGroup(int itemGroupId, String itemId, int orderedAmount, LocalDate shippingDate, double subtotal) {
        this.ItemGroupId = itemGroupId;
        this.itemId = itemId;
        this.orderedAmount = orderedAmount;
        this.shippingDate = shippingDate;
        this.subtotal = subtotal;
    }

    public String getItemId() {
        return itemId;
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

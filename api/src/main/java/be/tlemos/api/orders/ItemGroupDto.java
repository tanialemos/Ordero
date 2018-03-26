package be.tlemos.api.orders;

public class ItemGroupDto {

    private String itemName;
    private int orderedAmount;
    private int orderedYear;
    private int orderedMonth;
    private int orderedDay;
    private String shippingDate;
    private double subtotal;

    public ItemGroupDto() {
    }

    public ItemGroupDto(String itemName, int orderedAmount, int orderedYear, int orderedMonth, int orderedDay, String shippingDate, double subtotal) {
        this.itemName = itemName;
        this.orderedAmount = orderedAmount;
        this.orderedYear = orderedYear;
        this.orderedMonth = orderedMonth;
        this.orderedDay = orderedDay;
        this.shippingDate = shippingDate;
        this.subtotal = subtotal;
    }

    public String getItemName() {
        return itemName;
    }

    public int getOrderedAmount() {
        return orderedAmount;
    }

    public int getOrderedYear() {
        return orderedYear;
    }

    public int getOrderedMonth() {
        return orderedMonth;
    }

    public int getOrderedDay() {
        return orderedDay;
    }

    public String getShippingDate() {
        return shippingDate;
    }

    public double getSubtotal() {
        return subtotal;
    }
}

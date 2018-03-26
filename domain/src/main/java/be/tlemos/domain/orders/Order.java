package be.tlemos.domain.orders;

import java.util.List;

public class Order {

    private int orderNumber;
    private List<ItemGroup> itemGroupList;
    private String customerId;
    private double totalPrice;

    public Order(List<ItemGroup> itemGroupList, String customerId) {
        this.customerId = customerId;
        this.itemGroupList = itemGroupList;
    }

    public ItemGroup[] showAllItemGroupsInOrder(){
        ItemGroup[] itemGroups = new ItemGroup[itemGroupList.size()];
        return itemGroupList.toArray(itemGroups);
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public List<ItemGroup> getItemGroupList() {
        return itemGroupList;
    }
}

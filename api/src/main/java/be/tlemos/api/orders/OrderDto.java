package be.tlemos.api.orders;

import be.tlemos.domain.orders.ItemGroup;

import javax.inject.Inject;
import java.util.List;


public class OrderDto {

    private ItemGroupMapper itemGroupMapper;
    private int orderNumber;
    private ItemGroupDto[] itemGroupDtoList;
    private String customerId;
    private double totalPrice;

    public OrderDto() {
    }

    public OrderDto(int orderNumber, List<ItemGroup> itemGroupList, String customerId, double totalPrice) {
        itemGroupMapper = new ItemGroupMapper();
        this.orderNumber = orderNumber;
        this.itemGroupDtoList = itemGroupMapper.mapItemGroupToDto(itemGroupList);
        this.customerId = customerId;
        this.totalPrice = totalPrice;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

//    public ItemGroupDto[] getItemGroupList() {
////        return itemGroupList;
////    }

    public String getCustomerId() {
        return customerId;
    }

    public double getTotalPrice() {
        return totalPrice;
    }
}

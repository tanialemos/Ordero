package be.tlemos.api.orders;

import be.tlemos.domain.orders.ItemGroup;

import javax.inject.Named;
import java.util.List;

@Named
public class ItemGroupMapper {

    public ItemGroupDto[] mapItemGroupToDto(List<ItemGroup> itemGroups){
        ItemGroupDto[] itemGroupDtos = new ItemGroupDto[itemGroups.size()];
        for(int i = 0; i < itemGroupDtos.length; i++){
            ItemGroupDto item = null;
            for(ItemGroup itemGroup : itemGroups) {
                item = new ItemGroupDto(
                itemGroup.getItem().getName(),
                        itemGroup.getOrderedAmount(),
                        itemGroup.getOrderDate().getYear(),
                        itemGroup.getOrderDate().getMonthValue(),
                        itemGroup.getOrderDate().getDayOfMonth(),
                        itemGroup.getShippingDate().toString(),
                        itemGroup.getSubtotal()
                );
            }
            itemGroupDtos[i] = item;
        }
        return itemGroupDtos;
    }
}

package be.tlemos.api.items;

import be.tlemos.domain.items.Item;

public class ItemMapper {

    public ItemDto mapItemToDto(Item item){
        return new ItemDto(
                item.getName(),
                item.getDescription(),
                item.getPrice(),
                item.getAmount()
        );
    }

    public Item mapDtoToItem(ItemDto itemDto){
        return new Item(
                itemDto.getName(),
                itemDto.getDescription(),
                itemDto.getPrice(),
                itemDto.getAmount()
        );
    }
}

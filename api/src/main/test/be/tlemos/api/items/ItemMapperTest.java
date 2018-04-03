package be.tlemos.api.items;

import be.tlemos.domain.items.Item;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ItemMapperTest {

    ItemMapper itemMapper;

    @Test
    void mapItemToDto() {
        itemMapper = new ItemMapper();

        Item item1 = new Item("Running shoes", "Good for sport", 54.29, 150);
        item1.setItemId(7);

        ItemDto actualDto = itemMapper.mapItemToDto(item1);

        ItemDto expectedDto = new ItemDto(7, "Running shoes", "Good for sport", 54.29, 150);

        Assertions.assertThat(actualDto).isEqualToComparingFieldByField(expectedDto);
    }

    @Test
    void mapDtoToItem() {
        itemMapper = new ItemMapper();

        ItemDto itemDto = new ItemDto(7, "Running shoes", "Good for sport", 54.29, 150);

        Item actualItem = itemMapper.mapDtoToItem(itemDto);

        Item expectedItem = new Item("Running shoes", "Good for sport", 54.29, 150);

        Assertions.assertThat(actualItem).isEqualToComparingFieldByField(expectedItem);
    }
}
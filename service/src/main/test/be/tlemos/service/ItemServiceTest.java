package be.tlemos.service;

import be.tlemos.domain.items.Item;
import be.tlemos.domain.items.ItemStock;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class ItemServiceTest {

    ItemService itemService;
    ItemStock mockItemStock;

    @BeforeEach
    void setup(){
        mockItemStock = Mockito.mock(ItemStock.class);

        itemService = new ItemService(mockItemStock);
    }

    @Test
    void createNewItem_happyPath() {
        Item testItem = new Item("Dancing shoes", "Blue suede shoes", 110.00, 150);

        itemService.createNewItem(testItem);

        Mockito.verify(mockItemStock).createNewItem(testItem);
    }
}
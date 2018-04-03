package be.tlemos.domain.items;

import be.tlemos.domain.exceptions.ItemAlreadyExistsException;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ItemStockTest {

    Item testItem1;
    Item testItem2;

    @BeforeEach
    void setUp(){
        testItem1 = new Item("Dancing shoes", "Blue suede shoes", 110.99, 265);
        testItem2 = new Item("Running shoes", "Flexible and light", 59.80, 545);
    }

    @Test
    void createNewItem_happyPath() {
        ItemStock itemStock = new ItemStock();

        itemStock.createNewItem(testItem1);
        itemStock.createNewItem(testItem2);

        Assertions.assertThat(itemStock.getAllItemsInStock())
                .contains(testItem1)
                .contains(testItem2);
    }

    @Test
    void createNewItem_givenExistingName_throwItemAlreadyExistsException() {
        Item testItem = new Item("Spring boots", "These boots were made for walking", 100.00, 315);

        ItemStock itemStock = new ItemStock();

        RuntimeException exception = assertThrows(ItemAlreadyExistsException.class, () -> {
            itemStock.createNewItem(testItem);
        });

        Assertions.assertThat(exception.getMessage()).isEqualTo("An item with the same name already exists. Please provide a new one.");

    }

    @Test
    void getAllItemsInStock() {
    }

    @Test
    void getItemById() {
    }
}
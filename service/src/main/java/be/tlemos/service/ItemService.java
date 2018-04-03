package be.tlemos.service;

import be.tlemos.domain.items.Item;
import be.tlemos.domain.items.ItemStock;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

@Named
public class ItemService {

    ItemStock itemStock;

    @Inject
    public ItemService(ItemStock itemStock) {
        this.itemStock = itemStock;
    }

    public void createNewItem(Item item){
        itemStock.createNewItem(item);
    }

    public List<Item> getAllItemsInStock(){
        return itemStock.getAllItemsInStock();
    }
}

package be.tlemos.domain.items;

import javax.inject.Named;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Named
public class ItemStock {

    private Map<String, Item> itemStock;
    Item blackShoes;
    Item whiteSandals;
    Item flipFlops;

    public ItemStock(){
        itemStock = new HashMap<>();
        initalItemData();
    }

    private void initalItemData(){
        blackShoes = new Item("Black Shoes", "Basic black shoes for every occasion", 45.0, 100);
        whiteSandals = new Item("White Sandals", "Gorgeous white sandals perfect for the summer", 37.5, 68);
        flipFlops = new Item("Flip-flops", "Must-have for the beach", 15.0, 49);
        addItemToItemStock(blackShoes);
        addItemToItemStock(whiteSandals);
        addItemToItemStock(flipFlops);
    }

    public void addItemToItemStock(Item item) throws IllegalArgumentException {
        if(itemStock.containsKey(item.getName().toLowerCase())){
            throw new IllegalArgumentException("An item with the same name already exists. Please provide a new one.");
        }
        itemStock.put(item.getName().toLowerCase(), item);
    }

    public List<Item> getAllItemsInStock(){
        List<Item> itemList = new ArrayList<>();
        itemList.addAll(itemStock.values());
        return itemList;
    }

}

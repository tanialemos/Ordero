package be.tlemos.domain.items;

import be.tlemos.domain.exceptions.ItemAlreadyExistsException;

import javax.inject.Named;
import java.util.*;

@Named
public class ItemStock {

    private Map<Integer, Item> itemStock;
    private int counterItemId;
    private Item item1;
    private Item item2;
    private Item item3;

    public ItemStock(){
        itemStock = new HashMap<>();
        counterItemId = 4;
        generateInitialItemData();
    }

    private void generateInitialItemData(){
        item1 = new Item("Black shoes", "Basic black shoes", 55.9, 252);
        item1.setItemId(1);
        item2 = new Item("Flip-flops", "Must-have for the beach", 14.99, 684);
        item2.setItemId(2);
        item3 = new Item("Spring boots", "Boots to make your spring easier", 98.50, 54);
        item3.setItemId(3);

        itemStock.put(item1.getItemId(), item1);
        itemStock.put(item2.getItemId(), item2);
        itemStock.put(item3.getItemId(), item3);
    }

    public Item createNewItem(Item item) throws ItemAlreadyExistsException {
        if(doesItemNameAlreadyExist(item)){
            throw new ItemAlreadyExistsException("An item with the same name already exists. Please provide a new one.");
        }
        item.setItemId(counterItemId);
        itemStock.put(item.getItemId(), item);
        counterItemId++;
        return item;
    }

    private boolean doesItemNameAlreadyExist(Item item) {
        for (Item itemInStock : itemStock.values()){
            if (itemInStock.getName().equals(item.getName()))
                return true;
        }
        return false;
    }

    public List<Item> getAllItemsInStock(){
        List<Item> itemList = new ArrayList<>();
        itemList.addAll(itemStock.values());
        return Collections.unmodifiableList(itemList);
    }

    public String getItemById(int itemId){
        return itemStock.get(itemId).getName();
    }

}

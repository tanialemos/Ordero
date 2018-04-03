package be.tlemos.api.items;

public class ItemDto {

    private int itemId;
    private String name;
    private String description;
    private double price;
    private int amount;

    public ItemDto() {
    }

    public ItemDto(int itemId, String name, String description, double price, int amount) {
        this.itemId = itemId;
        this.name = name;
        this.description = description;
        this.price = price;
        this.amount = amount;
    }

    public int getItemId() {
        return itemId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public int getAmount() {
        return amount;
    }
}

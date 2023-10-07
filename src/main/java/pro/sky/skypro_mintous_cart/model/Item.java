package pro.sky.skypro_mintous_cart.model;

import java.util.Objects;

public class Item {
    public Item(int itemID) {
        this.itemID = itemID;
    }

    @Override
    public String toString() {
        return "Item{" +
                "itemID=" + itemID +
                '}';
    }

    private int itemID;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return itemID == item.itemID;
    }

    @Override
    public int hashCode() {
        return Objects.hash(itemID);
    }

    public int getItemID() {
        return itemID;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }
}

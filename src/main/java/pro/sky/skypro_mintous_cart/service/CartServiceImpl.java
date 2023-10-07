package pro.sky.skypro_mintous_cart.service;

import org.apache.commons.lang3.StringUtils;
import pro.sky.skypro_mintous_cart.model.Cart;
import pro.sky.skypro_mintous_cart.model.Item;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public abstract class CartServiceImpl implements CartService {
    private final List<Item> items = new LinkedList<>();

    public Cart add (int itemID) {
        Item newItem = new Item(itemID);
        items.add(newItem);
        return (Cart) items;
    }

    public Cart get() {
        return (Cart) items.iterator();
    }
}

package pro.sky.skypro_mintous_cart.service;

import pro.sky.skypro_mintous_cart.model.Cart;
import pro.sky.skypro_mintous_cart.model.Item;

import java.util.LinkedList;
import java.util.List;

public interface CartService {
    List<Item> items = new LinkedList<>();
    Cart add (int itemID);
    Cart get (int itemID);
}

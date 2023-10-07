package pro.sky.skypro_mintous_cart.service;

import org.springframework.stereotype.Service;
import pro.sky.skypro_mintous_cart.model.Cart;

import java.util.List;
import java.util.Map;

@Service
public class CartServiceImpl implements CartService {

    private final Cart cart;

    public CartServiceImpl(Cart cart) {
        this.cart = cart;
    }

    public List<Integer> add(List<Integer> ids) {
        return cart.add(ids);
    }

    public Map<Integer, Integer> get() {
        return cart.get();
    }
}

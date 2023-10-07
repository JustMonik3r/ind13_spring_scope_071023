package pro.sky.skypro_mintous_cart.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.skypro_mintous_cart.model.Cart;
import pro.sky.skypro_mintous_cart.model.Item;
import pro.sky.skypro_mintous_cart.service.CartService;

import java.util.List;

@RestController
@RequestMapping("/order")

public class CartController {
    private final CartService cartService;

    public CartController (CartService cartService) {
        this.cartService = cartService;
    }

    @GetMapping ("/add")
    public List<Item> add(@RequestParam List<Item> items) {
        return cartService.add(itemID);
    }

    @GetMapping ("/get")
    public Cart get(@RequestParam int itemID) {
        return cartService.get(itemID);
    }
}

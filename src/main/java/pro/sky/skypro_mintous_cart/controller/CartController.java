package pro.sky.skypro_mintous_cart.controller;
import pro.sky.skypro_mintous_cart.service.CartService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/order")
public class CartController {

    private final CartService cartService;

    public CartController(CartService basketService) {
        this.cartService = basketService;
    }

    @GetMapping("/add")
    public List<Integer> add(@RequestParam List<Integer> ids) {
        return cartService.add(ids);
    }

    @GetMapping("/get")
    public Map<Integer, Integer> get() {
        return cartService.get();
    }
}

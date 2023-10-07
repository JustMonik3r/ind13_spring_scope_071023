package pro.sky.skypro_mintous_cart.service;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public interface CartService {
    Map<Integer, Integer> items = new LinkedHashMap<>();
    List<Integer> add (List<Integer> ids);
    Map<Integer, Integer> get();
}

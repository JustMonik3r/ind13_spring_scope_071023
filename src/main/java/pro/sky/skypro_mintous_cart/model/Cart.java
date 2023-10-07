package pro.sky.skypro_mintous_cart.model;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
@SessionScope
public class Cart {

    public Map<Integer, Integer> idCounter = new HashMap<>();

    public List<Integer> add(List<Integer> ids) {
        for (Integer i : ids) {
            if (idCounter.containsKey(i)) {
                idCounter.put(i, idCounter.get(i) + 1);
            } else {
                idCounter.put(i, 1);
            }
        }
        return ids;
    }

    public Map<Integer, Integer> get() {
        return idCounter;
    }
}

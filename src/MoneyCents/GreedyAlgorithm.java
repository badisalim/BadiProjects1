package MoneyCents;

import java.util.HashMap;
import java.util.Map;

public class GreedyAlgorithm {


    public static Map<String, Integer> change(Integer money) {


        Map<String, Integer> moneyMap = new HashMap<>();
        moneyMap.put(new Cent50().toString(), new Cent50().getValue(money));
        moneyMap.put(new Cent20().toString(), new Cent20().getValue2(money));
        moneyMap.put(new Cent10().toString(), new Cent10().getValue2(money));
        moneyMap.put(new Cent5().toString(), new Cent5().getValue2(money));
        moneyMap.put(new Cent2().toString(), new Cent2().getValue2(money));
        moneyMap.put(new Cent1().toString(), new Cent1().getValue2(money));

        return moneyMap;
    }

}

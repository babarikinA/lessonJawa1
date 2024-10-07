import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Tusk1 {

    void task1() {
        Map<Object, Object> map = new HashMap<>();
        map.put("first", "val1");
        map.put("first", "val2");

        Set<Object> keysSet = new HashSet<>(map.keySet());//создание HashSet из ключей HashMap

        System.out.println(keysSet);


    }
}

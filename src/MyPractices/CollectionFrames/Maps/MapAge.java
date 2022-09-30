package MyPractices.CollectionFrames.Maps;

import java.util.Map;
import java.util.TreeMap;

public class MapAge {
    public static void main(String[] args) {
        Map<String,Integer> names = new TreeMap<>();
        names.put("George",22);
        names.put("Noah",23);
        names.put("Josh",21);
        names.put("Olumide",26);
        names.put("Williams",22);
        System.out.println();

        int joshAge = names.get("Josh");
        System.out.println("Josh's Age is "+ joshAge);

    }
}

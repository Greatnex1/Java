package MyPractices.CollectionFrames.Maps;

import java.util.Map;
import java.util.TreeMap;

public class Mystery {
    public static void main(String[] args) {
     //  mystery();
      //  System.out.println(result);
    }

    public static void mystery(Map<String,String> map) {
        Map<String,String> result = new TreeMap<>();
        for (String key  : map.keySet()) {
            if(key.compareTo(map.get(key))< 0) {
                result.put(key, map.get(key));
            }
                else{ result.put(map.get(key),key);

                }
            }
        System.out.println(result);
        }

    }


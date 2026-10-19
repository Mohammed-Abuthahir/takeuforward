// 51. LRU Cache
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class LRUCaches{
    public static void main(String[] args){
        LRUCache lRUCache = new LRUCache(2);
        lRUCache.put(1,1);
        lRUCache.put(2,2);
        System.out.println(lRUCache.get(2));
        lRUCache.put(2,1);
        System.out.println(lRUCache.get(2));
    }
}

class LRUCache{
    LinkedHashMap<Integer, Integer> map;
    int capacity ;
    public LRUCache(int capacity){
        this.map = new LinkedHashMap<>();
        this.capacity = capacity;
    }

    public int get(int key){
        return map.getOrDefault(key, -1);
    }

    public void put(int key, int value){
        map.put(key, value);
        if(map.size() > capacity){
            int oldest = map.keySet().iterator().next();
            map.remove(oldest);
        }
    }
}
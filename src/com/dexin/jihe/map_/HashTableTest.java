package com.dexin.jihe.map_;

import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

/**
 * @ClassName: HashTableTest
 * @Description:
 * @Author: TangDx
 * @DATE: 2022/6/1 22:21
 */
public class HashTableTest {
    public static void main(String[] args) {
        Hashtable hashtable = new Hashtable();

        hashtable.put("name", "唐德鑫");
        hashtable.put("age", "18");
        hashtable.put("salary", "10000");
//        hashtable.put(null, null); // hashTable集合键和值都不能为null

        Set set = hashtable.entrySet();
        for (Object obj: set){
             Map.Entry entry = (Map.Entry)obj;
            System.out.println(entry.getKey() + "---" + entry.getValue());
        }

        System.out.println(hashtable);
    }
}

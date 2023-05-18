package com.dexin.jihe.map_;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @ClassName: HashMApTest
 * @Description:
 * @Author: TangDx
 * @DATE: 2022/5/31 23:17
 */
public class HashMapTest {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        hashMap.put(null, null);
        hashMap.put("on1", null);
        hashMap.put("on2", null);
        hashMap.put("on3", "java");

        Set set = hashMap.entrySet();
        System.out.println(set.getClass());

        for (Object obj : set) {
            Map.Entry entry = (Map.Entry) obj;
            System.out.println(entry.getKey() + "---" + entry.getValue());
        }

        Set set1 = hashMap.keySet();
        for (Object obj : set1) {
            System.out.println(obj +"---"+ hashMap.get(obj));
        }

        System.out.println(hashMap);
    }
}

package com.dexin.wangluo;

import java.lang.reflect.Method;

/**
 * @ClassName: main
 * @Description:
 * @Author: TangDx
 * @DATE: 2022/7/27 17:59
 */
public class TestFs {
    public static void main(String[] args) {

        int i = test();
        System.out.println(i);


        Long l1 = new Long(1);
        Long l2 = 1L;

        System.out.println(l1.equals(l2));
        System.out.println("1".equals(l1));
        System.out.println("1".equals(l2));

        String s1 = "1";
        System.out.println(s1 == "1");

        String s2 = new String("1");
        System.out.println(s2 == "1");


//        HashMap<Object, Object> map = new HashMap<>();
//
//        Object abc = map.get("abc");
//        System.out.println(abc);
//        try {
//            FanShe fs = new FanSheImpl();
//            Method invokeMethod = getInvokeMethod(fs.getClass(), "create");
//            invokeMethod.invoke(fs,new User("tdx",18));
//        } catch (Exception e){
//            System.out.println("错误");
//        }
    }

    public static int test(){
        try {
            int a = 1 / 0;
            return a;
        } catch (Exception e){
            System.out.println(e);
            return 1;
        } finally {
            return 2;
        }
    }


    private static Method getInvokeMethod(Class<?> clazz, String methodName) {
        Method[] methods = clazz.getMethods();
        Method invokeMethod = null;
        for (Method method : methods) {
            if (method.getName().equalsIgnoreCase(methodName)) {
                invokeMethod = method;
                break;
            }
        }
        return invokeMethod;
    }
}

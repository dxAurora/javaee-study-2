package com.dexin.fanshe;

import java.lang.reflect.Field;

/**
 * @ClassName Demo01
 * @Description
 * @Author TangDx
 * @Date 2023/5/15 20:32
 * @Version 1.0
 */
public class Demo01 {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException, InstantiationException {
        Class<Car> class1 = Car.class;

        Car car = new Car();
        Class<? extends Car> class2 = car.getClass();

        Class<?> class3 = Class.forName("com.dexin.fanshe.Car");

        System.out.println(class1 + " --- " + class1.hashCode());
        System.out.println(class2 + " --- " + class2.hashCode());
        System.out.println(class3 + " --- " + class3.hashCode());
        System.out.println(class3 + " --- " + class3.hashCode());

        System.out.println(class1.getClass());

        System.out.println(class1.getName());

        System.out.println(class1.getPackage());

        Car car1 = class1.newInstance();


        // Exception in thread "main" java.lang.NoSuchFieldException: carName
        // getField() 方法只能得到非私有属性
//        Field field1 = class1.getField("carName");
        Field field2 = class1.getDeclaredField("carName");
        Field field3 = class1.getField("carPrice");
//        System.out.println(field1);
        System.out.println(field2);
        System.out.println(field3);
//        System.out.println(field2.get(car1));
        System.out.println(field3.get(car1));
    }
}


class Car{

    private String carName = "宝马";

    public String carPrice = "10000";


}
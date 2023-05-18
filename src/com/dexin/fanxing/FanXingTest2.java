package com.dexin.fanxing;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * @ClassName: FanXingTest2
 * @Description:
 * @Author: TangDx
 * @DATE: 2022/6/6 21:02
 */
public class FanXingTest2 {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("唐德鑫", 23, new myDate(1999, 8, 11)));
        employees.add(new Employee("阿龙", 53, new myDate(1959, 8, 11)));
        employees.add(new Employee("赵子龙", 53, new myDate(1969, 8, 11)));

        System.out.println(employees);

        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        System.out.println(employees);
    }
}

class Employee {
    private String name;
    private int age;
    private myDate birthday;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public myDate getBirthday() {
        return birthday;
    }

    public void setBirthday(myDate birthday) {
        this.birthday = birthday;
    }

    public Employee(String name, int age, myDate birthday) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "\nEmployee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                '}';
    }
}

class myDate implements Comparable<myDate> {
    private int year;
    private int month;
    private int day;

    @Override
    public String toString() {
        return "myDate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }

    public myDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public int compareTo(myDate o) {
        int i = year - o.getYear();
        if (i != 0) {
            return i;
        }
        return 0;
    }
}
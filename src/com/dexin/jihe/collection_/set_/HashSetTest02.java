package com.dexin.jihe.collection_.set_;

import java.util.HashSet;
import java.util.Objects;

/**
 * @ClassName: HashSetTest02
 * @Description:
 * @Author: TangDx
 * @DATE: 2022/5/31 20:54
 */
public class HashSetTest02 {
    public static void main(String[] args) {
        HashSet<Employee> hashSet = new HashSet<>();
        hashSet.add(new Employee("孙悟空", new MyDate(2010,10,20)));
        hashSet.add(new Employee("孙悟空", new MyDate(2010,10,20)));
        hashSet.add(new Employee("孙悟空", new MyDate(2010,10,20)));

        System.out.println("hashSet:" + hashSet);

    }
}

class Employee {
    String name;
    MyDate birthday;

    public Employee(String name, MyDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(name, employee.name) &&
                Objects.equals(birthday, employee.birthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, birthday);
    }
}

class MyDate{
    int year;
    int month;
    int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyDate myDate = (MyDate) o;
        return year == myDate.year &&
                month == myDate.month &&
                day == myDate.day;
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, month, day);
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }
}

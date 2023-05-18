package com.dexin.fanshe;

public class FanSheDemo {

    public static void main(String[] args) throws ClassNotFoundException {
        Person student = new Student();

        Class c1 = student.getClass();

        Class<Student> c2 = Student.class;

        Class c3 = Class.forName("com.dexin.fanshe.Student");

        Class superclass = c3.getSuperclass();

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c3.hashCode());

        System.out.println(superclass.hashCode());
    }
}

class Person{
    public String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }
}

class Student extends Person{
    public Student() {
        this.name = "学生";
    }

    public void say(){
        System.out.println("我是学生类");
    }
}

class Teacher extends Person{
    public Teacher() {
        this.name = "老师";
    }
}
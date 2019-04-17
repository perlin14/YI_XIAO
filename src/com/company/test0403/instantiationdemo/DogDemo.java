package com.company.test0403.instantiationdemo;

public class DogDemo {
    private String name;
    static String color;
    private int age;

    public DogDemo(String color)
    {
        this.color=color;
        System.out.println("This is a "+ color +" dog!");
    }

    void setName(String name)
    {
        this.name=name;
        System.out.println("The dog name is: "+ name);
    }
    String getName()
    {
        return this.name;
    }

    void setAge(int age)
    {
        this.age=age;
        System.out.println("The dog is "+age +" years old");
    }
    int getAge()
    {
        return this.age;
    }
}

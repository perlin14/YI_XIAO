package com.company.test0403.instantiationdemo;

public class DogInstantiation {
    public static void main(String[] args)
    {
        DogDemo dogDemo=new DogDemo("white");
        System.out.println("------------------------------------------");

        dogDemo.setAge(5);
        dogDemo.getAge();
        System.out.println("------------------------------------------");

        dogDemo.setName("Tom");
        dogDemo.getName();

        System.out.println("------------------------------------------");

        //System.out.println("The color is" + dogDemo);
    }
}

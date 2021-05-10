package lab1.array.reflection;

import lab1.array.ch2.FooBarQix;

import java.lang.reflect.Modifier;

public class Reflection {
    public static void main(String [] args)
    {
        System.out.println(FooBarQix.class.getSuperclass());
        int i =FooBarQix.class.getModifiers();
        System.out.println(Modifier.toString(i));
    }
}

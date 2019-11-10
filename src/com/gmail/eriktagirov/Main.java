package com.gmail.eriktagirov;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        final Class<?> cls = ExampleReflection.class;
        TestTask ann = cls.getAnnotation(TestTask.class);
        Method method = cls.getMethod("test", int.class, int.class);

        int test = (int) method.invoke(null , ann.a(), ann.b());
        System.out.println(test);
    }
}

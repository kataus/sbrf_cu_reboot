package ru.itvitality.sbrf.cu.j2003.l08.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


public class ReflectionPrivate {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {

        Class<DemoClass> clazz = DemoClass.class;
        System.out.println("Class Name:" + clazz.getSimpleName());

        Constructor<DemoClass> constructor = clazz.getConstructor(String.class);
        DemoClass object = constructor.newInstance("testVal");


        System.out.println("--- private method execution:");
        Method privateMethod = clazz.getDeclaredMethod("privateMethod");
        privateMethod.setAccessible(true); //Делаем как бы "public"

        privateMethod.invoke(object);

        //TODO только на инстанс


        System.out.println("--- changing private field:");
        Field field = clazz.getDeclaredField("value");
        field.setAccessible(true); //Делаем как бы "public"
        field.set(object, "privateValueChanged");
        System.out.println("changed value:" + field.get(object));

    }
}

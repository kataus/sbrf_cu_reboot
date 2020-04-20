package ru.itvitality.sbrf.cu.j2003.l08.reflection;

/**
 * @author sergey
 * created on 30.11.18.
 */
public class ReflectionIntro {
    public static void main(String[] args) throws ClassNotFoundException {

        Class<?> classString = Class.forName("java.lang.String");
        System.out.println("simpleName:" + classString.getSimpleName());
        System.out.println("canonicalName:" + classString.getCanonicalName());

        Class<Integer> classInt = int.class;
        System.out.println("TypeName int:" + classInt.getTypeName());

        Class<Integer> classInteger = Integer.class;
        System.out.println("TypeName integer:" + classInteger.getTypeName());

    }
}

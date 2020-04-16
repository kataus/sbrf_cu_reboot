package ru.itvitality.sbrf.cu.j2003.l07.aop.instrumentation.proxy;


public class MyClassImpl {

    public void secureAccess(String param) {
        System.out.println("secureAccess, param:" + param);
    }

    @Override
    public String toString() {
        return "MyClassImpl{}";
    }
}

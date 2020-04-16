package ru.itvitality.sbrf.cu.j2003.l07.aop.proxy;

public class ProxyDemo {
  public static void main(String[] args) {
    MyClassInterface myClass = IoC.createMyClass();
    myClass.secureAccess("Security Param");
  }
}




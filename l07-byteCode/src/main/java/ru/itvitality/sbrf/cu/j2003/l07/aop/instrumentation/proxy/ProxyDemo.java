package ru.itvitality.sbrf.cu.j2003.l07.aop.instrumentation.proxy;


/*
    java -javaagent:proxyDemo.jar -jar proxyDemo.jar
*/
public class ProxyDemo {

  public static void main(String[] args) {
    MyClassImpl myClass = new MyClassImpl();
    myClass.secureAccess("Security Param");
  }

}

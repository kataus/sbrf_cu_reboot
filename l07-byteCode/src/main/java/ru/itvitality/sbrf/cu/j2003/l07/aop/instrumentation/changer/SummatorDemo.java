package ru.itvitality.sbrf.cu.j2003.l07.aop.instrumentation.changer;

/*
java -javaagent:changerDemo.jar -jar changerDemo.jar
*/
public class SummatorDemo {
  public static void main(String[] args) {
    AnyClass anyClass = new AnyClass();
    System.out.println(anyClass.summator(30, 20));
  }
}

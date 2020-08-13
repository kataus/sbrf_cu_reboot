package ru.sbrf.cu.processrunner;

import java.util.stream.IntStream;

/*
from location: src/main/java
javac ru/sbrf/cu/processrunner/Job.java
java ru.sbrf.cu.processrunner.Job
 */
public class Job {
  public static void main(String[] args) {
    var propVal = System.getenv("propName");
    System.out.println("do job, propVal:" +  propVal);
    IntStream.range(1, 100).forEach(System.out::println);
  }
}

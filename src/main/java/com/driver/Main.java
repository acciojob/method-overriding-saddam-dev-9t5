package com.driver;

public class Main {
    public static class A {
      public String meth() {
          return "My name is Saddam";
      }
  }

    public static class B extends A {
     public String meth() {
         return "Method is overridden in Extendend class B";
     }
  }

  public static void main(String[] args) {
      B objB = new B();
      String res = objB.meth();
        System.out.println(res);
  }
}
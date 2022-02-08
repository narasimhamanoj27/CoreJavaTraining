package org;

public class ConstructorMain {

   private int age;
   private String name;
   private String className;

   public ConstructorMain(int age, String name, String className) {
      this.age = age;
      this.name = name;
      this.className = className;
   }

   public ConstructorMain() {}

   public int getAge() {
      return age;
   }

   public String getName() {
      return name;
   }

   public String getClassName() {
      return className;
   }

   @Override
   public String toString() {
      return "ConstructorMain{" +
              "age=" + age +
              ", name='" + name + '\'' +
              ", className='" + className + '\'' +
              '}';
   }
}

class Animal {
   void eat() {
      System.out.println("eating...");
   }
}

class Dog extends Animal {
   void bark() {
      System.out.println("barking...");
   }
}

class BabyDog extends Dog {
   void weep() {
      System.out.println("weeping...");
   }
}

class TestMultilevelInheritance{
   public static void main(String[] args) {
      BabyDog bulldog = new BabyDog();
      bulldog.weep();
      bulldog.bark();
      bulldog.eat();
   }
}
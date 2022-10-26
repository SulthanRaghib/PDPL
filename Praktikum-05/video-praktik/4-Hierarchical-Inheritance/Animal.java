class Animal {
   void eat() {
      System.out.println("eating....");
   }
}

class Dog extends Animal {
   void bark() {
      System.out.println("barking....");
   }
}

class Cat extends Animal {
   void meow() {
      System.out.println("meowing....");
   }
}

class TestHirarchicalInheritance {
   public static void main(String[] args) {
      Cat anggora = new Cat();
      anggora.meow();
      anggora.eat();
   }
}
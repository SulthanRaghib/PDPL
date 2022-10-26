/*
 * Apa hasil dari source code berikut ini, 
 * jika class Dog (line 7) ditambah keyword "final" di bagian depannya?
 * 
 * Jawabannya:
 * a. meowing...
      eating...
 * 
 * mengapa demikian? karena yang di kasih final class Dog, 
 * dan yang di panggil didalam test new Cat 😆
 * dan apabila yang dipanggil class new Dog, dan apabila ada class turunan/extend
 * maka akan error
 */
class Animal {
   void eat() {
      System.out.println("eating....");
   }
}

final class Dog extends Animal {
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
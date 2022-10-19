public class Dog {
   // instance variable
   String name;
   String breed;
   int age;
   String color;

   // constructor declaration of class
   public Dog(String name, String breed, int age, String color) {
      this.name = name;
      this.breed = breed;
      this.age = age;
      this.color = color;
   }

   // method 1
   public String getName() {
      return name;
   }

   // method 2
   public String getBreed() {
      return breed;
   }

   // method 3
   public int getAge() {
      return age;
   }

   // method 4
   public String getColor() {
      return color;
   }

   @Override
   public String toString() {
      return ("Hi my name is " + this.getName() + ".\nMy breed " + this.getBreed() + ", age " + this.getAge() + " and color are " + this.getColor() + "\n");
   }

   public static void main(String[] args) {
      Dog tuffy = new Dog("tuffy", "papillon", 5, "white");
      Dog Bulldog = new Dog("Bulldog", "Beef", 5, "Black");
      System.out.println(tuffy.toString());
      System.out.println(Bulldog.toString());
   }
}

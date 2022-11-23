/*
 * Berapa nilai akhir dari obj1.x hasil implementasi dari shallow copy berikut?
 * 
 * Jawaban:
 * c. 9
 */

class ABC {
   // instance variable of class ABC
   int x = 9;
}

public class ShallowCopy {
   // main method
   public static void main(String[] args) {

      // creating an object of class ABC
      ABC obj1 = new ABC();

      // it will copy the reference, not value
      ABC obj2 = obj1;

      // updating the value to 45
      // using the reference variable obj2
      obj2.x = 45;

      // printing the value of x using reference variable obj1
      System.out.println("The value of x is: " + obj1.x);
   }
}

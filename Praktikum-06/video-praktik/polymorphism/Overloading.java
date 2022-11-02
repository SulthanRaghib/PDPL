// Java Program for method overloading
// By using Different Types of Arguments

// Class 1
class Overloading {
   // Method with 2 integer parameters
   static int Multiply(int a, int b) {
      // Returns product of integer numbers
      return a * b;
   }

   // Method 2
   // With same name but with 2 double parameters
   static double Multiply(double a, double b) {
      // Returns product of double numbers
      return a * b;
   }
}

class TestOverloading{
   public static void main(String[] args) {
      // Calling method by passing
      // input as an arguments
      System.out.println(Overloading.Multiply(2,4));
      System.out.println(Overloading.Multiply(5.5,6.3));
   }   
}
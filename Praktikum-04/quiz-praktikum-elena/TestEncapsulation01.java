/*
 * Apa yang akan dihasilkan oleh kelas TestEncapsulation:
 * Apabila method getter dan setter pada kelas Encapsulate diset menjadi "private"?
 * 
 * Jawaban:
 * b. Program Error saat dicompile
 */
public class TestEncapsulation01 {
   public static void main(String[] args) {
      Encapsulate obj = new Encapsulate();

      // setting value of the variables
      obj.setName("Sulthan Raghib Fillah");
      obj.setAge(20);
      obj.setRoll(2);

      // Displaying values of the variables
      System.out.println("Name : " + obj.getName());
      System.out.println("Age  : " + obj.getAge());
      System.out.println("Roll : " + obj.getRoll());

      // Direct access of studentRoll is not possible
      // due to encapsulation
      // System.out.println("Geek's Roll: " + obj.geekName);
      
   }
}

class Encapsulate {
   // private variables declared
   // these can only be accessed by
   // public methods of class
   private String geekName;
   private int geekRoll;
   private int geekAge;

   // get method for age to access
   // private variable geekAge
   private int getAge() {
      return geekAge;
   }

   // get method for name to access
   // private variable geekName
   private String getName() {
      return geekName;
   }

   // get method for roll to access
   // private variable geekRoll
   private int getRoll() {
      return geekRoll;
   }

   // set method for age to access
   // private variable geekage
   private void setAge(int newAge) {
      geekAge = newAge;
   }

   // set method for name to access
   // private variable geekName
   private void setName(String newName) {
      geekName = newName;
   }

   // set method for roll to access
   // private variable geekRoll
   private void setRoll(int newRoll) {
      geekRoll = newRoll;
   }
}

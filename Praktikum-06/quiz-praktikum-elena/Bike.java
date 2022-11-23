/*
 * Apa hasil dari program di bawah ini?
 * 
 * Jawabannya : 
 * b. 150
 */

class Bike {
   int speedLimit = 150;
}

class Honda extends Bike {
   int speedLimit = 90;

   public static void main(String[] args) {
      Bike sepeda = new Honda();
      System.out.println(sepeda.speedLimit);
   }
}

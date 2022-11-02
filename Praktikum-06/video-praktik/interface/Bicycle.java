// Java program to demonstrate the
// real-world  example of interfaces

interface Vehcile {
   // all are the abstract methods
   void changeGear(int a);

   void speedUp(int a);

   void applyBrakes(int a);
}

class Bicycle implements Vehcile {
   int speed;
   int gear;

   // to change gear
   @Override
   public void changeGear(int newGear) {
      gear = newGear;
   }

   // to decrease speed
   @Override
   public void speedUp(int increment) {
      speed = speed + increment;
   }

   @Override
   public void applyBrakes(int decrement) {
      speed = speed - decrement;
   }

   public void printStates() {
      System.out.println("Speed : " + speed + "\n"
            + "Gear  : " + gear);
   }
}

class TestInterface {
   public static void main(String[] args) {
      // creating an instance of Bicycle
      // doing some operation
      Bicycle sepeda = new Bicycle();
      sepeda.changeGear(2);
      sepeda.speedUp(3);
      sepeda.applyBrakes(1);

      System.out.println("Bicycle Present State : ");
      sepeda.printStates();

   }
}
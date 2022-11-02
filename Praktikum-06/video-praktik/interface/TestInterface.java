public class TestInterface {
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

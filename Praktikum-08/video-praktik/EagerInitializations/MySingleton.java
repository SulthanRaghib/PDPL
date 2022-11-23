package EagerInitializations;

public class MySingleton {
   private static MySingleton singleton = new MySingleton();

   private MySingleton() {
      System.out.println("Ohayou... Raghib");
   }

   public static MySingleton getInstace() {
      return singleton;
   }
}

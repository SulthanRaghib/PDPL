// SELECTION STATEMENT: Nested If
public class NestedIfBot {
   public static void main(String[] args) {
      int umur = 20;
      int tinggi = 160;

      if (umur >= 18) {
         if (tinggi >= 170) {
            System.out.println("Anda boleh masuk");
         } else {
            System.out.println("Anda tidak boleh masuk");
         }
      } else {
         System.out.println("Anda tidak boleh masuk");
      }
   }
}

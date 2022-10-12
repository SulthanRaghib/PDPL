package loops;

// public class InfinityLoop {
//    public static void main(String[] args) {
//       for (;;) {
//          System.out.println("I'am a Hacker");
//       }
//    }
// }

public class InfinityLoop {
   public static void main(String[] args) {
      for (int i = 5; i != 0; i -= 2) {
         System.out.println(i);
      }
      int x = 5;
      while (x == 5) {
         System.out.println("In the loop");
      }
   }
}
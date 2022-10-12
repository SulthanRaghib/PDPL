public class JumpContinue {
   public static void main(String[] args) {
      for (int i = 0; i < 10; i++) {
         // if the number is event
         // skip and continue
         if (i % 2 == 0) {
            continue;
         }
         // in number is odd print it
         System.out.println(i);
      }
   }
}

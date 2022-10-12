public class JumpReturn {
   public static void main(String[] args) {
      boolean t = true;
      System.out.println("Sebelum return");
      if (t) {
         return;
      }
      System.out.println("Ini tidak akan di eksekusi");
   }
}

public class MagicNumber {
   public static final int Max_PASSWORD_SIZE = 7;

   public void setPassword(String password) {
      if (password.length() > Max_PASSWORD_SIZE) {
         throw new IllegalArgumentException("Password too long");
      }
   }
}

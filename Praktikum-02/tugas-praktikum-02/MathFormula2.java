// TRIGONOMETRI FORMULA

public class MathFormula2 {
   public static double Trigonometri(int a, int b, int gamma) {
      return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2) - (2 * a * b * Math.cos(gamma)));
   }

   public static String NAMA = "Sulthan Raghib FIllah";
   public static String NIM = "0110221007";
   public static String ROOMBLE = "3TI01";

   public static void main(String[] args) {
      int a = 3;
      int b = 4;
      int gamma = 5;
      double hasil = Trigonometri(a, b, gamma);

      System.out.println("==================================");
      System.out.println("Nama : " + NAMA);
      System.out.println("NIM  : " + NIM);
      System.out.println("Kelas: " + ROOMBLE);
      System.out.println("==================================");
      System.out.println("Rumus Trigonometri \nC = √(a^2 + b^2 - 2ab cos(gamma))");
      System.out.println("==================================");
      System.out.println("Diketahui :");
      System.out.println("a = " + a);
      System.out.println("b = " + b);
      System.out.println("gamma = " + gamma);
      System.out.println("==================================");
      System.out.println("Maka nilai C adalah : " + hasil);
   }
}

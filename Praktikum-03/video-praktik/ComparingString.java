// MEMBANDINGKAN STRING
public class ComparingString {
   public static void main(String[] args) {
      String nama1 = "Sulthan Raghib Fillah";
      String nama2 = "Rafi Yuki";

      // di pdf katanya pake equals bagus
      if(nama1.equals(nama2)) {
         System.out.println("nama 1 sama dengan nama 2");
      } else {
         System.out.println("nama 1 tidak sama dengan nama 2");
      }

      // tapi ini juga bisa
      // if (nama1 == nama2) {
      //    System.out.println("nama 1 sama dengan nama 2");
      // } else {
      //    System.out.println("nama 1 tidak sama dengan nama 2");
      // }
   }
}

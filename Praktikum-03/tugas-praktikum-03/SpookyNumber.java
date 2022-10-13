
/*****************************************
 * 1. Tombol lantai 13 ditiadakan pada lift
 * 2. Faktanya lantai 13 pada gedung
 * tetap ada, namun diakses
 * melalui lift dengan tombol yg
 * berbeda, yaitu tombol 14
 *****************************************/
import java.util.*;

public class SpookyNumber {
   public static void main(String[] args) {
      String ActualFloor = "Selamat datang di Lantai : ";

      try (Scanner input = new Scanner(System.in)) {
         System.out.println("===============================");
         System.out.println("Nama    : Sulthan Raghib Fillah");
         System.out.println("NIM     : 0110221007");
         System.out.println("Roomble : TI01");
         System.out.println("===============================\n");

         System.out.print("Ingin Naik ke Lantai Berapa : ");
         int floor = input.nextInt();

         if (floor == 13) {
            System.out.println("Tidak ada tombol lantai 13");
         } else if (floor >= 14) {
            System.out.println(ActualFloor + (floor - 1));
         } else {
            System.out.println(ActualFloor + floor);
         }
      }

      // int floor = 14;
      // String ActualFloor;
      // ActualFloor = (floor >= 13) ? "adalah : " + (floor - 1) : "adalah : " +
      // floor;
      // System.out.println("Lantai Sebenarnya " + ActualFloor);
      // }

   }
}

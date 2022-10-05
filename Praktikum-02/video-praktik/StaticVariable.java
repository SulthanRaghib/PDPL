/*
Variabel statis juga dikenal sebagai variabel kelas.
• Variabel-variabel ini dideklarasikan sama seperti variabel instan. Perbedaan
  adalah bahwa variabel statis dideklarasikan menggunakan kata kunci statis di dalam kelas
  di luar metode, konstruktor, atau blok apa pun.

• Tidak seperti variabel instan, kita hanya dapat memiliki satu salinan variabel statis per
  kelas, terlepas dari berapa banyak objek yang kita buat.

• Variabel statis dibuat pada awal eksekusi program dan dihancurkan
  otomatis saat eksekusi berakhir
 */

public class StaticVariable {
   public static String nama = "Sulthan Raghib FIllah";
   public static int umur = 20;

   public static void main(String[] args) {
      System.out.println("Namaku adalah : " + StaticVariable.nama);
      System.out.println("Umurku : " + StaticVariable.umur);
   }
}

/*
* Variabel instan adalah variabel non-statis dan dideklarasikan di kelas di luar
  metode, konstruktor, atau blok apa pun.

• Saat variabel instan dideklarasikan dalam sebuah kelas, variabel-variabel ini dibuat
  ketika objek dari kelas dibuat dan dihancurkan ketika objek tersebut
  hancur.

• Tidak seperti variabel lokal, kita dapat menggunakan penentu akses untuk variabel instan.
  Jika kita tidak menentukan penentu akses apa pun, maka penentu akses default
  akan digunakan.

• Inisialisasi variabel instan tidak wajib. Nilai defaultnya adalah 0.

• Variabel instan hanya dapat diakses dengan membuat objek
 */

public class InstanVariable {
   public String nama;
   public int umur;

   public InstanVariable() {
      this.nama = "Sulthan Raghib Fillah";
      this.umur = 20;
   }

   public static void main(String[] args) {
      InstanVariable Biodata = new InstanVariable();
      System.out.println("Namaku adalah : " + Biodata.nama);
      System.out.println("Umurku : " + Biodata.umur);
   }
}

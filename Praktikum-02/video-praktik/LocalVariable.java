/*
Variabel yang didefinisikan dalam blok atau metode atau konstruktor disebut local variabel.

1. Variabel-variabel ini dibuat ketika blok dimasukkan, atau fungsinya adalah
dipanggil dan dihancurkan setelah keluar dari blok atau ketika panggilan kembali
dari fungsi.

2. Ruang lingkup variabel-variabel ini hanya ada di dalam blok di mana
variabel dideklarasikan, yaitu, kita dapat mengakses variabel-variabel ini hanya di dalam itu
memblokir.

3. Inisialisasi variabel lokal adalah wajib sebelum menggunakannya dalam definisi
cakupan
*/

public class LocalVariable {
   public static void main(String[] args) {
      int var = 10;
      System.out.println("Local Variable : " + var);
   }
}

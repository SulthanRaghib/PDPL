public class MySingleton {
   private static MySingleton singleton = new MySingleton();

   private MySingleton() {
      System.out.println("Ohayou... Raghib");
   }

   public static MySingleton getInstace() {
      return singleton;
   }

   public static void main(String[] args) {
      MySingleton s1 = MySingleton.getInstace();
      MySingleton s2 = MySingleton.getInstace();
      MySingleton s3 = MySingleton.getInstace();
   }
}

/*
 * Output :
 * 
 * Ohayou... Raghib
 * 
 * padahal ada 3 variable mengapa outputnya hanya 1 saja
 * karena di return
 * 
 * inisialisasi diatas namanya Eager Initializtions
 * 
 * kontra:
 * Eager Initialization lebih lambat saat eksekusi karena harus menunggu proses
 * instansiasi
 * sedangkan
 * Lazy Initializtion lebih cepat saat eksekusi karena tidak perlu menunggu
 * proses instansiasi
 * akan tetapi saat sudah di start lebih lambat karena belum di memory
 */

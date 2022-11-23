package LazyInitializations;

public class Captain {
   public static Captain myCaptain;

   private Captain() {

   }

   public static Captain getCaptain() {
      if (myCaptain == null) {
         myCaptain = new Captain();
         System.out.println("A captain is elected for your team");
      }
      return myCaptain;
   }

   public static void main(String[] args) {
      Captain captain = Captain.getCaptain();
   }
}

/*
 * Output: 
 *
 * A captain is elected for your team
 * 
 * kontra:
 * Lazy Initializtion lebih cepat saat eksekusi karena tidak perlu menunggu proses instansiasi
 * sedangkan 
 * Eager Initialization harus menunggu proses instansiasi selesai
 * akan tetapi saat sudah di start lebih cepat karena sudah di memory
 */
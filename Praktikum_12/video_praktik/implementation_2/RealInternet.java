package Praktikum_12.video_praktik.implementation_2;

public class RealInternet implements Internet {

   @Override
   public void connectTo(String serverhost) {
      System.out.println("Connecting to " + serverhost);
   }
}

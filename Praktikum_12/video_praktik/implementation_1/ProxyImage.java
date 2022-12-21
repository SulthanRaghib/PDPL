package Praktikum_12.video_praktik.implementation_1;

public class ProxyImage implements Image{
   
   private Realimage realImage;
   private String fileName;

   public ProxyImage(String fileName) {
      this.fileName = fileName;
   }

   @Override
   public void display() {
      if (realImage == null) {
         realImage = new Realimage(fileName);
      }
      realImage.display();
   }
}

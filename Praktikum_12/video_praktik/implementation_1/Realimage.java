package Praktikum_12.video_praktik.implementation_1;

public class Realimage implements Image {

   private String fileName;

   public Realimage(String fileName) {
      this.fileName = fileName;
      loadFromDisk(fileName);
   }

   @Override
   public void display() {
      System.out.println("Displaying " + fileName);
   }

   private void loadFromDisk(String fileName) {
      System.out.println("Loading " + fileName);
   }
}

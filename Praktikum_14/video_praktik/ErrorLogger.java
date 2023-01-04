package Praktikum_14.video_praktik;

public class ErrorLogger extends AbstractLogger {
   public ErrorLogger(int level){
      this.level = level;
   }

   @Override
   protected void write(String message){
      System.out.println("Error Console::Logger " + message);
   }
}

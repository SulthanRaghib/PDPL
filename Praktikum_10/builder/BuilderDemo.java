package Praktikum_10.builder;

public class BuilderDemo {
   public static void main(String[] args) {
      CDBuilder cdBuilder = new CDBuilder();
      CDType cdType1 = cdBuilder.buildSonyCD();
      cdType1.showItems();

      CDType cdType2 = cdBuilder.buildSamsungCD();
      cdType2.showItems();
   }
}

/**
 * Output :
 * 
 * CD name : Sony CD, Price : 20
 * Cd name : Samsung CD, Price : 15
 */
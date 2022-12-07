// Enam

package Praktikum_10.builder;

import java.util.ArrayList;
import java.util.List;

public class CDType {
   private List<Packing> items = new ArrayList<Packing>();

   public void addItem(Packing packs) {
      items.add(packs);
   }

   public void getCost() {
      for (Packing packs : items) {
         packs.price();
      }
   }

   public void showItems() {
      for (Packing packs : items) {
         System.out.print("CD name : " + packs.pack());
         System.out.println(", Price : " + packs.price());
      }
   }
}

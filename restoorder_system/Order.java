/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restoorder_system;

import java.util.ArrayList;

public class Order {
   
      private ArrayList<Menu> items;

    public Order() {
        items = new ArrayList<>();
    }

    public void addItem(Menu item) {
        items.add(item);
    }

    public double getTotal() {
        double total = 0;
        for (Menu item : items) {
            total += item.getPrice();
        }
        return total;
    }
    
}
    

